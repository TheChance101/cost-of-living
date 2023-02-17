package interactor

import model.CityEntity
import kotlin.math.abs


class GetCityThatMatchTheManagerExpectationsInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): CityEntity {
        return dataSource.getAllCitiesData()
            .filterByCountryName()
            .takeIf { it.isNotEmpty() }
            ?.run {
                excludeNullPricesOfMeals().getCityThatMatchExpectations()
            } ?: throw IllegalStateException("List of cities is empty")
    }


    private fun List<CityEntity>.filterByCountryName() = filter { it.country.lowercase() in selectedCountries }

    private fun List<CityEntity>.excludeNullPricesOfMeals() = filter {
        it.mealsPrices.mealFor2PeopleMidRangeRestaurant != null &&
                it.mealsPrices.mealInexpensiveRestaurant != null &&
                it.mealsPrices.mealAtMcDonaldSOrEquivalent != null
    }

    private fun CityEntity.getSummationPriceOfMeals(): Float {
        return mealsPrices.mealFor2PeopleMidRangeRestaurant!!.div(2) +
                mealsPrices.mealInexpensiveRestaurant!! +
                mealsPrices.mealAtMcDonaldSOrEquivalent!!
    }

    private fun List<CityEntity>.getCityThatMatchExpectations(): CityEntity {
        val pricesOfMeals = map { it.getSummationPriceOfMeals() }
        val matchedPrice = (pricesOfMeals.maxOf { it } + pricesOfMeals.minOf { it }).div(2)
        return minByOrNull { abs(matchedPrice - it.getSummationPriceOfMeals()) }!!
    }

    companion object {
        private val selectedCountries = listOf("united states", "canada", "mexico", "usa")
    }
}
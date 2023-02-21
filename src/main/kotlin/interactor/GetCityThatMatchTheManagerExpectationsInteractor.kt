package interactor

import model.CityEntity
import kotlin.math.abs


class GetCityThatMatchTheManagerExpectationsInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    operator fun invoke(selectedCountries: List<String>): CityEntity {
        val countries = selectedCountries.map { it.lowercase() }

        return dataSource.getAllCitiesData()
            .filter {
                countries.contains(it.country.lowercase()) &&
                it.excludeNullPricesOfMeals()
            }
            .takeIf { it.isNotEmpty() }
            ?.getCityThatMatchExpectations()
            ?: throw IllegalStateException("List of cities is empty")
    }

    private fun CityEntity.excludeNullPricesOfMeals(): Boolean {
        return with(mealsPrices){
                mealInexpensiveRestaurant !=null &&
                mealFor2PeopleMidRangeRestaurant !=null &&
                mealAtMcDonaldSOrEquivalent != null
            }
    }

    private fun List<CityEntity>.getCityThatMatchExpectations(): CityEntity {
        val pricesOfMeals = this.map { it.mealsPrices.getSummationPricesOfMeals() }
        val matchedPrice = (pricesOfMeals.maxOf { it } + pricesOfMeals.minOf { it }).div(2)
        return minByOrNull { abs(matchedPrice - it.mealsPrices.getSummationPricesOfMeals()) }!!
    }
}
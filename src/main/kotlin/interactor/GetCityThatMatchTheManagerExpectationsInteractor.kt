package interactor

import model.CityEntity
import kotlin.math.abs


class GetCityThatMatchTheManagerExpectationsInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): CityEntity {

        val listOfCities = dataSource
            .getAllCitiesData()
            .filterByCountryName()

        return if (listOfCities.isNotEmpty()) {
                listOfCities
                .excludeNullPricesOfMeals()
                .getCityThatMatchExpectations()
        }
        else throw Throwable("List of cities is empty")

    }

    private fun List<CityEntity>.filterByCountryName() = filter { it.country.lowercase() in selectedCountries}

    private fun List<CityEntity>.excludeNullPricesOfMeals() = filter {
        it.mealsPrices.mealFor2PeopleMidRangeRestaurant != null &&
                it.mealsPrices.mealInexpensiveRestaurant != null &&
                it.mealsPrices.mealAtMcDonaldSOrEquivalent != null
        }


    private fun List<CityEntity>.getCityThatMatchExpectations(): CityEntity {
        val pricesOfMeals = mutableListOf<Float>()
        forEach {
            pricesOfMeals.add(
                it.mealsPrices.mealFor2PeopleMidRangeRestaurant!!.div(2) +
                it.mealsPrices.mealInexpensiveRestaurant!!+
                it.mealsPrices.mealAtMcDonaldSOrEquivalent!!
            )
        }
        val matchedPrice = (pricesOfMeals.maxOf { it } + pricesOfMeals.minOf { it }).div(2)
        return minByOrNull {
            abs(
                matchedPrice - (it.mealsPrices.mealFor2PeopleMidRangeRestaurant!!.div(2) +
                        it.mealsPrices.mealInexpensiveRestaurant!! +
                        it.mealsPrices.mealAtMcDonaldSOrEquivalent!!
                        )
            )
        }!!
    }

    companion object {
        private val selectedCountries = listOf("united states", "canada", "mexico", "usa")
    }
}
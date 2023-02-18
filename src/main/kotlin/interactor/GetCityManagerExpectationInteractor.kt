package interactor

import model.CityEntity

class GetCityManagerExpectationInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(countryOne:String , countryTwo:String , countryThree:String): String? {
        val averageDivide = 3
        val data =
            dataSource.getAllCitiesData()
                .filter { filterByCountry(it ,countryOne,countryTwo,countryThree) }
                .sortedBy {
                    (it.mealsPrices.mealInexpensiveRestaurant?.plus(it.mealsPrices.mealAtMcDonaldSOrEquivalent!!)
                        ?.plus(it.mealsPrices.mealFor2PeopleMidRangeRestaurant!!))?.div(
                            averageDivide
                        )
                }
        return if (data.isNotEmpty()) data[data.size / 2].cityName else null
    }

    private fun filterByCountry(
        city: CityEntity,
        countryOne: String,
        countryTwo: String,
        countryThree: String
    ): Boolean {
        return (
                city.country == countryOne &&
                        city.mealsPrices.mealAtMcDonaldSOrEquivalent != null &&
                        city.mealsPrices.mealInexpensiveRestaurant != null &&
                        city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null
                ) || (
                city.country == countryTwo &&
                        city.mealsPrices.mealAtMcDonaldSOrEquivalent != null &&
                        city.mealsPrices.mealInexpensiveRestaurant != null &&
                        city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null
                ) || (
                city.country == countryThree &&
                        city.mealsPrices.mealAtMcDonaldSOrEquivalent != null &&
                        city.mealsPrices.mealInexpensiveRestaurant != null &&
                        city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null
                )
    }
}
package interactor

import model.CityEntity

class GetCityManagerExpectation(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(): String? {
        val data =
            dataSource.getAllCitiesData()
                .filter(::filterByCountry)
                .sortingWithAveragePrice()

        return if (data.isNotEmpty()) data[data.size / 2].cityName else null
    }


    private fun filterByCountry(city: CityEntity): Boolean {
        return (city.country == "United States"
                && city.mealsPrices.mealAtMcDonaldSOrEquivalent != null
                && city.mealsPrices.mealInexpensiveRestaurant != null
                && city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null
                ) || (city.country == "Canada"
                && city.mealsPrices.mealAtMcDonaldSOrEquivalent != null
                && city.mealsPrices.mealInexpensiveRestaurant != null
                && city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null
                ) || (city.country == "Mexico"
                && city.mealsPrices.mealAtMcDonaldSOrEquivalent != null
                && city.mealsPrices.mealInexpensiveRestaurant != null
                && city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null
                )
    }


    private fun List<CityEntity>.sortingWithAveragePrice(): List<CityEntity> {
        return this.sortedBy {
            (it.mealsPrices.mealInexpensiveRestaurant?.plus(it.mealsPrices.mealAtMcDonaldSOrEquivalent!!)
                ?.plus(it.mealsPrices.mealFor2PeopleMidRangeRestaurant!!))?.div(3)
        }
    }
}
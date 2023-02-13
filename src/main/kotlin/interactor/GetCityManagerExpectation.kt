package interactor

import model.CityEntity

class GetCityManagerExpectation(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(): String? {
        val data = dataSource.getAllCitiesData()
            .filter(::excludeNullFoodPricesData)
            .filterAllCitiesByCountry()
            .sortingWithAveragePrice()
            .take(1)
        return if (data.isNotEmpty()) data[0].cityName else null
    }


    private fun excludeNullFoodPricesData(city: CityEntity): Boolean {
        return city.mealsPrices.mealAtMcDonaldSOrEquivalent != null
                && city.mealsPrices.mealInexpensiveRestaurant != null
                && city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null
    }

    private fun List<CityEntity>.filterAllCitiesByCountry(): List<CityEntity> {
        return this.filter {
            it.country == "USA" || it.country == "Canada" || it.country == "Mexico"
        }
    }

    private fun List<CityEntity>.sortingWithAveragePrice(): List<CityEntity> {
        return this.sortedByDescending {
            (it.mealsPrices.mealInexpensiveRestaurant?.plus(it.mealsPrices.mealAtMcDonaldSOrEquivalent!!)
                ?.plus(it.mealsPrices.mealFor2PeopleMidRangeRestaurant!!))?.div(3.0f)
        }
    }
}
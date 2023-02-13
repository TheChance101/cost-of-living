package interactor

import model.CityEntity

class GetCItyWithMealPriceBetweenTwo(
    private val dataSource: CostOfLivingDataSource,
) {


    fun execute(listOfCities: List<String>): CityEntity? {
        val allCities = dataSource.getAllCitiesData()
        return allCities[0]
    }

    private fun excludeNullMealPrices(city: CityEntity): Boolean {
        return city.mealsPrices.mealInexpensiveRestaurant != null
    }

}
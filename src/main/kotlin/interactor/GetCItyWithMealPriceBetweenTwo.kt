package interactor

import model.CityEntity

class GetCItyWithMealPriceBetweenTwo(
    private val dataSource: CostOfLivingDataSource,
) {



    fun execute(listOfCities: List<String>): CityEntity {
        val allCities = dataSource.getAllCitiesData()
            .filter {listOfCities.contains(it.country)}
            .filter(::excludeNullMealPrices)
        return allCities
            .sortedByDescending { it.mealsPrices.mealInexpensiveRestaurant }[allCities.size/2]
    }

    private fun excludeNullMealPrices(city: CityEntity): Boolean {
        return city.mealsPrices.mealInexpensiveRestaurant != null
    }

}
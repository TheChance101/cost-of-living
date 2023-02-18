package interactor

import model.CityEntity

class GetTopCitiesForInexpensiveMealsInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit: Int): List<String> {
        return dataSource.getAllCitiesData().asSequence().filter(::excludeNullMealsPricesAndLowQualityData)
            .distinctBy { it.cityName }.sortedBy { it.mealsPrices.mealInexpensiveRestaurant }.take(limit)
            .map { it.cityName }.toList()
    }

    private fun excludeNullMealsPricesAndLowQualityData(city: CityEntity): Boolean {
        return city.mealsPrices.mealInexpensiveRestaurant != null && city.dataQuality
    }

}

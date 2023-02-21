package interactor

import model.CityEntity

class GetTopCountriesHaveHighCarbonatedDrinksPricesInterctor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limit: Int): List<Pair<String, Float?>> {
        return dataSource.getAllCitiesData()
            .filter(::exceptionNullDrinkPriceAndQualityData)
            .sortedByDescending { it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants }
            .take(if (limit > 0) limit else 0)
            .map { Pair(it.country, it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants) }
    }

    private fun exceptionNullDrinkPriceAndQualityData(city: CityEntity): Boolean {
        return city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants != null
                && city.dataQuality
    }
}

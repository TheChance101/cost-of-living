package interactor

import model.CityEntity

class GetTopCountryEnforceHighTaxesOnCarbonatedDrinksInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(limit: Int): List<Pair<String, Float?>> {
        return dataSource.getAllCitiesData()
            .asSequence()
            .filter(::isLegalData)
            .distinctBy { it.country }
            .sortedByDescending { it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants }
            .take(limit)
            .map { Pair(it.country ,it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants) }
            .toList()
    }

    private fun isLegalData(city: CityEntity): Boolean {
        return city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants != null
                && city.dataQuality
                && city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants > 0
    }
}
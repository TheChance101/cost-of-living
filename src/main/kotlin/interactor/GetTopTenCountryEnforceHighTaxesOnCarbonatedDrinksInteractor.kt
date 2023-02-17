package interactor

import model.CityEntity

class GetTopTenCountryEnforceHighTaxesOnCarbonatedDrinksInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(limit: Int): List<Pair<String, Float?>> {
        return dataSource.getAllCitiesData()
            .asSequence()
            .filter(::isLegalData)
            .sortedByDescending { it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants }
            .distinctBy { it.country }
            .take(limit)
            .map { (it.country to it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants) }
            .toList()
    }

    private fun isLegalData(city: CityEntity): Boolean {
        return city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants != null
                && city.dataQuality
                && city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants > 0
    }
}
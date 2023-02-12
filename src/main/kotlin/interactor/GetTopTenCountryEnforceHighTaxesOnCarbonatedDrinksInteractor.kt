package interactor

import model.CityEntity

class GetTopTenCountryEnforceHighTaxesOnCarbonatedDrinksInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(limit: Int, cities: List<CityEntity>): List<Pair<String, Float?>> {
        return cities
            .asSequence()
            .sortedBy { it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants }
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
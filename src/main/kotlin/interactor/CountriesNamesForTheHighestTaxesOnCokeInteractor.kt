package interactor

import model.CityEntity

class CountriesNamesForTheHighestTaxesOnCokeInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limitOfDesiredCountries: Int): List<Pair<String, Float>> {
        return dataSource
            .getAllCitiesData()
            .filter{it.dataQuality}
            .sortedByDescending { it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants }
            .distinctBy { it.country }
            .take(limitOfDesiredCountries)
            .map { (it.country to it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants!!) }
    }
}
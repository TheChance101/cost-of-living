package interactor

import model.CityEntity

class GetCitiesNamesWithCheapestBananaPricesInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(vararg citiesNames: String): List<String> {
        val filteredCities = dataSource.getAllCitiesData().filter { city -> excludeNullBananaPrice(city) }
        val cityNames = filteredCities.map(CityEntity::cityName)

        return when {
            citiesNames.size == 1 && cityNames.contains(citiesNames.first()) -> citiesNames.toList()
            citiesNames.size != 1 && cityNames.containsAll(citiesNames.toList()) -> filteredCities.sortedBy { it.fruitAndVegetablesPrices.banana1kg }.map(CityEntity::cityName)
            citiesNames.any { it in cityNames } -> filteredCities.sortedBy { it.fruitAndVegetablesPrices.banana1kg }.filter { it.cityName in citiesNames }.map(CityEntity::cityName)
            else -> emptyList()
        }
    }

    private fun excludeNullBananaPrice(city: CityEntity): Boolean {
        return city.fruitAndVegetablesPrices.banana1kg != null
    }
}

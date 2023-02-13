package interactor

import model.CityEntity


class GetCitiesNamesSortedByCheapestBananaPrices(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(vararg cities: String): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter { excludeNullBananaPricesAndLowQualityData(it) }
            .filter { compereCitiesNamesWithInputCities(cities, it.cityName) }
            .sortedBy { it.fruitAndVegetablesPrices.banana1kg }
            .map { it.cityName }
    }

    private fun compereCitiesNamesWithInputCities(inputCity: Array<out String>, city: String): Boolean {
        return inputCity.map { it.toLowerCase().trim() }.contains(city.toLowerCase())
    }

    private fun excludeNullBananaPricesAndLowQualityData(city: CityEntity): Boolean {
        return city.fruitAndVegetablesPrices.banana1kg != null
    }

}

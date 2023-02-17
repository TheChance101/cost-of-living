package interactor

import interactor.util.formatSentence
import model.CityEntity


class GetCitiesNamesSortedByCheapestBananaPricesInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(vararg cities: String): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter {
                excludeNullBananaPrices(it) && compereCitiesNamesWithInputCities(
                    cities.toList(),
                    it.cityName
                )
            }

            .sortedBy { it.fruitAndVegetablesPrices.banana1kg }
            .takeUnless { it.isEmpty() }
            ?.map { it.cityName } ?: emptyList()
    }

    private fun compereCitiesNamesWithInputCities(cities: List<String>, city: String): Boolean {
        return cities.map { it.formatSentence() }.contains(city.lowercase())
    }

    private fun excludeNullBananaPrices(city: CityEntity): Boolean {
        return city.fruitAndVegetablesPrices.banana1kg != null
    }

}

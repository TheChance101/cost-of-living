package interactor

import model.CityEntity

class GetCitiesNamesWithCheapestBananaPricesInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(vararg citiesNames: String): List<String> {
        val dataEntities = dataSource
            .getAllCitiesData()
            .filter(::excludeNullBananaPrice)

        val dataNames = dataSource
            .getAllCitiesData()
            .filter(::excludeNullBananaPrice)
            .map { it.cityName }

        if (
            citiesNames.size == 1 &&
            dataNames.contains(citiesNames.first())
        ) {
            return citiesNames.toList()
        }
        if (
            citiesNames.size != 1
            && dataNames.containsAll(citiesNames.toList())
        ){
            return dataEntities.sortedBy { it.fruitAndVegetablesPrices.banana1kg }
                .filter { it.cityName in citiesNames }
                .map {
                it.cityName
            }
        }

        if (
            citiesNames.size != 1
            && citiesNames.any { it in dataNames }
        ){
            return dataEntities.sortedBy {
                it.fruitAndVegetablesPrices.banana1kg
            }
                .filter { it.cityName in citiesNames }
                .map {
                it.cityName
            }
        }
        return emptyList()
    }

    private fun excludeNullBananaPrice(city: CityEntity): Boolean {
        return city.fruitAndVegetablesPrices.banana1kg != null
    }
}
package interactor

import model.CityEntity

class GetCitiesNamesWithCheapestBananaPricesInteractor(private val dataSource: CostOfLivingDataSource) {

    operator fun invoke(vararg cities: CityEntity): List<String> {
        return dataSource.getAllCitiesData()
            .filter { isNotNullBananaPrice(it) && isContainsCitiesNames(it, cities.toList()) }
            .sortedBy { it.fruitAndVegetablesPrices.banana1kg }
            .map(CityEntity::cityName)
            .takeIf { it.isNotEmpty() }
            ?: throw IllegalStateException("maybe you entered invalid countries or something wrong in our server!")
    }

    private fun isNotNullBananaPrice(city: CityEntity): Boolean {
        return city.fruitAndVegetablesPrices.banana1kg != null
    }

    private fun isContainsCitiesNames(city: CityEntity, cities: List<CityEntity>): Boolean {
        return city.cityName.toLowercase() in cities.map { it.cityName.toLowercase() }
    }

    private fun String.toLowercase(): String {
        return lowercase().trim()
    }

}
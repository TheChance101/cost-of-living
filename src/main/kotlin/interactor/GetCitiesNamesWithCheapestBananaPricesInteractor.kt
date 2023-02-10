package interactor

import model.CityEntity

class GetCitiesNamesWithCheapestBananaPricesInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(vararg citiesNames: String): List<String> {
        return dataSource.getAllCitiesData()
            .filter { excludeNullBananaPriceAndIncludedCitiesNames(it, *citiesNames) }
            .sortedBy { it.fruitAndVegetablesPrices.banana1kg }
            .map(CityEntity::cityName)
    }

    private fun excludeNullBananaPriceAndIncludedCitiesNames(city: CityEntity, vararg citiesNames: String): Boolean {
        return city.fruitAndVegetablesPrices.banana1kg != null
                && city.cityName.lowercase() in citiesNames.map(::toFormalCase)
    }

    private fun toFormalCase(string: String): String {
        return string.lowercase().trim()
    }

}
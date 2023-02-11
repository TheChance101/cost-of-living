package interactor

import model.CityEntity

class GetCheapestBananaCitiesNamesInteractor(private val dataSource: CostOfLivingDataSource) {

    fun execute(vararg cities: String): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullBananaPricesAndLowQualityData)
            .filter { it.cityName in cities }
            .sortedBy { it.fruitAndVegetablesPrices.banana1kg }
            .map { it.cityName }
    }

    private fun excludeNullBananaPricesAndLowQualityData(city: CityEntity): Boolean {
        return city.fruitAndVegetablesPrices.banana1kg != null && city.dataQuality
    }

}
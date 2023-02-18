package interactor

import model.CityEntity

class  GetCheapestBananaPricesCitiesNamesInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun getCitiesVarArgs(): List<CityEntity> {
        return dataSource.getAllCitiesData()
    }

    fun execute(vararg cityEntities: CityEntity): List<String> {
        return cityEntities
            .filter { it.fruitAndVegetablesPrices.banana1kg != null }
            .sortedBy { it.fruitAndVegetablesPrices.banana1kg }
            .map { it.cityName }
            .takeIf { it.isNotEmpty() } ?: listOf("No Valid Data is Entered !")
    }
}

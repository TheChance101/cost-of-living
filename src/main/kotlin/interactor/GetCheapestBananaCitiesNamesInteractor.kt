package interactor

class GetCheapestBananaCitiesNamesInteractor(private val dataSource: CostOfLivingDataSource) {

    fun execute(vararg cities: String): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter { it.fruitAndVegetablesPrices.banana1kg != null && it.cityName in cities }
            .sortedBy { it.fruitAndVegetablesPrices.banana1kg }
            .map { it.cityName }
    }

}
package interactor

import model.CityEntity

class GetCheapestBananaCitiesNamesInteractor(private val dataSource: CostOfLivingDataSource) {

    fun execute(vararg cities: CityEntity): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter { it.fruitAndVegetablesPrices.banana1kg != null && it in cities }
            .sortedBy { it.fruitAndVegetablesPrices.banana1kg }
            .distinct()
            .map { it.cityName }
    }

}
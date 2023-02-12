package interactor

import model.CityEntity

class GetTopCitiesFruitsAndVegetablesLowestCostInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(cityEntity: CityEntity): List<String> {
        TODO("Not implemented yet")
    }

    fun excludeNullFruitsAndVegetables(city: CityEntity): Boolean {
        TODO("Not implemented yet")
    }

}
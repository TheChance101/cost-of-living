package interactor

import model.CityEntity

class GetTopCitiesFruitsAndVegetablesLowestCostInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullFruitAndVegetablePricesOrNullSalaries)
            .sortedBy(::compareFruitsAndVegetablesCostToSalary)
            .take(limit)
            .map { it.cityName }
    }

    fun excludeNullFruitAndVegetablePricesOrNullSalaries(city: CityEntity): Boolean {
        TODO("under testing")
    }

    private fun compareFruitsAndVegetablesCostToSalary(city: CityEntity): Float {
        TODO("under testing")

    }

    fun getAverageFruitAndVegetablePricesForCity(city: CityEntity): Float? {
        TODO("under testing")
    }

}
package interactor

import model.CityEntity

class GetTopCitiesFruitsAndVegetablesLowestCostInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limit: Int=10): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalaries)
            .sortedBy(::getTheAverageBetweenFruitsAndVegetablesCostToAverageSalary)
            .take(limit)
            .map { it.cityName }
    }

    fun excludeNullSalaries(city: CityEntity) =
        city.averageMonthlyNetSalaryAfterTax != null

    private fun getAverageOfFruitAndVegetablesPrices(city: CityEntity): Float {
        val fruitsAndVegetablesPrices = city.fruitAndVegetablesPrices
        val listOfPrices = listOfNotNull(
            fruitsAndVegetablesPrices.apples1kg,
            fruitsAndVegetablesPrices.banana1kg,
            fruitsAndVegetablesPrices.oranges1kg,
            fruitsAndVegetablesPrices.tomato1kg,
            fruitsAndVegetablesPrices.potato1kg,
            fruitsAndVegetablesPrices.onion1kg,
            fruitsAndVegetablesPrices.lettuceOneHead
        )
        return (listOfPrices.sum()).div(listOfPrices.size)
    }

    private fun getTheAverageBetweenFruitsAndVegetablesCostToAverageSalary(city: CityEntity) =
        getAverageOfFruitAndVegetablesPrices(city) / city.averageMonthlyNetSalaryAfterTax!!


}
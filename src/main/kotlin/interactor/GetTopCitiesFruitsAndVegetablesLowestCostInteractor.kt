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
        return getAverageFruitAndVegetablePricesForCity(city) != null && city.averageMonthlyNetSalaryAfterTax != null
    }

    private fun compareFruitsAndVegetablesCostToSalary(city: CityEntity): Float {
        return (getAverageFruitAndVegetablePricesForCity(city)!! / city.averageMonthlyNetSalaryAfterTax!!)

    }

    fun getAverageFruitAndVegetablePricesForCity(city: CityEntity): Float? {
        val fruitsAndVegetablesPrices = city.fruitAndVegetablesPrices
        val prices = listOf(
            fruitsAndVegetablesPrices.apples1kg,
            fruitsAndVegetablesPrices.banana1kg,
            fruitsAndVegetablesPrices.oranges1kg,
            fruitsAndVegetablesPrices.tomato1kg,
            fruitsAndVegetablesPrices.potato1kg,
            fruitsAndVegetablesPrices.onion1kg,
            fruitsAndVegetablesPrices.lettuceOneHead
        )
        val total = prices.filterNotNull().sum()
        val count = prices.count { it != null }
        return if (count > 0) total / count else null
    }

}
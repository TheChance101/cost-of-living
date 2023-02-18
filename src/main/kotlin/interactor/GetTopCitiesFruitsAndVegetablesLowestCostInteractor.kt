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
        return city.run {
            fruitAndVegetablesPrices.getAverageFruitAndVegetablesPrices() != null
                    && city.averageMonthlyNetSalaryAfterTax != null
        }
    }

    private fun compareFruitsAndVegetablesCostToSalary(city: CityEntity): Float {
        return city.run {
            fruitAndVegetablesPrices.getAverageFruitAndVegetablesPrices()!! / city.averageMonthlyNetSalaryAfterTax!!
        }
    }

}
package interactor

import model.CityEntity
import model.FruitAndVegetablesPrices

class GetAverageFruitAndVegetablesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullAndNonNumberSalaries)
            .sortedBy(::lowestCostComparingToTheSalaries)
            .take(10)
            .map { it.cityName }
    }

    private fun excludeNullAndNonNumberSalaries(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && !city.averageMonthlyNetSalaryAfterTax.isNaN()
    }

    private fun FruitAndVegetablesPrices.getAverageFruitVegetablesPrice(): Double {
        return mutableListOf(
            tomato1kg,
            potato1kg,
            lettuceOneHead,
            oranges1kg,
            onion1kg,
            banana1kg,
            apples1kg
        ).filterNotNull().average()
    }

    private fun lowestCostComparingToTheSalaries(city: CityEntity): Double {
        return city.fruitAndVegetablesPrices.getAverageFruitVegetablesPrice() / city.averageMonthlyNetSalaryAfterTax!!
    }

}

package interactor

import model.CityEntity

class GetLowestAvgFruitAndVegsPricesToSalariesInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .distinctBy { it.cityName }
            .filter(::excludeNullOrNegativeSalaries)
            .filter(::excludeNullOrNegativeFruitsAndVegs)
            .sortedBy {
                val avgSalary = it.averageMonthlyNetSalaryAfterTax!!
                val averageFruitAndVegPrice = getAverageFruitAndVegPrice(it)
                averageFruitAndVegPrice / avgSalary
            }
            .take(limit)
            .map { it.cityName }
            .toList()
    }

    private fun getAverageFruitAndVegPrice(cityEntity: CityEntity): Float {
        return cityEntity.fruitAndVegetablesPrices.run {
            (apples1kg!!
                    + banana1kg!!
                    + oranges1kg!!
                    + tomato1kg!!
                    + potato1kg!!
                    + onion1kg!!
                    + lettuceOneHead!!) / 7.0f
        }

    }


    private fun excludeNullOrNegativeSalaries(cityEntity: CityEntity): Boolean {
        return cityEntity.averageMonthlyNetSalaryAfterTax != null &&
                cityEntity.averageMonthlyNetSalaryAfterTax > 0
    }

    private fun excludeNullOrNegativeFruitsAndVegs(cityEntity: CityEntity): Boolean {
        return cityEntity.fruitAndVegetablesPrices.run {
            (apples1kg != null && apples1kg > 0) && (banana1kg != null && banana1kg > 0)
                    && (oranges1kg != null && oranges1kg > 0) && (tomato1kg != null && tomato1kg > 0)
                    && (potato1kg != null && potato1kg > 0) && (onion1kg != null && onion1kg > 0)
                    && (lettuceOneHead != null && lettuceOneHead > 0)
        }
    }
}

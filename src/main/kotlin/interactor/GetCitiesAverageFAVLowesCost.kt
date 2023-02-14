package interactor

import model.CityEntity
import model.FruitAndVegetablesPrices

class GetCitiesAverageFAVLowesCost (
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndFAVPrices)
            .sortedByDescending {getAverageFAVPricesCompareToSalaries(it.fruitAndVegetablesPrices,it.averageMonthlyNetSalaryAfterTax!!)}
            .take(limit)
            .map { it.cityName }
    }

    private fun getAverageFAVPricesCompareToSalaries(
        fruitAndVegetablesPrices: FruitAndVegetablesPrices,
        averageMonthlyNetSalaryAfterTax: Float
    ) : Float {
        var count = 0.0f
        fruitAndVegetablesPrices.apply {
            if(apples1kg != null){count++}
            if(banana1kg != null){count++}
            if(oranges1kg != null){count++}
            if(tomato1kg != null){count++}
            if(potato1kg != null){count++}
            if(onion1kg != null){count++}
            if(lettuceOneHead != null){count++}

            return averageMonthlyNetSalaryAfterTax - (((apples1kg?:0.0f) + (banana1kg?:0.0f) + (oranges1kg?:0.0f) + (tomato1kg?:0.0f) + (potato1kg?:0.0f) + (onion1kg?:0.0f) + (lettuceOneHead?:0.0f)) / count)
        }
    }

    private fun excludeNullSalariesAndFAVPrices(city: CityEntity): Boolean {
        city.fruitAndVegetablesPrices.apply {
            return city.averageMonthlyNetSalaryAfterTax != null && apples1kg != null && banana1kg != null && oranges1kg != null && tomato1kg != null && potato1kg != null && onion1kg != null && lettuceOneHead != null
        }

    }

}
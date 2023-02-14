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
        var total = 0.0f
        fruitAndVegetablesPrices.apply {
            if(apples1kg != null){count++ ; total += apples1kg}
            if(banana1kg != null){count++ ; total += banana1kg}
            if(oranges1kg != null){count++ ; total += oranges1kg}
            if(tomato1kg != null){count++ ; total += tomato1kg}
            if(potato1kg != null){count++ ; total += potato1kg}
            if(onion1kg != null){count++ ; total += onion1kg}
            if(lettuceOneHead != null){count++ ; total += lettuceOneHead}

            return averageMonthlyNetSalaryAfterTax - (total / count)
        }
    }

    private fun excludeNullSalariesAndFAVPrices(city: CityEntity): Boolean {
        city.fruitAndVegetablesPrices.apply {
            return city.averageMonthlyNetSalaryAfterTax != null && apples1kg != null && banana1kg != null && oranges1kg != null && tomato1kg != null && potato1kg != null && onion1kg != null && lettuceOneHead != null
        }

    }

}
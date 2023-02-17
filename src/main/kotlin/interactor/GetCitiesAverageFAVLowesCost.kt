package interactor

import model.CityEntity
import model.FruitAndVegetablesPrices

class GetCitiesAverageFAVLowesCost (
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::isNotNullSalaryAndAnyOfFruitsAndVegetablesPricesAreNotNull)
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
            apples1kg?.let {count++ ; total += apples1kg }
            banana1kg?.let {count++ ; total += banana1kg}
            oranges1kg?.let{count++ ; total += oranges1kg}
            tomato1kg?.let{count++ ; total += tomato1kg}
            potato1kg?.let{count++ ; total += potato1kg}
            onion1kg?.let{count++ ; total += onion1kg}
            lettuceOneHead?.let{count++ ; total += lettuceOneHead}

            return averageMonthlyNetSalaryAfterTax - (total / count)
        }
    }

    private fun isNotNullSalaryAndAnyOfFruitsAndVegetablesPricesAreNotNull(city: CityEntity): Boolean {
        city.fruitAndVegetablesPrices.apply {
            return city.averageMonthlyNetSalaryAfterTax != null && (apples1kg != null || banana1kg != null || oranges1kg != null || tomato1kg != null || potato1kg != null || onion1kg != null || lettuceOneHead != null)
        }

    }

}
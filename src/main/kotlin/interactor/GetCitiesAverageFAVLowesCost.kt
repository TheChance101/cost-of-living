package interactor

import model.CityEntity

class GetCitiesAverageFAVLowesCost(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData().let { if (limit < 1) return emptyList() else it }
            .filter(::isNotNullSalaryAndNotNullFruitsAndVegetablesPrices)
            .sortedByDescending { it.getAverageFAVPricesCompareToSalaries() }
            .take(limit)
            .map { it.cityName }
    }

    private fun CityEntity.getAverageFAVPricesCompareToSalaries() =
        fruitAndVegetablesPrices.run {
            var count = 0.0f
            var total = 0.0f
            apples1kg?.let { count++; total += apples1kg }
            banana1kg?.let { count++; total += banana1kg }
            oranges1kg?.let { count++; total += oranges1kg }
            tomato1kg?.let { count++; total += tomato1kg }
            potato1kg?.let { count++; total += potato1kg }
            onion1kg?.let { count++; total += onion1kg }
            lettuceOneHead?.let { count++; total += lettuceOneHead }

            averageMonthlyNetSalaryAfterTax!! - (total / count)
        }


    private fun isNotNullSalaryAndNotNullFruitsAndVegetablesPrices(city: CityEntity): Boolean {
        city.fruitAndVegetablesPrices.apply {
            return city.averageMonthlyNetSalaryAfterTax != null && (apples1kg != null || banana1kg != null || oranges1kg != null || tomato1kg != null || potato1kg != null || onion1kg != null || lettuceOneHead != null)
        }

    }

}
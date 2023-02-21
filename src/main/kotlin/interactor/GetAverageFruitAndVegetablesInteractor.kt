package interactor

import model.CityEntity

class GetAverageFruitAndVegetablesInteractor(private val dataSource: CostOfLivingDataSource) {

    fun execute(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullFruitVegPriceAndNullSalaries)
            .sortedBy(::calculateTheRatioBetweenFruitVegPriceAndSalary)
            .take(limit)
            .map(CityEntity::cityName)
    }

    fun excludeNullFruitVegPriceAndNullSalaries(city: CityEntity) =
        checkNullableFruitAndVegetablePrices(city) && city.averageMonthlyNetSalaryAfterTax != null

    private fun checkNullableFruitAndVegetablePrices(city: CityEntity) =
        with(city.fruitAndVegetablesPrices) {
            apples1kg != null && banana1kg != null && oranges1kg != null && tomato1kg != null
                    && potato1kg != null && onion1kg != null && lettuceOneHead != null
        }

    private fun calculateTheRatioBetweenFruitVegPriceAndSalary(city: CityEntity) =
        city.fruitAndVegetablesPrices.getAverageFruitsAndVegetablesPrice() / city.averageMonthlyNetSalaryAfterTax!!

}

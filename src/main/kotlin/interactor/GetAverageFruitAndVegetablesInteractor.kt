package interactor

import model.CityEntity

class GetAverageFruitAndVegetablesInteractor(private val dataSource: CostOfLivingDataSource) {

    fun execute(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullFruitAndVegetablePriceAndNullSalaries)
            .sortedBy(::calculateFruitVeggiePriceToSalaryRatio)
            .take(limit)
            .map(CityEntity::cityName)
    }

    fun excludeNullFruitAndVegetablePriceAndNullSalaries(city: CityEntity) =
        checkNullableFruitAndVegetablePrices(city) && city.averageMonthlyNetSalaryAfterTax != null

    private fun checkNullableFruitAndVegetablePrices(city: CityEntity) =
        with(city.fruitAndVegetablesPrices) {
            apples1kg != null && banana1kg != null && oranges1kg != null && tomato1kg != null
                    && potato1kg != null && onion1kg != null && lettuceOneHead != null
        }

    private fun calculateFruitVeggiePriceToSalaryRatio(city: CityEntity) =
        city.fruitAndVegetablesPrices.getAverageFruitsAndVegetablesPrice() / city.averageMonthlyNetSalaryAfterTax!!

}

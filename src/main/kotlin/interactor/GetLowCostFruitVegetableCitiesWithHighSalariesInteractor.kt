package interactor

import interactor.util.Constants.DEFAULT_VALUE
import interactor.util.Constants.LIMIT
import model.CityEntity
import model.FruitAndVegetablesPrices



class GetLowCostFruitVegetableCitiesWithHighSalariesInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): List<CityEntity> {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullSalaries)
            .sortedBy { excludeNullFruitVegPrices(it.fruitAndVegetablesPrices).div(it.averageMonthlyNetSalaryAfterTax!!) }
            .take(LIMIT)
    }
    private fun excludeNullSalaries(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null
    }
    private fun excludeNullFruitVegPrices(fruitAndVegetablesPrices: FruitAndVegetablesPrices): Float {
        var total = DEFAULT_VALUE
        fruitAndVegetablesPrices.apples1kg?.let { total += it }
        fruitAndVegetablesPrices.banana1kg?.let { total += it }
        fruitAndVegetablesPrices.lettuceOneHead?.let { total += it }
        fruitAndVegetablesPrices.onion1kg?.let { total += it }
        fruitAndVegetablesPrices.oranges1kg?.let { total += it }
        fruitAndVegetablesPrices.potato1kg?.let { total += it }
        fruitAndVegetablesPrices.tomato1kg?.let { total += it }
        return total
    }
}
package interactor

import model.CityEntity
import model.FruitAndVegetablesPrices



class GetCitiesHasLowestFruitVegPricesComparingSalariesPaid(private val dataSource: CostOfLivingDataSource)
{

    fun execute(): List<CityEntity> {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullSalaries)
            .sortedBy { excludeNullFruitVegPrices(it.fruitAndVegetablesPrices).div(it.averageMonthlyNetSalaryAfterTax!!) }
            .subList(0,10)
    }
    private fun excludeNullSalaries(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null
    }
    private fun excludeNullFruitVegPrices(fruitAndVegetablesPrices: FruitAndVegetablesPrices): Float {
        return fruitAndVegetablesPrices.apples1kg?.let { apples ->
                    fruitAndVegetablesPrices.banana1kg?.let { bananas ->
                        fruitAndVegetablesPrices.lettuceOneHead?.let { lettuce ->
                            fruitAndVegetablesPrices.onion1kg?.let { onions ->
                                fruitAndVegetablesPrices.oranges1kg?.let { oranges ->
                                    fruitAndVegetablesPrices.potato1kg?.let { potatoes ->
                                        fruitAndVegetablesPrices.tomato1kg?.let { tomatoes ->
                                            apples + bananas + lettuce + onions + oranges + potatoes + tomatoes
                                        } ?: 0f
                                    } ?: 0f
                                } ?: 0f
                            } ?: 0f
                        } ?: 0f
                    } ?: 0f
            } ?: 0f
    }
}
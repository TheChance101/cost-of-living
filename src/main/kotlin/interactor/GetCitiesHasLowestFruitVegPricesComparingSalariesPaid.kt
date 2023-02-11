package interactor

import model.CityEntity
import model.FruitAndVegetablesPrices

class GetCitiesHasLowestFruitVegPricesComparingSalariesPaid
{
    private var dataSource: CostOfLivingDataSource? = null
    private var cityEntitylist: List<CityEntity> = listOf()

    constructor(dataSource: CostOfLivingDataSource){
        this.dataSource = dataSource
    }
    constructor(cityEntitylist: List<CityEntity>){
        this.cityEntitylist = cityEntitylist
    }

    fun execute(): List<CityEntity> {
        if(dataSource != null)
            cityEntitylist = dataSource!!.getAllCitiesData()

        return cityEntitylist
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
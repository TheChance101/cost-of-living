package interactor

import model.CityEntity
import model.FruitAndVegetablesPrices



class GetLowCostFruitVegetableCitiesWithHighSalariesInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(limit: Int): List<String> {
        if (limit>dataSource.getAllCitiesData().count()){
           return listOf("")
        }
        return dataSource.getAllCitiesData()
            .filter(::excludeNullSalariesAndNullFruitVegPrices)
            .sortedBy { getFruitVegTotalPrice(it.fruitAndVegetablesPrices).div(it.averageMonthlyNetSalaryAfterTax!!) }
            .take(limit)
            .map { it.cityName }
    }
    private fun excludeNullSalariesAndNullFruitVegPrices(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null &&
                city.fruitAndVegetablesPrices.apples1kg!= null &&
                city.fruitAndVegetablesPrices.banana1kg!= null &&
                city.fruitAndVegetablesPrices.lettuceOneHead!= null &&
                city.fruitAndVegetablesPrices.onion1kg!= null &&
                city.fruitAndVegetablesPrices.oranges1kg!= null &&
                city.fruitAndVegetablesPrices.potato1kg!= null &&
                city.fruitAndVegetablesPrices.tomato1kg!= null
    }

    private fun getFruitVegTotalPrice(fruitAndVegetablesPrices: FruitAndVegetablesPrices): Float {
        return fruitAndVegetablesPrices.apples1kg!!+
                fruitAndVegetablesPrices.banana1kg!!+
                fruitAndVegetablesPrices.lettuceOneHead!!+
                fruitAndVegetablesPrices.onion1kg!!+
                fruitAndVegetablesPrices.oranges1kg!!+
                fruitAndVegetablesPrices.potato1kg!!+
                fruitAndVegetablesPrices.tomato1kg!!
    }
}
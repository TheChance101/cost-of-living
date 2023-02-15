package interactor

import model.CityEntity
import model.FruitAndVegetablesPrices



class GetLowCostFruitVegetableCitiesWithHighSalariesInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(limit: Int): List<String> {
        if ( limit <=0 || limit>dataSource.getAllCitiesData().count()){
           return listOf("")
        } // check it again
        return dataSource.getAllCitiesData()
            .filter(::excludeNullSalariesAndNullFruitVegPrices)
            .sortedBy { calculateFruitVegTotalPrice(it.fruitAndVegetablesPrices).div(it.averageMonthlyNetSalaryAfterTax!!) }
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

    private fun calculateFruitVegTotalPrice(fruitAndVegetablesPrices: FruitAndVegetablesPrices): Float {
        return fruitAndVegetablesPrices.apples1kg!!+
                fruitAndVegetablesPrices.banana1kg!!+ //use with
                fruitAndVegetablesPrices.lettuceOneHead!!+
                fruitAndVegetablesPrices.onion1kg!!+
                fruitAndVegetablesPrices.oranges1kg!!+
                fruitAndVegetablesPrices.potato1kg!!+
                fruitAndVegetablesPrices.tomato1kg!!
    }
}
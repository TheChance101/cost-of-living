package interactor

import model.CityEntity
import model.FruitAndVegetablesPrices


class GetLowCostFruitVegetableCitiesWithHighSalariesInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(limit: Int): List<String> {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullSalariesAndNullFruitVegPrices)
            .sortedBy { calculateFruitVegTotalPrice(it.fruitAndVegetablesPrices).div(it.averageMonthlyNetSalaryAfterTax!!) }
            .takeUnless { limit<=0 || limit > it.count() }
            ?.take(limit)
            ?.map { it.cityName } ?: emptyList()
    }
    private fun excludeNullSalariesAndNullFruitVegPrices(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null &&
                with(city.fruitAndVegetablesPrices){
                    this.apples1kg!= null && this.banana1kg!= null && this.lettuceOneHead!= null &&
                    this.onion1kg!= null && this.oranges1kg!= null && this.potato1kg!= null &&
                    this.tomato1kg!= null
                }
    }
    private fun calculateFruitVegTotalPrice(fruitAndVegetablesPrices: FruitAndVegetablesPrices): Float =
        with(fruitAndVegetablesPrices){
                return this.apples1kg!! + this.banana1kg!!+ this.lettuceOneHead!!+ this.onion1kg!!+ this.oranges1kg!!+
                   this.potato1kg!!+ this.tomato1kg!!
        }
}
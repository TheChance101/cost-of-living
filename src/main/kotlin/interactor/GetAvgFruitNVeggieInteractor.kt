package interactor

import model.CityEntity
import model.FruitAndVegetablesPrices
class GetAvgFruitNVeggieInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(): List<CityEntity>? {
        val list = dataSource.getAllCitiesData()
        if (list.isEmpty()) return null
        return list

            .filter(::excludeNullSalaries)
            .filter(::excludeNullFruitsVegPrices)
            .sortedBy {
                FruitsAndVegetablesPrice(it.fruitAndVegetablesPrices, it.averageMonthlyNetSalaryAfterTax!!)
            }
            .take(10)
    }



    private fun excludeNullSalaries(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null
    }

    private fun excludeNullFruitsVegPrices(city: CityEntity): Boolean {
        with(city.fruitAndVegetablesPrices) {
            return apples1kg != null &&
                    banana1kg != null &&
                    oranges1kg != null &&
                    tomato1kg != null &&
                    potato1kg != null &&
                    onion1kg != null &&
                    lettuceOneHead != null
        }
    }
        fun FruitsAndVegetablesPrice(
            fruitAndVegetablesPrices: FruitAndVegetablesPrices,
            averageMonthlyNetSalaryAfterTax: Float?): Float {
            fruitAndVegetablesPrices.apply{
                return ((apples1kg!! + banana1kg!! +  oranges1kg!! + tomato1kg!! + potato1kg!! + onion1kg!! + lettuceOneHead!!)
                        .div(7)).div(averageMonthlyNetSalaryAfterTax!!)

            }
        }


}
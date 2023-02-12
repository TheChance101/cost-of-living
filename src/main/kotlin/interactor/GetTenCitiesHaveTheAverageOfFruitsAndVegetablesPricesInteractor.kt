package interactor

import model.CityEntity

class GetTenCitiesHaveTheAverageOfFruitsAndVegetablesPricesInteractor
    (private val dataSource: CostOfLivingDataSource) {

    fun execute(): List<String> {
        val list = dataSource.getAllCitiesData()
            .filter( ::excludeNullSalariesAndNullPrices )

      val average = averageOfFruitsAndVegetables(list)

        return list
            .filter { it.averageMonthlyNetSalaryAfterTax!! > average }
            .sortedBy { it.averageMonthlyNetSalaryAfterTax }
            .take(10)
            .map { it.cityName }
    }

    private fun excludeNullSalariesAndNullPrices(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null &&
                city.fruitAndVegetablesPrices.apples1kg != null &&
                city.fruitAndVegetablesPrices.banana1kg != null &&
                city.fruitAndVegetablesPrices.lettuceOneHead != null &&
                city.fruitAndVegetablesPrices.onion1kg != null &&
                city.fruitAndVegetablesPrices.tomato1kg != null &&
                city.fruitAndVegetablesPrices.potato1kg != null &&
                city.fruitAndVegetablesPrices.oranges1kg != null
    }

    private fun averageOfFruitsAndVegetables(list: List<CityEntity>): Float {
        var sum = 0f
        for (city in list) {
            with(city.fruitAndVegetablesPrices) {
                sum += apples1kg!! + banana1kg!! + lettuceOneHead!! +
                        onion1kg!! + tomato1kg!! + potato1kg!! + oranges1kg!!
            }
        }

        return sum / (7 * list.size)
    }
}
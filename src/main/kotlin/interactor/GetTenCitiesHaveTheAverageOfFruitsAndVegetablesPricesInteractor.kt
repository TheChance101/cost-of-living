package interactor

class GetTenCitiesHaveTheAverageOfFruitsAndVegetablesPricesInteractor
    (private val dataSource: CostOfLivingDataSource) {

    fun execute(): List<String> {
        val list = dataSource.getAllCitiesData()
            .filter {
                it.averageMonthlyNetSalaryAfterTax != null &&
                        it.fruitAndVegetablesPrices.apples1kg != null &&
                        it.fruitAndVegetablesPrices.banana1kg != null &&
                        it.fruitAndVegetablesPrices.lettuceOneHead != null &&
                        it.fruitAndVegetablesPrices.onion1kg != null &&
                        it.fruitAndVegetablesPrices.tomato1kg != null &&
                        it.fruitAndVegetablesPrices.potato1kg != null &&
                        it.fruitAndVegetablesPrices.oranges1kg != null
            }

        var sum = 0f
        for (city in list) {
            with(city.fruitAndVegetablesPrices) {
                sum += apples1kg!! + banana1kg!! + lettuceOneHead!! +
                        onion1kg!! + tomato1kg!! + potato1kg!! + oranges1kg!!
            }
        }

        val average = sum / (7 * list.size)

        val salariesThatLessThanAverage = list
            .filter { it.averageMonthlyNetSalaryAfterTax!! > average }
            .sortedBy { it.averageMonthlyNetSalaryAfterTax }
            .take(10)
            .map { it.cityName }

        return salariesThatLessThanAverage
    }
}
package interactor

import model.CityEntity

class GetTenCitiesHaveTheAverageOfFruitsAndVegetablesPricesInteractor
    (private val dataSource: CostOfLivingDataSource) {

    fun execute(): List<String> {
        val list = dataSource.getAllCitiesData()
            .filter( ::excludeNullSalariesAndNullPrices )
            .sortingWithAveragePrice()
            .take(10)
            .map { it.cityName }
        return if(list.isEmpty()) listOf()
        else list
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

    private fun averageOfFruitsAndVegetables(city: CityEntity): Float {
        var sum : Float
            city.fruitAndVegetablesPrices.apply {
                sum = apples1kg!! + banana1kg!! + lettuceOneHead!! +
                        onion1kg!! + tomato1kg!! + potato1kg!! + oranges1kg!!
            }
        return (sum / 7)
    }

    private fun List<CityEntity>.sortingWithAveragePrice(): List<CityEntity> {
        return this.sortedByDescending {
            (it.averageMonthlyNetSalaryAfterTax?.div(
                averageOfFruitsAndVegetables(it)
            ))
        }
    }
}
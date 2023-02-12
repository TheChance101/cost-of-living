package interactor

import model.CityEntity

class GetTopCitiesFruitsAndVegetablesLowestCostInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit:Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .take(limit)
            .map { it.cityName }
    }

    fun excludeNullFruitsAndVegetables(city: CityEntity): Boolean {
        return city.fruitAndVegetablesPrices.banana1kg != null||
                city.fruitAndVegetablesPrices.apples1kg != null ||
                city.fruitAndVegetablesPrices.onion1kg != null ||
                city.fruitAndVegetablesPrices.lettuceOneHead != null ||
                city.fruitAndVegetablesPrices.oranges1kg != null ||
                city.fruitAndVegetablesPrices.tomato1kg != null ||
                city.fruitAndVegetablesPrices.potato1kg != null
    }

    fun excludeNullSalaries(city: CityEntity):Boolean{
        return city.averageMonthlyNetSalaryAfterTax != null
    }



}
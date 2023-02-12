package interactor

import model.CityEntity

class GetTopCitiesFruitsAndVegetablesLowestCostInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(cityEntity: CityEntity): List<String> {
        TODO("Not implemented yet")
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
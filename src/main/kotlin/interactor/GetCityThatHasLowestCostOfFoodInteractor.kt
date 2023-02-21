package interactor

import model.CityEntity
import utils.isNotNull


/**
write a function that return the city name that has the lowest cost of
food (rice , loaf of bread , chicken , eggs,cheese , beef)
let your function return list of paris that has city name and the cost
data quality should be high
 * **/
class GetCityThatHasLowestCostOfFoodInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(): CityEntity {
        return dataSource
            .getAllCitiesData()
            .ifEmpty { throw IllegalStateException() }
            .filter(::excludeNullFoodPricesAndLowQualityData)
            .minByOrNull { it.getCostOfFood() }
            ?: throw NoSuchElementException("No any city matching the given condition")
    }

}

private fun excludeNullFoodPricesAndLowQualityData(city: CityEntity): Boolean {
    return city.foodPrices.loafOfFreshWhiteBread500g.isNotNull() &&
            city.foodPrices.chickenFillets1kg.isNotNull() &&
            city.foodPrices.eggsRegular12.isNotNull() &&
            city.foodPrices.riceWhite1kg.isNotNull() &&
            city.foodPrices.localCheese1kg.isNotNull() &&
            city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat.isNotNull()
            && city.dataQuality
}

private fun CityEntity.getCostOfFood(): Float {
    return foodPrices.loafOfFreshWhiteBread500g!! +
            foodPrices.chickenFillets1kg!! +
            foodPrices.eggsRegular12!! +
            foodPrices.riceWhite1kg!! +
            foodPrices.localCheese1kg!! +
            foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!!
}
package interactor

import jdk.internal.net.http.common.Pair
import model.CityEntity


/**
write a function that return the city name that has the lowest cost of
food (rice , loaf of bread , chicken , eggs,cheese , beef)
let your function return list of paris that has city name and the cost
data quality should be high
 * **/
 class GetCityThatHasLowestCostOfFoodInteractor(
    private val dataSource: CostOfLivingDataSource,
)  {
    fun execute(): List<Pair<String, Float>> {
        return dataSource
            .getAllCitiesData()
            .also { if (it.isEmpty() )throw  IllegalStateException() }
            .filter(::excludeNullFoodPricesAndLowQualityData)
            .also { if (it.isNotEmpty()) throw NoReturnedDataException1 ("no data returned")}
            .sortedByDescending { it.getCostOfFood() }
            .take(1)
            .map {
                Pair.pair(it.cityName, it.getCostOfFood())
            }
        }

    override fun getAllCitiesData(): List<CityEntity> {
        TODO("Not yet implemented")
    }

}
private fun excludeNullFoodPricesAndLowQualityData(city: CityEntity): Boolean {
    return city.foodPrices.loafOfFreshWhiteBread500g != null&&
            city.foodPrices.chickenFillets1kg != null&&
            city.foodPrices.eggsRegular12 != null&&
            city.foodPrices.riceWhite1kg != null&&
            city.foodPrices.localCheese1kg != null&&
            city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat != null
            && city.dataQuality
}
private fun CityEntity.getCostOfFood() : Float{
    return  foodPrices.loafOfFreshWhiteBread500g!!+
            foodPrices.chickenFillets1kg!! +
            foodPrices.eggsRegular12!!+
            foodPrices.riceWhite1kg!!+
            foodPrices.localCheese1kg!!+
            foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!!
}

class NoReturnedDataException1 (message : String):
    Exception (message)



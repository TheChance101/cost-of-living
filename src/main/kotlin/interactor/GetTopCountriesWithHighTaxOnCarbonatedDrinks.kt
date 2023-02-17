package interactor
import model.CityEntity

class GetTopCountriesWithHighTaxOnCarbonatedDrinks (private val dataSource: CostOfLivingDataSource){
    fun execute(limit: Int, cities: List<CityEntity>): List<Pair<String, Double>> {
        return cities.asSequence()
            .filter(::excludeNullDrinkPriceAndNegativePriceAndLowQualityData)
            .groupBy { it.country }
            .mapValues { entry ->
                val drinksPrices = entry.value.flatMap { city ->
                    listOfNotNull(city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants)
                }
                drinksPrices.average()
            }
            .toList()
            .sortedByDescending { it.second }
            .take(limit)
    }
    private fun excludeNullDrinkPriceAndNegativePriceAndLowQualityData(city: CityEntity): Boolean {
        return  city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants != null
                && city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants  > 0
                && city.country!= null
                && city.dataQuality
    }
}
package interactor
import model.CityEntity
import utils.isNotNull

class GetTopCountriesWithHighTaxOnCarbonatedDrinks (private val dataSource: CostOfLivingDataSource){
    fun execute(limit: Int, cities: List<CityEntity>): List<Pair<String, Double>> {
        return cities.asSequence()
            .filter(::excludeNullableLowQualityPrices)
            .groupBy { it.country }
            .mapValues { entry ->
                entry.value.flatMap { city ->
                    listOfNotNull(city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants)
                }
               .average()
            }
            .toList()
            .sortedByDescending { it.second }
            .take(limit)
    }
    private fun excludeNullableLowQualityPrices(city: CityEntity): Boolean {
        return hasValidDrinkPrice(city) && hasValidCountry(city) && hasValidDataQuality(city)
    }

    private fun hasValidDrinkPrice(city: CityEntity): Boolean {
        return city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants.isNotNull()
                && city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants!! >= 0
    }

    private fun hasValidCountry(city: CityEntity): Boolean =city.country.isNotNull()

    private fun hasValidDataQuality(city: CityEntity): Boolean =city.dataQuality
}



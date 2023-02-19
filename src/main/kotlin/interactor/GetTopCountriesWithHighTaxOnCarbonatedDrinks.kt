package interactor
import model.CityEntity
import utils.NoReturnedDataException
import utils.isNotNull

class GetTopCountriesWithHighTaxOnCarbonatedDrinks (private val dataSource: CostOfLivingDataSource){
    fun execute(limit: Int): List<Pair<String, Double>> {
        return dataSource.getAllCitiesData()
            .also { if (it.isEmpty()){
                throw NoReturnedDataException(message = "List Of Data is Empty " )
            }}
           .asSequence()
            .filter(::excludeNullDrinkPriceAndNegativePriceAndLowQualityData)
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
    private fun excludeNullDrinkPriceAndNegativePriceAndLowQualityData(city: CityEntity): Boolean {
        return city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants.isNotNull()
                && city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants!! > 0
                && city.country.isNotNull()
                && city.dataQuality
    }
}



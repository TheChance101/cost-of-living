package interactor
import model.DrinksPrices
import model.CityEntity
import java.util.*

class GetTop10CountriesWithHighTaxOnCarbonatedDrinks ( private val dataSource: CostOfLivingDataSource){
    fun execute(cities:List<CityEntity>): List<Pair<String, Float?>> {
        return cities
            .asSequence()
            .filter(::excludeNullDrinkPriceAndNegativePriceAndLowQualityData)
            .distinctBy { it.country }
            .sortedByDescending { it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants }
            .take(10)
            .map { Pair(it.country ,it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants)}
            .toList()
    }
    private fun excludeNullDrinkPriceAndNegativePriceAndLowQualityData(city: CityEntity): Boolean {
        return  city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants != null
                && city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants  > 0
                && city.country!= null
                && city.dataQuality
    }
}
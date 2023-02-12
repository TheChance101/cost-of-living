package interactor
import model.DrinksPrices
import model.CityEntity
import java.util.*

class GetTopTenCoutriesHaveHighCarbonatedDrinksPrices(private val dataSource: CostOfLivingDataSource){
        fun execute(limit: Int, cities: List<CityEntity>): List<Pair<String, Float?>> {
            return cities
                .asSequence()
                .filter(::exceptionNullDrinkPriceAndUnderZeroPriceAndLowQualityData)
                .distinctBy { it.country }
                .sortedByDescending { it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants }
                .take(limit)
                .map { Pair(it.country, it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants) }
                .toList()
        }

        private fun exceptionNullDrinkPriceAndUnderZeroPriceAndLowQualityData(city: CityEntity): Boolean {
            return  city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants != null
                    && city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants  > 0
                    && city.country!= null
                    && city.dataQuality
        }
    }

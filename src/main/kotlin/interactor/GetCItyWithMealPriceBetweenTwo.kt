package interactor

import model.CityEntity
import kotlin.math.absoluteValue

class GetCItyWithMealPriceBetweenTwo(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(): CityEntity? {
        val allCities = dataSource.getAllCitiesData()
            .filter(::excludeNullMealPricesAndOtherThanUsaCanadaMexico)
            .sortedBy { getSumOfPrices(it) }

        return if(allCities.size>2) {
            findNearestPrice(allCities,(getSumOfPrices(allCities.first()) + getSumOfPrices(allCities.last())) / 2)
        }
        else null
    }

    fun getSumOfPrices(city: CityEntity): Float {
        return city.mealsPrices.mealAtMcDonaldSOrEquivalent!! +
                city.mealsPrices.mealInexpensiveRestaurant!! +
                city.mealsPrices.mealFor2PeopleMidRangeRestaurant!!
    }

    fun findNearestPrice(listOfCity:List<CityEntity>,priceToFindNearest:Float): CityEntity{
        var nearestPrice = listOfCity[0]
        var differenceBetweenPrices = (getSumOfPrices(nearestPrice) - priceToFindNearest).absoluteValue

        listOfCity.forEach{
            if((getSumOfPrices(it)-priceToFindNearest).absoluteValue < differenceBetweenPrices)
            {
                differenceBetweenPrices = (getSumOfPrices(it)-getSumOfPrices(nearestPrice)).absoluteValue
                nearestPrice = it
            }
        }
        return nearestPrice
    }

    private fun excludeNullMealPricesAndOtherThanUsaCanadaMexico(city: CityEntity): Boolean {
        return city.mealsPrices.mealInexpensiveRestaurant != null &&
                city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null &&
                city.mealsPrices.mealAtMcDonaldSOrEquivalent != null &&
                listOf("United States", "Canada", "Mexico").contains(city.country)
    }

}

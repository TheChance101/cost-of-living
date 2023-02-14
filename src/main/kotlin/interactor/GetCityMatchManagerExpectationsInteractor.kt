package interactor

import dataSource.utils.NorthAmericaCountries
import model.CityEntity
import model.MealsPrices

class GetCityMatchManagerExpectationsInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    private fun getOnlyNorthAmericaCountries(city: CityEntity): Boolean =
        city.country in NorthAmericaCountries.list

    private fun getHighestPrice(sortedCities: List<CityEntity>) =
        sortedCities.lastOrNull()?.mealsPrices?.mealFor2PeopleMidRangeRestaurant

    private fun getLowestPrice(sortedCities: List<CityEntity>) =
        sortedCities.firstOrNull()?.mealsPrices?.mealFor2PeopleMidRangeRestaurant

    private fun getMidRangePrice(lowestPrice: Float?, highestPrice: Float?) =
        (lowestPrice ?: 0.0f) + ((highestPrice ?: 0.0f) - (lowestPrice ?: 0.0f)) / 2


    private fun getCityWithMidRangePrice(cities: List<CityEntity>): CityEntity? =
        cities.find {
            it.mealsPrices.mealFor2PeopleMidRangeRestaurant == getMidRangePrice(
                getLowestPrice(cities),
                getHighestPrice(cities)
            )
        }

    private fun List<CityEntity>.getClosestMealPriceCity(midRangePrice: Float): CityEntity? =
        minByOrNull { kotlin.math.abs(it.mealsPrices.mealFor2PeopleMidRangeRestaurant ?: 0.0f - midRangePrice) }


    fun execute(): CityEntity {
        val sortedList = dataSource.getAllCitiesData()
            .filter(::getOnlyNorthAmericaCountries)
            .sortedBy { it.mealsPrices.mealFor2PeopleMidRangeRestaurant }

    }


}


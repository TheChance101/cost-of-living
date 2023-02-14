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


    fun execute(): CityEntity {

    }


}


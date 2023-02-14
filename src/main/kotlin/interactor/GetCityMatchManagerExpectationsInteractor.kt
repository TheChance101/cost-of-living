package interactor

import dataSource.utils.NorthAmericaCountries
import model.CityEntity
import model.MealsPrices

class GetCityMatchManagerExpectationsInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    private fun getOnlyNorthAmericaCountries(city: CityEntity): Boolean =
        city.country in NorthAmericaCountries.list


    private fun getLowestPrice(sortedCities: List<CityEntity>) =
        sortedCities.firstOrNull()?.mealsPrices?.mealFor2PeopleMidRangeRestaurant

    fun execute(): CityEntity {
      
    }


}


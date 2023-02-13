package interactor

import dataSource.utils.NorthAmericaCountries
import model.CityEntity

class GetCityMatchManagerExpectationsInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    private fun getOnlyNorthAmericaCountries(city: CityEntity): Boolean = city.country in NorthAmericaCountries.list

    private fun getOnlyMealPrice(city: CityEntity): Boolean = city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null

    fun execute(): CityEntity {
        return dataSource.getAllCitiesData()
            .filter(::getOnlyNorthAmericaCountries)
            .filter(::getOnlyMealPrice).first()
    }


}
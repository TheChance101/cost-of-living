package interactor

import dataSource.utils.NorthAmericaCountries
import model.CityEntity

class GetCityMatchManagerExpectationsInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    private fun getOnlyNorthAmericaCountries(city: CityEntity): Boolean =
        city.country in NorthAmericaCountries.list

    private fun getHighestMealInexpensiveRestaurantPrice(cityEntities: List<CityEntity>): CityEntity? =
        cityEntities.maxByOrNull { it.mealsPrices.mealInexpensiveRestaurant ?: 0.0f }

    private fun getHighestMealAtMcDonaldSOrEquivalentPrice(cityEntities: List<CityEntity>): CityEntity? =
        cityEntities.maxByOrNull { it.mealsPrices.mealAtMcDonaldSOrEquivalent ?: 0.0f }

    private fun getHighestMealFor2PeopleMidRangeRestaurantPrice(cityEntities: List<CityEntity>): CityEntity? =
        cityEntities.maxByOrNull { it.mealsPrices.mealFor2PeopleMidRangeRestaurant ?: 0.0f }


    fun execute(): CityEntity {
        return dataSource.getAllCitiesData()
            .filter(::getOnlyNorthAmericaCountries)

            .first()
    }


}


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

    fun forTesting(): List<CityEntity> {
        return dataSource.getAllCitiesData()
            .filter(::getOnlyNorthAmericaCountries).filter(::getOnlyMealPrice)
    }

}

/* for testing
    @Test
    fun `should `() {
        // given a list of countries that are in north america
        val givenValue = null
        // when we check if the countries are in north america
        val result = interactor.forTesting()

        result.forEach { city ->
            println("${city.country} ${city.mealsPrices.mealInexpensiveRestaurant?.let { it * 11 }} ${city.mealsPrices.mealFor2PeopleMidRangeRestaurant?.let { (it * 5) + 1 }} ${city.mealsPrices.mealAtMcDonaldSOrEquivalent?.let { it * 11 }}")
        }

        // then we should get true
//        assertNotEquals(givenValue, result.mealsPrices.mealFor2PeopleMidRangeRestaurant)
    }


*/
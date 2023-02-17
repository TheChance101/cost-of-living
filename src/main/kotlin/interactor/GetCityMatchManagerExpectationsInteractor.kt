package interactor

import model.CityEntity

class GetCityMatchManagerExpectationsInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): CityEntity {
        val sortedList = dataSource.getAllCitiesData()
            .filter { it.country in onlyRequiredCountries }
            .sortedBy { it.mealsPrices.mealFor2PeopleMidRangeRestaurant }
        val cityWithMidRangePrice = getCityWithMidRangePrice(sortedList)?.mealsPrices?.mealFor2PeopleMidRangeRestaurant
        return sortedList
            .getClosestMealPriceCity(cityWithMidRangePrice ?: 0.0f) ?: dataSource.getAllCitiesData()[0]
    }


    private fun List<CityEntity>.getClosestMealPriceCity(midRangePrice: Float): CityEntity? =
        minByOrNull { kotlin.math.abs(it.mealsPrices.mealFor2PeopleMidRangeRestaurant ?: (0.0f - midRangePrice)) }

    private fun getCityWithMidRangePrice(cities: List<CityEntity>): CityEntity? =
        cities.find {
            it.mealsPrices.mealFor2PeopleMidRangeRestaurant == getMidRangePrice(
                getLowestPrice(cities),
                getHighestPrice(cities)
            )
        }

    private fun getMidRangePrice(lowestPrice: Float?, highestPrice: Float?) =
        (lowestPrice ?: 0.0f) + ((highestPrice ?: 0.0f) - (lowestPrice ?: 0.0f)) / 2

    private fun getLowestPrice(sortedCities: List<CityEntity>) =
        sortedCities.firstOrNull()?.mealsPrices?.mealFor2PeopleMidRangeRestaurant

    private fun getHighestPrice(sortedCities: List<CityEntity>) =
        sortedCities.lastOrNull()?.mealsPrices?.mealFor2PeopleMidRangeRestaurant


    companion object {
        val onlyRequiredCountries: List<String> = listOf(
            "United States",
            "Canada",
            "Mexico"
        )
    }

}


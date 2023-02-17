package interactor

import model.CityEntity

class GetCityMatchManagerExpectationsInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): CityEntity {
        return dataSource.getAllCitiesData()
            .filter { it.country in onlyRequiredCountries }.let(::getLowestPrice)!!

    }
    //            .sortedBy { it.mealsPrices.mealFor2PeopleMidRangeRestaurant }
//        val cityWithMidRangePrice = getCityWithMidRangePrice(sortedList)?.mealsPrices?.mealFor2PeopleMidRangeRestaurant
//        return sortedList
//            .getClosestMealPriceCity(cityWithMidRangePrice ?: 0.0f) ?: dataSource.getAllCitiesData()[0]


    private fun getHighestPrice(cities: List<CityEntity>) =
        cities.maxByOrNull {
            listOfNotNull(
                it.mealsPrices.mealInexpensiveRestaurant,
                it.mealsPrices.mealFor2PeopleMidRangeRestaurant?.div(2) ?: 0f,
                it.mealsPrices.mealAtMcDonaldSOrEquivalent
            )
                .maxOrNull() ?: 0f
        }

    private fun getLowestPrice(cities: List<CityEntity>) =
        cities.minByOrNull {
            listOfNotNull(
                it.mealsPrices.mealInexpensiveRestaurant,
                it.mealsPrices.mealFor2PeopleMidRangeRestaurant?.div(2) ?: 0f,
                it.mealsPrices.mealAtMcDonaldSOrEquivalent
            )
                .minOrNull() ?: 0f
        }


    private fun List<CityEntity>.getClosestMealPriceCity(midRangePrice: Float): CityEntity? =
        minByOrNull { kotlin.math.abs(it.mealsPrices.mealFor2PeopleMidRangeRestaurant ?: (0.0f - midRangePrice)) }

//    private fun getCityWithMidRangePrice(cities: List<CityEntity>): CityEntity? =
//        cities.find {
//            it.mealsPrices.mealFor2PeopleMidRangeRestaurant == getMidRangePrice(
//                getLowestPrice(cities),
//                getHighestPrice(cities)
//            )
//        }

    private fun getMidRangePrice(lowestPrice: Float?, highestPrice: Float?) =
        (lowestPrice ?: 0.0f) + ((highestPrice ?: 0.0f) - (lowestPrice ?: 0.0f)) / 2


    companion object {
        val onlyRequiredCountries: List<String> = listOf(
            "United States",
            "Canada",
            "Mexico"
        )
    }

}


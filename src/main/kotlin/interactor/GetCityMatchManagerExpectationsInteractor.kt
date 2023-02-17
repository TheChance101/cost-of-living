package interactor

import model.CityEntity
import kotlin.math.abs

class GetCityMatchManagerExpectationsInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): CityEntity? {

    }

    private fun getMidRangePrices(city: CityEntity): Float = city.mealsPrices.run {
        sequenceOf(
            mealInexpensiveRestaurant,
            mealFor2PeopleMidRangeRestaurant,
            mealAtMcDonaldSOrEquivalent
        ).filterNotNull().let {
            getMidMealsPrice(city)
        }
    }

    private fun getMidMealsPrice(city: CityEntity) =
        abs(
            (getHighestPrice(city) + getLowestPrice(city)) / 2 - (city.mealsPrices.mealFor2PeopleMidRangeRestaurant
                ?: 0f)
        )


    private fun getHighestPrice(city: CityEntity) = sequenceOf(
        city.mealsPrices.mealInexpensiveRestaurant,
        city.mealsPrices.mealFor2PeopleMidRangeRestaurant,
        city.mealsPrices.mealAtMcDonaldSOrEquivalent
    ).filterNotNull().maxOrNull() ?: Float.MIN_VALUE

    private fun getLowestPrice(city: CityEntity) =
        sequenceOf(
            city.mealsPrices.mealInexpensiveRestaurant,
            city.mealsPrices.mealFor2PeopleMidRangeRestaurant?.div(2) ?: Float.MIN_VALUE,
            city.mealsPrices.mealAtMcDonaldSOrEquivalent
        )
            .filterNotNull()
            .minOrNull() ?: Float.MIN_VALUE


    companion object {
        val onlyRequiredCountries: List<String> = listOf(
            "United States",
            "Canada",
            "Mexico"
        )
    }

}


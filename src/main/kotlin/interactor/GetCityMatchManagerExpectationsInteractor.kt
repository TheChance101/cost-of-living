package interactor

import model.CityEntity
import utils.Constants
import kotlin.math.abs

class GetCityMatchManagerExpectationsInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): CityEntity? {
        return dataSource.getAllCitiesData()
            .let { it.ifEmpty { throw NoReturnedDataException(Constants.EMPTY_LIST_EXCEPTION) } }
            .filter { it.country in onlyRequiredCountries }
            .let { it.ifEmpty { emptyList() } }
            .minByOrNull(::getMidRangePrices)
    }


    private fun getMidRangePrices(city: CityEntity): Float = city.mealsPrices.run {
        getNonNullableSequenceOfPrices(
            mealInexpensiveRestaurant,
            mealFor2PeopleMidRangeRestaurant,
            mealAtMcDonaldSOrEquivalent
        ).let { getMidMealsPrice(city) }
    }

    private fun getMidMealsPrice(city: CityEntity) =
        abs(
            (getHighestPrice(city) + getLowestPrice(city)) / 2 - (city.mealsPrices.mealFor2PeopleMidRangeRestaurant
                ?: 0f)
        )


    private fun getHighestPrice(city: CityEntity): Float =
        getNonNullableSequenceOfPrices(
            city.mealsPrices.mealInexpensiveRestaurant,
            city.mealsPrices.mealFor2PeopleMidRangeRestaurant,
            city.mealsPrices.mealAtMcDonaldSOrEquivalent
        ).maxOrNull() ?: Float.MIN_VALUE


    private fun getLowestPrice(city: CityEntity) =
        getNonNullableSequenceOfPrices(
            city.mealsPrices.mealInexpensiveRestaurant,
            city.mealsPrices.mealFor2PeopleMidRangeRestaurant,
            city.mealsPrices.mealAtMcDonaldSOrEquivalent
        )
            .minOrNull() ?: Float.MIN_VALUE

    private fun getNonNullableSequenceOfPrices(price1: Float?, price2: Float?, price3: Float?): Sequence<Float> =
        sequenceOf(
            price1,
            price2,
            price3
        ).filterNotNull()


    companion object {
        val onlyRequiredCountries: List<String> = listOf(
            "United States",
            "Canada",
            "Mexico"
        )
    }

}


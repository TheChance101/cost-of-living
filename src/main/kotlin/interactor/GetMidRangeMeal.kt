package interactor

import model.CityEntity
import kotlin.math.abs


class GetMidRangeMeal(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(): CityEntity? {
        return dataSource
            .getAllCitiesData()
            .excludeTheOtherCountries()
            .let { it.filterNotNull() }
            .minByOrNull(::getMidRangePrices)
    }

    private fun List<CityEntity>.excludeTheOtherCountries(countries: List<String> = listOf("USA", "Canada", "Mexico")) = filter { it.country in countries }


    private fun excludeNullableValues(mealInexpensive: Float?, mealFor2PeopleMidRange: Float?, mealAtMcDonaldSOrEquivalent: Float?): List<Float> =
        listOf(mealInexpensive, mealFor2PeopleMidRange, mealAtMcDonaldSOrEquivalent).filterNotNull()


    private fun getExpensivePriceMeal(city: CityEntity): Float = excludeNullableValues(
            city.mealsPrices.mealInexpensiveRestaurant,
            city.mealsPrices.mealFor2PeopleMidRangeRestaurant,
            city.mealsPrices.mealAtMcDonaldSOrEquivalent).maxOrNull() ?: Float.MIN_VALUE


    private fun getCheapestPrice(city: CityEntity) = excludeNullableValues(
            city.mealsPrices.mealInexpensiveRestaurant,
            city.mealsPrices.mealFor2PeopleMidRangeRestaurant,
            city.mealsPrices.mealAtMcDonaldSOrEquivalent
        ).minOrNull() ?: Float.MIN_VALUE


    private fun getMidRangePrices(city: CityEntity): Float = city.mealsPrices.run {
        excludeNullableValues(
            mealInexpensiveRestaurant,
            mealFor2PeopleMidRangeRestaurant,
            mealAtMcDonaldSOrEquivalent
        ).let { getMidMealsPrice(city) }
    }

    private fun getMidMealsPrice(city: CityEntity) = (getExpensivePriceMeal(city) + getCheapestPrice(city)) / 2 - (city.mealsPrices.mealFor2PeopleMidRangeRestaurant ?: 0f)










}
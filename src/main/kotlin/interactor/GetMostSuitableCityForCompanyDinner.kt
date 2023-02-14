package interactor

import model.CityEntity
import kotlin.math.abs

class GetMostSuitableCityForCompanyDinner(private val dataSource: CostOfLivingDataSource) {
    fun execute(boundary: Float = Float.MAX_VALUE): CityEntity? {

        val cityDataHolders = dataSource.getAllCitiesData().filteredByCountries().map {
            val mealsPrices = it.mealsPrices
            CityMealsDataHolder(
                it,
                mealsPrices.mealInexpensiveRestaurant,
                mealsPrices.mealFor2PeopleMidRangeRestaurant?.div(2),
                mealsPrices.mealAtMcDonaldSOrEquivalent
            )

        }.filter { it.isValid() }
        if (cityDataHolders.isEmpty()) return null
        val wantedPrice = (cityDataHolders.maxOf { it.priciestMeal } + cityDataHolders.minOf { it.cheapestMeal }) / 2
        val mostSuitableDataHolder = cityDataHolders.minBy { abs(it.minBoundary(wantedPrice)) }
        return if (mostSuitableDataHolder.minBoundary(wantedPrice) <= boundary) mostSuitableDataHolder.city else null
    }

    private fun List<CityEntity>.filteredByCountries(
        countries: List<String> = listOf("usa", "canada", "mexico")
    ) = filter { it.country.lowercase() in countries }

    class CityMealsDataHolder(val city: CityEntity, vararg mealsPrices: Float?) {
        private val filteredMeals = mealsPrices.filterNotNull().filterNot { it.isNaN() }
        val cheapestMeal = filteredMeals.minOrNull() ?: Float.MAX_VALUE
        val priciestMeal = filteredMeals.maxOrNull() ?: Float.MIN_VALUE
        fun minBoundary(price: Float) =
            filteredMeals.fold(Float.MAX_VALUE) { acc, fl ->
                val x = abs(fl - price)
                if (x < acc) x else acc
            }

        fun isValid() = cheapestMeal != Float.MAX_VALUE
    }
}
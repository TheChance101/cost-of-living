package interactor

import model.CityEntity
import kotlin.math.abs

class CompanyDinnerInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(boundary: Float = Float.MAX_VALUE): CityEntity? = dataSource.getAllCitiesData().getOrNull(0)
    private fun List<CityEntity>.filteredByCountries(
        countries: List<String> = listOf("usa", "canada", "mexico")
    ) = filter { it.country.lowercase() in countries }
    class CityMealsDataHolder(val city: CityEntity, vararg mealsPrices: Float?) {
        private val filteredMeals = mealsPrices.filterNotNull().filterNot { it.isNaN() }
        private val cheapestMeal = filteredMeals.minOrNull() ?: Float.MAX_VALUE
        val priciestMeal = filteredMeals.maxOrNull() ?: Float.MIN_VALUE
        fun minBoundary(price: Float) =
            filteredMeals.fold(Float.MAX_VALUE) { acc, fl ->
                val x = abs(fl - price)
                if (x < acc) x else acc
            }
        fun isValid() = cheapestMeal != Float.MAX_VALUE
    }
}
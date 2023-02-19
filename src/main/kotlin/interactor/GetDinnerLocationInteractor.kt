package interactor

import model.*
import kotlin.math.abs

class GetDinnerLocationInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(): CityEntity? {
        return dataSource.getAllCitiesData()
            .filter {
                it.country in listOf("USA", "Canada", "Mexico") &&
                        it.mealsPrices.mealInexpensiveRestaurant != null
            }
            .sortedBy { it.mealsPrices.mealInexpensiveRestaurant }
            .also { if (it.size < 2) return null }
            .run {
                val averageMealPrice = getAverage(this.first().mealsPrices, this.last().mealsPrices)
                getClosestCity(this, averageMealPrice)
            }
    }
}

fun getAverage(cheapestCity: MealsPrices, mostExpensiveCity: MealsPrices) =
        (cheapestCity.mealInexpensiveRestaurant!! + mostExpensiveCity.mealInexpensiveRestaurant!!) / 2

fun getClosestCity(
    citiesSortedByMealPrice: List<CityEntity>,
    averageMealPrice: Float,
): CityEntity {
    return citiesSortedByMealPrice.map {
        it to abs(it.mealsPrices.mealInexpensiveRestaurant!! - averageMealPrice)
    }.sortedBy { it.second }[0].first
}


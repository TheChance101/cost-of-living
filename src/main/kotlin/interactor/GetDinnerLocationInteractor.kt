package interactor

import model.*
import kotlin.math.abs

class GetDinnerLocationInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(): CityEntity? {
        val citiesSortedByMealPrice = dataSource.getAllCitiesData()
            .filter { it.country in listOf("USA", "Canada", "Mexico") }
            .filter { it.mealsPrices?.mealInexpensiveRestaurant != null }
            .sortedBy { it.mealsPrices?.mealInexpensiveRestaurant!! }
        if (citiesSortedByMealPrice.isEmpty()) return null
        val cheapestCity = citiesSortedByMealPrice.first()
        val mostExpensiveCity = citiesSortedByMealPrice.last()
        val averageMealPrice =
            getAverage(cheapestCity.mealsPrices!!, mostExpensiveCity.mealsPrices!!)
        val closestCity: CityEntity? = getClosestCity(citiesSortedByMealPrice, averageMealPrice)
        return closestCity
    }
}
fun getAverage(cheapestCity: MealsPrices, mostExpensiveCity: MealsPrices): Float {
    val averageMealPrice =
        (cheapestCity.mealInexpensiveRestaurant!! + mostExpensiveCity.mealInexpensiveRestaurant!!) / 2
    return averageMealPrice
}
fun getClosestCity(
    citiesSortedByMealPrice: List<CityEntity>,
    averageMealPrice: Float,
): CityEntity? {
    var closestCity1: CityEntity? = null
    var closestDifference = Double.MAX_VALUE
    for (city in citiesSortedByMealPrice) {
        val difference = abs(city.mealsPrices?.mealInexpensiveRestaurant!! - averageMealPrice)
        if (difference < closestDifference) {
            closestDifference = difference.toDouble()
            closestCity1 = city
        }
    }
    return closestCity1
}

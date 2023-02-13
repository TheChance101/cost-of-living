package interactor

import model.*

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
            (cheapestCity.mealsPrices?.mealInexpensiveRestaurant!! + mostExpensiveCity.mealsPrices?.mealInexpensiveRestaurant!!) / 2

        var closestCity: CityEntity? = null
        var closestDifference = Double.MAX_VALUE

        for (city in citiesSortedByMealPrice) {
            val difference = kotlin.math.abs(city.mealsPrices?.mealInexpensiveRestaurant!! - averageMealPrice)
            if (difference < closestDifference) {
                closestDifference = difference.toDouble()
                closestCity = city
            }
        }

        return closestCity
    }
}
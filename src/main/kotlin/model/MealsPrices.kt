package model

data class MealsPrices(
    val mealInexpensiveRestaurant: Float?,
    val mealFor2PeopleMidRangeRestaurant: Float?,
    val mealAtMcDonaldSOrEquivalent: Float?,
) {
    fun getAverageBetweenLowAndHighMealsPrices(): Float? {
        val prices = listOf(
            mealInexpensiveRestaurant,
            mealAtMcDonaldSOrEquivalent,
        )
        val total = prices.filterNotNull().sum()
        val count = prices.count { it != null }
        return if (count > 0) total / count else null
    }

    fun getMealMidRangeRestaurantPriceForOnePerson(): Float? {
        return if (mealFor2PeopleMidRangeRestaurant != null) {
            mealFor2PeopleMidRangeRestaurant / 2
        } else null
    }
}
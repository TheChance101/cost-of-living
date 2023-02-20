package model

data class MealsPrices(
    val mealInexpensiveRestaurant: Float?,
    val mealFor2PeopleMidRangeRestaurant: Float?,
    val mealAtMcDonaldSOrEquivalent: Float?,
) {
    fun getSummationPricesOfMeals(): Float {
        return mealFor2PeopleMidRangeRestaurant!!.div(2) +
                mealInexpensiveRestaurant!! +
                mealAtMcDonaldSOrEquivalent!!
    }
}
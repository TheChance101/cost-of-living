package model

data class MealsPrices(
    val mealInexpensiveRestaurant: Float?,
    val mealFor2PeopleMidRangeRestaurant: Float?,
    val mealAtMcDonaldSOrEquivalent: Float?,
) {
    fun getAverageMealInCity(city: CityEntity): Float? {
        return if (city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null) {
            city.mealsPrices.mealFor2PeopleMidRangeRestaurant / 2
        } else if ((city.mealsPrices.mealInexpensiveRestaurant != null)
            && (city.mealsPrices.mealAtMcDonaldSOrEquivalent != null)
        )
            ((city.mealsPrices.mealInexpensiveRestaurant) + (city.mealsPrices.mealAtMcDonaldSOrEquivalent)) / 2
        else null
    }
}
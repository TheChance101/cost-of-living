package interactor

import model.CityData
import model.CityEntity
import model.FoodPrices

class GetMostSuitableSavingCityInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): String {
        return ""
    }

    fun excludeNullSalaries(city: Float?): Boolean {
        return true
    }

    fun calculateCitySavings(city: CityData, familyBudget: Float): Float {
        val apartmentCost = city.realEstatesPrices.apartment3BedroomsInCityCentre ?: 0f
        val foodCost = calculateFoodCost(city.foodPrices)
        val otherCosts = 250f
        return familyBudget - (apartmentCost + foodCost + otherCosts)
    }

    fun calculateFoodCost(foodPrice: FoodPrices): Float {
        val breadCost = 2 * 15f * (foodPrice.loafOfFreshWhiteBread500g ?: 0f)
        val cheeseCost = 1f * (foodPrice.localCheese1kg ?: 0f)
        val beefCost = 4f * (foodPrice.beefRound1kgOrEquivalentBackLegRedMeat ?: 0f)
        val chickenCost = 10f * (foodPrice.chickenFillets1kg ?: 0f)
        val riceCost = 2f * (foodPrice.riceWhite1kg ?: 0f)
        return breadCost + cheeseCost + beefCost + chickenCost + riceCost
    }

    fun calculateFamilyBudget(averageMonthlySalary: Float): Float {
        if (averageMonthlySalary < 0) {
            return 0f
        }
        return averageMonthlySalary * 2f
    }


}
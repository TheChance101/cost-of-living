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

    fun excludeNullSalaries(city: CityData): Boolean {
        return true
    }

    fun excludeNull() :Boolean {
        return true
    }

    fun calculateCitySavings(city: CityData, familyBudget: Float): Float {
        return 0f
    }

    fun calculateFoodCost(foodPrice: FoodPrices): Float {
        return 0f
    }

    fun calculateFamilyBudget(averageMonthlySalary: Float): Float {
        if (averageMonthlySalary < 0) {
            return 0f
        }
        return averageMonthlySalary * 2f
    }


}
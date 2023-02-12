package interactor

import model.CityEntity
import model.FoodPrices

class GetMostSuitableSavingCityInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute() {
        // should return string of the place I want to visit.
    }

    fun excludeNullSalaries(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null
    }

    // todo 3
    fun calculateCitySavings(city: CityEntity, familyBudget: Float): Float {
        return 0f // this needs the food cost + 250 of course
    }

    // todo 2
    fun calculateFoodCost(foodPrice: FoodPrices): Float {
        return 0f
    }


    // todo 1
    fun calculateFamilyBudget(city: CityEntity): Float {
        return 0f // this should calculate the upper limit of the family.
    }


}
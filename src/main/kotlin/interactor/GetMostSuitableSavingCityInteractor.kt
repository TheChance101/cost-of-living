package interactor

import model.FoodPrices

class GetMostSuitableSavingCityInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(limit: Int): List<String> {
        val suitableCities = dataSource
            .getAllCitiesData()
            .asSequence()
            .filter { excludeNullSalariesAndNullRealEstatePrice(it.averageMonthlyNetSalaryAfterTax,it.realEstatesPrices.apartment3BedroomsInCityCentre) }
            .sortedByDescending { calculateCitySavings(it.realEstatesPrices.apartment3BedroomsInCityCentre!!, it.foodPrices, calculateFamilyBudget(it.averageMonthlyNetSalaryAfterTax!!)) }
            .distinct()
            .take(limit)
            .map { it.cityName }
            .toList()

        if (suitableCities.isEmpty()) {
            throw Exception("No suitable cities found")
        }

        return suitableCities
    }

    fun excludeNullSalariesAndNullRealEstatePrice(averageMonthlySalary: Float?, realEstatesPrices: Float?): Boolean {
        return averageMonthlySalary != null && realEstatesPrices!= null
    }

    fun calculateCitySavings(realEstatesPrices: Float, foodPrices: FoodPrices, familyBudget: Float): Float {
        val foodCost = calculateFoodCost(foodPrices)
        val otherCosts = 250f
        return familyBudget - (realEstatesPrices + foodCost + otherCosts)
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

package interactor

import model.CityEntity
import model.FoodPrices



class GetMostSuitableSavingCityInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): CityEntity {
        return dataSource
            .getAllCitiesData()
            .filter ( ::excludeNullAverageSalaryRealStatePricesFoodPrices )
            .maxByOrNull ( ::calculateCitySavings )!!
    }

    fun excludeNullAverageSalaryRealStatePricesFoodPrices(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null &&
                city.realEstatesPrices.apartment3BedroomsInCityCentre != null &&
                city.foodPrices.chickenFillets1kg != null &&
                city.foodPrices.localCheese1kg != null &&
                city.foodPrices.loafOfFreshWhiteBread500g != null &&
                city.foodPrices.riceWhite1kg != null &&
                city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat != null
    }

    private fun calculateCitySavings(city: CityEntity): Float {
        val foodCost = calculateFoodCost(city.foodPrices)
        val realEstatesPrices = city.realEstatesPrices.apartment3BedroomsInCityCentre!!
        val familyBudget = city.averageMonthlyNetSalaryAfterTax!! * 2f
        val otherCosts = 250f
        return familyBudget - (realEstatesPrices + foodCost + otherCosts)
    }

    private fun calculateFoodCost(foodPrice: FoodPrices): Float {
        val breadCost = Const.LOAF_OF_FRESH_WHITE_AMOUNT * (foodPrice.loafOfFreshWhiteBread500g!!)
        val cheeseCost = Const.LOCAL_CHEESE_AMOUNT * (foodPrice.localCheese1kg!!)
        val beefCost = Const.READ_MEAT_AMOUNT * (foodPrice.beefRound1kgOrEquivalentBackLegRedMeat!!)
        val chickenCost = Const.CHICKEN_FILLETS_AMOUNT * (foodPrice.chickenFillets1kg!!)
        val riceCost = Const.RICE_WHITE_AMOUNT * (foodPrice.riceWhite1kg!!)
        return breadCost + cheeseCost + beefCost + chickenCost + riceCost
    }

    object Const{
        const val LOAF_OF_FRESH_WHITE_AMOUNT=  2 * 15f // 2 to convert it to kilos because the data from csv is 500g
        const val LOCAL_CHEESE_AMOUNT = 1f
        const val READ_MEAT_AMOUNT = 4f
        const val CHICKEN_FILLETS_AMOUNT = 10f
        const val RICE_WHITE_AMOUNT = 2f
    }
}


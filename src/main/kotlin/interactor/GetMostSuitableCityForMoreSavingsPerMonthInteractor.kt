package interactor

import interactor.GetMostSuitableCityForMoreSavingsPerMonthInteractor.NeedsAmounts.BEEF_AMOUNT
import interactor.GetMostSuitableCityForMoreSavingsPerMonthInteractor.NeedsAmounts.BREAD_AMOUNT
import interactor.GetMostSuitableCityForMoreSavingsPerMonthInteractor.NeedsAmounts.CHEESE_AMOUNT
import interactor.GetMostSuitableCityForMoreSavingsPerMonthInteractor.NeedsAmounts.CHICKEN_AMOUNT
import interactor.GetMostSuitableCityForMoreSavingsPerMonthInteractor.NeedsAmounts.OTHER_NEEDS_LIMIT
import interactor.GetMostSuitableCityForMoreSavingsPerMonthInteractor.NeedsAmounts.RICE_AMOUNT
import interactor.GetMostSuitableCityForMoreSavingsPerMonthInteractor.NeedsAmounts.SALARY_DIFFERENCE
import model.CityEntity

class GetMostSuitableCityForMoreSavingsPerMonthInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): CityEntity {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndNotHasAllPrimaryNeeds)
            .maxByOrNull { getCitySavings(it) }!!
    }

    private fun getCitySavings(city: CityEntity): Float {
        val foodCosts = city.foodPrices.run {
            loafOfFreshWhiteBread500g!! * BREAD_AMOUNT
            +localCheese1kg!! * CHEESE_AMOUNT
            +chickenFillets1kg!! * CHICKEN_AMOUNT
            +riceWhite1kg!! * RICE_AMOUNT
            +beefRound1kgOrEquivalentBackLegRedMeat!! * BEEF_AMOUNT
        }
        val salary = SALARY_DIFFERENCE * city.averageMonthlyNetSalaryAfterTax!!
        return salary - (foodCosts + OTHER_NEEDS_LIMIT)
    }

    private fun excludeNullSalariesAndNotHasAllPrimaryNeeds(city: CityEntity): Boolean {
        return city.run {
            averageMonthlyNetSalaryAfterTax != null
                    && foodPrices.loafOfFreshWhiteBread500g != null
                    && foodPrices.localCheese1kg != null
                    && foodPrices.chickenFillets1kg != null
                    && foodPrices.riceWhite1kg != null
                    && foodPrices.beefRound1kgOrEquivalentBackLegRedMeat != null
                    && realEstatesPrices.apartment3BedroomsInCityCentre != null
                    && realEstatesPrices.apartment3BedroomsOutsideOfCentre != null
        }
    }

    object NeedsAmounts {
        const val CHICKEN_AMOUNT = 10f
        const val BREAD_AMOUNT = 30F
        const val RICE_AMOUNT = 2f
        const val CHEESE_AMOUNT = 1f
        const val BEEF_AMOUNT = 4f
        const val OTHER_NEEDS_LIMIT = 250f
        const val SALARY_DIFFERENCE = 2f
    }

}
package interactor

import model.CityEntity
//task 10
class GetTheMostSuitableCityForSavingMoneyWhileAccommodation(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(): CityEntity =
        dataSource
            .getAllCitiesData()
            .filter(::excludeNullValues)
            .sortedByDescending(::calculateTotalSavings)[0]

    private fun excludeNullValues(city: CityEntity): Boolean {
        return city.run {
            averageMonthlyNetSalaryAfterTax != null &&
                    realEstatesPrices.run {
                        (apartment3BedroomsInCityCentre != null || apartment3BedroomsOutsideOfCentre != null)
                    } &&
                    foodPrices.run {
                        chickenFillets1kg != null &&
                                loafOfFreshWhiteBread500g != null &&
                                localCheese1kg != null &&
                                riceWhite1kg != null &&
                                beefRound1kgOrEquivalentBackLegRedMeat != null
                    }
        }
    }

    private fun calculateTotalSavings(city: CityEntity): Float {
        return city.run {
            2 * averageMonthlyNetSalaryAfterTax!! -
                    realEstatesPrices.run {
                        minOf(
                            apartment3BedroomsInCityCentre ?: Float.MAX_VALUE,
                            apartment3BedroomsOutsideOfCentre ?: Float.MAX_VALUE
                        )
                    } -
                    foodPrices.run {
                        10 * chickenFillets1kg!! -
                                30 * loafOfFreshWhiteBread500g!! -
                                localCheese1kg!! -
                                2 * riceWhite1kg!! -
                                4 * beefRound1kgOrEquivalentBackLegRedMeat!! -
                                250
                    }
        }
    }
}
package interactor

import model.CityEntity

class GetTheMostSuitableCityForSavingMoneyWhileAccommodation(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(): CityEntity =
        dataSource
            .getAllCitiesData()
            .filter(::excludeNullValues)
            .sortedByDescending(::calculateTotalSavings)[0]

    private fun excludeNullValues(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null
                && (city.realEstatesPrices.apartment3BedroomsInCityCentre != null ||
                city.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null) &&
                city.foodPrices.chickenFillets1kg != null &&
                city.foodPrices.loafOfFreshWhiteBread500g != null &&
                city.foodPrices.localCheese1kg != null &&
                city.foodPrices.riceWhite1kg != null &&
                city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat != null
    }

    private fun calculateTotalSavings(city: CityEntity): Float {
        return 2 * city.averageMonthlyNetSalaryAfterTax!! -
                minOf(
                    city.realEstatesPrices.apartment3BedroomsInCityCentre ?: Float.MAX_VALUE,
                    city.realEstatesPrices.apartment3BedroomsOutsideOfCentre ?: Float.MAX_VALUE
                ) -
                10 * city.foodPrices.chickenFillets1kg!! -
                30 * city.foodPrices.loafOfFreshWhiteBread500g!! -
                city.foodPrices.localCheese1kg!! -
                2 * city.foodPrices.riceWhite1kg!! -
                4 * city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!! -
                250
    }
}
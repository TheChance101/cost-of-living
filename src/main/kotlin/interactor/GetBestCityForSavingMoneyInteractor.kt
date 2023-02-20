package interactor

import model.CityEntity

class GetBestCityForSavingMoneyInteractor(private val dataSource: CostOfLivingDataSource) {

    operator fun invoke(): CityEntity{

        return dataSource.getAllCitiesData()
            .filter(::excludeNullRequireValues)
            .sortedByDescending(::calculateSavings)
            .first()
    }

    private fun calculateSavings(city: CityEntity): Float {

        return  city.averageMonthlyNetSalaryAfterTax!! * DOUBLE_AVERAGE_SALARY -
                city.realEstatesPrices.apartment3BedroomsInCityCentre!! -
                with(city.foodPrices){
                    (loafOfFreshWhiteBread500g!! * REQUIRE_BREAD) -
                            (chickenFillets1kg!! * REQUIRE_CHICKEN) -
                            (riceWhite1kg!! * REQUIRE_RICE) -
                            (beefRound1kgOrEquivalentBackLegRedMeat!! * REQUIRE_MEAT) -
                            city.foodPrices.localCheese1kg!! } - OTHER_NEEDS
    }
    private fun excludeNullRequireValues(city: CityEntity): Boolean {

        return  city.realEstatesPrices.apartment3BedroomsInCityCentre != null &&
                city.averageMonthlyNetSalaryAfterTax != null &&
                city.foodPrices.loafOfFreshWhiteBread500g != null &&
                city.foodPrices.localCheese1kg != null &&
                city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat != null &&
                city.foodPrices.chickenFillets1kg != null &&
                city.foodPrices.riceWhite1kg != null
    }
    private companion object{

        const val REQUIRE_BREAD = 30
        const val REQUIRE_MEAT = 4
        const val REQUIRE_RICE = 2
        const val REQUIRE_CHICKEN = 10
        const val OTHER_NEEDS = 250.0F
        const val DOUBLE_AVERAGE_SALARY = 2
    }
}
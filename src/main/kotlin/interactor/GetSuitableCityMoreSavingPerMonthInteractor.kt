package interactor

import model.CityEntity

/**
 * Created by Aziza Helmy on 2/11/2023.
 */
class GetSuitableCityMoreSavingPerMonthInteractor(private val dataSource: CostOfLivingDataSource) {
    companion object {
        private const val RICE_CONSUMPTION_BY_KG = 2
        private const val BREAD_CONSUMPTION_BY_KG = 15 * 2
        private const val CHEESE_CONSUMPTION_BY_KG = 1
        private const val CHICKEN_CONSUMPTION_BY_KG = 10
        private const val MEET_CONSUMPTION_BY_KG = 4
        private const val OTHER_NEEDS_CONSUMPTION = 250
        private const val AVERAGE_SALARY = 2
    }

    fun execute(): CityEntity {

        return dataSource.getAllCitiesData()
            .filter(::excludeNullSalariesApartment3BedroomsAndFoodies)
            .maxByOrNull { city ->
                city.let { city ->
                    val totalExpenses = city.foodPrices.run {
                        (riceWhite1kg!! * RICE_CONSUMPTION_BY_KG) +
                                (beefRound1kgOrEquivalentBackLegRedMeat!! * MEET_CONSUMPTION_BY_KG) +
                                (chickenFillets1kg!! * CHICKEN_CONSUMPTION_BY_KG) +
                                (localCheese1kg!! * CHEESE_CONSUMPTION_BY_KG) +
                                (loafOfFreshWhiteBread500g!! * BREAD_CONSUMPTION_BY_KG) +
                                OTHER_NEEDS_CONSUMPTION
                    } + city.realEstatesPrices.apartment3BedroomsInCityCentre!!
                    (city.averageMonthlyNetSalaryAfterTax!! * AVERAGE_SALARY) - totalExpenses
                }
            }!!
    }

    fun excludeNullSalariesApartment3BedroomsAndFoodies(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null &&
                city.realEstatesPrices.apartment3BedroomsInCityCentre != null &&
                city.foodPrices.localCheese1kg != null
                && city.foodPrices.loafOfFreshWhiteBread500g != null
                && city.foodPrices.chickenFillets1kg != null
                && city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat != null
                && city.foodPrices.riceWhite1kg != null
    }

}
package interactor

import model.CityEntity

/**
 * Created by Aziza Helmy on 2/11/2023.
 */
class GetSuitableCityMoreSavingPerMonthInteractor(private val dataSource: CostOfLivingDataSource) {
    private val riceConsumptionByKg = 2
    private val cheeseConsumptionByKg = 1
    private val breadConsumptionByKg = 15 * 2
    private val chickenConsumptionByKg = 10
    private val meetConsumptionByKg = 4
    private val otherNeedConsumptionByKg = 250
    private val averageSalaryByKg = 2

    fun execute(): CityEntity {

        return dataSource.getAllCitiesData()
            .filter(::excludeNullSalariesApartment3BedroomsAndFoodies)
            .maxByOrNull {
                (it.averageMonthlyNetSalaryAfterTax!! * averageSalaryByKg) -
                        ((it.foodPrices.riceWhite1kg!! * riceConsumptionByKg) +
                                (it.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!! * meetConsumptionByKg) +
                                (it.foodPrices.chickenFillets1kg!! * chickenConsumptionByKg) +
                                (it.foodPrices.localCheese1kg!! * cheeseConsumptionByKg) +
                                (it.foodPrices.loafOfFreshWhiteBread500g!! * breadConsumptionByKg) +
                                (otherNeedConsumptionByKg) +
                                (it.realEstatesPrices.apartment3BedroomsInCityCentre!!)
                                )
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
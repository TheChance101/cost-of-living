package interactor

import model.CityEntity

/**
 * Created by Aziza Helmy on 2/11/2023.
 */
class GetSuitableCityMoreSavingPerMonthInteractor(private val dataSource: CostOfLivingDataSource) {
    private val riceConsumption = 2
    private val cheeseConsumption = 1
    private val breadConsumption = 15 * 2
    private val chickenConsumption = 10
    private val meetConsumption = 4
    private val otherNeedConsumption = 250
    private val averageSalary = 2

    fun execute(): CityEntity {

        return dataSource.getAllCitiesData()
            .filter(::excludeNullSalariesApartment3BedroomsAndFoodies)
            .maxByOrNull {
                (it.averageMonthlyNetSalaryAfterTax!! * averageSalary) -
                        ((it.foodPrices.riceWhite1kg!! * riceConsumption) +
                                (it.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!! * meetConsumption) +
                                (it.foodPrices.chickenFillets1kg!! * chickenConsumption) +
                                (it.foodPrices.localCheese1kg!! * cheeseConsumption) +
                                (it.foodPrices.loafOfFreshWhiteBread500g!! * breadConsumption) +
                                (otherNeedConsumption) +
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
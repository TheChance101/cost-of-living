package interactor

import model.CityEntity

/**
 * Created by Aziza Helmy on 2/11/2023.
 */
class GetSuitableCityMoreSavingPerMonthInteractor(private val dataSource: CostOfLivingDataSource) {


    fun execute(): String {
        return ""
    }

    fun excludeNullSalaries(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null
    }

    fun excludeNullApartment3BedroomsInCityCenter(city: CityEntity): Boolean {
        return city.realEstatesPrices.apartment3BedroomsInCityCentre != null
    }

    fun excludeNullFoodies(city: CityEntity): Boolean {
        return city.foodPrices.localCheese1kg != null
                && city.foodPrices.loafOfFreshWhiteBread500g != null
                && city.foodPrices.chickenFillets1kg != null
                && city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat != null
                && city.foodPrices.riceWhite1kg != null
    }

    fun isSuitableApartment(city: CityEntity): Boolean {
        return (city.averageMonthlyNetSalaryAfterTax)!! * 2 > (city.realEstatesPrices.apartment3BedroomsInCityCentre!!)
    }
    fun getMonthlySalariesInAllCities(): List<Pair<String, Float?>> {
        return emptyList()
    }

}
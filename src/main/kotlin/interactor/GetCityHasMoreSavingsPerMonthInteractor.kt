package interactor

import model.CityEntity


class GetCityHasMoreSavingsPerMonthInteractor(
    private val dataSource: CostOfLivingDataSource,
) {


    fun execute(): CityEntity? {
        return dataSource.getAllCitiesData()
            .asSequence()
            .filter(::excludeNullFoodPrices)
            .filter(::excludeNullApartment)
            .filter(::excludeNullAverageMonthly)
            .filter(::excludeTransportationsPrices)
            .maxByOrNull(::countSavingsPerMonth)
    }


}


private fun excludeNullFoodPrices(city: CityEntity): Boolean {
    return city.foodPrices.loafOfFreshWhiteBread500g != null
            && city.foodPrices.localCheese1kg != null
            && city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat != null
            && city.foodPrices.chickenFillets1kg != null
            && city.foodPrices.riceWhite1kg != null

}

private fun excludeNullApartment(city: CityEntity): Boolean {
    return city.realEstatesPrices.apartment3BedroomsInCityCentre != null
            && city.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null

}

private fun excludeTransportationsPrices(city: CityEntity): Boolean {
    return city.transportationsPrices.gasolineOneLiter == null
            && city.transportationsPrices.monthlyPassRegularPrice == null
            && city.transportationsPrices.taxi1kmNormalTariff == null
            && city.transportationsPrices.taxi1hourWaitingNormalTariff == null
            && city.transportationsPrices.oneWayTicketLocalTransport == null
            && city.transportationsPrices.taxiStartNormalTariff == null


}

private fun excludeNullAverageMonthly(city: CityEntity): Boolean {
    return city.averageMonthlyNetSalaryAfterTax != null

}

private fun countSavingsPerMonth(city: CityEntity): Float {
    val salaryMonth = city.averageMonthlyNetSalaryAfterTax!! * 2

    val foodPricesAndApartment = (15 * ((city.foodPrices.loafOfFreshWhiteBread500g!! * 2)))
    +(city.foodPrices.localCheese1kg!!) + (4 * city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!!)
    +(city.foodPrices.chickenFillets1kg!! * 10) + (city.foodPrices.riceWhite1kg!! * 2) +
            minOf(
                city.realEstatesPrices.apartment3BedroomsInCityCentre!!,
                city.realEstatesPrices.apartment3BedroomsOutsideOfCentre!!
            )

    val otherNeeds = 250

    return (salaryMonth).minus(foodPricesAndApartment).minus(otherNeeds)

}












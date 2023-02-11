package interactor

import model.CityEntity


class GetCityHasMoreSavingsPerMonthInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit: Int): CityEntity? {
        return if (limit > 0) dataSource
            .getAllCitiesData()
            .asSequence()
            .filter(::excludeNullFoodPrices)
            .filter(::excludeNullApartment)
            .filter(::excludeTransportationsPrices)
            .take(limit)
            .firstOrNull()

        else if (limit == 0) null
        else null

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

}
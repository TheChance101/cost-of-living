package interactor

import model.CityEntity
import kotlin.math.max


class GetCityHasMoreSavingsPerMonthInteractor(
    private val dataSource: CostOfLivingDataSource,
) {


    fun execute(): CityEntity?{
        return  dataSource.getAllCitiesData()
            .asSequence()
            .filter(::excludeNullFoodPrices)
            .filter(::excludeNullApartment)
            .filter(::excludeTransportationsPrices)
            .filter(::excludeNullAverageMonthly)
            .maxByOrNull {
                (it.averageMonthlyNetSalaryAfterTax!!*2) -
                        ((15*it.foodPrices.loafOfFreshWhiteBread500g!!/2) +
                                (it.foodPrices.localCheese1kg!!) + (4 * it.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!!)
                    +  (it.foodPrices.chickenFillets1kg!! * 10  ) + (it.foodPrices.riceWhite1kg!!*2) -
                            minOf(it.realEstatesPrices.apartment3BedroomsInCityCentre!!,
                                it.realEstatesPrices.apartment3BedroomsOutsideOfCentre!!))  - (250)
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
    private  fun excludeNullAverageMonthly(city: CityEntity):Boolean{
     return city.averageMonthlyNetSalaryAfterTax!=null
  }




}
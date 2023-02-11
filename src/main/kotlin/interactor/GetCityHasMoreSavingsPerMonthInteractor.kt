package interactor

import model.CityEntity


class GetCityHasMoreSavingsPerMonthInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit: Int):List<CityEntity>?{
        return if (limit > 0) dataSource.getAllCitiesData()
            .filter(::excludeNullFoodPrices)
            .filter(::excludeNullApartment)
            .filter(::excludeTransportationsPrices)
            .filter(::excludeNullaverageMonthly)
            .filter(::excludeNullFood)
            .take(limit)


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
    private  fun excludeNullaverageMonthly(city: CityEntity):Boolean{
     return city.averageMonthlyNetSalaryAfterTax!=null
  }

    private  fun excludeNullFood(city: CityEntity):Boolean{
        return city.foodPrices.loafOfFreshWhiteBread500g!=null
               &&city.foodPrices.localCheese1kg!=null
               &&city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!=null
                &&city.foodPrices.chickenFillets1kg!=null
                &&city.foodPrices.riceWhite1kg!=null
                &&city.foodPrices.eggsRegular12!=null
    }

/*
    private fun FindTheMostSuitableCity(city: CityEntity):Float{
      val Salary =  city.averageMonthlyNetSalaryAfterTax!!*2

      val totalPriceOfTheFood=(15*city.foodPrices.loafOfFreshWhiteBread500g!!*2)
      +city.foodPrices.localCheese1kg!! + (4 * city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!!)
      +  (city.foodPrices.chickenFillets1kg!! * 10  ) + (city.foodPrices.riceWhite1kg!!*2)
     //   var totalPriceOfOtherNeeds= city.foodPrices.eggsRegular12!!<=250

      return totalPriceOfTheFood-Salary
    }


   fun x():List<CityEntity>{
        var list:List<CityEntity>
        var e:List<CityEntity>
        var cheapestCit =0.0f
        var listOfCity= execute(10)
        for (i in 0.. listOfCity!!.size){
            if (cheapestCit < FindTheMostSuitableCity(listOfCity[i])){
                cheapestCit= FindTheMostSuitableCity(listOfCity[i])
           e=listOf(listOfCity[i])
            }

        }
        return  e
    }
*/
}
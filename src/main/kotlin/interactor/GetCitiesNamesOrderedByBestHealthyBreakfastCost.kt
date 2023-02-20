package interactor

import model.CityEntity

class GetCitiesNamesOrderedByBestHealthyBreakfastCost(
    private val dataSource: CostOfLivingDataSource) {

    fun excute(limit : Int=10): List<String> {

        return dataSource.getAllCitiesData()
            .filter (::excludeNulls)
            .map { Pair(it.cityName,getBreakfastcost(it)) }
            .sortedBy { it.second }
            .map { it.first }.take(limit)
            
    }
   private fun getBreakfastcost(city : CityEntity): Float {
       return( (city.drinksPrices.milkRegularOneLiter!! / 4)
            + (city.foodPrices.eggsRegular12!! / 12)
            +(city.foodPrices.localCheese1kg!! / 4))
    }
   private fun excludeNulls (city : CityEntity):Boolean{
       return city.drinksPrices.milkRegularOneLiter!=null
               &&city.foodPrices.eggsRegular12!=null && city.foodPrices.localCheese1kg!=null
   }
}
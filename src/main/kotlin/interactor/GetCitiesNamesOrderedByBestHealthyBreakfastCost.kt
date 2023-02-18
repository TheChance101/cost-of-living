package interactor

import model.CityEntity

class GetCitiesNamesOrderedByBestHealthyBreakfastCost(
    private val dataSource: CostOfLivingDataSource) {

    fun excute(): List<String> {

        return dataSource.getAllCitiesData()
            .map { CityBreakFast(it.cityName,getBreakfastcost(it)) }
            .filter { it.breakfastCost!=-1f }
            .sortedBy { it.breakfastCost }
            .map { it.Name }
            
    }
   private fun getBreakfastcost(city : CityEntity): Float {
     if (city.drinksPrices.milkRegularOneLiter!=null
        &&city.foodPrices.eggsRegular12!=null && city.foodPrices.localCheese1kg!=null) {
         return (city.drinksPrices.milkRegularOneLiter!! / 4) + (city.foodPrices.eggsRegular12!! / 12)
         +(city.foodPrices.localCheese1kg!! / 4)
     }else
         return -1f
   }

    private class CityBreakFast( var Name : String,var breakfastCost : Float )
}
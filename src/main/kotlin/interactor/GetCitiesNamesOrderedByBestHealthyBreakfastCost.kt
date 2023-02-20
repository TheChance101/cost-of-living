package interactor

import model.CityEntity

class GetCitiesNamesOrderedByBestHealthyBreakfastCost(
    private val dataSource: CostOfLivingDataSource) {

    fun execute(limit : Int=10): List<String> {

        return dataSource.getAllCitiesData()
            .filter (::excludeNulls)
            .sortedBy { it.getBreakfastCost() }
            .map { it.cityName }.take(limit)
            
    }
   private fun CityEntity.getBreakfastCost(): Float {
       return( (drinksPrices.milkRegularOneLiter!! / 4)
            + (foodPrices.eggsRegular12!! / 12)
            +(foodPrices.localCheese1kg!! / 4))
    }
   private fun excludeNulls (city : CityEntity):Boolean{
       return city.drinksPrices.milkRegularOneLiter!=null
               &&city.foodPrices.eggsRegular12!=null && city.foodPrices.localCheese1kg!=null
   }
}
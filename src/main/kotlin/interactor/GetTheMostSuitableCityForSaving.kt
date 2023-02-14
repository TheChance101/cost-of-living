package interactor

import model.CityEntity

class GetTheMostSuitableCityForSaving(
   private val dataSource: CostOfLivingDataSource
) {
    fun execute():CityEntity{
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndApartmentAndFoodThings)
            .sortedByDescending(::savesAfterPayAllThings)
            .first()
    }
    private fun excludeNullSalariesAndApartmentAndFoodThings(cityEntity: CityEntity):Boolean{
        return cityEntity.averageMonthlyNetSalaryAfterTax!=null
                && cityEntity.realEstatesPrices.apartment3BedroomsOutsideOfCentre!=null
                && cityEntity.foodPrices.loafOfFreshWhiteBread500g!=null
                && cityEntity.foodPrices.localCheese1kg!=null
                && cityEntity.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!=null
                && cityEntity.foodPrices.chickenFillets1kg!=null
                && cityEntity.foodPrices.riceWhite1kg!=null
    }
    private fun savesAfterPayAllThings(cityEntity: CityEntity):Float{
        val foodPrices = cityEntity.foodPrices
        return (cityEntity.averageMonthlyNetSalaryAfterTax!!*2)-
                (foodPrices.loafOfFreshWhiteBread500g!!*30)-
                (foodPrices.localCheese1kg!!)-
                (foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!!*4)-
                (foodPrices.chickenFillets1kg!!*10)-
                (foodPrices.riceWhite1kg!!*2)-
                250
    }
}
package interactor

import model.CityEntity

//additional task
class GetCitiesNamesOrderedByBestHealthyBreakfastCost(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(limit: Int = 10) =
        dataSource.getAllCitiesData()
            .filter(::isAllBreakFastComponentsNotNull)
            .sortedBy { it.getBreakfastCost() }
            .map { it.cityName }
            .takeIf { limit >= 0 }
            ?.take(limit) ?: emptyList()


    private fun CityEntity.getBreakfastCost() =
        (drinksPrices.milkRegularOneLiter!! / 4) +
                (foodPrices.eggsRegular12!! / 12) +
                (foodPrices.localCheese1kg!! / 4)

    private fun isAllBreakFastComponentsNotNull(city: CityEntity): Boolean {
        return city.drinksPrices.milkRegularOneLiter != null
                && city.foodPrices.eggsRegular12 != null && city.foodPrices.localCheese1kg != null
    }
}
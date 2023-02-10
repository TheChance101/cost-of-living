package interactor

import model.CityEntity

class GetCitiesHasLowestFruitVegPricesComparingSalariesPaid (
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(list: List<CityEntity>): List<CityEntity> {


        return list
    }



}
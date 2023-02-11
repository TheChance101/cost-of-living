package interactor

import model.CityEntity
import model.FoodPrices

class GetMostSuitableSavingCityInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(limit: Int): CityEntity {
        TODO("NOT IMPLEMENTED YET")
    }

    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }

    fun getCostOfLiving(foodPrices: FoodPrices) {

    }
}
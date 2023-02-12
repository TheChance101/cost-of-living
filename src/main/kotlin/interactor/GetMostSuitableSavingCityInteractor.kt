package interactor

import model.CityEntity

class GetMostSuitableSavingCityInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute() {

    }

    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }

    fun calculateCiteSavings(city: CityEntity, familyBudget: Float): Float {
        return 0f
    }



}
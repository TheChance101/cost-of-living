package interactor

import model.CityEntity


class GetTopFiveCitiesForFashionInteractor (
    val dataSource: CostOfLivingDataSource,
){

    fun execute(limit: Int): List<String> {
        return listOf("")

    }

    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }

}
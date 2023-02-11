package interactor

import model.CityEntity

class getTheAverageSalaryForEachCityInTheCountryInteractor (
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(): CityEntity {
        throw Throwable("Not Implemented yet")
    }
    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }
}
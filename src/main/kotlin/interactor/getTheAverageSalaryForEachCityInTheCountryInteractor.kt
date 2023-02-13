package interactor

import model.CityEntity

class getTheAverageSalaryForEachCityInTheCountryInteractor (
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(countryName:String): List<Any> {
       return listOf()

    }
    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }
}


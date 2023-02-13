package interactor

import model.CityEntity

class getTheAverageSalaryForEachCityInTheCountryInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    //the function will return a List of pairs each pair have city name and salary average for this city
    fun execute(countryName: String): List<Any> {
        var result: List<Any>;
        result = dataSource.getAllCitiesData()
            .filter { excludeNullSalariesAndLowQualityData(it) && it.country.lowercase() == countryName.lowercase() }
            .map { listOf(it.cityName, it.averageMonthlyNetSalaryAfterTax) }

        return (
                if (result.size !== 0) return result
                else throw Exception()
                )
    }
    //for filter quality data
    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }
}


package interactor

import model.CityEntity

class GetCitiesNamesAndAverageSalariesInCountry (
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(country: String): List<Pair<String, Float>> {

       return dataSource
            .getAllCitiesData()
            .filter{it.country.lowercase()==country.lowercase()&&excludeNullSalariesAndLowQualityData(it)}
            .map{it.cityName to it.averageMonthlyNetSalaryAfterTax!!}
            .takeIf{it.isNotEmpty() }?: throw Exception("wrong name")

    }
    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }

}
package interactor

import model.CityEntity

class GetCitiesAverageSalary(private val dataSource: CostOfLivingDataSource) {

    fun execute(country: String): List<Pair<String, Double>> {

        val countryData = dataSource.getAllCitiesData().filter {
            excludeNullSalariesAndLowQualityDataAndCheckCountriesName(it, country)
        }

        return if (countryData.isNotEmpty()) {
            countryData.map {
                Pair(it.cityName, it.averageMonthlyNetSalaryAfterTax!!.toDouble())
            }
        } else {
            throw IllegalArgumentException("Invalid country name.")
        }
    }

    private fun excludeNullSalariesAndLowQualityDataAndCheckCountriesName(city: CityEntity, country: String): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
                && city.country.equals(country, ignoreCase = true)
    }


}
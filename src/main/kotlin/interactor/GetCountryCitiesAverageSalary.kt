package interactor

import model.CityEntity

class GetCountryCitiesAverageSalaryInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(country: String): List<Pair<String, Float>> {
        val citiesSalaries =  dataSource.getAllCitiesData()
            .filter { it.country.lowercase() == country.lowercase().trim().replace(Regex(" +"), " ") && excludeNullSalariesAndLowQualityData(it) }
            .map { Pair(it.cityName, it.averageMonthlyNetSalaryAfterTax!!) }

        if (citiesSalaries.isEmpty()) throw Exception("country was not found !")

        return citiesSalaries
    }

    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }


}
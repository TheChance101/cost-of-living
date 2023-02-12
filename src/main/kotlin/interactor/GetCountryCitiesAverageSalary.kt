package interactor

import model.CityEntity

class GetCountryCitiesAverageSalaryInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(country: String): List<Pair<String, Float>> {
        val citiesSalaries =  dataSource.getAllCitiesData()
            .filter { it.country.format_sentence() == country.format_sentence() && excludeNullSalariesAndLowQualityData(it) }
            .map { Pair(it.cityName, it.averageMonthlyNetSalaryAfterTax!!) }
        if (citiesSalaries.isEmpty()) throw Exception("country was not found !")

        return citiesSalaries
    }
    fun String.format_sentence() = this.lowercase().trim().replace(Regex(" +"), " ")
    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }


}
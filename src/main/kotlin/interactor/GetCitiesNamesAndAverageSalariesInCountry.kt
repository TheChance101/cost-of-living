package interactor

import model.CityEntity

//task 3
class GetCitiesNamesAndAverageSalariesInCountry(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(country: String): List<Pair<String, Float>> {
        return dataSource
            .getAllCitiesData()
            .filter { it.isCityNamesMatch(country) && it.isHighQualityDataAndNotNullSalaries() }
            .map { it.cityName to it.averageMonthlyNetSalaryAfterTax!! }
            .takeIf { it.isNotEmpty() } ?: throw Exception("wrong name")
    }

    private fun CityEntity.isCityNamesMatch(country: String) =
        this.country.lowercase() == country.lowercase()

    private fun CityEntity.isHighQualityDataAndNotNullSalaries() =
        averageMonthlyNetSalaryAfterTax != null && dataQuality


}
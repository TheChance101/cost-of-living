package interactor

import model.CityEntity

class SearchForAverageSalariesInCountryInteractor (
    private val dataSource: CostOfLivingDataSource,) {
    fun execute(countryName: String): List<Pair<String,Float>> {
        return dataSource
            .getAllCitiesData()
            .filter { excludeLowQualityData(it) && excludeNullSalaries(it) && (it.country.lowercase() == countryName.lowercase()) }
            .map { Pair(it.cityName, it.averageMonthlyNetSalaryAfterTax!!) }
            .takeIf { it.isNotEmpty() } ?: throw IllegalArgumentException("Country name not found")
    }
    fun excludeLowQualityData(city: CityEntity): Boolean {
        return city.dataQuality
    }
    fun excludeNullSalaries(city: CityEntity): Boolean{
        return city.averageMonthlyNetSalaryAfterTax != null
    }
}

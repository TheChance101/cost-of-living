package interactor

import model.CityEntity

class SearchForAverageSalariesInCountryInteractor (
    private val dataSource: CostOfLivingDataSource,) {
    fun execute(countryName: String): List<Pair<String,Float>> {
        return dataSource
            .getAllCitiesData()
            .filter { excludeLowQualityCityEntityData(it) && excludeNullSalaries(it) &&
                    compareCountryNameWithInputName(it, countryName)
            }
            .map { Pair(it.cityName, it.averageMonthlyNetSalaryAfterTax!!) }
            .takeIf { it.isNotEmpty() } ?: throw IllegalArgumentException("Country name not found")
    }
    private fun compareCountryNameWithInputName(it: CityEntity, countryName: String) =
        (it.country.lowercase() == countryName.lowercase())

}
fun excludeLowQualityCityEntityData(city: CityEntity): Boolean {
    return city.dataQuality
}
fun excludeNullSalaries(city: CityEntity): Boolean{
    return city.averageMonthlyNetSalaryAfterTax != null
}

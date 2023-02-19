package interactor

import model.CityEntity
import utils.isNotNull


class GetSalaryAverageAndCitiesNamesInCountryInteractor(
    private val dataSource: CostOfLivingDataSource
    ) {

    fun execute(countryName:String):List<Pair<String,Float>> {
        return dataSource
            .getAllCitiesData()
            .ifEmpty { throw java.lang.IllegalStateException("Something went wrong") }
            .takeIf{ countryName.lowercase() in it.map{city -> city.country.lowercase()} }
            .orEmpty()
            .filter{
                isValidCountryName(countryName,it) &&
                excludeNullSalaryAveragesAndLowQualityData(it)
            }
            .map{Pair(it.cityName,it.averageMonthlyNetSalaryAfterTax!!)}
    }

    private fun isValidCountryName(countryName: String, city: CityEntity) =
        countryName.lowercase() == city.country.lowercase()
    private fun excludeNullSalaryAveragesAndLowQualityData(city:CityEntity) =
        city.averageMonthlyNetSalaryAfterTax.isNotNull() && city.dataQuality

}
package interactor

import model.CityEntity
import utils.isNotNull


class GetSalaryAverageAndCitiesNamesInCountryInteractor(
    private val dataSource: CostOfLivingDataSource
    ) {

    fun execute(countryName:String):List<Pair<String,Float>> {
        return dataSource
            .getAllCitiesData()
            .asSequence()
            .ifEmpty { throw IllegalStateException("Something went wrong") }
            .groupBy { it.country.lowercase() }
            .getOrElse(countryName.lowercase()){throw NoSuchElementException("Country not found")}
            .filter{
                isValidCountryName(countryName,it) &&
                excludeNullSalaryAveragesAndLowQualityData(it)
            }
            .toList()
            .map{it.cityName to it.averageMonthlyNetSalaryAfterTax!!}
    }

    private fun isValidCountryName(countryName: String, city: CityEntity) =
        countryName.lowercase() == city.country.lowercase()
    private fun excludeNullSalaryAveragesAndLowQualityData(city:CityEntity) =
        city.averageMonthlyNetSalaryAfterTax.isNotNull() && city.dataQuality

}
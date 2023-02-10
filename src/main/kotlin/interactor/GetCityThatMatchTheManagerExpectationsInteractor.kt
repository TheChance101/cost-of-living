package interactor

import model.CityEntity
import java.util.*

class GetCityThatMatchTheManagerExpectationsInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(countries: List<String>): CityEntity? {
        val data = dataSource.getAllCitiesData()
        val formatCountriesNames = formatCountriesNames(countries)
        val existCountries = excludeTheCountryThatNotExist(formatCountriesNames)

        return if (existCountries.isEmpty())
            null
        else
            data.random()
    }

    private fun formatCountriesNames(countriesNames: List<String>) =
        if (countriesNames.isEmpty()) emptyList() else countriesNames.map { country ->
            country.lowercase().trim().split("\\s+".toRegex()).joinToString(" ") {
                it.replaceFirstChar { char ->
                    if (char.isLowerCase()) char.titlecase(Locale.getDefault()) else it
                }
            }
        }

    private fun excludeTheCountryThatNotExist(countriesNames: List<String>): List<String> {
        val selectedCountries = listOf("United States", "Canada", "Mexico")
        val countries = mutableListOf<String>()
        countriesNames.filter { selectedCountries.contains(it) }.map {
            countries.add(it)
        }
        return countries
    }
}
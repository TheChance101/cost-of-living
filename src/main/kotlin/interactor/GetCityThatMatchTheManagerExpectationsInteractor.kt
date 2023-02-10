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
        val pricesOfMeals = mutableListOf<Float>()

        return if (existCountries.isEmpty())
            null
        else
            data
                .filter { it.country in existCountries }
                .filter { it.mealsPrices.mealFor2PeopleMidRangeRestaurant != null }
                .map {
                    pricesOfMeals.add(it.mealsPrices.mealFor2PeopleMidRangeRestaurant!!)
                    it
                }
                .let {
                    bestRestaurantThatMatchExpectation(pricesOfMeals, it)
                }
    }

    private fun bestRestaurantThatMatchExpectation(
        pricesOfMeals: MutableList<Float>,
        cityEntity: List<CityEntity>
    ): CityEntity {
        val mid = (pricesOfMeals.maxOf { it } - pricesOfMeals.minOf { it }).div(2)
        return cityEntity.filter { it.mealsPrices.mealFor2PeopleMidRangeRestaurant!! >= mid }
            .sortedBy { it.mealsPrices.mealFor2PeopleMidRangeRestaurant }.first()
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
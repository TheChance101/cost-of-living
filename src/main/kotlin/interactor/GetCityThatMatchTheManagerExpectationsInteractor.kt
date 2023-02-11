package interactor

import model.CityEntity
import java.util.*


class GetCityThatMatchTheManagerExpectationsInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(countries: List<String>): CityEntity? {
        val formatCountriesNames = formatCountriesNames(countries)
        val existCountries = excludeTheCountryThatNotExist(formatCountriesNames)
        val pricesOfMeals = mutableListOf<Float>()

        return if (existCountries.isEmpty())
            null
        else
            dataSource
                .getAllCitiesData()
                .filter { it.country in existCountries }
                .filter(::excludeNullPricesOfMeals)
                .map {
                    pricesOfMeals.add(it.mealsPrices.mealFor2PeopleMidRangeRestaurant!!)
                    it
                }.let { citiesEntity ->
                    getCityThatMatchExpectations(pricesOfMeals, citiesEntity)
                }
    }


    private fun formatCountriesNames(countriesNames: List<String>): List<String> {
        return if (countriesNames.isEmpty())
            emptyList()
        else
            countriesNames.map { country ->
                country.lowercase()
                    .trim()
                    .split("\\s+".toRegex())
                    .joinToString(" ") {
                        it.replaceFirstChar { char ->
                            if (char.isLowerCase()) char.titlecase(Locale.getDefault()) else it
                        }
                    }
            }
    }

    private fun excludeTheCountryThatNotExist(countriesNames: List<String>): List<String> {
        val selectedCountries = listOf("United States", "Canada", "Mexico")
        return countriesNames.filter { selectedCountries.contains(it) }.map { it }
    }

    private fun excludeNullPricesOfMeals(city: CityEntity): Boolean {
        return city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null
    }

    private fun getCityThatMatchExpectations(
        pricesOfMeals: MutableList<Float>,
        citiesEntity: List<CityEntity>
    ): CityEntity {
        val midPriceOfMeals = (pricesOfMeals.maxOf { it } - pricesOfMeals.minOf { it }).div(2)
        return citiesEntity
            .filter { it.mealsPrices.mealFor2PeopleMidRangeRestaurant!! >= midPriceOfMeals }
            .sortedBy { it.mealsPrices.mealFor2PeopleMidRangeRestaurant }.first()
    }

}
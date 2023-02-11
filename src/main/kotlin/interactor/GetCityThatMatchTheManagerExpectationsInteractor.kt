package interactor

import model.CityEntity
import java.util.*


class GetCityThatMatchTheManagerExpectationsInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(countries: List<String>): CityEntity? {
        val existCountries = countries.map(::formatCountriesNames)
                                     .filter { selectedCountries.contains(it) }

        val pricesOfMeals = mutableListOf<Float>()

        return if (existCountries.isEmpty())
            null
        else
            dataSource
                .getAllCitiesData()
                .filter { it.country in existCountries }
                .filter(::excludeNullPricesOfMeals)
                .onEach {
                    pricesOfMeals.add(it.mealsPrices.mealFor2PeopleMidRangeRestaurant!!)
                }.let { citiesEntity ->
                    getCityThatMatchExpectations(pricesOfMeals, citiesEntity)
                }
    }


    private fun formatCountriesNames(countryName: String): String {
            return countryName.lowercase()
                .trim()
                .split("\\s+".toRegex())
                .joinToString(" ") {
                    it.replaceFirstChar { char ->
                        if (char.isLowerCase()) char.titlecase(Locale.getDefault()) else it
                    }
                }
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

     companion object {
        private val selectedCountries = listOf("United States", "Canada", "Mexico")
     }
}
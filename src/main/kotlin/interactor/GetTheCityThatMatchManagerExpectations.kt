package interactor

import model.CityEntity
import dataSource.CsvDataSource
import java.lang.Math.floor

class GetTheCityThatMatchManagerExpectations(private val dataSource: CostOfLivingDataSource) {
    fun execute(): CityEntity {
        val northAmericaCountries = filterByCountryAndNoneNullable(dataSource.getAllCitiesData())
            .sortedBy { it.mealsPrices.mealFor2PeopleMidRangeRestaurant }
        return northAmericaCountries.get(getMedianValue(northAmericaCountries.size))
    }

    fun filterByCountryAndNoneNullable(countries: List<CityEntity>): List<CityEntity> =
        countries.filter {
            (it.country == "United States" || it.country == "Mexico" || it.country == "Canada")
                    && it.mealsPrices.mealFor2PeopleMidRangeRestaurant != null
        }

    fun getMedianValue(number: Int): Int = kotlin.math.floor(number / 2.0).toInt()
}

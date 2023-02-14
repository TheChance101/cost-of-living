package interactor

import model.CityEntity
import interactor.util.Constants.CANADA
import interactor.util.Constants.MEXICO
import interactor.util.Constants.UNITED_STATES

class GetTheCityThatMatchManagerExpectationsInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(): CityEntity {
        val northAmericaCountries = filterByCountryAndNoneNullable(dataSource.getAllCitiesData())
            .sortedBy { it.mealsPrices.mealFor2PeopleMidRangeRestaurant }
        return northAmericaCountries[getMedianValue(northAmericaCountries.size)]
    }

    fun filterByCountryAndNoneNullable(countries: List<CityEntity>): List<CityEntity> =
        countries.filter {
            (it.country == UNITED_STATES || it.country == MEXICO || it.country == CANADA)
                    && it.mealsPrices.mealFor2PeopleMidRangeRestaurant != null
        }

    fun getMedianValue(number: Int): Int = kotlin.math.floor(number / 2.0).toInt()
}

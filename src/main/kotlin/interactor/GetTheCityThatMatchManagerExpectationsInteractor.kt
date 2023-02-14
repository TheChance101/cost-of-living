package interactor

import model.CityEntity
import interactor.util.Constants.CANADA
import interactor.util.Constants.MEXICO
import interactor.util.Constants.UNITED_STATES

class GetTheCityThatMatchManagerExpectationsInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(): CityEntity {
        val northAmericaCountries = filterByCountryAndNoneNullable(dataSource.getAllCitiesData())
            .sortedBy {
                (it.mealsPrices.mealFor2PeopleMidRangeRestaurant!!.div(2)
                        + it.mealsPrices.mealInexpensiveRestaurant!! + it.mealsPrices.mealAtMcDonaldSOrEquivalent!!) / 3
            }
        return northAmericaCountries.get(getMedianValue(northAmericaCountries.size))
    }

    fun filterByCountryAndNoneNullable(countries: List<CityEntity>): List<CityEntity> =
        countries.filter {
            it.country in listOf<String>(UNITED_STATES, MEXICO, CANADA)
                    && it.mealsPrices.mealFor2PeopleMidRangeRestaurant != null
                    && it.mealsPrices.mealInexpensiveRestaurant != null
                    && it.mealsPrices.mealAtMcDonaldSOrEquivalent != null

        }

    fun getMedianValue(number: Int): Int = kotlin.math.floor(number / 2.0).toInt()
}





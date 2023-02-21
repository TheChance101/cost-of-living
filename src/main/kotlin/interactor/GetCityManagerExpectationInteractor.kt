package interactor

import model.CityEntity

class GetCityManagerExpectationInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    private val averageDivider = 3
    private val averageHalfDivider = 2

    fun execute(countryOne: String, countryTwo: String, countryThree: String): String? {
        val data =
            dataSource.getAllCitiesData()
                .filter { filterByCountryExcludeNullValues(it, countryOne, countryTwo, countryThree) }
                .sortedBy(::sumAverage)

        return if (data.isNotEmpty()) findAverageBetweenHighestAndLowest(data) else null
    }

    private fun filterByCountryExcludeNullValues(
        city: CityEntity,
        countryOne: String,
        countryTwo: String,
        countryThree: String
    ): Boolean {
        return (
                city.country == countryOne &&
                        city.mealsPrices.mealAtMcDonaldSOrEquivalent != null &&
                        city.mealsPrices.mealInexpensiveRestaurant != null &&
                        city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null
                ) || (
                city.country == countryTwo &&
                        city.mealsPrices.mealAtMcDonaldSOrEquivalent != null &&
                        city.mealsPrices.mealInexpensiveRestaurant != null &&
                        city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null
                ) || (
                city.country == countryThree &&
                        city.mealsPrices.mealAtMcDonaldSOrEquivalent != null &&
                        city.mealsPrices.mealInexpensiveRestaurant != null &&
                        city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null
                )
    }


    private fun findAverageBetweenHighestAndLowest(
        data: List<CityEntity>,
    ): String? {
        val average = sumAverage(data.first()).plus(sumAverage(data.last())).div(averageHalfDivider)

        return data.minByOrNull {
            average.minus(sumAverage(it))
        }?.cityName
    }

    private fun sumAverage(city: CityEntity): Float {
        return city.mealsPrices.mealFor2PeopleMidRangeRestaurant?.plus(city.mealsPrices.mealInexpensiveRestaurant!!)
            ?.plus(city.mealsPrices.mealAtMcDonaldSOrEquivalent!!)?.div(averageDivider)!!
    }
}
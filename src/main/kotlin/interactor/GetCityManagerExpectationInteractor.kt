package interactor

import model.CityEntity

class GetCityManagerExpectationInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    private val defaultInRange = 10
    private val averageDivide = 3

    fun execute(countryOne: String, countryTwo: String, countryThree: String): String? {
        val data =
            dataSource.getAllCitiesData()
                .filter { filterByCountry(it, countryOne, countryTwo, countryThree) }
                .sortedBy {
                    sumAverage(it)
                }

        return findAverageBetweenHighestAndLowest(data)
    }

    private fun filterByCountry(
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
        val average = sumAverage(data.first()).plus(sumAverage(data.last())).div(2)
        val startRange = average.plus(defaultInRange)
        val endRange = average.minus(defaultInRange)
        var cityName: String? = null
        data.forEach { city ->
            cityName = city.takeIf { sumAverage(city) in startRange..endRange }?.cityName
        }

        return cityName
    }

    private fun sumAverage(city: CityEntity): Float {
        return city.mealsPrices.mealFor2PeopleMidRangeRestaurant?.plus(city.mealsPrices.mealInexpensiveRestaurant!!)
            ?.plus(city.mealsPrices.mealAtMcDonaldSOrEquivalent!!)?.div(averageDivide)!!
    }
}
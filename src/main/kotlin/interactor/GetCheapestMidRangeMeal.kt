package interactor

import model.CityEntity

class GetCheapestMidRangeMeal(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(): CityEntity {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeTheThreeCountriesOrNot)
            .sortedBy { it.mealsPrices.mealFor2PeopleMidRangeRestaurant }
            .first()
    }

    private fun excludeTheThreeCountriesOrNot(city: CityEntity): Boolean {
        return (city.country == "USA" || city.country == "Canada" || city.country == "Mexico" || city.mealsPrices != null)
    }

}
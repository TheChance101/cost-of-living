package interactor

import model.CityEntity

class GetCityThatMatchTheManagerExpectationsInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(countries: List<String>): CityEntity {

         dataSource
            .getAllCitiesData()
             .filter{countries.contains(it.country)}
             .filter (::excludeNullMealFor2PeopleMidRangeRestaurant)
            .map {
                print(it.mealsPrices.mealFor2PeopleMidRangeRestaurant)
            }
        return dataSource.getAllCitiesData().random()
    }


    private fun excludeNullMealFor2PeopleMidRangeRestaurant(city: CityEntity): Boolean {
        return city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null
    }

}
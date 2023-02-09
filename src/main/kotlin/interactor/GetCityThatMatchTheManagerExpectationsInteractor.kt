package interactor

import model.CityEntity

class GetCityThatMatchTheManagerExpectationsInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(countries: List<String>): CityEntity {
        return dataSource.getAllCitiesData().random()
    }
}
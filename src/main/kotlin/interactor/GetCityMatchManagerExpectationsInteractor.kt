package interactor

import dataSource.utils.NorthAmericaCountries
import model.CityEntity

class GetCityMatchManagerExpectationsInteractor(
    private val dataSource: CostOfLivingDataSource,
) {


    fun execute(): String {
        return dataSource.getAllCitiesData()
            .filter { it.country in NorthAmericaCountries.list }.first().country
    }

}
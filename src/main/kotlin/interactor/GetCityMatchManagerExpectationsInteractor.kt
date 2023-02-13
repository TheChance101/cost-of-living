package interactor

import dataSource.utils.NorthAmericaCountries
import model.CityEntity

class GetCityMatchManagerExpectationsInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    private fun getOnlyNorthAmericaCountries(city: CityEntity): Boolean = city.country in NorthAmericaCountries.list

    fun execute(): CityEntity {
        return dataSource.getAllCitiesData()
            .filter(::getOnlyNorthAmericaCountries).first()
    }

}
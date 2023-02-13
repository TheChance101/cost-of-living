package interactor

import model.*

class GetDinnerLocationInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(): CityEntity? {

        return dataSource.getAllCitiesData().first()
    }
}

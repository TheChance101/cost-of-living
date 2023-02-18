package dataSource

import interactor.CostOfLivingDataSource
import model.CityEntity

class FakeEmptyDataSource:CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return emptyList()
    }
}
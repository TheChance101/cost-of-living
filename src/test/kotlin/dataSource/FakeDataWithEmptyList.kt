package dataSource

import interactor.CostOfLivingDataSource
import model.CityEntity

class FakeDataWithEmptyList: CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return emptyList()
    }
}
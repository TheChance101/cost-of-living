package data

import interactor.CostOfLivingDataSource
import model.*


class EmptyFakeData : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return emptyList()

    }
}









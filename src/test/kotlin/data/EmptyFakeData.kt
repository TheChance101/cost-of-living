package data

import interactor.CostOfLivingDataSource
import model.*


object EmptyFakeData : CostOfLivingDataSource {
    override fun getAllCitiesData(): List<CityEntity> {
        return emptyList()

    }
}









package interactor

import model.CityEntity

interface CostOfLivingDataSource {
    fun getAllCitiesData(): List<CityEntity>
}
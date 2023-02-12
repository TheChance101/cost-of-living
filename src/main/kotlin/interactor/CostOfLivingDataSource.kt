package interactor

import model.CityData
import model.CityEntity

interface CostOfLivingDataSource {
    fun getAllCitiesData(): List<CityEntity>
    fun getCityData(): List<CityData>
}


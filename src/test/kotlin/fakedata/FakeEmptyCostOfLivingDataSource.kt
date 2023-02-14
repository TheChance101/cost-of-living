package fakedata

import interactor.CostOfLivingDataSource
import model.CityEntity

//Related to GetTopCitiesForBuyingApartment Class Test
class FakeEmptyCostOfLivingDataSource  :CostOfLivingDataSource{
    // data source implementation
    override fun getAllCitiesData(): List<CityEntity> {
        return emptyList()
    }
}
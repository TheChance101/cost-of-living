package interactor

import model.CityEntity

class GetBestCityForSavingMoneyInteractor(private val dataSource: CostOfLivingDataSource) {

    fun execute() : CityEntity{

       return dataSource.getAllCitiesData().random()
    }
}
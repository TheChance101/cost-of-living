package interactor

import model.CityEntity

class GetBestCityForSavingMoneyInteractor(private val dataSource: CostOfLivingDataSource) {

    fun execute(isAppartmentInTheCityCentre : Boolean) : CityEntity{

       return dataSource.getAllCitiesData()[0]
    }

    fun checkNullFields(city : CityEntity , isAppartmentInTheCityCentre : Boolean) : Boolean{

        return false
    }
}
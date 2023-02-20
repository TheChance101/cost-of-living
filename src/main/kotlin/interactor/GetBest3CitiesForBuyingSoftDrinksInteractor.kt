package interactor

import model.CityEntity

class GetBest3CitiesForBuyingSoftDrinksInteractor(private val dataSource: CostOfLivingDataSource) {

    operator fun invoke(): List<CityEntity>{

       return listOf(dataSource.getAllCitiesData()[0])
    }

    private fun excludeNullRequireValues(city : CityEntity) : Boolean{

        return true
    }
}
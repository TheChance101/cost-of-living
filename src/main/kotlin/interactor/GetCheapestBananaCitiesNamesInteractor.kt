package interactor

import model.CityEntity

class GetCheapestBananaCitiesNamesInteractor(private val dataSource: CostOfLivingDataSource) {

    fun execute(vararg cities: String): List<String> {
         TODO("return sorted list of cities by cheapest banana prices")
    }


}
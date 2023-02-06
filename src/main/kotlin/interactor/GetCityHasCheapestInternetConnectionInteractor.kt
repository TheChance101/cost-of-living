package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    var newVareable: Int = 0
    fun execute(): CityEntity {
        throw Throwable("Not Implemented yet")
    }


}
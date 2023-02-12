package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): String {
        throw Throwable("Not Implemented yet")
    }

     fun excludeNullSalaries(city: CityEntity): Boolean {
         throw Throwable("Not Implemented yet")
    }

    fun excludeNullPrice(city: CityEntity): Boolean {
        throw Throwable("Not Implemented yet")
    }

}
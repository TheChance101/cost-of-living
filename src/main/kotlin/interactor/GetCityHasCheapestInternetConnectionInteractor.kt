package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    private val highestPercentageOfInternetCheapness = 5.0f // 5%

    fun execute(): CityEntity? {
        return null
    }

    // exclude null and negative and zero
    fun excludeNullAndIncorrectInternetPriceAndSalary(city: CityEntity): Boolean {
        return false
    }

    fun calculatingThePercentageOfTheInternetPriceFromTheSalary(internetPrice: Float?, salary: Float?): Float? {
        return null
    }


}
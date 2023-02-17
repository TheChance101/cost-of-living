package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): CityEntity {
        throw Throwable("Not Implemented yet")
    }

    fun calculateThePercentageBetweenSalaryAndInternetPrice(city: CityEntity) =
        0f

    fun excludeNullSalariesAndNullInternetPricesAndLowQualityData(city: CityEntity) =
        false


}
package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): CityEntity {
        throw Throwable("Not Implemented yet")
    }

    fun calculateThePercentageBetweenSalaryAndInternetPrice(city: CityEntity) =
        city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!! /
                city.averageMonthlyNetSalaryAfterTax!!

    fun excludeNullSalariesAndNullInternetPricesAndLowQualityData(city: CityEntity) =
        false


}
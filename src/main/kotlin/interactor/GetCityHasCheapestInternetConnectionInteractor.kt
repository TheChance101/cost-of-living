package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute() =
        dataSource.getAllCitiesData()
            .filter(::excludeNullSalariesAndNullInternetPrices)
            .minByOrNull(::calculateThePercentageBetweenSalaryAndInternetPrice)


    fun calculateThePercentageBetweenSalaryAndInternetPrice(city: CityEntity) =
        city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!! /
                city.averageMonthlyNetSalaryAfterTax!!

    fun excludeNullSalariesAndNullInternetPrices(city: CityEntity) =
        city.averageMonthlyNetSalaryAfterTax != null
                && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null


}
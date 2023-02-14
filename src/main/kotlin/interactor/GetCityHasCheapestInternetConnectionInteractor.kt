package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): CityEntity{
        val cities=dataSource
            .getAllCitiesData()
        return cities.minBy { it.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!! / it.averageMonthlyNetSalaryAfterTax!! }
    }
}
package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): CityEntity? {
        return dataSource
            .getAllCitiesData()
            .filter { it.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null && it.averageMonthlyNetSalaryAfterTax != null }
            .minByOrNull { it.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!! / it.averageMonthlyNetSalaryAfterTax!! }

    }

}
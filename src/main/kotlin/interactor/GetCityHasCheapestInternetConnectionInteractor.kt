package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): CityEntity?{
        val cities=dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndInternet)
            .filter(::excludeNegativeOrZeroSalariesAndNegativeInternetCosts)
        return cities.minByOrNull { it.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!! / it.averageMonthlyNetSalaryAfterTax!! }
    }
    private fun excludeNullSalariesAndInternet(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null
                && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null
    }
    private fun excludeNegativeOrZeroSalariesAndNegativeInternetCosts(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax!! > 0 && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!! >=0
    }

}
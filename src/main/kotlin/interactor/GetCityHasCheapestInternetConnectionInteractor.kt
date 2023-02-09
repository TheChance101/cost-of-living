package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): CityEntity? {
        val list = dataSource.getAllCitiesData()
        if (list.isEmpty()) return null
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalariesOrNullInternetCosts)
            .filter (::excludeNegativeSalariesOrNegativeInternetCosts)
            .minByOrNull {
                it.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!!.div(it.averageMonthlyNetSalaryAfterTax!!)
            }

    }

    private fun excludeNullSalariesOrNullInternetCosts(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl !=null
    }

    private fun excludeNegativeSalariesOrNegativeInternetCosts(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax!! >= 0 && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!! >=0
    }

}
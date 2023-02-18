package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(limit: Int): CityEntity? {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullInternetOrNullSalaries)
            .take(limit)
            .minByOrNull(::compareInternetCostToSalary)
    }

    private fun excludeNullInternetOrNullSalaries(city: CityEntity): Boolean {
        return city.run {
            servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null && averageMonthlyNetSalaryAfterTax != null
        }
    }

    private fun compareInternetCostToSalary(city: CityEntity): Float {
        return city.run {
            (servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!! / averageMonthlyNetSalaryAfterTax!!) * 100
        }
    }

}
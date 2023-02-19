package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): CityEntity {
        return dataSource.getAllCitiesData().filter(::excludeNullSalariesAndNullPriceAndNegativeOfThem).minByOrNull {
            (it.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!!
                .div(it.averageMonthlyNetSalaryAfterTax!!)).times(100)
        }!!
    }

    private fun excludeNullSalariesAndNullPriceAndNegativeOfThem(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null
                && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null
                && city.averageMonthlyNetSalaryAfterTax > 0
                && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl > 0
    }

}

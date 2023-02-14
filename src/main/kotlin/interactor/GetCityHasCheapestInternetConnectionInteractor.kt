package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): CityEntity {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullSalariesAndNullInternetPriceAndQualityData)
            .sortedBy(::calculateInternetPercent)
            .first()
    }

    private fun excludeNullSalariesAndNullInternetPriceAndQualityData(city: CityEntity): Boolean {
        return city.dataQuality && city.averageMonthlyNetSalaryAfterTax != null
                && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null
    }

    private fun calculateInternetPercent(city: CityEntity): Float {
        return (city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!!
            .div(city.averageMonthlyNetSalaryAfterTax!!)).times(100)
    }

}

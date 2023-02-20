package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource
) {

   operator fun invoke(): CityEntity {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullSalariesAndNullInternetPriceAndLowQualityData)
            .minByOrNull (::calculateInternetPercent)
            ?: throw IllegalStateException("Invalid data")
    }

    private fun excludeNullSalariesAndNullInternetPriceAndLowQualityData(city: CityEntity): Boolean {
        return city.dataQuality && city.averageMonthlyNetSalaryAfterTax != null
                && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null
    }

    private fun calculateInternetPercent(city: CityEntity): Float {
        return (city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!!
            .div(city.averageMonthlyNetSalaryAfterTax!!))
    }

}

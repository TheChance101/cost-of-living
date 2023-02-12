package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor()
{

    fun execute(cities: List<CityEntity>): CityEntity {
        return if (cities.isNotEmpty()) cities.filter(::excludeNullSalariesAndNullInternetPriceAndQualityData)
            .sortedBy(::calculateInternetPercent).first()
         else throw IllegalArgumentException("Illegal input")
    }

    private fun excludeNullSalariesAndNullInternetPriceAndQualityData(city: CityEntity): Boolean {
        return city.dataQuality && city.averageMonthlyNetSalaryAfterTax != null
                && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null
                && city.averageMonthlyNetSalaryAfterTax >= 0
                && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl >= 0
    }

    private fun calculateInternetPercent(city: CityEntity): Float {
        return (city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!!
            .div(city.averageMonthlyNetSalaryAfterTax!!)).times(100)
    }

}

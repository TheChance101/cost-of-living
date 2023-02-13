package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): CityEntity {
        return dataSource.getAllCitiesData().filter(::excludeNullAndIncorrectInternetPriceAndSalary)
            .sortedBy(::calculatingThePercentageOfTheInternetPriceFromTheSalary).first()
    }


    // exclude null and negative and zero
    fun excludeNullAndIncorrectInternetPriceAndSalary(city: CityEntity): Boolean {
        return ((city.averageMonthlyNetSalaryAfterTax != null) && (city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null)
                && (city.averageMonthlyNetSalaryAfterTax > 0)
                && (city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl > 0))
    }

    fun calculatingThePercentageOfTheInternetPriceFromTheSalary(city: CityEntity): Float {
        val salary = city.averageMonthlyNetSalaryAfterTax
        val internetPrice = city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl
        return (internetPrice!!.div(salary!!)).times(100)
    }

}
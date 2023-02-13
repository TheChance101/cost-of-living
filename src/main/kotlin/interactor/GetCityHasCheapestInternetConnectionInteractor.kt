package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource
) {
//Reham and Zeinab
    fun execute(): CityEntity{
//        return if (cities.isEmpty()) throw IllegalArgumentException("Illegal input")
//        else cities.filter(::excludeIsNullAverageMonthlyNetSalaryAfterTaxAndinternet60MbpsOrMoreUnlimitedDataCableAdsl).
//     minByOrNull { it.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!!/it.averageMonthlyNetSalaryAfterTax!!}!!
//

    return dataSource.getAllCitiesData()[0]

    }
    private fun excludeIsNullAverageMonthlyNetSalaryAfterTaxAndinternet60MbpsOrMoreUnlimitedDataCableAdsl (city : CityEntity ) : Boolean{
        return(city.averageMonthlyNetSalaryAfterTax != null &&
                city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null)
    }

}
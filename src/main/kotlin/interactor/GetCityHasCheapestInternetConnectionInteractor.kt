package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource
) {
//Reham and Zeinab
    fun execute(cities: List<CityEntity>): CityEntity{
        return if (cities.isEmpty()) throw IllegalArgumentException("Illegal input")
        else cities.filter(::excludeIsNullAverageMonthlyNetSalaryAfterTaxAndinternet60MbpsOrMoreUnlimitedDataCableAdsl).
     minByOrNull { it.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!!/it.averageMonthlyNetSalaryAfterTax!!}!!



    }
    private fun excludeIsNullAverageMonthlyNetSalaryAfterTaxAndinternet60MbpsOrMoreUnlimitedDataCableAdsl (city : CityEntity ) : Boolean{
        return(city.averageMonthlyNetSalaryAfterTax != null &&
                city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null)
    }

}
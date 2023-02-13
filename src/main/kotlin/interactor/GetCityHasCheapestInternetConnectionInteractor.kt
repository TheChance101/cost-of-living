package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource
) {
//Reham and Zeinab
    fun execute(): CityEntity{

       return dataSource.getAllCitiesData().
       filter(::excludeIsNullAverageMonthlyNetSalaryAfterTaxAndinternet60MbpsOrMoreUnlimitedDataCableAdsl).
     minByOrNull { it.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!!/it.averageMonthlyNetSalaryAfterTax!!}!!




    }
    private fun excludeIsNullAverageMonthlyNetSalaryAfterTaxAndinternet60MbpsOrMoreUnlimitedDataCableAdsl (city : CityEntity ) : Boolean{
        return(city.averageMonthlyNetSalaryAfterTax != null &&
                city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null)
    }

}
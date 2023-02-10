package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(cities:List<CityEntity>): CityEntity?
     = if (cities.isEmpty()) null else cities.filter {
         excludeNullFromSalariesNullInternetPriceAndLowQualityData(it)
    }.sortedBy { cityEntity -> (cityEntity.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl?.
    div(cityEntity.averageMonthlyNetSalaryAfterTax!!))?.times(100) }[0]

    private fun excludeNullFromSalariesNullInternetPriceAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
                && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null
    }


}
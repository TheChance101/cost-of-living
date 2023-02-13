package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): CityEntity{
        return dataSource
            .getAllCitiesData()
            .filter (::excludeNullSalariesAndLowQualityDataAndNullInternetConnection)
            .sortedBy (::sortByAverageBetweenNetSalaryAndInternetPrice)
            .first()
    }

    private fun excludeNullSalariesAndLowQualityDataAndNullInternetConnection(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null
                && city.dataQuality
                && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!=null
    }
    private fun sortByAverageBetweenNetSalaryAndInternetPrice(city: CityEntity):Float{
        return city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!! / city.averageMonthlyNetSalaryAfterTax!!
    }

}
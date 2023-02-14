package interactor

import model.CityEntity

class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): CityEntity?{
        val cities=dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndInternet)
        return cities.minByOrNull { it.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!! / it.averageMonthlyNetSalaryAfterTax!! }
    }
    private fun excludeNullSalariesAndInternet(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null
                && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null
    }
}
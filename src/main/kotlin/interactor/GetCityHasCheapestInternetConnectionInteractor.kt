package interactor

import model.CityEntity

//task 1
class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): CityEntity? {
        return dataSource
            .getAllCitiesData()
            .filter(::isNotNullOrLessThanZeroSalaryAndInternetPrice)
            .minByOrNull(::getInternetPriceAverage)
    }

    private fun getInternetPriceAverage(it: CityEntity) =
        it.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!! /
                it.averageMonthlyNetSalaryAfterTax!!

    private fun isNotNullOrLessThanZeroSalaryAndInternetPrice(city: CityEntity) =
        city.averageMonthlyNetSalaryAfterTax != null
                && city.averageMonthlyNetSalaryAfterTax > 0
                && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null
                && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl >= 0


}
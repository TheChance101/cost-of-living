package interactor

import model.CityEntity
import utils.isNotNull


class GetCityHasCheapestInternetConnectionInteractor(
    private val dataSource: CostOfLivingDataSource
){

    fun execute(): CityEntity {
        return  dataSource.getAllCitiesData()
            .asSequence()
            .filter (::excludeNullSalariesAndLowQualityDataAndNullInternetPrice).toList()
            .sortedBy(::findTheRatioOfInternetPriceToSalaryAverage)
            .takeIf { it.isNotEmpty() }
            ?.first() ?: throw NoReturnedDataException("List that you entered all of it has bad quality data " +
                "or null average salary or null internet price")

   }

    private fun excludeNullSalariesAndLowQualityDataAndNullInternetPrice(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax.isNotNull() &&
                 city.dataQuality &&
                 city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl.isNotNull()
    }

    private fun findTheRatioOfInternetPriceToSalaryAverage(city: CityEntity) =
        city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!! / city.averageMonthlyNetSalaryAfterTax!!



}





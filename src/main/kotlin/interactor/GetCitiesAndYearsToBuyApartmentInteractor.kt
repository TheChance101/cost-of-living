package interactor

import model.CityEntity
import interactor.util.Extension.toFormat

class GetCitiesAndYearsToBuyApartmentInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(limit: Int): List<Pair<String?,String>> =
        dataSource
            .getAllCitiesData()
            .filter(::excludeNullValueAndLowQualityData)
            .sortedBy(::calculateYearsNeededToBuyApartment)
            .take(limit)
            .map { Pair(it.cityName, "${calculateYearsNeededToBuyApartment(it)} year") }


    private fun excludeNullValueAndLowQualityData(city: CityEntity): Boolean =
        city.let {
            it.dataQuality &&
            it.cityName != null &&
            it.averageMonthlyNetSalaryAfterTax != null &&
            it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null
        }


    private fun calculateYearsNeededToBuyApartment(city: CityEntity): Float =
        city.let {
            ( it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!! *100 /
             ( it.averageMonthlyNetSalaryAfterTax!! * 12)).toFormat()
        }


}
package interactor

import model.CityEntity

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


    private fun excludeNullValueAndLowQualityData(city: CityEntity): Boolean =   //the value are Salaries , Prices Per SquareMeter and city name
        city.let {
            it.dataQuality &&
            it.cityName != null &&
            it.averageMonthlyNetSalaryAfterTax != null &&
            it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null
        }


    private fun calculateYearsNeededToBuyApartment(city: CityEntity): Int =
        city.let {
            ( it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!! *100).toInt()  /
                    (it.averageMonthlyNetSalaryAfterTax!! * 12).toInt()
        }

}
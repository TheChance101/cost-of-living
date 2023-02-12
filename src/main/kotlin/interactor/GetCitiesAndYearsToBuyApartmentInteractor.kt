package interactor

import model.CityEntity
import interactor.util.Extension.toFormat
import interactor.util.Extension.toYear

class GetCitiesAndYearsToBuyApartmentInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(limit: Int): List<Pair<String,String>> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullValueAndLowQualityData)
            .sortedBy(::calculateYearsNeededToBuyApartment)
            .take(limit)
            .map { Pair(it.cityName, calculateYearsNeededToBuyApartment(it).toYear()) }
    }


    private fun excludeNullValueAndLowQualityData(city: CityEntity): Boolean {
        return city.let {
             it.dataQuality &&
            it.averageMonthlyNetSalaryAfterTax != null &&
            it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null
        }
    }

    private fun calculateYearsNeededToBuyApartment(city: CityEntity): Float {
        return city.let {
            ((it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!! * 100) /
             ( it.averageMonthlyNetSalaryAfterTax!! * 12)).toFormat()
        }
    }
}



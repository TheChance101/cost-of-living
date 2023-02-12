package interactor

import interactor.util.Constants.ONE_HUNDRED_SQUARE_METER
import interactor.util.Constants.TWELVE_MONTH
import model.CityEntity
import interactor.util.toFormat
import interactor.util.toYear

class GetCitiesAndYearsToBuyApartmentInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(limit: Int): List<Pair<String, String>> {
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
        return with(city) {
            ((realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre?.times(ONE_HUNDRED_SQUARE_METER))?.div(
                (averageMonthlyNetSalaryAfterTax?.times(TWELVE_MONTH)!!)
            ))?.toFormat() ?: 0f
        }
    }
}



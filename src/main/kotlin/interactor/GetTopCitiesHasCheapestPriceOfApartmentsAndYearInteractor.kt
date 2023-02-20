package interactor

import model.CityEntity
import kotlin.math.roundToInt

class GetTopCitiesHasCheapestPriceOfApartmentsAndYearInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    operator fun invoke(limit: Int): List<Pair<String, Float>> {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullNetSalaryAndPricePerSquareMeterAndLowDataQuality)
            .takeIf { it.isNotEmpty() && limit > 0 }
            ?.run {
                asSequence()
                    .distinctBy { it.cityName }
                    .map(::makeAPairOfCityNameAndCountOfYears)
                    .sortedBy { it.second }
                    .take(limit).toList()
            }
            ?: throw Exception("Empty Data")

    }

    private fun makeAPairOfCityNameAndCountOfYears(city: CityEntity): Pair<String, Float> {
        return Pair(
            city.cityName, calculateCountOfYearsToBuyApartment(city, city.averageMonthlyNetSalaryAfterTax!!)
        )
    }

    private fun excludeNullNetSalaryAndPricePerSquareMeterAndLowDataQuality(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null &&
                city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null &&
                city.dataQuality
    }

    private fun calculateCountOfYearsToBuyApartment(city: CityEntity, salary: Float): Float {
        return getTheNearestFiveNumberAfterTheSign(
            (city
                .realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!
                .times(100))
                .div(salary)
                .div(12)
        )
    }

    private fun getTheNearestFiveNumberAfterTheSign(number: Float): Float {
        return number.times(100000)
            .roundToInt()
            .div(100000.0).toFloat()
    }


}
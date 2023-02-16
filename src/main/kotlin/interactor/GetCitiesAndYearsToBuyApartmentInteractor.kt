package interactor
import interactor.util.Constants.ONE_HUNDRED_SQUARE_METER
import interactor.util.Constants.TWELVE_MONTH
import model.CityEntity
import interactor.util.toDiv
import interactor.util.toYear
import java.lang.ArithmeticException


class GetCitiesAndYearsToBuyApartmentInteractor(
    private val dataSource: CostOfLivingDataSource ,
) {

    fun execute(limit: Int) : Map<String, String> {
        return dataSource
                .getAllCitiesData()
                .filter(::excludeNullValueAndSalaryIsZeroAndLowQualityData)
                .sortedBy(::calculateYearsNeededToBuyApartment)
                .take(limit)
                .associate { it.cityName to calculateYearsNeededToBuyApartment(it) }
    }


    private fun excludeNullValueAndSalaryIsZeroAndLowQualityData(city: CityEntity): Boolean {
        return city.let {
            it.dataQuality &&
                    it.cityName.trim() != "" &&
                    it.averageMonthlyNetSalaryAfterTax != null &&
                    it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null &&
                    it.averageMonthlyNetSalaryAfterTax != 0f
        }
    }

     fun calculateYearsNeededToBuyApartment(city: CityEntity): String {
        return with(city){ city
            (city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!! * ONE_HUNDRED_SQUARE_METER)
                .takeIf { it > 0f }
                ?.toDiv( city.averageMonthlyNetSalaryAfterTax!! * TWELVE_MONTH )
                ?.toYear()
                ?: throw ArithmeticException("the salary can't be zero or less")
        }

    }
}





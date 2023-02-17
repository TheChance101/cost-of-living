package interactor
import interactor.util.Constants.ONE_HUNDRED_SQUARE_METER
import interactor.util.Constants.TWELVE_MONTH
import model.CityEntity
import interactor.util.toDiv
import interactor.util.toYear
import java.lang.ArithmeticException

/*
Q6:-
There is a guy who hate the crowd and love the nature and he hate to pay for renting appartments all of his life,
he decied to work in 1 full time job + 1 part time job, he pay all the money he get from the part time job for living
and eating and all his needs, and save all the money that he get from the full time job to buy 100 meter apartment,
 find the top 10 cities names that he can buy this apartment faster,
 and how many year is needed to buy each apartment for each city,
 the expected return type is a list of pairs each pair is city name and the years needed to buy the apartment
 in float or double, this guy is serious so please avoid the low qulaity data.
 */

class GetCitiesAndYearsToBuyApartmentInteractor(
    private val dataSource: CostOfLivingDataSource ,
) {

    fun execute(limit: Int) : Map<String, String> {
        return dataSource
                .getAllCitiesData()
                .filter(::excludeNullValueAndSalaryIsZeroAndLowQualityData)
                .sortedBy(::calculateYearsNeededToBuyApartment)
                .take(limit)
                .associateBy (CityEntity::cityName , ::calculateYearsNeededToBuyApartment )
    }


    private fun excludeNullValueAndSalaryIsZeroAndLowQualityData(city: CityEntity): Boolean {
        return city.let {
            it.dataQuality &&
                    it.cityName.trim() != "" &&
                    it.averageMonthlyNetSalaryAfterTax != null &&
                    it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null &&
                    it.averageMonthlyNetSalaryAfterTax > 0f
        }
    }

     fun calculateYearsNeededToBuyApartment(city: CityEntity): String {
        return (city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!! * ONE_HUNDRED_SQUARE_METER)
                .toDiv( city.averageMonthlyNetSalaryAfterTax!! * TWELVE_MONTH )
                .toYear()
    }
}





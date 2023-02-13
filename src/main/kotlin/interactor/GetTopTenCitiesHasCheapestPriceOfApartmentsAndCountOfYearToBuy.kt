package interactor

import model.CityEntity
import kotlin.math.roundToInt

class GetTopTenCitiesHasCheapestPriceOfApartmentsAndCountOfYearToBuy(
    private val dataSource: CostOfLivingDataSource
) {



    /**
     * @param salaryOfFullTimeJob
     * @see this main method and call all function on class
     * @return return List of pair , this pair of city name and count of years
     * to buy apartment in this city
     */
    fun execute(salaryOfFullTimeJob: Number): List<Pair<String, Number?>>? {
        val salary = formatSalary(salaryOfFullTimeJob)
        return if (salary != null) {
            getCheapestPerSquareMeterCitiesNames().map {
                toPair(it, salary)
            }
        } else null

    }


    /**
     * @param salary
     * @see to check if salary bigger than zero or not
     * @return salary after format or null if salary is equal or less than zero
     */
    private fun formatSalary(salary: Number) =
        if (salary.toDouble() > 0.0) salary.toDouble() else null


    /**
     * @param object of CityEntity and salary
     * @see make pair of city name and count of years to buy apartment in this
     * cities
     * @return pair of city name and count of years to buy apartment in this
     */
    //to make a pair of city name and count of years to buy apartment in this city
    private fun toPair(city: CityEntity, salary: Double): Pair<String, Number> {
        return Pair(
            city.cityName, (
                    (city
                        .realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!
                        .times(100))
                        .div(salary))
                .div(12)
                .times(100000)
                .roundToInt()
                .div(100000.0)
        )
    }


    /**
     * @see take list of object of CityEntity and filter it according to
     * excludeNullPricePerSquareMeterAndLowDataQuality function
     * then sorted by price Per Square Meter in outside center a
     * then take top ten cities
     * @return  List of ten items of object and this object is instance of CityEntity
     */
    private fun getCheapestPerSquareMeterCitiesNames(): List<CityEntity> {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullPricePerSquareMeterAndLowDataQuality)
            .sortedBy { it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre }
            .take(10)
    }


    /**
     * @param object of  CityEntity
     * @see check if price Per Square Meter is null or not and avoid low data
     * @return true or false
     */
    private fun excludeNullPricePerSquareMeterAndLowDataQuality(city: CityEntity): Boolean {
        return city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null
                && city.dataQuality
    }


}
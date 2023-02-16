package interactor

import model.CityEntity
import javax.management.Query.div
import kotlin.math.roundToInt

class GetTopTenCitiesHasCheapestPriceOfApartmentsAndYearInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(salaryOfFullTimeJob: Number): List<Pair<String, Number?>>? {
        val salary = formatSalary(salaryOfFullTimeJob)
        return if (salary != null) {
            getCheapestPerSquareMeterCitiesNames().map {
                toPair(it, salary)
            }
        } else null

    }

    private fun formatSalary(salary: Number) =
        if (salary.toDouble() > 0.0) salary.toDouble() else null


    private fun toPair(city: CityEntity, salary: Double): Pair<String, Number> {
        return Pair(
            city.cityName,calculateCountOfYearsToBuyApartment(city,salary)
        )
    }


    private fun getCheapestPerSquareMeterCitiesNames(): List<CityEntity> {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullDataQuality)
            .filter(::excludeNullPricePerSquareMeter)
            .sortedBy { it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre }
            .take(10)
    }


    private fun excludeNullDataQuality(city: CityEntity): Boolean {
        return city.dataQuality
    }
     private fun excludeNullPricePerSquareMeter(city: CityEntity): Boolean {
        return city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null

    }
    private fun calculateCountOfYearsToBuyApartment(city: CityEntity, salary: Double): Double {
      return (city
                  .realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!
                  .times(100))
                  .div(salary)
          .div(12)
          .times(100000)
          .roundToInt()
          .div(100000.0)
    }

}
package interactor

import model.CityEntity
import kotlin.math.round

class GetTopTenCitiesHasCheapestPriceOfApartmentsAndCountOfYearToBuy(
    private val dataSource: CostOfLivingDataSource
) {

    fun getPairOfCheapestCitiesAndCountOfYears(salaryOfFullTimeJob: Any?)
            : MutableList<Pair<String, Any?>>? {

        val pairOfCitiesNamesAndCountOfYear =
            mutableListOf<Pair<String, Any?>>()

        val salary = formatSalary(salaryOfFullTimeJob)

        if (salary != null) {

            for (i in getCheapestPerSquareMeterCitiesNames()) {

                // calculate count of years to get apartment
                var years = ((i
                    .realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre
                    ?.times(100))?.div(salary))?.div(12)
                    years = String.format("%.5f", years).toDouble()


                // get city name from dataBase
                val cityName = i.cityName

                pairOfCitiesNamesAndCountOfYear.add(Pair(cityName, years))
            }
        } else return null

        return pairOfCitiesNamesAndCountOfYear

    }

    private fun formatSalary(salary: Any?): Double? {
        var salaryNotNull: Double? = null
        if (salary != null && isNumericToX(salary.toString())) {
            val nSalary = salary.toString().toDouble()
            if (nSalary > 0.0)
                salaryNotNull = nSalary
        }
        return salaryNotNull
    }

    private fun isNumericToX(toCheck: String): Boolean {
        return toCheck.toDoubleOrNull() != null
    }

    private fun getCheapestPerSquareMeterCitiesNames(): List<CityEntity> {
        return dataSource.getAllCitiesData()
            .filter(::excludeLowDataQuality)
            .filter(::excludeNullPricePerSquareMeter)
            .sortedBy { it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre }
            .take(10)
    }

    private fun excludeNullPricePerSquareMeter(city: CityEntity): Boolean {
        return city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null
    }

    private fun excludeLowDataQuality(city: CityEntity): Boolean {
        return city.dataQuality
    }


}
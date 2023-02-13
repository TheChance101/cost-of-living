package interactor

import model.CityEntity
import java.lang.Exception

class GetSalariesOfCountryCitiesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(countryName: String): Map<String, Float?>? {
        return dataSource.getAllCitiesData()
            .filter { countryName.lowercase() == it.country.lowercase() }
            .run {
                if (isEmpty())
                    throw Exception("Wrong Country Name")
                else
                    filter(::excludeNullSalariesAndLowQualityData)
                        .associate { it.cityName to it.averageMonthlyNetSalaryAfterTax }
                        .ifEmpty { null }

            }
    }

    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.dataQuality && city.averageMonthlyNetSalaryAfterTax != null
    }


}
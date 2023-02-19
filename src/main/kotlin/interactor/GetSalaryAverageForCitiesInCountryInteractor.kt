package interactor

import model.CityEntity

/**
 * Created by Mohamed Elgohary on 2/11/2023.
 */
class GetSalaryAverageForCitiesInCountryInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(countryName: String): List<Pair<String, Float>> {
        return  dataSource.getAllCitiesData()
            .filter(::excludeNullSalariesAndLowQualityData)
            .filter { it.country.equals(countryName, true) }
            .map { Pair(it.cityName, it.averageMonthlyNetSalaryAfterTax!!) }
            .takeIf { it.isNotEmpty() } ?: throw Exception ("No cities found in country $countryName")
    }

    fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }
}


package interactor

import model.CityEntity

/**
 * Created by Mohamed Elgohary on 2/11/2023.
 */
class GetSalaryAverageForCitiesInCountryInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(countryName: String): List<Pair<String, Float>> {
        return (dataSource.getAllCitiesData()
            .filter { excludeNullSalariesAndLowQualityData(it) && it.country.equals(countryName, true) }
            .takeIf { it.isNotEmpty() } ?: throw Exception("No cities found in country $countryName"))
            .map { Pair(it.cityName, it.averageMonthlyNetSalaryAfterTax!!) }
    }

    fun excludeNullSalariesAndLowQualityData(city: CityEntity) = city.run {
        averageMonthlyNetSalaryAfterTax != null && dataQuality
    }

}
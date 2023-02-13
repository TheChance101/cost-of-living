package interactor

import model.CityEntity

/**
 * Created by Mohamed Elgohary on 2/11/2023.
 */
class GetSalaryAverageForCitiesInCountryInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(countryName: String): List<Pair<String, Float>> {
        val citiesInCountry = dataSource.getAllCitiesData()
            .filter { it.country.equals(countryName, true) }

        if (citiesInCountry.isEmpty()) {
            throw Exception("No cities found in country $countryName")
        }

        return citiesInCountry
            .filter(::excludeNullSalariesAndLowQualityData)
            .map { Pair(it.cityName, it.averageMonthlyNetSalaryAfterTax!!) }
    }

    fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }
}
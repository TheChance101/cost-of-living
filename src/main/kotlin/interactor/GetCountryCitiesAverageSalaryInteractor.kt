package interactor

import interactor.util.Constants.COUNTRY_WAS_NOT_FOUND
import interactor.util.formatSentence
import model.CityEntity

class GetCountryCitiesAverageSalaryInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(country: String): List<Pair<String, Float>> {
        val citiesSalaries = dataSource.getAllCitiesData()
            .filter { searchCountry(it, country) && excludeNullSalariesAndLowQualityData(it) }
            .map { Pair(it.cityName, it.averageMonthlyNetSalaryAfterTax!!) }
        if (citiesSalaries.isEmpty()) throw Exception(COUNTRY_WAS_NOT_FOUND)

        return citiesSalaries
    }

    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }

    private fun searchCountry(city: CityEntity, country: String): Boolean {
        return city.country.formatSentence() == country.formatSentence()
    }


}
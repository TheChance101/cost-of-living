package interactor

import interactor.util.formatSentence
import model.CityEntity

class GetCountryCitiesAverageSalaryInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(country: String): List<Pair<String, Float>> {
        return dataSource.getAllCitiesData()
            .filter { compareCountry(it, country) && excludeNullSalariesAndLowQualityData(it) }
            .map { Pair(it.cityName, it.averageMonthlyNetSalaryAfterTax!!) }
            .takeIf { it.isNotEmpty() } ?: throw Exception("country was not found !")
    }

    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }

    private fun compareCountry(city: CityEntity, country: String): Boolean {
        return city.country.formatSentence() == country.formatSentence()
    }


}
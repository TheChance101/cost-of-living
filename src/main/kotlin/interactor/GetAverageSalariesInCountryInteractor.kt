package interactor

import model.CityEntity
import java.util.*

class GetAverageSalariesInCountryInteractor (
    private val dataSource: CostOfLivingDataSource,) {
    fun execute(countryName: String): List<Pair<String,Float?>> {
        val citiesData = dataSource
            .getAllCitiesData()
            .filter (::excludeLowQualityData )
            .filter(::excludeNullSalaries)
            .filter { (it.country.lowercase(Locale.getDefault())) == countryName.lowercase(Locale.getDefault()) }

        if (citiesData.isEmpty()) {
            throw IllegalArgumentException("Country name not found")
        }

        return citiesData.map { Pair(it.cityName, it.averageMonthlyNetSalaryAfterTax) }
    }
    fun excludeLowQualityData(city: CityEntity): Boolean {
        return city.dataQuality
    }
    fun excludeNullSalaries(city: CityEntity): Boolean{
        return city.averageMonthlyNetSalaryAfterTax != null
    }
}

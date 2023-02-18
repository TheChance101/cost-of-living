package interactor
import model.CityEntity

class GetSalaryAverageAndCitiesNames (private val dataSource: CostOfLivingDataSource ) {
    fun execute(countryName: String): List<Pair<String, Float>> {

        return dataSource.getAllCitiesData()
            .filter { countryName.lowercase() == it.country.lowercase() && excludeNullSalariesAndLowQualityData(it) }
            .map { Pair(it.cityName, it.averageMonthlyNetSalaryAfterTax!!) }
            .takeIf { it.isNotEmpty() }?: throw Exception("Country not found")


    }
    private fun excludeNullSalariesAndLowQualityData(city: CityEntity) :Boolean{
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }

}
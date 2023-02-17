package interactor

import model.CityEntity

class GetCitiesNamesAndAverageSalariesInCountry (
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(country: String): List<Pair<String, Float>> {

        val list=dataSource.run {
            getAllCitiesData()
            .filter{it.country.lowercase()==country.lowercase()&&excludeNullSalariesAndLowQualityData(it)}
            .map{it.cityName to it.averageMonthlyNetSalaryAfterTax!!} }


        if (list.isEmpty()) throw Exception("wrong name")

        return list
    }
    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }

}
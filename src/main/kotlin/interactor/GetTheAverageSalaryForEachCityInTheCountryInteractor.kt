package interactor

import model.CityEntity

class GetTheAverageSalaryForEachCityInTheCountryInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(countryName: String): List<Pair<String,Float>> {

        return dataSource.getAllCitiesData()
            .filter { excludeNullSalariesAndLowQualityData(it) && allowCountryNameToBeLowerOrUpperOrMix(it,countryName) }
            .map { Pair(it.cityName, it.averageMonthlyNetSalaryAfterTax!!) }
            .takeIf { it.isNotEmpty() }?:throw Exception("country name or average salary not found ")

    }

    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }

    private fun allowCountryNameToBeLowerOrUpperOrMix(countryNameInData: CityEntity,inputCountryName:String): Boolean {
        return  countryNameInData.country.lowercase() == inputCountryName.lowercase()
    }
}

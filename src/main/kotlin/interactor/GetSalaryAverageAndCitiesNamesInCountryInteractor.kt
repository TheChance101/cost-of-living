package interactor

import model.CityEntity


class GetSalaryAverageAndCitiesNamesInCountryInteractor(
    private val dataSource: CostOfLivingDataSource
    ) {

    fun execute(countryName:String):List<Pair<String,Float>> {
        return if (checkIfCountryIsValid(countryName))
            dataSource.getAllCitiesData()
                .filter{excludeNullSalariesAndLowQualityData(it) && it.country.lowercase() == countryName.lowercase()}
                .map{Pair(it.cityName,it.averageMonthlyNetSalaryAfterTax!!)}
        else
            throw Exception("Invalid country name")
    }

    private fun checkIfCountryIsValid(countryName: String):Boolean{
        return countryName.lowercase() in dataSource.getAllCitiesData()
            .map{it.country.lowercase()}
    }

    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }

}
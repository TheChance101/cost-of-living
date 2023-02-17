package interactor

import utils.isNotNull


class GetSalaryAverageAndCitiesNamesInCountryInteractor(
    private val dataSource: CostOfLivingDataSource
    ) {

    fun execute(countryName:String):List<Pair<String,Float>> {
        return dataSource
            .getAllCitiesData()
            .filter{
                    it.averageMonthlyNetSalaryAfterTax.isNotNull() &&
                    it.dataQuality &&
                    it.country.lowercase() == countryName.lowercase()
            }
            .map{Pair(it.cityName,it.averageMonthlyNetSalaryAfterTax!!)}
            .takeIf { it.isNotEmpty() } ?: throw InvalidCountryNameException("Invalid country name")

    }

}
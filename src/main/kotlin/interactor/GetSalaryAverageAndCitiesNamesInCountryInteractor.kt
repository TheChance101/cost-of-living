package interactor

import utils.isNotNull


class GetSalaryAverageAndCitiesNamesInCountryInteractor(
    private val dataSource: CostOfLivingDataSource
    ) {

    fun execute(countryName:String):List<Pair<String,Float>> {
        return dataSource
            .getAllCitiesData()
            .also{
                    if(it.isEmpty()) throw java.lang.IllegalStateException("Something went wrong")
                    if(countryName.lowercase() !in it.map{city -> city.country.lowercase()}) return emptyList()
            }
            .filter{
                    countryName.lowercase() == it.country.lowercase() &&
                    it.averageMonthlyNetSalaryAfterTax.isNotNull() &&
                    it.dataQuality
            }
            .map{Pair(it.cityName,it.averageMonthlyNetSalaryAfterTax!!)}

    }

}
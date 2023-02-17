package interactor


class GetSalaryAverageAndCitiesNamesInCountryInteractor(
    private val dataSource: CostOfLivingDataSource
    ) {

    fun execute(countryName:String):List<Pair<String,Float>> {
        return dataSource
            .getAllCitiesData()
            .filter{
                    it.averageMonthlyNetSalaryAfterTax != null &&
                    it.dataQuality &&
                    it.country.lowercase() == countryName.lowercase()
            }
            .map{Pair(it.cityName,it.averageMonthlyNetSalaryAfterTax!!)}
            .takeIf { it.isNotEmpty() } ?: throw Exception("Invalid country name")

    }

}
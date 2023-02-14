package interactor

class GetCitiesNamesAndAverageSalariesInCountry (
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(country: String): List<Pair<String, Float>> {

        if (dataSource
                .getAllCitiesData()
                .filter { it.country.lowercase() == country.lowercase() && it.dataQuality }
                .map { it.cityName to it.averageMonthlyNetSalaryAfterTax!! }.isEmpty()
        )
            throw Exception("wrong name")
        else
            return dataSource
                .getAllCitiesData()
                .filter { it.country.lowercase() == country.lowercase() && it.dataQuality }
                .map { it.cityName to it.averageMonthlyNetSalaryAfterTax!! }

    }

}
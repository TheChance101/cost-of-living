package interactor

class GetCitiesNamesAndAverageSalariesInCountry (
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(country: String): List<Pair<String, Float>> {

        val list=dataSource
            .getAllCitiesData()
            .filter{it.country.lowercase()==country.lowercase()&&it.dataQuality}
            .map{it.cityName to it.averageMonthlyNetSalaryAfterTax!!}

        if (list.isEmpty()) throw Exception("wrong name")

        return list

    }

}
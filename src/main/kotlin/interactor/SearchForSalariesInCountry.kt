package interactor
import model.CityEntity


class SearchForSalariesInCountry (private val dataSource: CostOfLivingDataSource,) {

    fun execute(countryName: String): List<Pair<String, Float>> {

        val listOfCities = dataSource
            .getAllCitiesData()
            .filter { countryName.lowercase() == it.country.lowercase() && it.dataQuality }
        if (listOfCities.isNotEmpty()) {
            var listOfPairs= mutableListOf<Pair<String, Float>>()
            listOfCities.forEach {
                listOfPairs.add(Pair(it.cityName, it.averageMonthlyNetSalaryAfterTax!!))
            }
            return listOfPairs
        } else
            throw Exception("Enter correct country name")
    }


}
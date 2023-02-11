package interactor

class GetCitiesAverageSalary(private val dataSource: CostOfLivingDataSource) {

    fun execute(country: String): List<Pair<String, Double>> {
        val countryData = dataSource.getAllCitiesData().filter {
            it.country.equals(country, ignoreCase = true) && it.dataQuality
        }

        return if (countryData.isEmpty()) {
            throw IllegalArgumentException("Invalid country name.")
        } else {
            countryData.map { Pair(it.cityName, it.averageMonthlyNetSalaryAfterTax!!.toDouble()) }
        }
    }

}
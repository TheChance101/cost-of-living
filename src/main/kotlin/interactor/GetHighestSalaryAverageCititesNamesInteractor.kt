package interactor

import model.CityEntity

class GetHighestSalaryAverageCititesNamesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit: Int): List<String>{
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalaries)
            .sortedByDescending { it.averageMonthlyNetSalaryAfterTax }
            .take(limit)
            .map { it.cityName }
    }

    private fun excludeNullSalaries(city: CityEntity): Boolean{
        return city.averageMonthlyNetSalaryAfterTax != null
    }

}
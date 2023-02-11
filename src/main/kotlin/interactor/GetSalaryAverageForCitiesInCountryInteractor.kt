package interactor

import model.CityEntity

/**
 * Created by Mohamed Elgohary on 2/11/2023.
 */
class GetSalaryAverageForCitiesInCountryInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(countryName: String): List<Pair<String, Float>> {
        return listOf(Pair("", 1.0f))
    }

    fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {

        return true
    }
}
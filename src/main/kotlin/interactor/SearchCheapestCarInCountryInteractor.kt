package interactor

import model.CityEntity

/**
 * Created by Mohamed Elgohary on 2/17/2023.
 */
class SearchCheapestCarInCountryInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(countryName: String, limit: Int): List<Pair<String, Float>> {
        return listOf(Pair("New York", 15000.0f))
    }

    fun searchCheapestCar(city: CityEntity) = 15000.0f

    fun excludeNullCarsPrices(city: CityEntity) = true
}
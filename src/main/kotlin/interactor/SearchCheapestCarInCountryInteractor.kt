package interactor
import model.CityEntity
/**
 * Created by Mohamed Elgohary on 2/17/2023.
 */
class SearchCheapestCarInCountryInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(countryName: String, limit: Int): List<Pair<String, Float>> {
        return (dataSource.getAllCitiesData()
            .filter { excludeNullCarsPrices(it) && it.country.equals(countryName, true) }
            .takeIf { it.isNotEmpty() } ?: throw Exception("No cities found in country $countryName"))
            .take(limit)
            .map { city -> Pair(city.cityName, searchCheapestCar(city)) }
    }
    fun searchCheapestCar(city: CityEntity) = minOf(
        city.carsPrices.volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar!!,
        city.carsPrices.toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar!!
    )
    fun excludeNullCarsPrices(city: CityEntity) = city.carsPrices.run {
        volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar != null &&
                toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar !=null
    }
}
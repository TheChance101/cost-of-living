package interactor

import model.CityEntity

/**
 * Created by Mohamed Elgohary on 2/17/2023.
 */
class SearchCheapestCarInCountryInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(countryName: String,limit: Int): List<Pair<String, Float>> {
        return (dataSource.getAllCitiesData()
            .filter { excludeNullCarsPricesAndSalaries(it) && it.country.equals(countryName, true) }
            .takeIf { it.isNotEmpty() } ?: throw Exception("No cities found in country $countryName"))
            .sortedBy { getNumberOfMonthsToBuyACar(it) }
            .take(limit)
            .map { city ->
                Pair(
                    "You can buy the car after working ${getNumberOfMonthsToBuyACar(city)} months in ${city.cityName}",
                    searchCheapestCar(city)
                )
            }
    }
     fun getNumberOfMonthsToBuyACar(city: CityEntity) =
        (searchCheapestCar(city) / city.averageMonthlyNetSalaryAfterTax!!)

    fun searchCheapestCar(city: CityEntity) = minOf(
        city.carsPrices.volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar!!,
        city.carsPrices.toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar!!
    )

    fun excludeNullCarsPricesAndSalaries(city: CityEntity) = city.run {
        carsPrices.volkswagenGolf_1_4_90kwTrendLineOrEquivalentNewCar != null &&
                carsPrices.toyotaCorollaSedan_1_6l_97kwComfortOrEquivalentNewCar != null &&
                averageMonthlyNetSalaryAfterTax != null
    }
}
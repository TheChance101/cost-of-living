package interactor

import model.CityEntity

class GetTopCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(limit: Int): List<Pair<String, Float>> {
        return dataSource.getAllCitiesData()
            .also { require(limit >= 1) { "Invalid Argument!" } }
            .filter { excludeLowQualityData(it) && excludeInvalidCountries(it) && excludeInvalidDrinksPrice(it) }
            .groupBy { it.country }
            .mapValues { calculateAverageCokePrices(it.value) }
            .toList()
            .sortedByDescending { it.second }
            .take(limit)
            .map {  Pair(it.first, it.second.toFloat()) }
    }
}

private fun calculateAverageCokePrices(countries: List<CityEntity>) =
    countries
        .sumOf { it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants!!.toDouble() }
        .div(countries.size)

fun excludeInvalidDrinksPrice(cityEntity: CityEntity) =
    cityEntity.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants != null &&
            cityEntity.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants > 0

fun excludeLowQualityData(cityEntity: CityEntity) = cityEntity.dataQuality


fun excludeInvalidCountries(cityEntity: CityEntity) =
    cityEntity.country.isNotBlank() &&
            cityEntity.cityName.length > 3 &&
            cityEntity.country[0].isUpperCase() &&
            cityEntity.country.contains("[a-zA-Z]+$".toRegex())

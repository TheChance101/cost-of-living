package interactor

class TopTenCountriesTaxes(private val dataSource: CostOfLivingDataSource)
{
    fun getTopTenCountriesWithHighestTaxesOnCarbonatedDrinks(): List<Pair<String, Float>> {
        val drinksPrices = dataSource.getAllCitiesData()
        val filteredDrinksPrices = drinksPrices.filter { it.dataQuality }
        val topTenCountries = filteredDrinksPrices
            .groupBy { it.country }
            .mapValues { (_, prices) -> prices.sumByDouble { it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants?.toDouble() ?: 0.0 } / prices.size }
            .toList()
            .sortedByDescending { (_, avgPrice) -> avgPrice }
            .take(10)
        return topTenCountries.map { (country, avgPrice) -> Pair(country, avgPrice.toFloat()) }
    }
}
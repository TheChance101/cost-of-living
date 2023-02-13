package interactor


class GetTopTenCountriesTaxesInteractor(private val dataSource : CostOfLivingDataSource) {
    fun execute() : List<Pair<String, Float>> {
        val drinksPrices = dataSource.getAllCitiesData()
        val filteredDrinksPrices =
            drinksPrices.filter { it.dataQuality && it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants != null }
        val topTenCountries = filteredDrinksPrices
            .groupBy { it.country }
            .mapValues { (_, prices) -> prices.sumOf { it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants!!.toDouble() } / prices.size }
            .toList()
            .sortedByDescending { (_, avgPrice) -> avgPrice }
            .take(10)
        return topTenCountries.map { (country, avgPrice) -> Pair(country, avgPrice.toFloat()) }
    }


}








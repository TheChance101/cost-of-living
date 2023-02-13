package interactor

import model.CityEntity


class GetTopTenCountriesTaxesInteractor(private val dataSource : CostOfLivingDataSource) {
    fun execute() : List<Pair<String, Float>> {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullCokePepsiAndLowQualityData)
            .groupBy { it.country }
            .mapValues{
                calculateAvgDrinkPrices(it.value)
            }
            .toList()
            .sortedByDescending { (_, avgPrice) -> avgPrice }
            .take(10).map { (country, avgPrice) -> Pair(country, avgPrice.toFloat()) }
    }

    private fun excludeNullCokePepsiAndLowQualityData(city : CityEntity) : Boolean {
        return city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants != null && city.dataQuality
    }

    private fun calculateAvgDrinkPrices( countries : List<CityEntity>) : Double {
        return countries.sumOf { it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants!!.toDouble() } .div(countries.size)
    }

}














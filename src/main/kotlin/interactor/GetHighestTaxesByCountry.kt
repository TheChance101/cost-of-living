package interactor

import model.CityEntity


class GetHighestTaxesByCountry (private val dataSource : CostOfLivingDataSource) {
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

    private fun calculateAvgDrinkPrices( city : List<CityEntity>) : Double {
        return city.sumOf { it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants!!.toDouble() } .div(city.size)
    }

}














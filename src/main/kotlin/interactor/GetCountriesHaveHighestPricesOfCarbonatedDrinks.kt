package interactor

import model.CityEntity


class GetCountriesHaveHighestPricesOfCarbonatedDrinks(private val dataSource: CostOfLivingDataSource) {
    // the function return the average of price for each country
    fun getCountriesHaveHighestPricesOfCarbonatedDrinks(limit:Int =10): List<Pair<String, Double>> =
        dataSource
            .getAllCitiesData()
            .filter(::excludeNullValueOfCarbonateDrinksPriceAndLowDataQuality)
            .groupBy { it.country }
            .mapValues {
                it.value.sumOf { cityEntity ->
                    cityEntity.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants!!.toDouble()
                }.div(it.value.size)
            }
            .toList()
            .sortedByDescending { (_, averageOfPrice) -> averageOfPrice }
            .also { if (limit< 0) throw Throwable("$limit is not logical ") }
            .take(limit)
            .map { (country, averageOfPrice) -> Pair(country, averageOfPrice) }


    // get high data quality only
    private fun excludeNullValueOfCarbonateDrinksPriceAndLowDataQuality(city: CityEntity) =
        city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants != null && city.dataQuality


}

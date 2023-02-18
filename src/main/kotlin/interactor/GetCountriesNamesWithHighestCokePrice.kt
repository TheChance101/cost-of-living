package interactor

import model.CityEntity

class GetCountriesNamesWithHighestCokePrice(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limitOfCountries: Int = 10) = dataSource.getAllCitiesData()
        .filter {it.isDataQualityAndValidCokeValue()}
        .countriesToCokePricesMap()
        .pairsOfCountriesToAveragePrices()
        .sortedByDescending {it.second}.take(limitOfCountries)
}

private fun CityEntity.isDataQualityAndValidCokeValue() =
    dataQuality && drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants != null

private fun List<CityEntity>.countriesToCokePricesMap() =
    groupBy({it.country}, {it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants!!})

private fun Map<String, List<Float>>.pairsOfCountriesToAveragePrices() =
    map { (it.key to ((it.value).reduce {totalCokePrice,cokePrice ->totalCokePrice+cokePrice})/it.value.size)}

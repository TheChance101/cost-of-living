package interactor

import model.CityEntity

class GetTopFashionCitiesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limit: Int): List<String>{
        return dataSource.getAllCitiesData()
            .filter (::execludeNullPrices)
            .sortedBy {

                        it.clothesPrices.onePairOfJeansLevis50oneOrSimilar!! +
                        it.clothesPrices.oneSummerDressInAChainStoreZaraHAndM!! +
                        it.clothesPrices.onePairOfNikeRunningShoesMidRange!!
            }
            .take(limit)
            .map {
                it.cityName
            }
    }

    private fun execludeNullPrices(city: CityEntity): Boolean{
        return with(city.clothesPrices) {
                this.onePairOfJeansLevis50oneOrSimilar != null &&
                this.onePairOfNikeRunningShoesMidRange != null &&
                this.oneSummerDressInAChainStoreZaraHAndM != null
        }
    }
}



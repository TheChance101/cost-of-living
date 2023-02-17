package interactor

import model.CityEntity

class GetTopFashionCitiesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limit: Int): List<String> {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullPrices)
            .sortedBy(::calculateClothesPrices)
            .take(limit)
            .map { it.cityName }
    }

    private fun excludeNullPrices(city: CityEntity): Boolean {
        return with(city.clothesPrices) {
            this.onePairOfJeansLevis50oneOrSimilar != null &&
                    this.onePairOfNikeRunningShoesMidRange != null &&
                    this.oneSummerDressInAChainStoreZaraHAndM != null
        }
    }

    private fun calculateClothesPrices(city: CityEntity): Float {
        return with(city.clothesPrices) {
            onePairOfJeansLevis50oneOrSimilar!! +
                    oneSummerDressInAChainStoreZaraHAndM!! +
                    onePairOfNikeRunningShoesMidRange!!
        }
    }
}



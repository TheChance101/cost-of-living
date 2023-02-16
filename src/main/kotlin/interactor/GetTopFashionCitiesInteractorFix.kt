package interactor

import model.CityEntity

class GetTopFashionCitiesInteractorFix(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limit: Int): List<String> {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullPricesAndLowQualityData)
            .sortedBy(::calculateClothesPrices)
            .take(limit)
            .map { it.cityName }
    }
    private fun excludeNullPricesAndLowQualityData(city: CityEntity): Boolean {
        return with(city.clothesPrices) {
            onePairOfJeansLevis50oneOrSimilar != null &&
                    onePairOfNikeRunningShoesMidRange != null &&
                    oneSummerDressInAChainStoreZaraHAndM != null &&
                    city.dataQuality
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

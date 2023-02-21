package interactor

import model.CityEntity
import model.ClothesPrices



class GetBestCitiesToFashionShoppingInteractor(private val dataSource: CostOfLivingDataSource) {

    fun execute(): List<String> {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullClothesBrandPrices)
            .sortedBy {
                it.clothesPrices.findAveragePrices()
            }
            .take(5)
            .map { it.cityName }

    }

    private fun excludeNullClothesBrandPrices(city: CityEntity): Boolean {
        return city.clothesPrices.oneSummerDressInAChainStoreZaraHAndM != null &&
                city.clothesPrices.onePairOfNikeRunningShoesMidRange != null &&
                city.clothesPrices.onePairOfJeansLevis50oneOrSimilar != null
    }

    private fun ClothesPrices.findAveragePrices(): Float {
        return listOfNotNull(
            onePairOfJeansLevis50oneOrSimilar,
            oneSummerDressInAChainStoreZaraHAndM,
            onePairOfNikeRunningShoesMidRange,
        ).average().toFloat()
    }
}
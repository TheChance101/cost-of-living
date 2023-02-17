package interactor

import model.CityEntity
import model.ClothesPrices

class GetTopFashionCitiesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limit: Int): List<String> {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullPricesAndLowQualityData)
            .sortedBy(::getClothesAveragePrice)
            .take(limit)
            .map { it.cityName }
    }

    private fun ClothesPrices.getAllPricesNotNull(): List<Float> {
        return listOfNotNull(onePairOfJeansLevis50oneOrSimilar,
            onePairOfNikeRunningShoesMidRange,
            oneSummerDressInAChainStoreZaraHAndM,
            onePairOfMenLeatherBusinessShoes)
    }

    private fun excludeNullPricesAndLowQualityData(city: CityEntity): Boolean {
        return city.run {
            clothesPrices.getAllPricesNotNull().isNotEmpty() && dataQuality
        }
    }

    private fun getClothesAveragePrice(city: CityEntity) = city.clothesPrices.getAllPricesNotNull().average().toFloat()
}



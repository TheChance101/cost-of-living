package interactor

import model.CityEntity
import model.ClothesPrices

class GetTopFashionCitiesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limit: Int): List<String> {
        return dataSource.getAllCitiesData()
          //  .filter(::excludeNullPrices)
           // .sortedBy(::calculateClothesPrices)
            .take(limit)
            .map { it.cityName }
    }

    private fun ClothesPrices.getAllPricesNotNull(): List<Float> {
        return listOfNotNull(onePairOfJeansLevis50oneOrSimilar,
            onePairOfNikeRunningShoesMidRange,
            oneSummerDressInAChainStoreZaraHAndM,
            onePairOfMenLeatherBusinessShoes)
    }
}



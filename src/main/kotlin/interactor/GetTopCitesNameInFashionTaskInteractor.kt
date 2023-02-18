package interactor

import model.CityEntity
import model.ClothesPrices

class GetTopCitesNameInFashionTaskInteractor(

    private val dataSource: CostOfLivingDataSource,
) {
    val limit = 5

    fun execute(): List<String> {

        return dataSource
            .getAllCitiesData()
            .filter { excludeNullClothesPrices(it.clothesPrices) }
            .sortedByDescending { averagePrice(it.clothesPrices) }
            .take(limit)
            .map { it.cityName }
    }
}

fun excludeNullClothesPrices(clothesPrices: ClothesPrices) =
    clothesPrices.onePairOfJeansLevis50oneOrSimilar != null && clothesPrices.onePairOfMenLeatherBusinessShoes != null
            && clothesPrices.onePairOfNikeRunningShoesMidRange != null && clothesPrices.oneSummerDressInAChainStoreZaraHAndM != null

fun averagePrice(clothesPrices: ClothesPrices) =
    (clothesPrices.onePairOfJeansLevis50oneOrSimilar!! + clothesPrices.onePairOfMenLeatherBusinessShoes!! +
            clothesPrices.onePairOfNikeRunningShoesMidRange!! + clothesPrices.oneSummerDressInAChainStoreZaraHAndM!!) / 4
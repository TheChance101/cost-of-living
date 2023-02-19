package interactor

import model.CityEntity
import model.ClothesPrices

class GetTopCitesNameInFashionTaskInteractor(

    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limit: Int) = dataSource
        .also { require(limit >= 1) { "Invalid Argument!" } }
        .getAllCitiesData()
        .filter { excludeNullClothesPrices(it.clothesPrices) }
        .sortedByDescending { averagePrice(it.clothesPrices) }
        .take(limit)
        .map { it.cityName }
}

fun excludeNullClothesPrices(clothesPrices: ClothesPrices) =
    clothesPrices.onePairOfJeansLevis50oneOrSimilar != null && clothesPrices.onePairOfMenLeatherBusinessShoes != null
            && clothesPrices.onePairOfNikeRunningShoesMidRange != null && clothesPrices.oneSummerDressInAChainStoreZaraHAndM != null

fun averagePrice(clothesPrices: ClothesPrices) =
    (clothesPrices.onePairOfJeansLevis50oneOrSimilar!! + clothesPrices.onePairOfMenLeatherBusinessShoes!! +
            clothesPrices.onePairOfNikeRunningShoesMidRange!! + clothesPrices.oneSummerDressInAChainStoreZaraHAndM!!) / 4
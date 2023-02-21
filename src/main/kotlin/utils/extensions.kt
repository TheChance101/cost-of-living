package utils

import model.ClothesPrices

fun <T> T.isNotNull() = this != null

fun <T> T.isNull() = this == null

fun ClothesPrices.areNotNull(): Boolean {
    return onePairOfJeansLevis50oneOrSimilar.isNotNull() &&
            onePairOfMenLeatherBusinessShoes.isNotNull() &&
            onePairOfNikeRunningShoesMidRange.isNotNull() &&
            oneSummerDressInAChainStoreZaraHAndM.isNotNull()
}
fun ClothesPrices.average(): Float {
    return listOfNotNull(
        onePairOfJeansLevis50oneOrSimilar,
        onePairOfMenLeatherBusinessShoes,
        onePairOfNikeRunningShoesMidRange,
        oneSummerDressInAChainStoreZaraHAndM
    ).average().toFloat()
}
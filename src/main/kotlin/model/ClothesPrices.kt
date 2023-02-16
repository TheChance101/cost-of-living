package model

data class ClothesPrices(
    val onePairOfJeansLevis50oneOrSimilar: Float?,
    val oneSummerDressInAChainStoreZaraHAndM: Float?,
    val onePairOfNikeRunningShoesMidRange: Float?,
    val onePairOfMenLeatherBusinessShoes: Float?,
)

fun ClothesPrices.hasNoNull(): Boolean {
    return this::class.java.declaredFields
        .map {
            it.isAccessible = true
            it.get(this)
        }.all { it != null }
}

fun ClothesPrices.averagePrice(): Float {
    return this::class.java.declaredFields
        .map {
            it.isAccessible = true
            it.get(this) as Float
        }.average().toFloat()
}
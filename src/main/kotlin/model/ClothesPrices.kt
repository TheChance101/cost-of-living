package model

data class ClothesPrices(
    val onePairOfJeansLevis50oneOrSimilar: Float?,
    val oneSummerDressInAChainStoreZaraHAndM: Float?,
    val onePairOfNikeRunningShoesMidRange: Float?,
    val onePairOfMenLeatherBusinessShoes: Float?,
) {
    fun getAverageClothesPrices(): Float? {
        val prices = listOf(
            onePairOfJeansLevis50oneOrSimilar,
            oneSummerDressInAChainStoreZaraHAndM,
            onePairOfNikeRunningShoesMidRange,
            onePairOfMenLeatherBusinessShoes,
        )
        val total = prices.filterNotNull().sum()
        val count = prices.count { it != null }
        return if (count > 0) total / count else null
    }
}

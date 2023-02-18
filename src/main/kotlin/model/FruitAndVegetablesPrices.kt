package model

data class FruitAndVegetablesPrices(
    val apples1kg: Float?,
    val banana1kg: Float?,
    val oranges1kg: Float?,
    val tomato1kg: Float?,
    val potato1kg: Float?,
    val onion1kg: Float?,
    val lettuceOneHead: Float?,
) {
    fun getAverageFruitAndVegetablesPrices(): Float? {
        val prices = listOf(
            apples1kg,
            banana1kg,
            oranges1kg,
            tomato1kg,
            potato1kg,
            onion1kg,
            lettuceOneHead
        )
        val total = prices.filterNotNull().sum()
        val count = prices.count { it != null }
        return if (count > 0) total / count else null
    }
}

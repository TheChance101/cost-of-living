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
    fun getAverageFruitsAndVegetablesPrice() =
        listOfNotNull(tomato1kg, potato1kg, lettuceOneHead, oranges1kg, onion1kg, banana1kg, apples1kg).average()
}
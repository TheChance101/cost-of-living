package model

data class FruitAndVegetablesPrices(
    val apples1kg: Float?,
    val banana1kg: Float?,
    val oranges1kg: Float?,
    val tomato1kg: Float?,
    val potato1kg: Float?,
    val onion1kg: Float?,
    val lettuceOneHead: Float?,
){
fun getAvreage(): Float {
    val fruitAndVegetableList = listOfNotNull(
        apples1kg, banana1kg, onion1kg,
        lettuceOneHead, oranges1kg,
        potato1kg,tomato1kg)
    return fruitAndVegetableList.sum() / fruitAndVegetableList.size
}
}
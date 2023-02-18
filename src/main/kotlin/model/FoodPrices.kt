package model

data class FoodPrices(
    val loafOfFreshWhiteBread500g: Float?,
    val riceWhite1kg: Float?,
    val eggsRegular12: Float?,
    val localCheese1kg: Float?,
    val chickenFillets1kg: Float?,
    val beefRound1kgOrEquivalentBackLegRedMeat: Float?,
) {
    fun getSumOfFoodPricesByEveryItemQuantity(
        whiteBreadQuantityForEvery500g: Float,
        riceWhiteQuantity: Float,
        cheeseQuantity: Float,
        chickenFilletsQuantity: Float,
        redMeetBeefQuantity: Float
    ): Float? {
        val prices = listOf(
            loafOfFreshWhiteBread500g!! * whiteBreadQuantityForEvery500g,
            riceWhite1kg!! * riceWhiteQuantity,
            localCheese1kg!! * cheeseQuantity,
            chickenFillets1kg!! * chickenFilletsQuantity,
            beefRound1kgOrEquivalentBackLegRedMeat!! * redMeetBeefQuantity,
        )
        val total = prices.sum()
        val count = prices.count { true }
        return if (count > 0) total / count else null
    }
}

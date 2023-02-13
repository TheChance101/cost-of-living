package model

data class CityEntity(
    val cityName: String,
    val country: String,
    val mealsPrices: MealsPrices,
    val drinksPrices: DrinksPrices,
    val fruitAndVegetablesPrices: FruitAndVegetablesPrices,
    val foodPrices: FoodPrices,
    val servicesPrices: ServicesPrices,
    val clothesPrices: ClothesPrices,
    val transportationsPrices: TransportationsPrices,
    val carsPrices: CarsPrices,
    val realEstatesPrices: RealEstatesPrices,
    val averageMonthlyNetSalaryAfterTax: Float?,
    val dataQuality: Boolean,
) {
    constructor(cityName: String) : this(cityName,"",
        MealsPrices(null, null, null),
        DrinksPrices(null, null, null, null, null),
        FruitAndVegetablesPrices(null, null, null, null,null,null, null),
        FoodPrices(null, null, null, null, null, null),
        ServicesPrices(null, null,null,null,null,null,null,null),
        ClothesPrices(null, null,null,null),
        TransportationsPrices(null, null,null,null,null,null),
        CarsPrices(null, null),
        RealEstatesPrices(null, null,null,null,null,null),
        null,
        false)
}

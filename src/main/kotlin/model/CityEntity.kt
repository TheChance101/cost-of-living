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
)

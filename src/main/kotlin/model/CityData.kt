package model

class CityData (
    val cityName: String,
    val country: String,
    val averageMonthlyNetSalaryAfterTax: Float?,
    val dataQuality: Boolean,
    val realEstatesPrices: RealEstatesPrices,
    val foodPrices: FoodPrices
)
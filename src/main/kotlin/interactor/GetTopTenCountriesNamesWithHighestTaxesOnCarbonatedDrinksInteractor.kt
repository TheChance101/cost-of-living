package interactor

import model.CityEntity

class GetTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(limit: Int): List<Pair<String, Float>> {
        val citiesData = dataSource.getAllCitiesData()
        if (limit < 1 ) throw IllegalArgumentException("Please Enter Positive Number!")
        return emptyList()
    }


    fun sumCityDrinkAverage(cityEntity: CityEntity):Float?{
        if (cityEntity.drinksPrices.milkRegularOneLiter == null
            || cityEntity.drinksPrices.cappuccinoRegularInRestaurants == null
            || cityEntity.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants == null
            || cityEntity.drinksPrices.waterAThirdOfLiterBottleInRestaurants == null
            || cityEntity.drinksPrices.waterOneAndHalfLiterBottleAtTheMarket == null) {
            return null
        }
        val sum = cityEntity.drinksPrices.milkRegularOneLiter!! +
                cityEntity.drinksPrices.cappuccinoRegularInRestaurants!! +
                cityEntity.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants!! +
                cityEntity.drinksPrices.waterAThirdOfLiterBottleInRestaurants!! +
                cityEntity.drinksPrices.waterOneAndHalfLiterBottleAtTheMarket!!
        val drinksCount = 5.0f
        return sum / drinksCount
    }


    fun excludeInvalidDrinksPrice(cityEntity: CityEntity) =
        cityEntity.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants != null &&
        cityEntity.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants > 0 &&
                cityEntity.drinksPrices.milkRegularOneLiter != null &&
                cityEntity.drinksPrices.milkRegularOneLiter> 0 &&
                cityEntity.drinksPrices.waterAThirdOfLiterBottleInRestaurants != null &&
                cityEntity.drinksPrices.waterAThirdOfLiterBottleInRestaurants > 0 &&
                cityEntity.drinksPrices.waterOneAndHalfLiterBottleAtTheMarket != null &&
                cityEntity.drinksPrices.waterOneAndHalfLiterBottleAtTheMarket > 0 &&
                cityEntity.drinksPrices.cappuccinoRegularInRestaurants != null &&
                cityEntity.drinksPrices.cappuccinoRegularInRestaurants > 0


    fun excludeLowQualityData(cityEntity: CityEntity) = cityEntity.dataQuality


    fun excludeInvalidCountries(cityEntity: CityEntity) =
        cityEntity.country.isNotBlank() &&
        cityEntity.cityName.length > 3 &&
        cityEntity.country[0].isUpperCase() &&
        cityEntity.country.contains("[a-zA-Z]+$".toRegex())
}
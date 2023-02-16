package interactor

import model.CityEntity

class GetTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(limit: Int): Map<String,Float> {
        val citiesData = dataSource.getAllCitiesData()
        return if (limit < 0 ) throw IllegalArgumentException("Please Enter Positive Number!")
        else {
            var map = mutableMapOf<String,Float>()
            /*val dataFiltered = citiesData.apply {
                filter(::excludeLowQualityData)
                filter(::excludeInvalidCountries)
                filter(::excludeInvalidDrinksPrice)
                take(limit)
            }*/

            val dataFiltered = citiesData
                .filter(::excludeLowQualityData)
                .filter(::excludeInvalidCountries)
                .filter(::excludeInvalidDrinksPrice)
                .sortedByDescending(::sumCityDrinkAverage)
                .take(limit)

            dataFiltered.forEach {
                val average = sumCityDrinkAverage(it)
                if (average != null) {
                    map.put(it.cityName,average)
                }
            }
            return map
        }
    }

    /**
     * Asserts input is valid and high quality
     * @param cityEntity represents selected object
     * @return each cityEntity's drinks average
     * @author Hassan Wasfy
     * */
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

    /**
     * Returns `true` if the drinks prices values
     * is valid
     * @param cityEntity represents a city.
     * @return `true` if the value of drinks prices not `null` and positive.
     * @author Abdurrahman Salah ad-Din && Hassan Wasfy
     */
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

    /**
     * Returns `true` for high quality data and `false` for low quality data.
     * @param cityEntity represents a city.
     * @return the value of `DataQuality`.
     * @author Abdurrahman Salah ad-Din
     */
    fun excludeLowQualityData(cityEntity: CityEntity) = cityEntity.dataQuality

    /**
     * Returns `true` if the value of `country` is invalid.
     * @param cityEntity represents a city.
     * @return `true` if the value of `countryName` is not empty.
     * @author Abdurrahman Salah ad-Din
     */
    fun excludeInvalidCountries(cityEntity: CityEntity) =
        cityEntity.country.isNotBlank() &&
        cityEntity.cityName.length > 3 &&
        cityEntity.country[0].isUpperCase() &&
        cityEntity.country.contains("[a-zA-Z]+$".toRegex())
}
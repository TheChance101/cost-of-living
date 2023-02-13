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


            return map
        }
    }

    fun

    /**
     * Returns `true` if the `cokePepsiAThirdOfLiterBottleInRestaurants` value
     * is valid
     * @param cityEntity represents a city.
     * @return `true` if the value of drink price not `null` and positive.
     * @author Abdurrahman Salah ad-Din
     */
    fun excludeInvalidDrinksPrice(cityEntity: CityEntity) =
        cityEntity.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants != null &&
        cityEntity.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants > 0

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
        cityEntity.country[0].isUpperCase()
}
package interactor

import model.CityEntity

class GetTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(limit: Int): List<String> {
        return throw Exception("Not Implemented yet")
    }

    fun filterHighQualityData(cities: List<CityEntity>):List<CityEntity>{
        //return cities.filter { it.dataQuality }
        throw Exception("Not Implemented yet")
    }

    /**
     * Returns `true` if the `cokePepsiAThirdOfLiterBottleInRestaurants` value
     * is valid
     * @param cityEntity represents a city.
     * @return `true` if the value of drink price not `null` and positive.
     * @author Abdurrahman Salah ad-Din
     */
    fun excludeInvalidDrinksPrice(cityEntity: CityEntity) = Exception("Not implemented yet")

    /**
     * Returns `true` for high quality data and `false` for low quality data.
     * @param cityEntity represents a city.
     * @return the value of `DataQuality`.
     * @author Abdurrahman Salah ad-Din
     */
    fun excludeLowQualityData(cityEntity: CityEntity) = Exception("Not implemented yet")

    /**
     * Returns `true` if the value of `country` is invalid.
     * @param cityEntity represents a city.
     * @return `true` if the value of `countryName` is not empty.
     * @author Abdurrahman Salah ad-Din
     */
    fun excludeInvalidCountries(cityEntity: CityEntity) = Exception("Not implemented yet")
}
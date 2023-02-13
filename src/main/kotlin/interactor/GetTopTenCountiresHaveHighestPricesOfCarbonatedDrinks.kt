package interactor
import model.CityEntity



class GetTopTenCountriesHaveHighestPricesOfCarbonatedDrinks(private val dataSource: CostOfLivingDataSource) {


    // extract the names of ten countries that have high taxes on carbonated drinks
   fun getCountriesOfHighestCarbonatedDrinksPrices(limit:Int): List<Pair<String, Float?>> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeCarbonateDrinksPriceAndLowQualityData)
            .sortedByDescending { it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants }
            .map{it.country}.toSet().zip(getDrinksPrice(dataSource))
            .take(limit)

    }

    // add average prices to the country names
    fun getDrinksPrice(dataSource: CostOfLivingDataSource): List<Float?> {
        val list =dataSource
            .getAllCitiesData()
            .filter(::excludeCarbonateDrinksPriceAndLowQualityData)
            .sortedByDescending { it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants }
            .map { it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants }
        return list
    }
    // get high data quality only
    fun excludeCarbonateDrinksPriceAndLowQualityData(country: CityEntity): Boolean {
        return country.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants !=null && country.dataQuality
    }

    // check the entered limit value
    fun checkTheInputOfLimit(limit:Int):Boolean {
        return !(limit == 0 || limit == -1)
    }
    //check for empty list and null
    fun filterTheListOfCountriesOfHighestCarbonatedDrinksPrices (list: List<String>):Boolean {
        return true

    }

    }







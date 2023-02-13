package interactor

import model.CityEntity

class GetTop10CountriesEnforceHighTaxesOnCarbonatedDrinks (
    private val dataSource: CostOfLivingDataSource,
){
    fun excute():List<String>?{
        val list = dataSource.getAllCitiesData()

        if (list.isEmpty()||allPriceIsNull(list)||allDataIsLow(list)) return null

        return dataSource.getAllCitiesData()
            .filter(::excludeNullPricesAndLowQualityData)
            .sortedByDescending{it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants}
            .take(10).map { it.cityName +" : " + it.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants}

    }
    private fun excludeNullPricesAndLowQualityData(city: CityEntity): Boolean {
        return city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants != null
                && city.dataQuality
    }
    private fun allPriceIsNull(list: List<CityEntity>):Boolean{
        var count: Int = 0
        for (element in list)
            if (element.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants ==null)
                count++

        return count==list.size
    }
    private fun allDataIsLow(list: List<CityEntity>):Boolean{
        var count: Int = 0
        for (element in list)
            if (!element.dataQuality)
                count++

        return count==list.size
    }

}
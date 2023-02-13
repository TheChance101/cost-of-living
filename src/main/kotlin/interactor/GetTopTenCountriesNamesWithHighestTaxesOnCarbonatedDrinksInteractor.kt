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


}
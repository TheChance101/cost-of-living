package interactor

import model.CityEntity

class GetCitiesNameHasHighestClothesPriceInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    private val limit: Int = 5

    fun execute():List<String>{
        return listOf()
    }

    fun excludeAnyNullClothPriceAndLowQualityData(city:CityEntity): Boolean{
        return false
    }
}
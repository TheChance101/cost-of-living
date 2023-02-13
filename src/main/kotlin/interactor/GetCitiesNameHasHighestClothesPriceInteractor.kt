package interactor

import model.CityEntity

class GetCitiesNameHasHighestClothesPriceInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    private val limit: Int = 5

    fun execute(): List<CityEntity> {
        return dataSource.getAllCitiesData()
            .filter(::excludeAnyNullClothPriceAndLowQualityData)
    }

    private fun excludeAnyNullClothPriceAndLowQualityData(city:CityEntity): Boolean{
        return true
    }
}
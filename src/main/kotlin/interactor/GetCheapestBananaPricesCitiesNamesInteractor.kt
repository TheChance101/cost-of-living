package interactor

import model.CityEntity

class  GetCheapestBananaPricesCitiesNamesInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun getCitiesVarArgs(): Array<CityEntity> {
        return dataSource.getAllCitiesData().toTypedArray()
    }
    fun execute(vararg cityEntities: CityEntity): List<String> {
        return emptyList()
    }

}
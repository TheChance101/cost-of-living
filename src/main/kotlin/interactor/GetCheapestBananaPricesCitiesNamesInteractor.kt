package interactor

import model.CityEntity

class  GetCheapestBananaPricesCitiesNamesInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun getCitiesVarArgs(): Array<CityEntity> {
        return dataSource.getAllCitiesData().toTypedArray()
    }
    fun execute(vararg cityEntities: CityEntity): List<String> {
        return if (cityEntities.isEmpty())
            listOf("No Data is Entered !")
       else  throw Throwable("Not Implemented yet")
    }

}

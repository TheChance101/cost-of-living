package interactor

import model.CityEntity

class GetCheapestBananaPricesCitiesNamesInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(vararg cityEntities: CityEntity): List<String> {
        throw Throwable("Not Implemented yet")
    }
}
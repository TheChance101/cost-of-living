package interactor

import model.CityEntity
import model.CityNameClothesPrices

class GetCityNamesClothesPrices(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute( ): List<CityNameClothesPrices> {
        return listOf()
    }
}
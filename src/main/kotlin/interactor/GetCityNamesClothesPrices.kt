package interactor

import model.CityEntity
import model.CityNameClothesPrices

class GetCityNamesClothesPrices(
    private val dataSource: List<CityEntity>,
) {

    fun execute( ): List<CityNameClothesPrices> {

        if(dataSource.size == 0  ) throw  Exception (" the data you pass hasn't city ")

        return listOf()
    }
}
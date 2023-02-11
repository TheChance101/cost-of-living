package interactor

import model.CityNameSumClothesPrices
import model.NameCityClothesPrices

class GetTop5NamesCitiesHasClothesFamousBrandsWithSuitablePricesInteractor (
    private val dataSource: List<NameCityClothesPrices>,
) {

    fun execute( ): List<String> {

        if(dataSource.size < 5  ) throw  Exception ("the dataSource has less than 5 city ")

        return listOf()
    }

}


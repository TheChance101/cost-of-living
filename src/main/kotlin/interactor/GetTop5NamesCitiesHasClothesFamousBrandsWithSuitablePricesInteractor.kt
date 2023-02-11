package interactor

import model.NameCityClothesPrices

class GetTop5NamesCitiesHasClothesFamousBrandsWithSuitablePricesInteractor (
    private val dataSource: List<NameCityClothesPrices>,
) {

    fun execute( ): List<String> {

        if(dataSource.size == 0  ) throw  Exception ("the dataSource is empty")

        return listOf()
    }


    
}

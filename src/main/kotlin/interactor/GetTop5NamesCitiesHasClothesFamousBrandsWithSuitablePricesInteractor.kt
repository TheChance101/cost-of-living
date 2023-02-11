package interactor

import model.CityEntity
import model.CityNameSumClothesPrices
import model.NameCityClothesPrices

class GetTop5NamesCitiesHasClothesFamousBrandsWithSuitablePricesInteractor (
    private val dataSource: List<NameCityClothesPrices>,
) {

    fun execute( ): List<String> {

        if(dataSource.filter(::deletAllCityHasNotClothes).size < 5  ) throw  Exception ("the dataSource has less than 5 city ")

        return listOf()
    }



    private fun deletAllCityHasNotClothes(city: NameCityClothesPrices): Boolean {
        return city.onePairOfJeansLevis50oneOrSimilar != null && city.onePairOfMenLeatherBusinessShoes != null  && city.onePairOfNikeRunningShoesMidRange != null && city.oneSummerDressInAChainStoreZaraHAndM != null
    }
}



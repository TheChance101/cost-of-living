package interactor

import model.NameCityClothesPrices

class GetTop5NamesCitiesHasClothesFamousBrandsWithSuitablePricesInteractor (
    private val dataSource: List<NameCityClothesPrices>,
) {

    private val numberOfReturnCityName = 5
    fun execute( ): List<String> {

        if(dataSource.filter(deletAllCityHasNotClothes).size < numberOfReturnCityName  ) throw  Exception ("the dataSource has less than 5 city ")

        return dataSource
            .filter(deletAllCityHasNotClothes)
            .sortedBy(calculateSumClothesPrices)
            .take(numberOfReturnCityName)
            .map { it.cityName }
    }


    private val calculateSumClothesPrices = { city: NameCityClothesPrices ->
        city.onePairOfMenLeatherBusinessShoes!! + city.onePairOfJeansLevis50oneOrSimilar!! + city.onePairOfNikeRunningShoesMidRange!! + city.oneSummerDressInAChainStoreZaraHAndM!!
    }

    private val deletAllCityHasNotClothes = { city: NameCityClothesPrices ->
        city.onePairOfJeansLevis50oneOrSimilar != null && city.onePairOfMenLeatherBusinessShoes != null  && city.onePairOfNikeRunningShoesMidRange != null && city.oneSummerDressInAChainStoreZaraHAndM != null
    }

}



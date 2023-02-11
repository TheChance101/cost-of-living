package interactor

import model.CityNameClothesPrices

class GetTop5CitiesNameHasSuitableClothesPricesInteractor (
    private val dataSource: List<CityNameClothesPrices>,
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


    private val calculateSumClothesPrices = { cityName: CityNameClothesPrices ->
        cityName.onePairOfMenLeatherBusinessShoes!! + cityName.onePairOfJeansLevis50oneOrSimilar!! + cityName.onePairOfNikeRunningShoesMidRange!! + cityName.oneSummerDressInAChainStoreZaraHAndM!!
    }

    private val deletAllCityHasNotClothes = { cityName: CityNameClothesPrices ->
        cityName.onePairOfJeansLevis50oneOrSimilar != null && cityName.onePairOfMenLeatherBusinessShoes != null  && cityName.onePairOfNikeRunningShoesMidRange != null && cityName.oneSummerDressInAChainStoreZaraHAndM != null
    }

}



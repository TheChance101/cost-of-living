package interactor

import model.CityEntity

class GetTop5CitiesNameHasSuitableClothesPricesInteractor(
    private val dataSource:  CostOfLivingDataSource,
) {

    fun execute(limit : Int ): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(excludeNullClothes)
            .sortedBy(calculateSumClothesPrices)
            .take(limit)
            .map { it.cityName }
            .takeIf { it.isNotEmpty() } ?: throw Exception("the dataSource hasn't city has suitable clothes prices ")
    }


    private val calculateSumClothesPrices = { cityName: CityEntity ->
        cityName.clothesPrices.onePairOfMenLeatherBusinessShoes!! +
                cityName.clothesPrices.onePairOfJeansLevis50oneOrSimilar!! +
                cityName.clothesPrices.onePairOfNikeRunningShoesMidRange!! +
                cityName.clothesPrices.oneSummerDressInAChainStoreZaraHAndM!!
    }


    private val excludeNullClothes = { cityName: CityEntity ->
        cityName.clothesPrices.onePairOfJeansLevis50oneOrSimilar != null &&
                cityName.clothesPrices.onePairOfMenLeatherBusinessShoes != null &&
                cityName.clothesPrices.onePairOfNikeRunningShoesMidRange != null &&
                cityName.clothesPrices.oneSummerDressInAChainStoreZaraHAndM != null
    }

}



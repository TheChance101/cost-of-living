package interactor

import model.CityEntity

class GetTopCitiesNameHasSuitableClothesPricesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(excludeNullClothes)
            .sortedBy(calculateSumClothesPrices)
            .take(limit)
            .map { it.cityName }
            .takeIf { it.isNotEmpty() } ?: throw Exception("the dataSource hasn't city has suitable clothes prices ")
    }

    private val calculateSumClothesPrices = { cityName: CityEntity ->
        cityName.clothesPrices.run {
            onePairOfMenLeatherBusinessShoes!! +
                    onePairOfJeansLevis50oneOrSimilar!! +
                    onePairOfNikeRunningShoesMidRange!! +
                    oneSummerDressInAChainStoreZaraHAndM!!
        }
    }

    private val excludeNullClothes = { cityName: CityEntity ->
        cityName.clothesPrices.run {
            onePairOfJeansLevis50oneOrSimilar != null &&
                    onePairOfMenLeatherBusinessShoes != null &&
                    onePairOfNikeRunningShoesMidRange != null &&
                    oneSummerDressInAChainStoreZaraHAndM != null
        }

    }

}



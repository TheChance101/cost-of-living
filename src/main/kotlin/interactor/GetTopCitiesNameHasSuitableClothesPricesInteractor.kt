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
        cityName.run {
            clothesPrices.onePairOfMenLeatherBusinessShoes!! +
                    clothesPrices.onePairOfJeansLevis50oneOrSimilar!! +
                    clothesPrices.onePairOfNikeRunningShoesMidRange!! +
                    clothesPrices.oneSummerDressInAChainStoreZaraHAndM!!

        }
    }


    private val excludeNullClothes = { cityName: CityEntity ->
        cityName.run{
            clothesPrices.onePairOfJeansLevis50oneOrSimilar != null &&
                    clothesPrices.onePairOfMenLeatherBusinessShoes != null &&
                    clothesPrices.onePairOfNikeRunningShoesMidRange != null &&
                    clothesPrices.oneSummerDressInAChainStoreZaraHAndM != null

        }

    }


}



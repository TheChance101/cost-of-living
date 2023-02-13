package interactor

import model.CityEntity

class GetCitiesNameHasHighestClothesPriceInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    private val limit: Int = 5

    fun execute(): List<CityEntity> {
        return dataSource.getAllCitiesData()
            .filter(::excludeAnyNullClothPriceAndLowQualityData)
            .sortedByDescending(::getSumOfClothesPricesOfCity)
    }

    private fun excludeAnyNullClothPriceAndLowQualityData(city:CityEntity): Boolean{
        return city.dataQuality
                && city.clothesPrices.onePairOfJeansLevis50oneOrSimilar != null
                && city.clothesPrices.onePairOfMenLeatherBusinessShoes != null
                && city.clothesPrices.onePairOfNikeRunningShoesMidRange != null
                && city.clothesPrices.oneSummerDressInAChainStoreZaraHAndM != null
    }

    private fun getSumOfClothesPricesOfCity(city:CityEntity): Float{
        return city.clothesPrices.onePairOfJeansLevis50oneOrSimilar!! +
                city.clothesPrices.onePairOfMenLeatherBusinessShoes!! +
                city.clothesPrices.onePairOfNikeRunningShoesMidRange!! +
                city.clothesPrices.oneSummerDressInAChainStoreZaraHAndM!!
    }
}
package interactor

import model.CityEntity

class GetTopFiveCitiesNamesForShoppingClothesFromFamousBrandsInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullClothesPricesAndBrandClothesData)
            .sortedByDescending {
                it.clothesPrices.onePairOfJeansLevis50oneOrSimilar
                    ?.plus(
                        it.clothesPrices.onePairOfMenLeatherBusinessShoes
                        !!.plus(
                            it.clothesPrices.onePairOfNikeRunningShoesMidRange!!
                                .plus(it.clothesPrices.oneSummerDressInAChainStoreZaraHAndM!!)
                        )
                    )
            }
            .take( limit )
            .map { it.cityName }
    }


    private fun excludeNullClothesPricesAndBrandClothesData(city: CityEntity): Boolean {
        return city.clothesPrices.onePairOfJeansLevis50oneOrSimilar != null &&
                city.clothesPrices.onePairOfMenLeatherBusinessShoes != null &&
                city.clothesPrices.onePairOfNikeRunningShoesMidRange != null &&
                city.clothesPrices.oneSummerDressInAChainStoreZaraHAndM != null
    }


}

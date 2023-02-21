package interactor

import model.CityEntity


class GetTopFiveCitiesForFashionInteractor (
    val dataSource: CostOfLivingDataSource,
){

    fun execute(limit:Int)=
             dataSource
            .getAllCitiesData()
            .filter(::excludeNullClothesPricesValues)
            .sortedWith(compareBy({it.clothesPrices.onePairOfJeansLevis50oneOrSimilar},{it.clothesPrices.oneSummerDressInAChainStoreZaraHAndM},{it.clothesPrices.onePairOfNikeRunningShoesMidRange},{it.clothesPrices.onePairOfMenLeatherBusinessShoes}))
            .take(limit)
            .map { it.cityName }



    fun excludeNullClothesPricesValues(city: CityEntity)=
                city.clothesPrices.onePairOfJeansLevis50oneOrSimilar != null &&
                city.clothesPrices.onePairOfMenLeatherBusinessShoes != null &&
                city.clothesPrices.onePairOfNikeRunningShoesMidRange != null &&
                city.clothesPrices.oneSummerDressInAChainStoreZaraHAndM != null

}
package interactor

import model.CityEntity

class GetSuitableClothesPriceCitiesNameInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter (::excludeCityWitNoBrand)
            .sortedBy(::getAveragePriceForClothes)
            .take(limit)
            .map { it.cityName }
    }
    private fun getAveragePriceForClothes(cityEntity: CityEntity):Float
    {
        var totalPrice:Float =0.0F
        if(cityEntity.clothesPrices.oneSummerDressInAChainStoreZaraHAndM !=null) totalPrice+=cityEntity.clothesPrices.oneSummerDressInAChainStoreZaraHAndM
        if(cityEntity.clothesPrices.onePairOfNikeRunningShoesMidRange !=null) totalPrice+=cityEntity.clothesPrices.onePairOfNikeRunningShoesMidRange
        if (cityEntity.clothesPrices.onePairOfMenLeatherBusinessShoes !=null) totalPrice+=cityEntity.clothesPrices.onePairOfMenLeatherBusinessShoes
        if(cityEntity.clothesPrices.onePairOfJeansLevis50oneOrSimilar !=null) totalPrice+=cityEntity.clothesPrices.onePairOfJeansLevis50oneOrSimilar
        return totalPrice / getNumberOfBrand(cityEntity)
    }
    private fun getNumberOfBrand(cityEntity: CityEntity):Int{
        var totalBrand =0
        if(cityEntity.clothesPrices.oneSummerDressInAChainStoreZaraHAndM != null) totalBrand++
        if(cityEntity.clothesPrices.onePairOfNikeRunningShoesMidRange != null) totalBrand++
        if(cityEntity.clothesPrices.onePairOfMenLeatherBusinessShoes != null) totalBrand++
        if(cityEntity.clothesPrices.onePairOfJeansLevis50oneOrSimilar != null) totalBrand++
        return totalBrand

    }
    fun excludeCityWitNoBrand(city: CityEntity): Boolean {
        return !(city.clothesPrices.oneSummerDressInAChainStoreZaraHAndM == null &&
                city.clothesPrices.onePairOfJeansLevis50oneOrSimilar == null &&
                city.clothesPrices.onePairOfMenLeatherBusinessShoes == null &&
                city.clothesPrices.onePairOfNikeRunningShoesMidRange == null)
    }

}
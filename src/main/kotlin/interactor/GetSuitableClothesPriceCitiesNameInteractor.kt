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
            .distinctBy { it.cityName }
            .takeIf { limit >0 }
            ?.take(limit)
            ?.map { it.cityName } ?: emptyList()
    }
    private fun getAveragePriceForClothes(cityEntity: CityEntity):Float
    {
        var totalPrice:Float =0.0f
        cityEntity.clothesPrices.oneSummerDressInAChainStoreZaraHAndM?.let { totalPrice+=cityEntity.clothesPrices.oneSummerDressInAChainStoreZaraHAndM }
        cityEntity.clothesPrices.onePairOfNikeRunningShoesMidRange?.let { totalPrice+=cityEntity.clothesPrices.onePairOfNikeRunningShoesMidRange}
        cityEntity.clothesPrices.onePairOfMenLeatherBusinessShoes?.let { totalPrice+=cityEntity.clothesPrices.onePairOfMenLeatherBusinessShoes }
        cityEntity.clothesPrices.onePairOfJeansLevis50oneOrSimilar?.let { totalPrice+=cityEntity.clothesPrices.onePairOfJeansLevis50oneOrSimilar }
        return totalPrice / getNumberOfBrand(cityEntity)
    }
    private fun getNumberOfBrand(cityEntity: CityEntity):Int{
        var totalBrand =0
        cityEntity.clothesPrices.oneSummerDressInAChainStoreZaraHAndM?.let { totalBrand++ }
        cityEntity.clothesPrices.onePairOfNikeRunningShoesMidRange?.let { totalBrand++ }
        cityEntity.clothesPrices.onePairOfMenLeatherBusinessShoes?.let {totalBrand++}
        cityEntity.clothesPrices.onePairOfJeansLevis50oneOrSimilar?.let {totalBrand++ }
        return totalBrand

    }
    fun excludeCityWitNoBrand(city: CityEntity): Boolean {
        return getNumberOfBrand(city) > 0
    }

}
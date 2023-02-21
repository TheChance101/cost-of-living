package interactor

import model.CityEntity

//task 5
class GetSuitableClothesPriceCitiesNameInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::isCityContainsAtLeastNonNullBrand)
            .sortedBy(::getAveragePriceForClothes)
            .takeIf { limit > 0 }
            ?.take(limit)
            ?.map { it.cityName } ?: emptyList()
    }

    private fun getAveragePriceForClothes(cityEntity: CityEntity): Float {
        var totalPrice = 0.0f
        cityEntity.clothesPrices.run {
            onePairOfMenLeatherBusinessShoes?.let { totalPrice += onePairOfMenLeatherBusinessShoes }
            oneSummerDressInAChainStoreZaraHAndM?.let { totalPrice += oneSummerDressInAChainStoreZaraHAndM }
            onePairOfNikeRunningShoesMidRange?.let { totalPrice += onePairOfNikeRunningShoesMidRange }
            onePairOfJeansLevis50oneOrSimilar?.let { totalPrice += onePairOfJeansLevis50oneOrSimilar }
        }
        return totalPrice / getNumberOfBrand(cityEntity)
    }

    private fun getNumberOfBrand(cityEntity: CityEntity): Int {
        var totalBrand = 0
        cityEntity.clothesPrices.run {
            onePairOfMenLeatherBusinessShoes?.let { totalBrand++ }
            oneSummerDressInAChainStoreZaraHAndM?.let { totalBrand++ }
            onePairOfNikeRunningShoesMidRange?.let { totalBrand++ }
            onePairOfJeansLevis50oneOrSimilar?.let { totalBrand++ }
            return totalBrand
        }
    }

    private fun isCityContainsAtLeastNonNullBrand(city: CityEntity) =
        getNumberOfBrand(city) > 0

}
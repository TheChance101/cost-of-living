package interactor

import model.CityEntity

class GetTopFashionCitiesNamesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit: Int): List<String> {
        if (limit <= 0) return emptyList()
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullPricesAndLowQualityData)
            .sortedBy { it.getAveragePrice() }
            .take(limit)
            .map { it.cityName }
    }

    private fun excludeNullPricesAndLowQualityData(city: CityEntity): Boolean {
        with(city.clothesPrices) {
            return onePairOfJeansLevis50oneOrSimilar != null &&
                    onePairOfMenLeatherBusinessShoes != null &&
                    onePairOfNikeRunningShoesMidRange != null &&
                    oneSummerDressInAChainStoreZaraHAndM != null &&
                    city.dataQuality
        }
    }

    private fun CityEntity.getAveragePrice(): Float {
        with(clothesPrices) {
            return (onePairOfJeansLevis50oneOrSimilar!! +
                    onePairOfMenLeatherBusinessShoes!! +
                    onePairOfNikeRunningShoesMidRange!! +
                    oneSummerDressInAChainStoreZaraHAndM!!) / 4
        }
    }

}
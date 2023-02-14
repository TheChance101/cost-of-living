package interactor

import model.CityEntity


class GetTopFiveCitiesForFashionInteractor (
    val dataSource: CostOfLivingDataSource,
){

    fun execute(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndLowQualityData)
            .sortedBy { it.cityName }
            .take(10)
            .sortedWith(compareBy({it.clothesPrices.onePairOfJeansLevis50oneOrSimilar},{it.clothesPrices.oneSummerDressInAChainStoreZaraHAndM},{it.clothesPrices.onePairOfNikeRunningShoesMidRange},{it.clothesPrices.onePairOfMenLeatherBusinessShoes}))
            .take(limit)
            .map { it.cityName }

    }

    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
    }

}
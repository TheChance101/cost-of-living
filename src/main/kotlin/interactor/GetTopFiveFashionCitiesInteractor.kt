package interactor

import model.CityEntity

class GetTopFiveFashionCitiesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): List<String> {
        val allCitiesData = dataSource.getAllCitiesData()
        return allCitiesData
            .filter { it.clothesPrices.onePairOfJeansLevis50oneOrSimilar != null }
            .sortedBy { it.clothesPrices.onePairOfJeansLevis50oneOrSimilar!! }
            .take(5)
            .map { it.cityName }
    }
}
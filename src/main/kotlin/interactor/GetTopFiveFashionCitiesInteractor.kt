package interactor

import model.CityEntity

class GetTopFiveFashionCitiesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): List<String> {
       return emptyList()
    }
}
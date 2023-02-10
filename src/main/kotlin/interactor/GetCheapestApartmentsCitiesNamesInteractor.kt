package interactor

import model.CityEntity

class GetCheapestApartmentsCitiesNamesInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(limit: Int): List<Pair<String, Float>> {

        return emptyList<Pair<String, Float>>()
    }
}
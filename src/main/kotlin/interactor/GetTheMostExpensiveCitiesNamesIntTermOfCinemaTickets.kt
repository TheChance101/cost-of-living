package interactor

import model.CityEntity

class GetTheMostExpensiveCitiesNamesIntTermOfCinemaTickets(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit :Int ): List<String> {
        return emptyList()
    }


}
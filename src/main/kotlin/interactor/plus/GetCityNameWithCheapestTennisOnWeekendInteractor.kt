package interactor.plus

import interactor.CostOfLivingDataSource

class GetCitiesNameWithCheapestTennisPriceOnWeekendInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    operator fun invoke(limit: Int): List<String>{
        return emptyList()
    }
}
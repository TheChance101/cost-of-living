package interactor.plus

import interactor.CostOfLivingDataSource
import model.CityEntity

class GetCitiesNameWithCheapestTennisPriceOnWeekendInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    operator fun invoke(limit: Int): List<String> {
        return dataSource.getAllCitiesData()
            .filter { it.servicesPrices.tennisCourtRentOneHourOnWeekend != null }
            .sortedBy { it.servicesPrices.tennisCourtRentOneHourOnWeekend }
            .take(limit)
            .map(CityEntity::cityName)
            .takeIf { it.isNotEmpty() }
            ?: throw IllegalStateException("Empty list!")
    }
}
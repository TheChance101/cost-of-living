package interactor

import model.CityEntity

class GetCityHasHighestRentingBetweenApartmentsInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(): CityEntity {
        throw Throwable("Not Implemented yet")
    }
}
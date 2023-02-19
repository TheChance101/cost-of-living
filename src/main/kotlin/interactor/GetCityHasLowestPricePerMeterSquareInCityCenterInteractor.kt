package interactor

import model.CityEntity

class GetCityHasLowestPricePerMeterSquareInCityCenterInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(): CityEntity? {
        return null
    }

}
package interactor

import model.CityEntity

class CompanyDinnerInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(boundary: Float = Float.MAX_VALUE): CityEntity? =dataSource.getAllCitiesData().getOrNull(0)
}
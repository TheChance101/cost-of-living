package interactor.addons

import interactor.CostOfLivingDataSource
import model.CityEntity

class GetCheapestCityForCookPersonInteractor (
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute():CityEntity{}

    fun excludeFalseDataQuality():Boolean{}

    fun excludeNullSalaryOrNullMinutePrice():Boolean{}

    fun calculateMinutePricePercentToSalary():Float{}
}
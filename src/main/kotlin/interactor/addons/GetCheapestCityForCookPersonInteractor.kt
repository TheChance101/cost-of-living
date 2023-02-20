package interactor.addons

import interactor.CostOfLivingDataSource
import model.CityEntity

class GetCheapestCityForCookPersonInteractor (
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute():CityEntity{}

    fun excludeFalseDataQuality(city:CityEntity):Boolean{}

    fun excludeNullSalaryAndNullMinutePrice(city:CityEntity):Boolean{}

    fun calculateMinutePricePercentToSalary(city: CityEntity):Int{}
}
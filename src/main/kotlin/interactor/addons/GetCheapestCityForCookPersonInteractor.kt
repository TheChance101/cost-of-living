package interactor.addons

import interactor.CostOfLivingDataSource
import model.CityEntity

class GetCheapestCityForCookPersonInteractor (
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute()=
        dataSource.getAllCitiesData()
            .filter { excludeFalseDataQuality(it) && excludeNullSalaryAndNullMinutePrice(it)}
            .also { if (it.isEmpty()) throw NullPointerException() }
            .sortedBy { calculateMinutePricePercentToSalary(it) }
            .map { it.cityName }
            .first()

    fun excludeFalseDataQuality(city:CityEntity) = city.dataQuality

    fun excludeNullSalaryAndNullMinutePrice(city:CityEntity) =
        city.averageMonthlyNetSalaryAfterTax != null
                && city.servicesPrices.oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans != null

    fun calculateMinutePricePercentToSalary(city: CityEntity) =
        ((100 * city.servicesPrices.oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans!!) /
                city.averageMonthlyNetSalaryAfterTax!!).toInt()
}
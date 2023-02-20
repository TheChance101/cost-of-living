package interactor.addons

import interactor.CostOfLivingDataSource
import model.CityEntity

class GetCheapestCityForCrookPersonInteractor (
    private val dataSource: CostOfLivingDataSource,
) {

    /**
     * Task brief :->
     *
     * There is a man who love to crook on people, he has a job, but he is a thief, stealing people runs in his blood.
     * so one day he thought about cheating on the citizens, but first he had to check which city will be his target,
     * as he will be forced to pay for his fake calls, so he had to choose the cheapest minute tariff city.
     *
     * @author Hassan Wasfy
     * */



    fun execute()=
        dataSource.getAllCitiesData()
            .filter { excludeFalseDataQuality(it) && excludeNullSalaryAndNullMinutePrice(it)}
            .also { if (it.isEmpty()) throw NullPointerException() }
            .minByOrNull { calculateMinutePricePercentToSalary(it) }!!.cityName

    fun excludeFalseDataQuality(city:CityEntity) = city.dataQuality

    fun excludeNullSalaryAndNullMinutePrice(city:CityEntity) =
        city.averageMonthlyNetSalaryAfterTax != null
                && city.servicesPrices.oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans != null

    fun calculateMinutePricePercentToSalary(city: CityEntity) =
        ((100 * city.servicesPrices.oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans!!) /
                city.averageMonthlyNetSalaryAfterTax!!).toInt()
}
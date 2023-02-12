package interactor

import model.CityEntity

/**
 * Created by Aziza Helmy on 2/11/2023.
 */
class GetSuitableCityMoreSavingPerMonthInteractor(private val dataSource: CostOfLivingDataSource) {


    fun execute(): String {
        return ""
    }

    fun excludeNullSalaries(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null
    }

}
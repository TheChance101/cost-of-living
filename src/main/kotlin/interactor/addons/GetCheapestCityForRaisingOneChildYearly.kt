package interactor.addons

import interactor.CostOfLivingDataSource
import model.CityEntity
import model.ServicesPrices

class GetCheapestCityForRaisingOneChildYearlyInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute() = dataSource
        .getAllCitiesData()
        .filter { excludeLowQualityCityEntityData(it) && excludeNullPreschoolAndPrimarySchool(it.servicesPrices) }
        .minByOrNull { getAverageSchoolingYearly(it.servicesPrices) }
        .also { require(it != null) { "Low Quality Data Or Missing Data!" } }


    private fun excludeLowQualityCityEntityData(city: CityEntity): Boolean {
        return city.dataQuality
    }

    private fun excludeNullPreschoolAndPrimarySchool(services: ServicesPrices) =
        services.preschoolOrKindergartenFullDayPrivateMonthlyForOneChild != null
                && services.internationalPrimarySchoolYearlyForOneChild != null


    private fun getAverageSchoolingYearly(services: ServicesPrices) =
        ((services.preschoolOrKindergartenFullDayPrivateMonthlyForOneChild!! * 12)
                + services.internationalPrimarySchoolYearlyForOneChild!!) / 2


}
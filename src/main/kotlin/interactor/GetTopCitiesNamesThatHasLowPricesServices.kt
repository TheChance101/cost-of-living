package interactor

import model.CityEntity

class GetTopCitiesNamesThatHasLowPricesServices(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(limit: Int): List<String> {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullServicesPrices)
            .sortedBy(::summationCityServPrice)
            .take(limit)
            .map { it.cityName}

    }

     fun excludeNullServicesPrices(city: CityEntity): Boolean {
        return city.servicesPrices.basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment != null
                && city.servicesPrices.oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans != null
                && city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null
                && city.servicesPrices.fitnessClubMonthlyFeeForOneAdult != null
                && city.servicesPrices.tennisCourtRentOneHourOnWeekend != null
                && city.servicesPrices.cinemaInternationalReleaseOneSeat != null
                && city.servicesPrices.preschoolOrKindergartenFullDayPrivateMonthlyForOneChild != null
                && city.servicesPrices.internationalPrimarySchoolYearlyForOneChild != null


    }
     fun summationCityServPrice(city: CityEntity): Float {
        return (city.servicesPrices.basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment!! +
                city.servicesPrices.oneMinOfPrepaidMobileTariffLocalNoDiscountsOrPlans!! +
                city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!! +
                city.servicesPrices.fitnessClubMonthlyFeeForOneAdult!! +
                city.servicesPrices.tennisCourtRentOneHourOnWeekend!! +
                city.servicesPrices.cinemaInternationalReleaseOneSeat!! +
                city.servicesPrices.preschoolOrKindergartenFullDayPrivateMonthlyForOneChild!! +
                city.servicesPrices.internationalPrimarySchoolYearlyForOneChild!!).div(8)
    }
}

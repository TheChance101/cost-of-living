package interactor

import model.CityEntity

class GetTheTopCitiesWhereYouCanGetAnApartmentFaster(
    private val dataSource: CostOfLivingDataSource,
) {
    fun getListOfTopCitiesNamesAndNumberOfYearsToGetApartmentFaster(limit:Int): List<Pair<String, Float>> {
        return getTopCitesHasCanPayApartmentFaster(limit)
            .map { Pair(it.cityName, getNumberOfYearsToBuyApartment(it)) }
    }

    // function return top cities dependent on number of years to get apartment in the city and the prices of food and services  from lowest to highest
    private fun getTopCitesHasCanPayApartmentFaster(limit:Int): List<CityEntity> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullPricePerSquareMeterAvargeSalaryFoodPricesServicesPricesAndLowQualityData)
            .sortedWith(compareBy(
                { getNumberOfYearsToBuyApartment(it) }, { calculateTotalExpensesForFoodAndServices(it) })
            )
            .take(limit)

    }


    private fun excludeNullPricePerSquareMeterAvargeSalaryFoodPricesServicesPricesAndLowQualityData(city: CityEntity): Boolean {
        return city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null &&
                city.averageMonthlyNetSalaryAfterTax != null &&
                city.foodPrices.chickenFillets1kg != null &&
                city.foodPrices.eggsRegular12 != null &&
                city.foodPrices.localCheese1kg != null &&
                city.foodPrices.riceWhite1kg != null &&
                city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat != null &&
                city.foodPrices.loafOfFreshWhiteBread500g != null &&
                city.servicesPrices.basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment != null &&
                city.servicesPrices.cinemaInternationalReleaseOneSeat != null &&
                city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl != null &&
                city.servicesPrices.internationalPrimarySchoolYearlyForOneChild != null &&
                city.dataQuality
    }

    private fun getNumberOfYearsToBuyApartment(city: CityEntity): Float {

        return 100 * city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!
            .div(city.averageMonthlyNetSalaryAfterTax!! * Const.numberOfMonthsInYear)

    }

    private fun calculateTotalExpensesForFoodAndServices(city: CityEntity): Float {
        return city.foodPrices.chickenFillets1kg!!
            .plus(city.foodPrices.eggsRegular12!!)
            .plus(city.foodPrices.localCheese1kg!!)
            .plus(city.foodPrices.riceWhite1kg!!)
            .plus(city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!!)
            .plus(city.foodPrices.loafOfFreshWhiteBread500g!!)
            .plus(city.servicesPrices.basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment!!)
            .plus(city.servicesPrices.cinemaInternationalReleaseOneSeat!!)
            .plus(city.servicesPrices.internet60MbpsOrMoreUnlimitedDataCableAdsl!!)
            .plus(city.servicesPrices.internationalPrimarySchoolYearlyForOneChild!!)
    }
    object Const {
        const val numberOfMonthsInYear = 12
    }

}

package interactor

import model.CityEntity

class GetCityMakesFamilySaveMoreInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): String {

        if (dataSource.getAllCitiesData().isNotEmpty()) {

            val cities = dataSource.getAllCitiesData().filter(::excludeNullFoodPrice)
            var citiesAftercheck: List<CityEntity> = listOf()

            cities.forEach {
                var cost: Double = 250.0
                cost += it.foodPrices.riceWhite1kg!!.toDouble() * 2
                cost += it.foodPrices.chickenFillets1kg!!.toDouble() * 10
                cost += it.foodPrices.localCheese1kg!!.toDouble()
                cost += it.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!!.toDouble() * 4
                cost += it.foodPrices.loafOfFreshWhiteBread500g!!.toDouble() * 30
                cost += it.realEstatesPrices.apartment3BedroomsOutsideOfCentre!!.toDouble()
                if (cost <= (it.averageMonthlyNetSalaryAfterTax!!.toDouble() / 2)) {
                    citiesAftercheck += it
                }


            }

            val city = citiesAftercheck.sortedByDescending { it.averageMonthlyNetSalaryAfterTax }
                .map { it.cityName }[0]
            return city
        }


        return "There is no Data"

    }


    fun excludeNullFoodPrice(city: CityEntity): Boolean {
        return city.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null
                && city.averageMonthlyNetSalaryAfterTax != null
                && city.foodPrices.chickenFillets1kg != null
                && city.foodPrices.localCheese1kg != null
                && city.foodPrices.riceWhite1kg != null
                && city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat != null
                && city.foodPrices.loafOfFreshWhiteBread500g != null
                && city.dataQuality
    }

    fun excludeInvalidSalary(city: CityEntity):Boolean{
        return city.averageMonthlyNetSalaryAfterTax != null
    }
}
package interactor

import model.CityEntity

class GetMostSuitableCityInteractor {

    fun findTheMostSuitableCity(list: List<CityEntity>): String? {

        return list
            .filter(::excludeNullPropertiesInCityEntity)
            .sortedBy {
                it.averageMonthlyNetSalaryAfterTax?.minus(
                    (it.foodPrices!!.chickenFillets1kg!! * 10
                        .plus(it.foodPrices.loafOfFreshWhiteBread500g!! * 30)
                        .plus(it.realEstatesPrices!!.apartment3BedroomsInCityCentre!!)
                        .plus(it.foodPrices.localCheese1kg!!)
                        .plus(it.foodPrices.riceWhite1kg!! * 2)
                        .plus(250))
                )
            }.last().cityName
    }


    fun getAllCities(dataSource: CostOfLivingDataSource) = dataSource.getAllCitiesData()

    private fun excludeNullPropertiesInCityEntity(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null
                && city.foodPrices!!.chickenFillets1kg != null
                && city.foodPrices!!.beefRound1kgOrEquivalentBackLegRedMeat != null
                && city.realEstatesPrices!!.apartment3BedroomsInCityCentre != null
                && city.foodPrices.localCheese1kg != null
                && city.foodPrices.riceWhite1kg != null
                && city.foodPrices.loafOfFreshWhiteBread500g != null

    }
}
package interactor

import model.CityEntity

class GetMostSuitableCityInteractor {

    fun findTheMostSuitableCity(list: List<CityEntity>) =
        list.filter(::excludeNullPropertiesInCityEntity).maxByOrNull {
            (it.averageMonthlyNetSalaryAfterTax!! * 2).minus(
                (it.foodPrices.chickenFillets1kg!! * 10)
                    .plus(it.foodPrices.loafOfFreshWhiteBread500g!! * 30)
                    .plus(
                        minOf(
                            it.realEstatesPrices.apartment3BedroomsInCityCentre!!,
                            it.realEstatesPrices.apartment3BedroomsOutsideOfCentre!!
                        )
                    )
                    .plus(it.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!! * 4)
                    .plus(it.foodPrices.localCheese1kg!!)
                    .plus(it.foodPrices.riceWhite1kg!! * 2)
                    .plus(250)
            )

        }!!.cityName

    fun getAllCities(dataSource: CostOfLivingDataSource) = dataSource.getAllCitiesData()

    private fun excludeNullPropertiesInCityEntity(city: CityEntity): Boolean {
        return city.averageMonthlyNetSalaryAfterTax != null
                && city.foodPrices.chickenFillets1kg != null
                && city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat != null
                && city.realEstatesPrices.apartment3BedroomsInCityCentre != null
                && city.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null
                && city.foodPrices.localCheese1kg != null
                && city.foodPrices.riceWhite1kg != null
                && city.foodPrices.loafOfFreshWhiteBread500g != null

    }
}
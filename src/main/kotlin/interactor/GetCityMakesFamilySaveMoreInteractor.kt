package interactor

import model.CityEntity

class GetCityMakesFamilySaveMoreInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): String {
        return if (dataSource.getAllCitiesData().isNotEmpty()) {
            dataSource.getAllCitiesData()
                .filter(::excludeInvalidData)
                .maxByOrNull {it.run { calculateSalaryAfterBuyingTheNeeds(it) }
                }!!.cityName
        } else throw Exception("There is no Data")
    }

    fun excludeInvalidData(city: CityEntity): Boolean {
        return city.run{
            realEstatesPrices.apartment3BedroomsInCityCentre != null
                    && averageMonthlyNetSalaryAfterTax != null
                    && foodPrices.chickenFillets1kg != null
                    && foodPrices.localCheese1kg != null
                    && foodPrices.riceWhite1kg != null
                    && foodPrices.beefRound1kgOrEquivalentBackLegRedMeat != null
                    && foodPrices.loafOfFreshWhiteBread500g != null
                    && dataQuality
        }
    }

    private fun calculateSalaryAfterBuyingTheNeeds(city: CityEntity): Double {
        val doubleOfSalary = city.averageMonthlyNetSalaryAfterTax!!.toDouble() * 2
        val priceOf2KiloGramsOfRice = 2 * city.foodPrices.riceWhite1kg!!.toDouble()
        val priceOf10KiloGramsOfChickenFillets = 10 * city.foodPrices.chickenFillets1kg!!.toDouble()
        val priceOf4KiloGramsOfMeetBeef = 4 * city.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!!.toDouble()
        val priceOf15KgOfBread = 30 * city.foodPrices.loafOfFreshWhiteBread500g!!.toDouble()
        val paymentForTheOtherTypeOfNeeds = 250
        return (doubleOfSalary) - (
                    priceOf2KiloGramsOfRice + priceOf10KiloGramsOfChickenFillets +
                    city.foodPrices.localCheese1kg!!.toDouble()+ priceOf4KiloGramsOfMeetBeef +
                    priceOf15KgOfBread + city.realEstatesPrices.apartment3BedroomsInCityCentre!!.toDouble() +
                        paymentForTheOtherTypeOfNeeds)
    }

}
package interactor

import model.CityEntity

class GetCityMakesFamilySaveMoreInteractor(
    private val dataSource: CostOfLivingDataSource,
) {


    fun execute(): String {
        return if (dataSource.getAllCitiesData().isNotEmpty()) {
            dataSource.getAllCitiesData().filter(::excludeNullvalues).maxByOrNull {it.run {
                (averageMonthlyNetSalaryAfterTax!!.toDouble() *2) -(
                (foodPrices.riceWhite1kg!!.toDouble() * 2)+
                (foodPrices.chickenFillets1kg!!.toDouble() * 10)+
                (foodPrices.localCheese1kg!!.toDouble())+
                (foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!!.toDouble() * 4)+
                (foodPrices.loafOfFreshWhiteBread500g!!.toDouble() * 30)+
                (realEstatesPrices.apartment3BedroomsInCityCentre!!.toDouble()) +250 )
            } }!!.cityName
        } else throw Exception("There is no Data")
    }

    fun excludeNullvalues(city: CityEntity): Boolean {
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


}
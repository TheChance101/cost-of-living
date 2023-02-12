package interactor

import model.CityEntity

class GetCityThatHasAverageMealsPricesInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(): CityEntity? {
         return    dataSource
            .getAllCitiesData()
            .filter(::getCitiesInUsaCanadaAndMexico)
            .filter (::excludeCitiesWithNullOrNegativeMealsPrices)
            .sortedBy (::getAverageMealsPrices).let{
                if(it.isNotEmpty())
                    it[it.size /2]
                 else
                     null
                 }
    }
    private fun getCitiesInUsaCanadaAndMexico(city: CityEntity): Boolean {
    return city.country == "Canada" || city.country == "United States" || city.country == "Mexico"
    }

    private fun excludeCitiesWithNullOrNegativeMealsPrices(city: CityEntity): Boolean {
        val number1 = city.mealsPrices.mealInexpensiveRestaurant
        val number2 = city.mealsPrices.mealFor2PeopleMidRangeRestaurant
        val number3 = city.mealsPrices.mealAtMcDonaldSOrEquivalent
     return (number1 != null && number2 != null && number3 != null && number1 > 0 && number2 > 0 && number3 > 0)
    }

    private fun getAverageMealsPrices(city: CityEntity): Float {
       val number1 = city.mealsPrices.mealInexpensiveRestaurant!!
       val number2 = city.mealsPrices.mealFor2PeopleMidRangeRestaurant!!
       val number3 = city.mealsPrices.mealAtMcDonaldSOrEquivalent!!
        return (number1 + number2 + number3) / 3
    }
}
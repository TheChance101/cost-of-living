package interactor

import model.CityEntity

class GetCityThatHasAverageMealsPricesIntractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(): CityEntity? {
     return null
    }
    private fun getCandidateCities(city: CityEntity): Boolean {
        return false
    }
    private fun excludeCitiesWithNullPrices(city: CityEntity): Boolean {
        return false
    }
    private fun getCityWithMostExpensiveMealsPrices(city: CityEntity): Float {
        return 0f
    }
    private fun getCityWithCheapestMealsPrices(city: CityEntity): Float {
        return 0f
    }
}
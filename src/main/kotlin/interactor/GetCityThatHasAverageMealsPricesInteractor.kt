package interactor

import model.CityEntity

class GetCityThatHasAverageMealsPricesInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(): CityEntity? {
        return null
    }

    private fun getCitiesInUsaCanadaAndMexico(city: CityEntity): Boolean {
        return false
    }

    private fun excludeCitiesWithNullOrNegativeMealsPrices(city: CityEntity): Boolean {
        return false
    }

    private fun getAverageMealsPrices(city: CityEntity): Float {
        return 0f
    }
}
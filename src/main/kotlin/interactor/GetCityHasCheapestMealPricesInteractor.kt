package interactor

import model.CityEntity

class GetCityHasCheapestMealPricesInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): CityEntity {
        throw Throwable("Not Implemented yet")
    }

    private fun citiesInUSACanadaAndMexico(city: CityEntity): List<String> {
        TODO("Not Implemented yet")
    }
}
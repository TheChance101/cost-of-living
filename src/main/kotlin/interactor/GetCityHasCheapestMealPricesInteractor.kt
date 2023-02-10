package interactor

import model.CityEntity

class GetCityHasCheapestMealPricesInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): CityEntity {
        throw Throwable("Not Implemented yet")
    }

    fun citiesInUSACanadaAndMexico(city: CityEntity): Boolean {
        return city.country == "United States" || city.country == "Canada" || city.country == "Mexico"
    }
}
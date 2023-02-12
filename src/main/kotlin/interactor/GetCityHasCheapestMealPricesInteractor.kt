package interactor

import model.CityEntity

enum class ThreeSpecificCountries(val nameOFCountry: String) {
    USA("United States"),
    CANADA("Canada"),
    MEXICO("Mexico"),
    EGYPT("Egypt")
}

class GetCityHasCheapestMealPricesInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): CityEntity {
        throw Throwable("Not Implemented yet")
    }



    fun citiesInUSACanadaAndMexico(city: CityEntity): Boolean {
        return city.country == ThreeSpecificCountries.USA.nameOFCountry
                || city.country == ThreeSpecificCountries.CANADA.nameOFCountry
                || city.country == ThreeSpecificCountries.MEXICO.nameOFCountry
    }

    fun isCityHasAverageMealPrice(city: CityEntity): Boolean {
        return !((city.mealsPrices.mealFor2PeopleMidRangeRestaurant == null || city.mealsPrices.mealFor2PeopleMidRangeRestaurant == 0.0F)
                && ((city.mealsPrices.mealInexpensiveRestaurant == null || city.mealsPrices.mealInexpensiveRestaurant == 0.0F)
                || (city.mealsPrices.mealAtMcDonaldSOrEquivalent == null || city.mealsPrices.mealAtMcDonaldSOrEquivalent == 0.0F)))
    }

    fun getAverageMealInCity(city: CityEntity): Float {
        TODO()
    }
}
package interactor

import enums.ThreeSpecificCountries
import model.CityEntity
import kotlin.math.ceil

class GetCityHasCheapestMealPricesInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): CityEntity {

        val listOfCitiesEntity = dataSource.getAllCitiesData()
            .filter(::citiesInUSACanadaAndMexico)
            .filter(::isCityHasAverageMealPrice)
            .sortedByDescending { getAverageMealInCity(it) }

       return listOfCitiesEntity
            .filter { getAverageMealInCity(it) == getAverageMealInAllCities(listOfCitiesEntity) || getAverageMealInCity(it) == ceil(getAverageMealInAllCities(listOfCitiesEntity).toDouble()).toFloat() }
            .first()


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
        return if (city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null && city.mealsPrices.mealFor2PeopleMidRangeRestaurant != 0.0F) {
            city.mealsPrices.mealFor2PeopleMidRangeRestaurant / 2
        } else if ((city.mealsPrices.mealInexpensiveRestaurant != null && city.mealsPrices.mealInexpensiveRestaurant != 0.0F)
            && (city.mealsPrices.mealAtMcDonaldSOrEquivalent != null && city.mealsPrices.mealAtMcDonaldSOrEquivalent != 0.0F)
        )
            ((city.mealsPrices.mealInexpensiveRestaurant) + (city.mealsPrices.mealAtMcDonaldSOrEquivalent)) / 2
        else 0.0F
    }

    fun getAverageMealInAllCities(cityEntityList: List<CityEntity>): Float {
        if (cityEntityList.isEmpty()) return 0.0F
        return (getAverageMealInCity(cityEntityList.first()) + getAverageMealInCity(cityEntityList.last())) / 2
    }

}
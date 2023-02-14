package interactor

import enums.ThreeSpecificCountries
import model.CityEntity
import kotlin.math.ceil
import kotlin.math.floor

class GetCityHasCheapestMealPricesInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): CityEntity {

        val listOfCitiesEntity = dataSource.getAllCitiesData()
            .filter(::isCitiesInUSACanadaAndMexico)
            .filter(::isCityHasAverageMealPrice)
            .sortedByDescending { getAverageMealInCity(it) }

        return if (listOfCitiesEntity.isEmpty()) throw Throwable("List of cities is empty")
        else listOfCitiesEntity
            .filter { getAverageMealInCity(it) == getAverageMealInAllCities(listOfCitiesEntity) || getAverageMealInCity(it).toInt() == ceil( getAverageMealInAllCities(listOfCitiesEntity)).toInt() || getAverageMealInCity(it).toInt() == floor( getAverageMealInAllCities(listOfCitiesEntity)).toInt() }
            .first()
    }

    fun isCitiesInUSACanadaAndMexico(city: CityEntity): Boolean {
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
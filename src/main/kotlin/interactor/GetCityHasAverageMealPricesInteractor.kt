package interactor

import model.CityEntity
import kotlin.math.ceil
import kotlin.math.floor

class GetCityHasAverageMealPricesInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): CityEntity? {

        val listOfCitiesEntity = dataSource.getAllCitiesData()
            .filter { isCitiesInUSACanadaAndMexico(it) && excludeNullMealPrices(it) }
            .sortedByDescending { getAverageMealInCity(it) }

        return if (listOfCitiesEntity.isNotEmpty()) getAverageMealInAllCities(listOfCitiesEntity)
        else throw Throwable("List of cities is empty")
    }

    fun isCitiesInUSACanadaAndMexico(city: CityEntity): Boolean {
        return city.country == ThreeSpecificCountries.USA.nameOFCountry
                || city.country == ThreeSpecificCountries.CANADA.nameOFCountry
                || city.country == ThreeSpecificCountries.MEXICO.nameOFCountry
    }

    fun excludeNullMealPrices(city: CityEntity): Boolean {
        return (city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null)
                || ((city.mealsPrices.mealInexpensiveRestaurant != null)
                && (city.mealsPrices.mealAtMcDonaldSOrEquivalent != null))
    }

    fun getAverageMealInCity(city: CityEntity): Float? {
        return if (city.mealsPrices.mealFor2PeopleMidRangeRestaurant != null) {
            city.mealsPrices.mealFor2PeopleMidRangeRestaurant / 2
        } else if ((city.mealsPrices.mealInexpensiveRestaurant != null)
            && (city.mealsPrices.mealAtMcDonaldSOrEquivalent != null)
        )
            ((city.mealsPrices.mealInexpensiveRestaurant) + (city.mealsPrices.mealAtMcDonaldSOrEquivalent)) / 2
        else null
    }

    fun getAverageMealInAllCities(cityEntityList: List<CityEntity>): CityEntity? {
        if (cityEntityList.isEmpty()) return null
        val averageMealPricesInAllCities =
            (getAverageMealInCity(cityEntityList.first())!! + getAverageMealInCity(cityEntityList.last())!!) / 2

        return cityEntityList.first {
            (getAverageMealInCity(it) == averageMealPricesInAllCities)
                    || (getAverageMealInCity(it) == floor(averageMealPricesInAllCities))
                    || (getAverageMealInCity(it) == ceil(averageMealPricesInAllCities))
        }
    }
}

enum class ThreeSpecificCountries(val nameOFCountry: String) {
    USA("United States"),
    CANADA("Canada"),
    MEXICO("Mexico"),
    EGYPT("Egypt")
}
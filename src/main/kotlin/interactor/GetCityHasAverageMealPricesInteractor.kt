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
            .sortedByDescending { it.mealsPrices.getAverageMealInCity(it) }

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

    fun getAverageMealInAllCities(cityEntityList: List<CityEntity>): CityEntity? {
        if (cityEntityList.isEmpty()) return null
        val averageMealPricesInAllCities =
            (cityEntityList.first().mealsPrices.getAverageMealInCity(cityEntityList.first())!! +
        cityEntityList.last().mealsPrices.getAverageMealInCity(cityEntityList.last())!!).div(2)

        return cityEntityList.first {
            (it.mealsPrices.getAverageMealInCity(it) == averageMealPricesInAllCities)
                    || (it.mealsPrices.getAverageMealInCity(it) == floor(averageMealPricesInAllCities))
                    || (it.mealsPrices.getAverageMealInCity(it) == ceil(averageMealPricesInAllCities))
        }
    }
}

enum class ThreeSpecificCountries(val nameOFCountry: String) {
    USA("United States"),
    CANADA("Canada"),
    MEXICO("Mexico"),
    EGYPT("Egypt")
}
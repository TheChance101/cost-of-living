package interactor

import model.CityEntity
import kotlin.math.min

class GetBest3CitiesForBuyingSoftDrinksInteractor(private val dataSource: CostOfLivingDataSource) {

    operator fun invoke(): List<CityEntity> {

        return dataSource.getAllCitiesData()
            .filter(::excludeNullRequireValues)
            .sortedByDescending(::calculateNumberOfSoftDrinksCanBuy)
            .take(3)
    }

    private fun excludeNullRequireValues(city: CityEntity): Boolean {

        return with(city.realEstatesPrices) {
            apartment3BedroomsInCityCentre != null &&
            apartment3BedroomsOutsideOfCentre != null &&
            apartmentOneBedroomInCityCentre != null &&
            apartmentOneBedroomOutsideOfCentre != null } &&
            city.averageMonthlyNetSalaryAfterTax != null &&
            city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants != null
    }


    private fun calculateNumberOfSoftDrinksCanBuy(city: CityEntity): Int {

        return ((city.averageMonthlyNetSalaryAfterTax!! -
                LIVING_COST -
                with(city.realEstatesPrices) {
                    minOf(
                        apartment3BedroomsInCityCentre!!,
                        apartment3BedroomsOutsideOfCentre!!,
                        apartmentOneBedroomOutsideOfCentre!!,
                        apartmentOneBedroomInCityCentre!!
                    )
                }) / city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants!!).toInt()
    }

    private companion object {

        const val LIVING_COST = 500.0f
    }
}
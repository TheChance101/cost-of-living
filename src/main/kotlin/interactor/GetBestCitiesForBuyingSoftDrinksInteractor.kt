package interactor

import model.CityEntity

class GetBestCitiesForBuyingSoftDrinksInteractor(private val dataSource: CostOfLivingDataSource) {

    operator fun invoke(limit : Int): List<CityEntity> {

        return dataSource.getAllCitiesData()
            .filter(::excludeNullRequireValues)
            .takeIf { it.isNotEmpty() && limit > 0 }
            ?.run {
                 sortedByDescending(::calculateNumberOfSoftDrinksCanBuy)
                .take(limit)
            } ?: throw IllegalStateException("List of cities is invalid or limit below zero")
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

        return ((city.averageMonthlyNetSalaryAfterTax!! - LIVING_COST - getMinimumRealEstatesPrice(city)
                ) / city.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants!!).toInt()
    }
    private fun getMinimumRealEstatesPrice(city: CityEntity): Float {

        return with(city.realEstatesPrices) {
            minOf(
                apartment3BedroomsInCityCentre!!,
                apartment3BedroomsOutsideOfCentre!!,
                apartmentOneBedroomOutsideOfCentre!!,
                apartmentOneBedroomInCityCentre!!
            )
        }
    }

    private companion object {

        const val LIVING_COST = 500.0f
    }
}
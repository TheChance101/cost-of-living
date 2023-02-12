package interactor

import model.CityEntity

class GetHighestDifferentInApartmentRent (  private val dataSource: CostOfLivingDataSource,
) {

    fun execute(cities: List<CityEntity>): String? {
        return if (cities.isNotEmpty()) cities
            .filter(::excludeNullSalariesAndLowQualityData)
            .sortedByDescending { it.findHighestDifferentInCitiesRent() }
            .take(1)
            .map { it.cityName }[0]
        else null

    }

    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.realEstatesPrices.apartment3BedroomsInCityCentre != null
                && city.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null
                && city.realEstatesPrices.apartmentOneBedroomInCityCentre != null
                && city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre != null
                && city.dataQuality
    }

    private fun CityEntity.findHighestDifferentInCitiesRent(): Float {
        return (realEstatesPrices.apartmentOneBedroomInCityCentre!!
            .minus(realEstatesPrices.apartmentOneBedroomOutsideOfCentre!!))
            .plus(
                (realEstatesPrices.apartment3BedroomsInCityCentre!! - realEstatesPrices.apartment3BedroomsOutsideOfCentre!!)
            )

    }
}
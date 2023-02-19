package interactor

import model.CityEntity

class GetHighestDifferentInApartmentRent (  private val dataSource: CostOfLivingDataSource,
) {

    fun execute(apartmentOneBedroom: Boolean, apartment3Bedrooms: Boolean, limit: Int): String? {
        return if (dataSource.getAllCitiesData().isNotEmpty())
            dataSource.getAllCitiesData()
                .filter(::excludeNullApartmentBedroom)
                .sortedByDescending { it.findHighestDifferentInCitiesRent(apartmentOneBedroom, apartment3Bedrooms) }
                .takeIf { apartment3Bedrooms || apartmentOneBedroom }
                ?.take(limit)
                ?.map { it.cityName }?.get(0)
        else null
    }

    private fun excludeNullApartmentBedroom(city: CityEntity): Boolean {
        return city.realEstatesPrices.apartment3BedroomsInCityCentre != null
                && city.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null
                && city.realEstatesPrices.apartmentOneBedroomInCityCentre != null
                && city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre != null
                && city.dataQuality
    }

    private fun CityEntity.findHighestDifferentInCitiesRent(
        apartmentOneBedroom: Boolean,
        apartment3Bedrooms: Boolean
    ): Float {
        if (apartmentOneBedroom && !apartment3Bedrooms)
            return kotlin.math.abs(
                realEstatesPrices.apartmentOneBedroomInCityCentre!!
                        - realEstatesPrices.apartmentOneBedroomOutsideOfCentre!!
            )
        else if (apartment3Bedrooms && !apartmentOneBedroom)
            return kotlin.math.abs(
                realEstatesPrices.apartment3BedroomsInCityCentre!!
                        - realEstatesPrices.apartment3BedroomsOutsideOfCentre!!
            )
        else if (apartment3Bedrooms && apartmentOneBedroom) (
                return kotlin.math.abs(
                    realEstatesPrices.apartmentOneBedroomInCityCentre!!
                            - realEstatesPrices.apartmentOneBedroomOutsideOfCentre!!
                ) +
                        kotlin.math.abs(
                            realEstatesPrices.apartment3BedroomsInCityCentre!!
                                    - realEstatesPrices.apartment3BedroomsOutsideOfCentre!!
                        )

                )
        else return 0f
    }
}
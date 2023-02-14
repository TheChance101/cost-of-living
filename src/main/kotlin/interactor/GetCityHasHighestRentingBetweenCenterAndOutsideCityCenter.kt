package interactor

import model.CityEntity
import model.RealEstatesPrices
import kotlin.math.abs

class GetCityHasHighestDifferenceRentBetweenCityCenterAndOutside(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(type: typeOfApartments): CityEntity? {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullRentAndLowQualityData)
            .maxByOrNull { city ->
                when (type) {
                    typeOfApartments.ONE_BEDROOM -> abs(
                        city.realEstatesPrices.apartmentOneBedroomInCityCentre!!
                                - city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre!!
                    )
                    typeOfApartments.THREE_BEDROOMS -> abs(
                        city.realEstatesPrices.apartment3BedroomsInCityCentre!!
                                - city.realEstatesPrices.apartment3BedroomsOutsideOfCentre!!
                    )
                }
            }
    }

    private fun excludeNullRentAndLowQualityData(city: CityEntity): Boolean {
        return city.dataQuality
                && city.realEstatesPrices.apartmentOneBedroomInCityCentre != null
                && city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre != null
                && city.realEstatesPrices.apartment3BedroomsInCityCentre != null
                && city.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null
    }

}

enum class typeOfApartments {
    ONE_BEDROOM, THREE_BEDROOMS

}



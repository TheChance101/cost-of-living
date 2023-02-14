package interactor

import interactor.util.TypeOfApartments
import model.CityEntity
import java.lang.Math.abs

class GetHighestApartmentPriceDifferenceCityInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(type: TypeOfApartments): CityEntity? {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullRentAndLowQualityData)
            .maxByOrNull { city ->
                when (type) {
                    TypeOfApartments.ONE_BEDROOM -> abs(
                        city.realEstatesPrices.apartmentOneBedroomInCityCentre!!
                                - city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre!!
                    )

                    TypeOfApartments.THREE_BEDROOMS -> abs(
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


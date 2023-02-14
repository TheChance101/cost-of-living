package interactor

import enums.TheTypeOfApartments
import model.CityEntity
import kotlin.math.abs

class GetCityHasHighestDifferentRentBetweenCityCenterAndOutsideInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(type: TheTypeOfApartments): CityEntity {
        if (type == TheTypeOfApartments.ONE_BED_ROOM) {
            return dataSource.getAllCitiesData()
                .filter(::excludeNullRentOneTypeOneAndLowQualityData)
                .maxByOrNull { abs(it.realEstatesPrices.apartmentOneBedroomInCityCentre!!
                        - it.realEstatesPrices.apartmentOneBedroomOutsideOfCentre!!) }!!

        } else   {
            return dataSource.getAllCitiesData()
                .filter(::excludeNullRentOneTypeTwoAndLowQualityData)
                .maxByOrNull {
                    abs(
                        it.realEstatesPrices.apartment3BedroomsInCityCentre!! -
                                it.realEstatesPrices.apartment3BedroomsOutsideOfCentre!!
                    )
                }!!

        }
    }


    private fun excludeNullRentOneTypeOneAndLowQualityData(city: CityEntity): Boolean {
        return city.dataQuality
                && city.realEstatesPrices.apartmentOneBedroomInCityCentre != null
                && city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre != null
    }



    private fun excludeNullRentOneTypeTwoAndLowQualityData(city: CityEntity): Boolean {

        return city.dataQuality
                && city.realEstatesPrices.apartment3BedroomsInCityCentre != null
                && city.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null


    }
}





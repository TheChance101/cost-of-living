package interactor

import model.CityEntity
import kotlin.math.abs

class GetCityHasHighestDifferentRentBetweenCityCenterAndOutsideInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(type: Int): String? {
        if (type == 1) {
            return dataSource.getAllCitiesData()
                .filter(::excludeNullRentOneTypeOneAndLowQualityData)
                .maxByOrNull { abs(it.realEstatesPrices.apartmentOneBedroomInCityCentre!!
                        - it.realEstatesPrices.apartmentOneBedroomOutsideOfCentre!!) }!!
                .cityName
        } else if (type == 2) {
            return  return dataSource.getAllCitiesData()
                .filter(::excludeNullRentOneTypeTwoAndLowQualityData)
                .maxByOrNull { abs(it.realEstatesPrices.apartment3BedroomsInCityCentre!! -
                        it.realEstatesPrices.apartment3BedroomsOutsideOfCentre!!) }!!
                .cityName
        }
        else return null

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





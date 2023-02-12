package interactor

import model.CityEntity
import model.RealEstatesPrices

class GetHighestDifferenceBetweenCityCenterAndOutsideCityCenter(
    private val dataSource:CostOfLivingDataSource
)  {

//    fun execute(cities: List<Any>): CityEntity? {
//        return dataSource.getAllCitiesData()
//            .filter { it.dataQuality && it.realEstatesPrices != null }
//            .maxByOrNull { it: CityEntity ->
//                it.realEstatesPrices.apartmentOneBedroomInCityCentre!! -
//                        it.realEstatesPrices.apartmentOneBedroomOutsideOfCentre!!
//            }
//    }

    fun execute_DifferentPayRentingBetweenIntCityCenter_OutCitycenter( limit: Int ): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullDataAndLowQuality)
            .sortedByDescending { it.realEstatesPrices.apartmentOneBedroomInCityCentre!! - it.realEstatesPrices.apartmentOneBedroomInCityCentre}
            .take(limit)
            .map { it.cityName }
    }
    fun execute_DifferentPayRentingBetween3BedRoom_IntCityCenter_OutCitycenter( limit: Int ): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullDataAndLowQuality)
            .sortedByDescending { it.realEstatesPrices.apartment3BedroomsInCityCentre!! - it.realEstatesPrices.apartment3BedroomsOutsideOfCentre!! }
            .take(limit)
            .map { it.cityName }
    }
    fun execute_DifferentPayRentingBetween_pricePerSquareMeterToBuy_IntCityCenter_OutCitycenter( limit: Int ): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullDataAndLowQuality)
            .sortedByDescending { it.realEstatesPrices.apartment3BedroomsInCityCentre!! - it.realEstatesPrices.apartment3BedroomsOutsideOfCentre!! }
            .take(limit)
            .map { it.cityName }
    }

    private fun excludeNullDataAndLowQuality(city: CityEntity): Boolean {
        return city.realEstatesPrices != null && city.realEstatesPrices != null && city.dataQuality
    }
}
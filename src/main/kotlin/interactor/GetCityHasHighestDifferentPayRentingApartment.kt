package interactor

import model.CityEntity
import model.RealEstatesPrices
import kotlin.math.abs
import kotlin.math.max


class GetCityWithHighestRentalPriceDifferenceInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute() = dataSource.getAllCitiesData()
        .filter { excludeNullValues(it) && excludeNullDataAndLowQuality(it) }
        .minByOrNull {
            getHighestDifferentBetweenCityCenterAndOutsideWithDifferentTypeOfApartments(it.realEstatesPrices)
        }!!


    private fun getHighestDifferentBetweenCityCenterAndOutsideWithDifferentTypeOfApartments(
        realEstatesPrices: RealEstatesPrices
    ) =
        max(
            abs(
                realEstatesPrices.apartmentOneBedroomInCityCentre!! -
                        realEstatesPrices.apartmentOneBedroomOutsideOfCentre!!
            ), abs(
                realEstatesPrices.apartment3BedroomsInCityCentre!! -
                        realEstatesPrices.apartment3BedroomsOutsideOfCentre!!
            )
        )

    fun excludeNullValues(city: CityEntity) = city.realEstatesPrices.apartmentOneBedroomInCityCentre != null
            && city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre != null
            && city.realEstatesPrices.apartment3BedroomsInCityCentre != null
            && city.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null


    private fun excludeNullDataAndLowQuality(city: CityEntity) = city.dataQuality
}


//class GetHighestDifferenceBetweenCityCenterAndOutsideCityCenter(
//    private val dataSource:CostOfLivingDataSource
//)  {


//    fun execute_DifferentPayRentingBetweenIntCityCenter_OutCitycenter(limit: Int): List<String> {
//        return dataSource
//            .getAllCitiesData()
//            .filter(::excludeNullDataAndLowQuality)
//            .sortedByDescending { it.realEstatesPrices.apartmentOneBedroomInCityCentre!! - it.realEstatesPrices.apartmentOneBedroomOutsideOfCentre!! }
//            .take(limit)
//            .map { it.cityName }
//    }
//    fun execute_DifferentPayRentingBetween3BedRoom_IntCityCenter_OutCitycenter( limit: Int ): List<String> {
//        return dataSource
//            .getAllCitiesData()
//            .filter(::excludeNullDataAndLowQuality)
//            .sortedByDescending { it.realEstatesPrices.apartment3BedroomsInCityCentre!! - it.realEstatesPrices.apartment3BedroomsOutsideOfCentre!! }
//            .take(limit)
//            .map { it.cityName }
//    }
//    fun execute_DifferentPayRentingBetween_pricePerSquareMeterToBuy_IntCityCenter_OutCitycenter( limit: Int ): List<String> {
//        return dataSource
//            .getAllCitiesData()
//            .filter(::excludeNullDataAndLowQuality)
//            .sortedByDescending { it.realEstatesPrices.pricePerSquareMeterToBuyApartmentInCityCentre!! - it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!! }
//            .take(limit)
//            .map { it.cityName }
//    }

//    private fun excludeNullDataAndLowQuality(city: CityEntity): Boolean {
//        return city.realEstatesPrices != null && city.realEstatesPrices != null && city.dataQuality
//    }

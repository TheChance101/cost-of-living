package interactor

import model.CityEntity
import model.RealEstatesPrices


class GetCityWithHighestRentalPriceDifferenceInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(cityData: List<CityEntity>): String {
        var cityWithHighestDifference = ""
        var highestDifference = 0.0
        cityData.forEach { city ->
            if (city.cityName == "high_quality") {
                val difference = city.realEstatesPrices.pricePerSquareMeterToBuyApartmentInCityCentre!!- city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!
                if (difference > highestDifference) {
                    highestDifference = difference.toDouble()
                    cityWithHighestDifference = city.cityName
                }
            }
        }
        return cityWithHighestDifference
    }

    fun excludeNullValues(city: CityEntity): Boolean {
        return city.realEstatesPrices.apartmentOneBedroomInCityCentre != null
                && city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre !=null
                && city.realEstatesPrices.apartment3BedroomsInCityCentre !=null
                && city.realEstatesPrices.apartment3BedroomsOutsideOfCentre !=null
                && city.realEstatesPrices.pricePerSquareMeterToBuyApartmentInCityCentre !=null
                && city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre !=null
    }
    private fun excludeNullDataAndLowQuality(city: CityEntity): Boolean {
        return city.dataQuality
    }
}

data class CityByPriceDifference(var nameCity: String, var priceDifference: Double)





















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

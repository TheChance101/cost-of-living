package interactor

import model.CityEntity
import model.RealEstatesPrices


class GetCityWithHighestRentalPriceDifferenceInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): String {
        val listOfData = mutableListOf<CityByPriceDifference>()

        dataSource.getAllCitiesData().filter(::excludeNullValues)
            .forEach {
                val priceDifference =
                    it.realEstatesPrices.pricePerSquareMeterToBuyApartmentInCityCentre!! - it.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre!!
                listOfData.add(CityByPriceDifference(it.cityName, priceDifference.toDouble()))
            }


        listOfData.sortByDescending { it.priceDifference }

        return listOfData[0].nameCity
    }

    fun excludeNullValues(city: CityEntity): Boolean {
        return city.realEstatesPrices.pricePerSquareMeterToBuyApartmentInCityCentre != null && city.realEstatesPrices.pricePerSquareMeterToBuyApartmentOutsideOfCentre != null
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

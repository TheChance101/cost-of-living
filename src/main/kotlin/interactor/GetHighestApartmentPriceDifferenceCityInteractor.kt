package interactor

import model.CityEntity
import kotlin.math.abs


class GetHighestApartmentPriceDifferenceCityInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): String {
        return dataSource.getAllCitiesData()
            .filter { city -> city.hasValidData() }
            .maxByOrNull { city -> city.getApartmentPriceDifference() }?.cityName.toString()
    }

    private fun CityEntity.hasValidData(): Boolean {
        return with(realEstatesPrices) {
                    apartmentOneBedroomInCityCentre != null &&
                    apartmentOneBedroomOutsideOfCentre != null &&
                    apartment3BedroomsInCityCentre != null &&
                    apartment3BedroomsOutsideOfCentre != null &&
                    dataQuality
        }
    }

    private fun CityEntity.getApartmentPriceDifference(): Float {
        val oneBedroomPriceDiff =
            realEstatesPrices.apartmentOneBedroomInCityCentre!! - realEstatesPrices.apartmentOneBedroomOutsideOfCentre!!
        val threeBedroomPriceDiff =
            realEstatesPrices.apartment3BedroomsInCityCentre!! - realEstatesPrices.apartment3BedroomsOutsideOfCentre!!
        return (abs(oneBedroomPriceDiff) + abs(threeBedroomPriceDiff)) / 2f
    }
}
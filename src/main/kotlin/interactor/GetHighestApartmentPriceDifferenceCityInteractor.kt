package interactor

import model.CityEntity
import kotlin.math.abs


class GetHighestApartmentPriceDifferenceCityInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): String {
        return dataSource.getAllCitiesData()
            .filter (::excludeNullPricesAndLowQualityData)
            .maxByOrNull {calculateApartmentPrice(it)}?.cityName.toString()
    }

    private fun excludeNullPricesAndLowQualityData(city: CityEntity): Boolean {
        return with(city.realEstatesPrices) {
            apartmentOneBedroomInCityCentre != null &&
                    apartmentOneBedroomOutsideOfCentre != null &&
                    apartment3BedroomsInCityCentre != null &&
                    apartment3BedroomsOutsideOfCentre != null &&
                    city.dataQuality
        }
    }

    private fun calculateApartmentPrice(city: CityEntity): Float {
        return city.let {
            (abs(it.realEstatesPrices.apartmentOneBedroomInCityCentre!! - it.realEstatesPrices.apartmentOneBedroomOutsideOfCentre!!)
                    + abs(it.realEstatesPrices.apartment3BedroomsInCityCentre!! - it.realEstatesPrices.apartment3BedroomsOutsideOfCentre!!)).div(
                2
            )
        }
    }
}
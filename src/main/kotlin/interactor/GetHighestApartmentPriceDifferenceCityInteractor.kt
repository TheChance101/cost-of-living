package interactor

import model.CityEntity
import kotlin.math.abs


class GetHighestApartmentPriceDifferenceCityInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): String {
        return dataSource.getAllCitiesData()
            .filter (::excludeNullPricesAndLowQualityData)
            .maxByOrNull {getApartmentPriceDifference(it)}?.cityName.toString()
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

    private fun getApartmentPriceDifference(city: CityEntity): Float {
        return with(city.realEstatesPrices){
           abs ( ((apartmentOneBedroomOutsideOfCentre?.let { apartmentOneBedroomInCityCentre?.minus(it) } )!!.toFloat() +
                    (apartment3BedroomsInCityCentre?.let { apartment3BedroomsOutsideOfCentre?.minus(it) } )!!.toFloat()/2))
        }
    }
}
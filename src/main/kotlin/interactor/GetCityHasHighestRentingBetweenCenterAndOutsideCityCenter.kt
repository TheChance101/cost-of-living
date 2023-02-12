package interactor
import model.CityEntity
import model.RealEstatesPrices

class GetHighestApartmentPriceDifferenceCityInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): CityEntity? {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullPricesAndLowQualityData)
            .maxByOrNull { it.realEstatesPrices.getApartmentPriceDifference() }
    }


    private fun excludeNullPricesAndLowQualityData(city: CityEntity): Boolean {
        with(city.realEstatesPrices) {
            return apartmentOneBedroomInCityCentre != null &&
                    apartmentOneBedroomOutsideOfCentre != null &&
                    apartment3BedroomsInCityCentre != null &&
                    apartment3BedroomsOutsideOfCentre != null &&
                    city.dataQuality
        }
    }
    private fun RealEstatesPrices.getApartmentPriceDifference(): Float {
        return( ((apartmentOneBedroomOutsideOfCentre?.let { apartmentOneBedroomInCityCentre?.minus(it) } )!!.toFloat() +
                (apartment3BedroomsInCityCentre?.let { apartment3BedroomsOutsideOfCentre?.minus(it) } )!!.toFloat())/2)
    }


}





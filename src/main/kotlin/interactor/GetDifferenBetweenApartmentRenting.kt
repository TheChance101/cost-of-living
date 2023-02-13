package somepackage
import interactor.CostOfLivingDataSource
import model.CityEntity

class GetDifferentBetweenApartmentRenting(private val dataSource:CostOfLivingDataSource) {

    fun getCityWithHighestApartmentRentDifference(dataSource: CostOfLivingDataSource): CityEntity? {
        return dataSource.getAllCitiesData().filter { it.dataQuality }
            .maxByOrNull { city ->
                val realEstatesPrices = city.realEstatesPrices
                val oneBedroomDiff = getApartmentRentDifference(
                    realEstatesPrices.apartmentOneBedroomInCityCentre,
                    realEstatesPrices.apartmentOneBedroomOutsideOfCentre
                )
                val threeBedroomDiff = getApartmentRentDifference(
                    realEstatesPrices.apartment3BedroomsInCityCentre,
                    realEstatesPrices.apartment3BedroomsOutsideOfCentre
                )
                maxOf(oneBedroomDiff, threeBedroomDiff)
            }

    }

     fun getApartmentRentDifference(centerPrice: Float?, outsidePrice: Float?): Float {

         if (centerPrice == null || outsidePrice == null) {
             return 0f
         }
         return centerPrice - outsidePrice
    }
}
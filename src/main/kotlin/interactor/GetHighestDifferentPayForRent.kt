package interactor

import model.CityEntity

class  GetHighestDifferentPayForRent (
    private val dataSource: CostOfLivingDataSource,

    ) {
    fun execute(): CityEntity{
        return dataSource
            .getAllCitiesData()
            .filter(::excludeHighQulaityDataAndNullable)
            .sortedByDescending (::sortedHighestDifferentPayForRent)
            .first()
    }
}
private fun excludeHighQulaityDataAndNullable(city: CityEntity): Boolean {
    val  apartmentPrices = city.realEstatesPrices
    return city.dataQuality && apartmentPrices.apartmentOneBedroomOutsideOfCentre !=null &&apartmentPrices.apartment3BedroomsOutsideOfCentre !=null
            && apartmentPrices.apartmentOneBedroomInCityCentre !=null &&apartmentPrices.apartment3BedroomsInCityCentre !=null
}
private  fun sortedHighestDifferentPayForRent(city: CityEntity):Float{
    val  apartmentPrices=city.realEstatesPrices
    val differentBetweenOneBadRoomPrices= apartmentPrices.apartmentOneBedroomInCityCentre !!- apartmentPrices.apartmentOneBedroomOutsideOfCentre !!
    val differentBetweenThreeBadRoomPrices =apartmentPrices.apartment3BedroomsInCityCentre!!- apartmentPrices.apartment3BedroomsOutsideOfCentre !!
    return  if (differentBetweenOneBadRoomPrices >=differentBetweenThreeBadRoomPrices) return differentBetweenOneBadRoomPrices
    else  differentBetweenThreeBadRoomPrices
}
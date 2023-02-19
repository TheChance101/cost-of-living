package interactor

import model.CityEntity


class GetCityHasHighestRentingBetweenApartmentsInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    // Returns the highest-quality, highest-priced city for rent

    fun getHighestQualityCityForRenting(): CityEntity {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullValuesAndLowQualityData)
            .minByOrNull(::sortingWithRentingPrices)!!


    }
    // Sort the listing by rental price for one- and three-bedroom apartments

     fun sortingWithRentingPrices(city: CityEntity): Float {
        return city.realEstatesPrices.apartment3BedroomsInCityCentre?.plus(
            city.realEstatesPrices.apartmentOneBedroomInCityCentre!!)?.div(
            city.realEstatesPrices.apartment3BedroomsOutsideOfCentre?.plus
                (city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre!!)!!)!!
    }

     fun excludeNullValuesAndLowQualityData(city: CityEntity): Boolean {
        return city.realEstatesPrices.apartment3BedroomsInCityCentre != null
                && city.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null
                && city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre != null
                && city.realEstatesPrices.apartmentOneBedroomInCityCentre != null
                && city.dataQuality
    }


}


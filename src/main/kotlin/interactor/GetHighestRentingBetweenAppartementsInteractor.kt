package interactor

import model.CityEntity

class GetCityHasHighestRentingBetweenApartmentsInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(): CityEntity {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullValuesAndLowQualityData)
            .sortingWithRentingPrices()
            .take(1)[0]
    }

    private fun excludeNullValuesAndLowQualityData(city: CityEntity): Boolean {
        return city.realEstatesPrices.apartment3BedroomsInCityCentre != null
                && city.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null
                && city.realEstatesPrices.apartmentOneBedroomInCityCentre != null
                && city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre != null
                && city.dataQuality
    }

    private fun List<CityEntity>.sortingWithRentingPrices(): List<CityEntity> {
        return this.sortedBy {
            (it.realEstatesPrices.apartment3BedroomsInCityCentre?.plus(it.realEstatesPrices.apartmentOneBedroomInCityCentre!!))
                ?.div(
                    it.realEstatesPrices.apartment3BedroomsOutsideOfCentre?.plus(it.realEstatesPrices.apartmentOneBedroomOutsideOfCentre!!)!!
                )
        }
    }

}
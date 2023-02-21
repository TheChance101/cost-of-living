package interactor

import model.CityEntity
import model.RealEstatesPrices
import kotlin.math.abs
import kotlin.math.max


class GetCityWithHighestRentalPriceDifferenceInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute() = dataSource.getAllCitiesData()
        .filter { excludeNullValues(it) && excludeNullDataAndLowQuality(it) }
        .minByOrNull {
            getHighestDifferentBetweenCityCenterAndOutsideWithDifferentTypeOfApartments(it.realEstatesPrices)
        }!!
    private fun getHighestDifferentBetweenCityCenterAndOutsideWithDifferentTypeOfApartments(
        realEstatesPrices: RealEstatesPrices
    ) =
        max(
            abs(
                realEstatesPrices.apartmentOneBedroomInCityCentre!! -
                        realEstatesPrices.apartmentOneBedroomOutsideOfCentre!!
            ), abs(
                realEstatesPrices.apartment3BedroomsInCityCentre!! -
                        realEstatesPrices.apartment3BedroomsOutsideOfCentre!!
            )
        )

    fun excludeNullValues(city: CityEntity) = city.realEstatesPrices.apartmentOneBedroomInCityCentre != null
            && city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre != null
            && city.realEstatesPrices.apartment3BedroomsInCityCentre != null
            && city.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null


    private fun excludeNullDataAndLowQuality(city: CityEntity) = city.dataQuality
}
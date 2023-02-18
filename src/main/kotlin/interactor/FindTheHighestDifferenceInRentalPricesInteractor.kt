package interactor

import model.CityEntity
import kotlin.math.abs

class FindTheHighestDifferenceInRentalPricesInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(): CityEntity? {

        val citiesData = dataSource.getAllCitiesData()

        return citiesData
            .filter(::excludeNullAndLowQualityData)
            .maxByOrNull {
                val inCityCenter =
                    it.realEstatesPrices.apartmentOneBedroomInCityCentre!! +
                            it.realEstatesPrices.apartment3BedroomsInCityCentre!!

                val outsideCity =
                    it.realEstatesPrices.apartmentOneBedroomOutsideOfCentre!! +
                            it.realEstatesPrices.apartment3BedroomsOutsideOfCentre!!

              abs(inCityCenter - outsideCity)
            }
    }

    private fun excludeNullAndLowQualityData(city: CityEntity): Boolean {
        return city.realEstatesPrices.apartmentOneBedroomInCityCentre != null
                && city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre != null
                && city.realEstatesPrices.apartment3BedroomsInCityCentre != null
                && city.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null
                && city.dataQuality
    }

}
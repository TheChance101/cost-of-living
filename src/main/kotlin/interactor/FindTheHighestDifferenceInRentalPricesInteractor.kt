package interactor

import model.CityEntity
import kotlin.math.abs

//task 4
class FindTheHighestDifferenceInRentalPricesInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute() = dataSource.getAllCitiesData()
        .filter(::isHighQualityDataAndNotNullApartments)
        .maxByOrNull(::getAbsDifferenceBetweenApartments)


    private fun getAbsDifferenceBetweenApartments(city: CityEntity): Float {
        val inCityCenter =
            city.realEstatesPrices.apartmentOneBedroomInCityCentre!! +
                    city.realEstatesPrices.apartment3BedroomsInCityCentre!!

        val outsideCity =
            city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre!! +
                    city.realEstatesPrices.apartment3BedroomsOutsideOfCentre!!

        return abs(inCityCenter - outsideCity)
    }

    private fun isHighQualityDataAndNotNullApartments(city: CityEntity): Boolean {
        return city.realEstatesPrices.apartmentOneBedroomInCityCentre != null
                && city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre != null
                && city.realEstatesPrices.apartment3BedroomsInCityCentre != null
                && city.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null
                && city.dataQuality
    }

}
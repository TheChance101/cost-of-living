package interactor

import interactor.utils.BedroomOption
import model.CityEntity
import kotlin.math.abs


class GetCostlierCityWithRentingAnApartmentBetweenCityCenterAndOutsideCityCenterInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(option: BedroomOption): CityEntity {
        return when (option) {
            BedroomOption.ONE_BEDROOM -> getOneBedroom()
            BedroomOption.THREE_BEDROOM -> getThreeBedroom()
        }
    }

    private fun getThreeBedroom(): CityEntity {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullPriceApartment3BedroomsAndLowQualityData)
            .maxByOrNull(::getDifferencePricesApartment3Bedrooms)!!
    }

    private fun getOneBedroom(): CityEntity {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullPriceApartment1BedroomsAndLowQualityData)
            .maxByOrNull(::getDifferencePricesApartment1Bedrooms)!!
    }


    private fun excludeNullPriceApartment3BedroomsAndLowQualityData(city: CityEntity): Boolean {
        return city.dataQuality
                && city.realEstatesPrices.apartment3BedroomsInCityCentre != null
                && city.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null
    }

    private fun excludeNullPriceApartment1BedroomsAndLowQualityData(city: CityEntity): Boolean {
        return city.dataQuality
                && city.realEstatesPrices.apartmentOneBedroomInCityCentre != null
                && city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre != null
    }


    private fun getDifferencePricesApartment3Bedrooms(city: CityEntity): Float {
        return abs(city.realEstatesPrices.apartment3BedroomsInCityCentre!! - city.realEstatesPrices.apartment3BedroomsOutsideOfCentre!!)
    }

    private fun getDifferencePricesApartment1Bedrooms(city: CityEntity): Float {
        return abs(city.realEstatesPrices.apartmentOneBedroomInCityCentre!! - city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre!!)
    }

}
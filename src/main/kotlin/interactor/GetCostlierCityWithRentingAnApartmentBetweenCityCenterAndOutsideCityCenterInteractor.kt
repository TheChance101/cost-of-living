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
            .filter {
                it.dataQuality
                        && it.realEstatesPrices.apartment3BedroomsInCityCentre != null
                        && it.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null
            }
            .maxByOrNull { abs(it.realEstatesPrices.apartment3BedroomsInCityCentre!! - it.realEstatesPrices.apartment3BedroomsOutsideOfCentre!!) }!!

    }

    private fun getOneBedroom(): CityEntity {
        return dataSource.getAllCitiesData()
            .filter {
                it.dataQuality
                        && it.realEstatesPrices.apartmentOneBedroomInCityCentre != null
                        && it.realEstatesPrices.apartmentOneBedroomOutsideOfCentre != null
            }

            .maxByOrNull { abs(it.realEstatesPrices.apartmentOneBedroomInCityCentre!! - it.realEstatesPrices.apartmentOneBedroomOutsideOfCentre!!) }!!


    }


}
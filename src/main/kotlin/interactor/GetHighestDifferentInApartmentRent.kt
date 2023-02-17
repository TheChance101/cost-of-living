package interactor
import model.CityEntity
import utils.isNotNull

class GetHighestDifferentInApartmentRent (
    private val dataSource: CostOfLivingDataSource,
)
{

    fun execute(limit: Int): CityEntity {
        return if (limit==1)
            dataSource.getAllCitiesData()
                .filter(::excludeNullApartmentBedroom)
                .sortedByDescending { it.findHighestDifferentInCitiesRent() }
                .take(limit)
                .first()
        else throw InvalidLimitException("invalid limit value")
    }

    private fun excludeNullApartmentBedroom(city: CityEntity): Boolean {
        return city.realEstatesPrices.apartment3BedroomsInCityCentre.isNotNull()
                && city.realEstatesPrices.apartment3BedroomsOutsideOfCentre.isNotNull()
                && city.realEstatesPrices.apartmentOneBedroomInCityCentre.isNotNull()
                && city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre.isNotNull()
                && city.dataQuality
    }

    private fun CityEntity.findHighestDifferentInCitiesRent()=kotlin.math.abs(
        realEstatesPrices.apartmentOneBedroomInCityCentre!!
                - realEstatesPrices.apartmentOneBedroomOutsideOfCentre!!
    )+
            kotlin.math.abs(
                realEstatesPrices.apartment3BedroomsInCityCentre!!
                        - realEstatesPrices.apartment3BedroomsOutsideOfCentre!!
            )
}

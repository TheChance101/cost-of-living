package interactor
import model.CityEntity
import utils.isNotNull
import java.lang.IllegalStateException
import java.util.NoSuchElementException
class GetCityHasTheHighestDifferentInApartmentRentInteractor (
    private val dataSource: CostOfLivingDataSource,
)
{

    fun execute(): CityEntity =
        dataSource.getAllCitiesData()
            .asSequence()
            .ifEmpty { throw IllegalStateException("Something went wrong") }
            .filter(::excludeNullApartmentBedroom)
            .maxByOrNull { it.findHighestDifferentInCitiesRent() }
            ?: throw NoSuchElementException("No data matching the condition.")

    private fun excludeNullApartmentBedroom(city: CityEntity): Boolean {
        return city.realEstatesPrices.apartment3BedroomsInCityCentre.isNotNull()
                && city.realEstatesPrices.apartment3BedroomsOutsideOfCentre.isNotNull()
                && city.realEstatesPrices.apartmentOneBedroomInCityCentre.isNotNull()
                && city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre.isNotNull()
                && city.dataQuality
    }

    private fun CityEntity.findHighestDifferentInCitiesRent()=
            kotlin.math.abs(
                        realEstatesPrices.apartmentOneBedroomInCityCentre!!
                         - realEstatesPrices.apartmentOneBedroomOutsideOfCentre!!
            )+
            kotlin.math.abs(
                       realEstatesPrices.apartment3BedroomsInCityCentre!!
                        - realEstatesPrices.apartment3BedroomsOutsideOfCentre!!
            )
}

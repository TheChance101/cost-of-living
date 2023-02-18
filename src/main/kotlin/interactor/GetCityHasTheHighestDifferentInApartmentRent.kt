package interactor
import model.CityEntity
import utils.isNotNull
import java.lang.IllegalStateException
import java.util.NoSuchElementException

class GetCityHasTheHighestDifferentInApartmentRent (
    private val dataSource: CostOfLivingDataSource,
)
{

    fun execute(limit: Int): CityEntity {
        return if (limit==1)
            dataSource.getAllCitiesData().also { if (it.isEmpty()) throw IllegalStateException("no data") }
                .filter(::excludeNullApartmentBedroom)
                .let { it.ifEmpty { throw NoSuchElementException("no filtered data") } }
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

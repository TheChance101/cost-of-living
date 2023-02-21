package interactor

import model.CityEntity


class GetCostlierCityInteractor(

    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(): CityEntity {
        return dataSource.getAllCitiesData()
            .filter(::excludeNullValuesAndLowQualityData)
            .maxByOrNull(::calculateTheRatioBetweenThePriceOfApartmentsInsideAndOutsideTheCity)
            ?: throw Exception("Invalid Data")
    }

    private fun excludeNullValuesAndLowQualityData(city: CityEntity): Boolean {
        return city.dataQuality && with(city.realEstatesPrices) {
            apartmentOneBedroomInCityCentre != null &&
                    apartmentOneBedroomOutsideOfCentre != null &&
                    apartment3BedroomsInCityCentre != null &&
                    apartment3BedroomsOutsideOfCentre != null
        }
    }

    private fun calculateTheRatioBetweenThePriceOfApartmentsInsideAndOutsideTheCity(city: CityEntity): Float {
        return with(city.realEstatesPrices) {
            (apartmentOneBedroomInCityCentre!! + apartment3BedroomsInCityCentre!!) /
                    (apartment3BedroomsOutsideOfCentre!! + apartmentOneBedroomOutsideOfCentre!!)
        }
    }
}
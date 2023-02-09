package interactor

import model.CityEntity

class GetCityHasHighestDifferentPayRentingApartment (
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute_OneBedroomInCityCentre(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndLowQualityData)
            .sortedByDescending { it.realEstatesPrices.apartmentOneBedroomInCityCentre }
            .take(limit)
            .map { it.cityName }
    }
    fun execute_OneBedroomOutsideOfCentree(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndLowQualityData)
            .sortedByDescending { it.realEstatesPrices.apartmentOneBedroomOutsideOfCentre }
            .take(limit)
            .map { it.cityName }
    }
    fun execute_O3BedroomsInCityCentre(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndLowQualityData)
            .sortedByDescending { it.realEstatesPrices.apartment3BedroomsInCityCentre }
            .take(limit)
            .map { it.cityName }
    }

    fun execute_3BedroomsOutsideOfCentre(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndLowQualityData)
            .sortedByDescending { it.realEstatesPrices.apartment3BedroomsOutsideOfCentre }
            .take(limit)
            .map { it.cityName }
    }

    private fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
        return city.realEstatesPrices != null && city.dataQuality
    }
}


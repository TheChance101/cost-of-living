package interactor

import model.CityEntity

class GetHighestDifferenceBetweenCityCenterAndOutsideCityCenter(
    private val dataSource: CostOfLivingDataSource
)  {

    fun execute_DifferentPayRentingBetweenIntCityCenter_OutCitycenter(limit: Int): List<String>{
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullDataAndLowQuality)
            .sortedByDescending { it.realEstatesPrices.apartmentOneBedroomInCityCentre!! - it.realEstatesPrices.apartmentOneBedroomInCityCentre }
            .take(limit)
            .map { it.cityName }
    }

    private fun excludeNullDataAndLowQuality(city: CityEntity): Boolean {
        return city.realEstatesPrices != null && city.realEstatesPrices != null && city.dataQuality
    }
}
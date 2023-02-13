package interactor

import model.CityEntity
import model.RealEstatesPrices

class GetCityWithHighestCostOfLivingDifferenceInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(): CityEntity {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullPricesAndLowQualityData)
            .maxByOrNull {
                getLivingCostDifference(it.realEstatesPrices)
            }!!
    }

    private fun excludeNullPricesAndLowQualityData(city: CityEntity): Boolean {
        return city.realEstatesPrices.apartmentOneBedroomInCityCentre != null &&
                city.realEstatesPrices.apartmentOneBedroomOutsideOfCentre != null &&
                city.realEstatesPrices.apartment3BedroomsInCityCentre != null &&
                city.realEstatesPrices.apartment3BedroomsOutsideOfCentre != null &&
                city.dataQuality
    }

    private fun getLivingCostDifference(prices: RealEstatesPrices): Float {
        return (prices.apartmentOneBedroomInCityCentre?.minus(prices.apartmentOneBedroomOutsideOfCentre!!))?.plus((prices.apartment3BedroomsInCityCentre?.minus(prices.apartment3BedroomsOutsideOfCentre!!)!!)) ?: 0f
    }
}




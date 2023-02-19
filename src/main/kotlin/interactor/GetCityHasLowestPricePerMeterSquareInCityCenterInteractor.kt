package interactor

import model.CityEntity

class GetCityHasLowestPricePerMeterSquareInCityCenterInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(): CityEntity? {
        return null
    }

    private fun isValidPrices(city: CityEntity): Boolean {
        return city.realEstatesPrices.pricePerSquareMeterToBuyApartmentInCityCentre != null
                && city.realEstatesPrices.pricePerSquareMeterToBuyApartmentInCityCentre > 0f
    }


}
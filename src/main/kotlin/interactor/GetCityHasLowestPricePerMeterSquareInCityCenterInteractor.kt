package interactor

import model.CityEntity

class GetCityHasLowestPricePerMeterSquareInCityCenterInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(): CityEntity? {
        return dataSource
            .getAllCitiesData()
            .filter(::isValidPrices)
            .minByOrNull { it.realEstatesPrices.pricePerSquareMeterToBuyApartmentInCityCentre!! }
    }

    private fun isValidPrices(city: CityEntity): Boolean {
        return city.realEstatesPrices.pricePerSquareMeterToBuyApartmentInCityCentre != null
                && city.realEstatesPrices.pricePerSquareMeterToBuyApartmentInCityCentre > 0f
    }


}
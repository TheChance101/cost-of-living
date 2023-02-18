package interactor

import model.CityEntity

class GetCheapestBasicPricesInAllCitiesComparingToAverageSalariesInteractor (
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): CityEntity? {
        return null
    }

    fun execludeNullSalaryAndQualityDataAndOtherBaicPrices(cityEntity: CityEntity): Boolean? {
        return cityEntity.run {
            dataQuality
                    && averageMonthlyNetSalaryAfterTax != null
                    && realEstatesPrices.apartmentOneBedroomInCityCentre != null
                    && servicesPrices.basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment != null
                    && transportationsPrices.monthlyPassRegularPrice != null
        }
    }
}
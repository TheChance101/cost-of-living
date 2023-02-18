package interactor

import model.CityEntity

class GetCheapestBasicPricesInAllCitiesComparingToAverageSalariesInteractor (
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): CityEntity? {
        return dataSource
            .getAllCitiesData()
            .filter { execludeNullSalaryAndQualityDataAndOtherBaicPrices(it) != null }
            .maxByOrNull {
                (it.averageMonthlyNetSalaryAfterTax)!! -
                        (it.transportationsPrices.monthlyPassRegularPrice
                        !! + it.servicesPrices.basicElectricityHeatingCoolingWaterGarbageFor85m2Apartment!!
                                + it.realEstatesPrices.apartmentOneBedroomInCityCentre!!)
            }
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
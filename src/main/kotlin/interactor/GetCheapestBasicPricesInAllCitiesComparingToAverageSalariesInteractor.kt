package interactor

import model.CityEntity

class GetCheapestBasicPricesInAllCitiesComparingToAverageSalariesInteractor (
    private val dataSource: CostOfLivingDataSource
) {

    fun execute(): CityEntity? {
        return null
    }

    fun execludeNullSalaryAndQualityDataAndOtherBaicPrices(cityEntity: CityEntity): Boolean? {
       return  true
    }
}
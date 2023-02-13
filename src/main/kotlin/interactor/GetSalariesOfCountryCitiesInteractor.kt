package interactor

import model.CityEntity

class GetSalariesOfCountryCitiesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(countryName: String): Map<String, Float>? {
        return mapOf()
    }

    private fun excludeNullSalariesAndLowQualityData(city: CityEntity):Boolean{
        return false
    }



}
package interactor

import model.CityEntity
import utils.Constants.INVALID_LIMIT_EXCEPTION_MSG
import utils.areNotNull
import utils.average


class GetTopFashionCitiesNamesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .asSequence()
            .filter(::excludeNullPricesAndLowQualityData)
            .sortedBy { it.clothesPrices.average() }
            .distinctBy { Pair(it.cityName, it.country) }
            .takeIf { limit >= 0 }
            ?.take(limit)
            ?.map { it.cityName }
            ?.toList() ?: throw InvalidLimitException(INVALID_LIMIT_EXCEPTION_MSG)
    }

    private fun excludeNullPricesAndLowQualityData(city: CityEntity) =
        city.clothesPrices.areNotNull() && city.dataQuality

}
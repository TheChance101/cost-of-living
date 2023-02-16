package interactor

import model.CityEntity
import model.ClothesPrices


class GetTopFashionCitiesNamesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .asSequence()
            .filter(::excludeNullPricesAndLowQualityData)
            .sortedBy { it.clothesPrices.averagePrice() }
            .distinctBy { Pair(it.cityName, it.country) }
            .takeIf { limit > 0 }
            ?.map { it.cityName }
            ?.toList() ?: emptyList()
    }

    private fun excludeNullPricesAndLowQualityData(city: CityEntity) =
        city.clothesPrices.hasNoNull() && city.dataQuality

    private fun ClothesPrices.hasNoNull(): Boolean {
        return this::class.java.declaredFields
            .map {
                it.isAccessible = true
                it.get(this)
            }.all { it != null }
    }

    private fun ClothesPrices.averagePrice(): Float {
        return this::class.java.declaredFields
            .map {
                it.isAccessible = true
                it.get(this) as Float
            }.average().toFloat()
    }

}
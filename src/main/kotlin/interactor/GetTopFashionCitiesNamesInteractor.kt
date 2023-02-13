package interactor

import model.CityEntity

class GetTopFashionCitiesNamesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit: Int): List<String> {
        if (limit <= 0) return emptyList()
        return dataSource
            .getAllCitiesData()
            .asSequence()
            .filter(::excludeNullPricesAndLowQualityData)
            .sortedBy { it.getClothesAveragePrice() }
            .distinctBy { it.cityName }
            .take(limit)
            .map { it.cityName }
            .toList()
    }

    private fun excludeNullPricesAndLowQualityData(city: CityEntity) = city.hasNoNullClothesPrices() && city.dataQuality

    private fun CityEntity.hasNoNullClothesPrices(): Boolean {
        return clothesPrices::class.java.declaredFields
            .map {
                it.isAccessible = true
                it.get(clothesPrices)
            }.all { it != null }
    }

    private fun CityEntity.getClothesAveragePrice(): Float {
        return clothesPrices::class.java.declaredFields
            .map {
                it.isAccessible = true
                it.get(clothesPrices) as Float
            }.average().toFloat()
    }

}
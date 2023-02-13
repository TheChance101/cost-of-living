package interactor

import model.CityEntity

class GetTopFashionCitiesNamesInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    fun execute(limit: Int): List<String> {
        if (limit <= 0) return emptyList()
        return dataSource.getAllCitiesData().filter(::excludeNullPricesAndLowQualityData)
            .sortedBy { it.getClothesAveragePrice() }.take(limit).map { it.cityName }
    }

    private fun excludeNullPricesAndLowQualityData(city: CityEntity) = city.hasNoNullClothesPrices() && city.dataQuality

    private fun CityEntity.hasNoNullClothesPrices(): Boolean {
        val fields = clothesPrices::class.java.declaredFields
        return fields.map {
            it.isAccessible = true
            it.get(clothesPrices)
        }.any { it != null }
    }

    private fun CityEntity.getClothesAveragePrice(): Float {
        return clothesPrices::class.java.declaredFields.mapNotNull {
            it.isAccessible = true
            val value = it.get(clothesPrices)
            if (value is Float) value else null
        }.average().toFloat()
    }


}
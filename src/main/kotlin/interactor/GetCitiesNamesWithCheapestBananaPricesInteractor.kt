package interactor

import model.CityEntity

class GetCitiesNamesWithCheapestBananaPricesInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(vararg citiesNames: String): List<String> {
        val dataEntities = dataSource
            .getAllCitiesData()
            .filter { cityEntity -> excludeNullBananaPrice(cityEntity) }

        val dataNames = dataSource
            .getAllCitiesData()
            .filter { cityEntity -> excludeNullBananaPrice(cityEntity) }
            .map(CityEntity::cityName)

        when {
            (citiesNames.size == 1) &&
                    dataNames.contains(citiesNames.first())
            -> {
                return citiesNames.toList()
            }

            (citiesNames.size != 1)
                    && dataNames.containsAll(citiesNames.toList())
            -> {
                return dataEntities.sortedBy { cityEntity -> cityEntity.fruitAndVegetablesPrices.banana1kg }
                    .filter { cityEntity -> cityEntity.cityName in citiesNames }
                    .map(CityEntity::cityName)
            }

            (citiesNames.size != 1)
                    && citiesNames.any { it in dataNames }
            -> {
                return dataEntities.sortedBy { cityEntity ->
                    cityEntity.fruitAndVegetablesPrices.banana1kg
                }
                    .filter { cityEntity -> cityEntity.cityName in citiesNames }
                    .map(CityEntity::cityName)
            }

            else -> {
                return emptyList()
            }

        }

    }

    private fun excludeNullBananaPrice(city: CityEntity): Boolean {
        return city.fruitAndVegetablesPrices.banana1kg != null
    }
}
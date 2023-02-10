package interactor

import model.CityEntity

class GetCitiesNamesWithCheapestBananaPricesInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(vararg citiesNames: String): List<String> {
        val filteredCities = dataSource.getAllCitiesData().filter(::excludeNullBananaPrice)
        val cityNames = filteredCities.map(CityEntity::cityName)

        return if (citiesNames.any { it in cityNames }) {
            filteredCities.sortedBy { it.fruitAndVegetablesPrices.banana1kg }
                .filter { it.cityName in citiesNames }.map(CityEntity::cityName)
        } else emptyList()

    }

    private fun excludeNullBananaPrice(city: CityEntity): Boolean {
        return city.fruitAndVegetablesPrices.banana1kg != null
    }
}

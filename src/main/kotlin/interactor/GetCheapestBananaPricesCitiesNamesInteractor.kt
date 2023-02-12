package interactor

import model.CityEntity

class GetCheapestBananaPricesCitiesNamesInteractor(
    private val dataSource: CostOfLivingDataSource
) {

    fun getCitiesVarArgs(): Array<CityEntity> {
        return dataSource.getAllCitiesData().toTypedArray()
    }

    fun execute(vararg cityEntities: CityEntity): List<String> {
        return if (cityEntities.isEmpty())
            listOf("No Data is Entered !")
        else cityEntities
            .filter(::excludeNullBananaPrices)
            .sortingWithBananaPrices()
            .map { it.cityName }
    }

    private fun excludeNullBananaPrices(city: CityEntity): Boolean {
        return city.fruitAndVegetablesPrices.banana1kg != null
    }

    /**
     * Sort the list with the banana prices between CityEntities.
     * @return sorted List<CityEntity>
     */
    private fun List<CityEntity>.sortingWithBananaPrices(): List<CityEntity> {
        return this.sortedByDescending {
            it.fruitAndVegetablesPrices.banana1kg
        }
    }
}
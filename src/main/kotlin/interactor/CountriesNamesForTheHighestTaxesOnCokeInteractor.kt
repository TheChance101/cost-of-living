package interactor
import model.CityEntity

class CountriesNamesForTheHighestTaxesOnCokeInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limitOfDesiredCountries: Int): List<CityEntity> {
        return dataSource
            .getAllCitiesData()
            .take(limitOfDesiredCountries)
    }
}
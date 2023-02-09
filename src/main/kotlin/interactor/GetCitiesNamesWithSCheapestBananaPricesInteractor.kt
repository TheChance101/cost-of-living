package interactor


class GetCitiesNamesWithSCheapestBananaPricesInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(vararg citiesNames: String): List<String> {
        return emptyList()
    }
}
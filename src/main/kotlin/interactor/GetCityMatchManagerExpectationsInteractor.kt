package interactor

import model.CityEntity

class GetCityMatchManagerExpectationsInteractor(
    private val dataSource: CostOfLivingDataSource,
) {

    private val northAmericaCountries: List<String> =
        listOf(
            "United States",
            "Guatemala",
            "Belize",
            "El Salvador",
            "Honduras",
            "Nicaragua",
            "Costa Rica",
            "Panama",
            "Canada",
            "Mexico"
        )

    fun execute(): String {
        return dataSource.getAllCitiesData()
            .filter { it.country in northAmericaCountries }.first().cityName
    }

}
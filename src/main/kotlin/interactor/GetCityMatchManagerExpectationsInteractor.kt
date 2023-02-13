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

    private fun filterOnlyNorthAmericaCities(cities: List<CityEntity>): List<CityEntity> =
        cities.filter { it.country in northAmericaCountries }


    fun execute(cities: List<CityEntity>): String {
        return "${filterOnlyNorthAmericaCities(cities).size}"
    }

}
package interactor

import model.CityEntity

class GetCitiesAndYearsToBuyApartmentInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(limit: Int): List<Pair<String?,String>> =  listOf(Pair("",""))

}
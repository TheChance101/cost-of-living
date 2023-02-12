package interactor

import model.CityEntity

class GetCityHasLowestYearsToBuyApartmentInteractor(
    private val dataSource: CostOfLivingDataSource,
) {
    fun execute(limit:Int,fullTimeSalary : Int): List<Pair<String,Float>> {

        TODO(" Not implemented yet ")

    }
    fun excludeNullPriceOfApartmentAndLowQualityData(city: CityEntity): Boolean {
        TODO(" Not implemented yet ")
    }
}

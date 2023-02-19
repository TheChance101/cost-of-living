package interactor
import model.CityEntity

class GetCityWithCheapestInternationalPrimarySchoolForOneChildInteractor(
    private val dataSource: CostOfLivingDataSource
) {
    fun execute(limit:Int): List<Pair<String,Float?>> {
        return (dataSource
            .getAllCitiesData()
            .filter (::excludeNullInterNationalPrimarySchoolYearlyForOneChildAndLowQualityData )
            .sortedBy { it.servicesPrices.internationalPrimarySchoolYearlyForOneChild }
            .take(limit)
            .map { Pair(it.cityName, it.servicesPrices.internationalPrimarySchoolYearlyForOneChild) }
            .takeIf {  (limit>0)  }?: throw Exception("Not valid limit "))
    }

    fun excludeNullInterNationalPrimarySchoolYearlyForOneChildAndLowQualityData(city: CityEntity): Boolean {
        return return city.servicesPrices.internationalPrimarySchoolYearlyForOneChild != null && city.dataQuality
    }

    
}
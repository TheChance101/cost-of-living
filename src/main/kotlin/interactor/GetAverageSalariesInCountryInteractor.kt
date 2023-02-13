package interactor

import model.CityEntity
import java.util.*

class GetAverageSalariesInCountryInteractor (
    private val dataSource: CostOfLivingDataSource,) {
    fun execute(countryName: String): List<Pair<String,Float?>> {
        return emptyList()
    }
    fun excludeLowQualityData(city: CityEntity): Boolean {
        return city.dataQuality
    }
    fun excludeNullSalaries(city: CityEntity): Boolean{
        return city.averageMonthlyNetSalaryAfterTax != null
    }
}

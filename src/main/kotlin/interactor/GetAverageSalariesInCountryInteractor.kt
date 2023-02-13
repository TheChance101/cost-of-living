package interactor

import model.CityEntity

class GetAverageSalariesInCountryInteractor (
    private val dataSource: CostOfLivingDataSource,) {

        fun execute(countryName: String): List<Pair<String,Float>> {
            return listOf(Pair("",0.0f))
        }

         fun excludeNullSalariesAndLowQualityData(city: CityEntity): Boolean {
            return city.averageMonthlyNetSalaryAfterTax != null && city.dataQuality
        }

}

package interactor
import model.CityEntity

class SearchForSalariesInCountry (  private val dataSource: CostOfLivingDataSource,){
    fun execute(limit: Int): List<String> {
        return dataSource
            .getAllCitiesData()
            .filter(::excludeNullSalariesAndLowQualityData)
            .sortedBy {it.averageMonthlyNetSalaryAfterTax}
            .take(limit)
            .map { it.country }
    }

    fun searchForSalary(list:List<CityEntity>): List<Pair<String,Float>> {
       for(i in 0 until list.size) {
           if (list[i].isUpper() || list[i].isLower()) {


                   return List(list[i],it.averageMonthlyNetSalaryAfterTax)

           }
       }
}
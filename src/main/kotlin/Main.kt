import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor
import interactor.getTheAverageSalaryForEachCityInTheCountryInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
//    println(getHighestSalaryAverageCities.execute(limit = 10))
//    printSeparationLine()
//
//    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
//    println(getCityHasCheapestInternetConnectionInteractor.execute())
//    val getTheAverageSalaryForEachCityInTheCountry =getTheAverageSalaryForEachCityInTheCountryInteractor(dataSource)

    println(dataSource.getAllCitiesData().take(20).filter { it.country =="Cuba" }
        .map { listOf(it.cityName,it.averageMonthlyNetSalaryAfterTax) })

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}




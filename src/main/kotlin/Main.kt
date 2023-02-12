
import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor
import interactor.GetSalaryAverageForCitiesInCountryInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

   // val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    //println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

   // val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    //println(getCityHasCheapestInternetConnectionInteractor.execute())
    printSeparationLine()

    val getSalaryAverageForCitiesInCountryInteractor = GetSalaryAverageForCitiesInCountryInteractor(dataSource)
    println(getSalaryAverageForCitiesInCountryInteractor.execute("Egypt"))
    println(getSalaryAverageForCitiesInCountryInteractor.execute("Turkey"))
    println(getSalaryAverageForCitiesInCountryInteractor.execute("syria"))
}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


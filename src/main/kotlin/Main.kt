import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetCityThatMatchTheManagerExpectationsInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

//    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
//    println(getHighestSalaryAverageCities.execute(limit = 10))
//    printSeparationLine()

    val countries = listOf("United State", "Canada", "Mexico")
    val getCityThatMatchTheManagerExpectationsInteractor = GetCityThatMatchTheManagerExpectationsInteractor(dataSource)
    getCityThatMatchTheManagerExpectationsInteractor.execute(countries)

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


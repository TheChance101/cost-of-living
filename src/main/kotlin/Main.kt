import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.*

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser) // CSV : comma separated values
    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())
    printSeparationLine()

    val getCityThatHasAverageMealsPricesInteractor = GetCityThatHasAverageMealsPricesInteractor(dataSource)
    println(getCityThatHasAverageMealsPricesInteractor.execute())
    printSeparationLine()


    val getSalariesOfCountryCitiesInteractor = GetSalariesOfCountryCitiesInteractor(dataSource)
    println(getSalariesOfCountryCitiesInteractor.execute("Iraq"))
    printSeparationLine()


  
}
private fun printSeparationLine(){
    print("\n_______________________________\n")

}


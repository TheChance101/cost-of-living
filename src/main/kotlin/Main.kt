import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetCityHasMoreSavingsPerMonthInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser) // CSV : comma separated values


    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)

    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())
    printSeparationLine()



    val getCityHasMoreSavingsPerMonthInteractor = GetCityHasMoreSavingsPerMonthInteractor(dataSource)
    println(getCityHasMoreSavingsPerMonthInteractor.execute(limit = 1))
    printSeparationLine()



}
private fun printSeparationLine(){
    print("\n_______________________________\n")

}


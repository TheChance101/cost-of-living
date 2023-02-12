import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor
import interactor.GetMostSuitableSavingCityInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

    // todo un comment when done to test the functions you wrote
//    val getMostSuitableSavingCityInteractor = GetMostSuitableSavingCityInteractor(dataSource)
//    println(getMostSuitableSavingCityInteractor.execute(limit = 5))
//    printSeparationLine()

//    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
//    println(getCityHasCheapestInternetConnectionInteractor.execute())



}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


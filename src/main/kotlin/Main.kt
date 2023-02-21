import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.*

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCitiesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())

    printSeparationLine()

    val x=GetCountriesNamesWithHighestCokePrice(dataSource)
    println(x.execute())

    printSeparationLine()

    val testFindCitiesWithBestValueForMoneyInteractor = FindCitiesWithBestValueForMoneyInteractor(dataSource)
    println(testFindCitiesWithBestValueForMoneyInteractor.execute(10))

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


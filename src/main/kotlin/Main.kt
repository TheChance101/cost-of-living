import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCitiesNamesSortedCheapestBananPrices
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val inputCitiesEntity= arrayOf(
        dataSource.getAllCitiesData()[11],
        dataSource.getAllCitiesData()[4],
        dataSource.getAllCitiesData()[10],
        dataSource.getAllCitiesData()[12],
        dataSource.getAllCitiesData()[13])

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

    val getCitiesNamesSortedCheapestBananPrices = GetCitiesNamesSortedCheapestBananPrices()
    println(getCitiesNamesSortedCheapestBananPrices.excute(*inputCitiesEntity))

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


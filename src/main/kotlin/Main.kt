import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityThatMatchTheManagerExpectationsInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))

    printSeparationLine()

    val countries = listOf("UnItEd STaTeS", "CaNAdA", "MexIco","irAq")
    val getCityThatMatchTheManagerExpectationsInteractor = GetCityThatMatchTheManagerExpectationsInteractor(dataSource)
    print(getCityThatMatchTheManagerExpectationsInteractor.execute(countries))

}

private fun printSeparationLine() {
    print("\n_______________________________\n")
}


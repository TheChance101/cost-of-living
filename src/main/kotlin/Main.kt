import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetAverageFruitAndVegetablesInteractor
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetCityThatMatchTheManagerExpectationsInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor
import interactor.GetTopTenCountriesTaxesInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))

    printSeparationLine()

    val countries = listOf("UnItEd STaTeS", "CaNAdA", "MexIco","irAq")
    val getCityThatMatchTheManagerExpectationsInteractor = GetCityThatMatchTheManagerExpectationsInteractor(dataSource)
    print(getCityThatMatchTheManagerExpectationsInteractor.execute(countries))
    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor()
    println(getCityHasCheapestInternetConnectionInteractor.execute(listOf()))
    printSeparationLine()


    val getAverageFruitAndVegetablesInteractor = GetAverageFruitAndVegetablesInteractor(dataSource)
    println(getAverageFruitAndVegetablesInteractor.execute())
    printSeparationLine()


    println()
    print("\n_______________________________\n")
    val topTenCountriesTaxes = GetTopTenCountriesTaxesInteractor(dataSource)
  //  var topTenCountries= topTenCountriesTaxes.execute()
  //  println(topTenCountries)

}

private fun printSeparationLine() {
    print("\n_______________________________\n")
}


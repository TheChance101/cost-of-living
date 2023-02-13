import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityThatMatchTheManagerExpectationsInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor
import interactor.TopTenCountriesTaxes

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))

    printSeparationLine()

    val countries = listOf("UnItEd STaTeS", "CaNAdA", "MexIco","irAq")
    val getCityThatMatchTheManagerExpectationsInteractor = GetCityThatMatchTheManagerExpectationsInteractor(dataSource)
    print(getCityThatMatchTheManagerExpectationsInteractor.execute(countries))

    println()
    print("\n_______________________________\n")
    val topTenCountriesTaxes = TopTenCountriesTaxes(dataSource)
    var topTenCountries= topTenCountriesTaxes.getTopTenCountriesWithHighestTaxesOnCarbonatedDrinks()
    println(topTenCountries)

}

private fun printSeparationLine() {
    print("\n_______________________________\n")
}


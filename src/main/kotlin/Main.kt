import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor
import interactor.GetTopTenCoutriesHaveHighCarbonatedDrinksPrices

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getTopTenCountriesWithHighTaxOnCarbonatedDrinks= GetTopTenCoutriesHaveHighCarbonatedDrinksPrices(dataSource)
    println(getTopTenCountriesWithHighTaxOnCarbonatedDrinks.execute(5))
    printSeparationLine()

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor
import interactor.GetTopTenCoutriesHaveHighCarbonatedDrinksPrices

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val data = dataSource.getAllCitiesData()
    val getTop10CountriesWithHighTaxOnCarbonatedDrinks= GetTopTenCoutriesHaveHighCarbonatedDrinksPrices(dataSource)
    println(getTop10CountriesWithHighTaxOnCarbonatedDrinks.execute(10,data))

    val inputCitiesEntity= arrayOf(
        dataSource.getAllCitiesData()[11],
        dataSource.getAllCitiesData()[4],
        dataSource.getAllCitiesData()[10],
        dataSource.getAllCitiesData()[12],
        dataSource.getAllCitiesData()[13])

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


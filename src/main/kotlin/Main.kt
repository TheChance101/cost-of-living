import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor
import interactor.GetTop10CountriesWithHighTaxOnCarbonatedDrinks

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
    val data = dataSource.getAllCitiesData()
    val getTop10CountriesWithHighTaxOnCarbonatedDrinks=GetTop10CountriesWithHighTaxOnCarbonatedDrinks(dataSource)
    println(getTop10CountriesWithHighTaxOnCarbonatedDrinks.execute(data))
    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())


}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor
import interactor.GetTopTenCoutriesHaveHighCarbonatedDrinksPrices
import interactor.GetCitiesAndYearsToBuyApartmentInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getTopTenCountriesWithHighTaxOnCarbonatedDrinks= GetTopTenCoutriesHaveHighCarbonatedDrinksPrices(dataSource)
    println(getTopTenCountriesWithHighTaxOnCarbonatedDrinks.execute(5))
    printSeparationLine()

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

    val getCitiesAndYearsToBuyApartment = GetCitiesAndYearsToBuyApartmentInteractor(dataSource)
    println(getCitiesAndYearsToBuyApartment.execute(limit = 10))
    printSeparationLine()

    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())
    printSeparationLine()



}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor
import interactor.GetTopTenCoutriesHaveHighCarbonatedDrinksPrices
import interactor.GetCitiesAndYearsToBuyApartmentInteractor
import interactor.GetTopFashionCitiesInteractor
import interactor.GetCitiesNamesSortedByCheapestBananaPrices
import interactor.*

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getTopTenCountriesWithHighTaxOnCarbonatedDrinks= GetTopTenCoutriesHaveHighCarbonatedDrinksPrices(dataSource)
    println(getTopTenCountriesWithHighTaxOnCarbonatedDrinks.execute(5))
    printSeparationLine()

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

    val getTopFashionCitiesInteractor = GetTopFashionCitiesInteractor(dataSource)
    println(getTopFashionCitiesInteractor.execute(5))
    printSeparationLine()

    val getCitiesNamesSortedByCheapestBananaPrices = GetCitiesNamesSortedByCheapestBananaPrices(dataSource)
    println(getCitiesNamesSortedByCheapestBananaPrices.execute("Caracas","Accra","Giza"))
    printSeparationLine()

    val getCitiesAndYearsToBuyApartment = GetCitiesAndYearsToBuyApartmentInteractor(dataSource)
    println(getCitiesAndYearsToBuyApartment.execute(limit = 10))
    printSeparationLine()

    val getCountryCitiesAverageSalary = GetCountryCitiesAverageSalaryInteractor(dataSource)
    println(getCountryCitiesAverageSalary.execute("Syria"))
    printSeparationLine()

    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())
    printSeparationLine()



}

private fun printSeparationLine() {
    print("\n_______________________________\n")
}


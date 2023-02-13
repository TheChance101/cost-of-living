
import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetCityHasLowestYearsToBuyApartmentInteractor
import interactor.GetCityHasCheapestMealPricesInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor
import interactor.GetSalaryAverageForCitiesInCountryInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getCityHasLowestYearsToBuyApartmentInteractor = GetCityHasLowestYearsToBuyApartmentInteractor(dataSource)
    println(getCityHasLowestYearsToBuyApartmentInteractor.execute(10,55))
    printSeparationLine()
    println(getCityHasLowestYearsToBuyApartmentInteractor.execute(7,100))
    printSeparationLine()
    println(getCityHasLowestYearsToBuyApartmentInteractor.execute(0,55))
   // val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    //println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

   // val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    //println(getCityHasCheapestInternetConnectionInteractor.execute())
    printSeparationLine()

    val getSalaryAverageForCitiesInCountryInteractor = GetSalaryAverageForCitiesInCountryInteractor(dataSource)
    println(getSalaryAverageForCitiesInCountryInteractor.execute("Egypt"))
    println(getSalaryAverageForCitiesInCountryInteractor.execute("Turkey"))
    println(getSalaryAverageForCitiesInCountryInteractor.execute("syria"))
    val getCityHasCheapestMealPricesInteractor = GetCityHasCheapestMealPricesInteractor(dataSource)
    println(getCityHasCheapestMealPricesInteractor.execute())
}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


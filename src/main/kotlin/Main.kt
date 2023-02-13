
import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetCityHasLowestYearsToBuyApartmentInteractor
import interactor.GetCityHasCheapestMealPricesInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getCityHasLowestYearsToBuyApartmentInteractor = GetCityHasLowestYearsToBuyApartmentInteractor(dataSource)
    println(getCityHasLowestYearsToBuyApartmentInteractor.execute(10,55))
    printSeparationLine()
    println(getCityHasLowestYearsToBuyApartmentInteractor.execute(7,100))
    printSeparationLine()
    println(getCityHasLowestYearsToBuyApartmentInteractor.execute(0,55))
    printSeparationLine()

    val getCityHasCheapestMealPricesInteractor = GetCityHasCheapestMealPricesInteractor(dataSource)
    println(getCityHasCheapestMealPricesInteractor.execute())
}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


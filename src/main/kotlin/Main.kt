import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.*

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

    val getCheapestApartmentsCitiesNamesInteractor = GetCheapestApartmentsCitiesNamesInteractor(dataSource)
    getCheapestApartmentsCitiesNamesInteractor.execute(10).forEach {
        println("Number of years needed to buy a 100m apartment in ${it.first} city is : " + "%.2f".format(it.second))
    }
    printSeparationLine()

    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())
    printSeparationLine()

    val getCheapestBananaPricesCitiesNamesInteractor=GetCheapestBananaPricesCitiesNamesInteractor(dataSource)
    getCheapestBananaPricesCitiesNamesInteractor.apply {
       println(execute(*getCitiesVarArgs()))
    }

}

private fun printSeparationLine() {
    print("\n_______________________________\n")
}



import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.*

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()


    //Mohamed Ragab Ali
    val gitCityNamesClothesPrices=  GetCityNamesClothesPrices(dataSource .getAllCitiesData() )
    val getTop5NamesCitiesHasClothesFamousBrandsWithSuitablePricesInteractor =   GetTop5CitiesNameHasSuitableClothesPricesInteractor ( gitCityNamesClothesPrices.execute() )
    println ( getTop5NamesCitiesHasClothesFamousBrandsWithSuitablePricesInteractor.execute() )
    printSeparationLine()

    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


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
    println(getCheapestApartmentsCitiesNamesInteractor.execute(10))
    printSeparationLine()

    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())
    printSeparationLine()

    val getCheapestBananaPricesCitiesNamesInteractor=GetCheapestBananaPricesCitiesNamesInteractor(dataSource)
    getCheapestBananaPricesCitiesNamesInteractor.apply {
       println(execute(*getCitiesVarArgs()))
    }
    printSeparationLine()

    val getBestClothesPriceCitiesNameInteractor = GetTopFiveCitiesNamesForShoppingClothesFromFamousBrandsInteractor(dataSource)
    println(getBestClothesPriceCitiesNameInteractor.execute(limit = 5))
    printSeparationLine()

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}

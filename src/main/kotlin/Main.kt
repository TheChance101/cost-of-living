import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.*
fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCitiesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())
    val cairo = City("Cairo",8)
    val madrid = City("Madrid",8)
    val manchester = City("Manchester",8)
    val berlin = City("Berlin",8)
    println(cairo.lowestPrice(berlin, cairo, madrid, manchester))

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


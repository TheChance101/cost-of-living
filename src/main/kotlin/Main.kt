import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor
import interactor.GetTheRightApartment
import interactor.GetTopFiveCitiesForFashionInteractor
fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

//    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
//    println(getHighestSalaryAverageCities.execute(limit = 10))
//    printSeparationLine()
//
//    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
//    println(getCityHasCheapestInternetConnectionInteractor.execute())
//
//   val getTheRightApartment = GetTheRightApartment(dataSource)
//    println(getTheRightApartment.getListOfDetailsOfApartment(1000))
    val getTopFiveCitiesForFashionInteractor = println(GetTopFiveCitiesForFashionInteractor(dataSource).execute(5))

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


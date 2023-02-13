import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCItyWithMealPriceBetweenTwo
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()
    val getCItyWithMealPriceBetweenTwo = GetCItyWithMealPriceBetweenTwo(dataSource)
    println(getCItyWithMealPriceBetweenTwo.execute(listOf("United States","Canada","Mexico")))


    printSeparationLine()
    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}



import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetCityHasCheapestMealPricesInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getCityHasCheapestMealPricesInteractor = GetCityHasCheapestMealPricesInteractor(dataSource)
    println(getCityHasCheapestMealPricesInteractor.execute())
}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetLowestAveragePricesForFruitsAndVegetablesInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val lowestAveragePricesForFruitsAndVegetables = GetLowestAveragePricesForFruitsAndVegetablesInteractor(dataSource)
    println(lowestAveragePricesForFruitsAndVegetables.execute(limit = 10))
    printSeparationLine()

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


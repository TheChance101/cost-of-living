import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource

fun main(args: Array<String>) {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
    startApp(dataSource)
}

fun startApp(dataSource: CostOfLivingDataSource){
    println(dataSource.getAllCitiesData())
}
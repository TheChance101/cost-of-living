import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.*
import utils.Helper

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
    Helper(dataSource).init()
}


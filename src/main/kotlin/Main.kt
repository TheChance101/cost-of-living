import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.*
import ui.UserInterface

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
    UserInterface(dataSource).init()
}


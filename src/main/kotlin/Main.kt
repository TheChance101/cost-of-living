import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource

import interactor.GetTopFiveCitiesForFashionInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
    val getTopFiveCitiesForFashionInteractor = println(GetTopFiveCitiesForFashionInteractor(dataSource).execute(5))

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


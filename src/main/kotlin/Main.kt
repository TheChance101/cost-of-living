import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor

import interactor.GetTopTenCountiresHaveHighestPricesOfCarbonatedDrinks

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
    val getTopTenCountiresHaveHighestPricesOfCarbonatedDrinks =
        GetTopTenCountiresHaveHighestPricesOfCarbonatedDrinks(dataSource)
    println(getTopTenCountiresHaveHighestPricesOfCarbonatedDrinks.getCountriesOfHighestCarbonatedDrinksPrices(
        limit = 10))
    printSeparationLine()


}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


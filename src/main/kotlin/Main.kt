import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor

import interactor.GetTopTenCountriesHaveHighestPricesOfCarbonatedDrinks

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
    val getTopTenCountriesHaveHighestPricesOfCarbonatedDrinks =
        GetTopTenCountriesHaveHighestPricesOfCarbonatedDrinks(dataSource)
    println(getTopTenCountriesHaveHighestPricesOfCarbonatedDrinks.getCountriesOfHighestCarbonatedDrinksPrices(
        limit = 10))
    printSeparationLine()


}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


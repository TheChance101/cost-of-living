import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCItyWithMealPriceBetweenTwo
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetTopTenCountriesHaveHighestPricesOfCarbonatedDrinks
import interactor.GetHighestSalaryAverageCititesNamesInteractor
import interactor.GetTheRightApartment


fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
    val getTopTenCountriesHaveHighestPricesOfCarbonatedDrinks =
        GetTopTenCountriesHaveHighestPricesOfCarbonatedDrinks(dataSource)
    println(getTopTenCountriesHaveHighestPricesOfCarbonatedDrinks.getCountriesOfHighestCarbonatedDrinksPrices(
        limit = 10))

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))

    printSeparationLine()
    val getCItyWithMealPriceBetweenTwo = GetCItyWithMealPriceBetweenTwo(dataSource)
    println(getCItyWithMealPriceBetweenTwo.execute(listOf("United States","Canada","Mexico")))

    printSeparationLine()
    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())


    val getTheRightApartment = GetTheRightApartment(dataSource)
    println(getTheRightApartment.getListOfDetailsOfApartment(1000))

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


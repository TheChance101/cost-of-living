import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetAvgFruitNVeggieInteractor
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor

import interactor.*



fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser) // CSV : comma separated values

    //1
    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

    //2
    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())
    printSeparationLine()


   val GetAvgFruitNVeggieInteractor = GetAvgFruitNVeggieInteractor(dataSource)
    println(GetAvgFruitNVeggieInteractor.execute())
    printSeparationLine()






    val getCityHasMoreSavingsPerMonthInteractor = GetCityHasMoreSavingsPerMonthInteractor(dataSource)
    println(getCityHasMoreSavingsPerMonthInteractor.execute())
    printSeparationLine()




    //3
    val getCheapestTenCitiesApartments = FindTheCheapestTenCitiesApartments(dataSource)
    println(getCheapestTenCitiesApartments.execute())
    printSeparationLine()

    //4
    val getCityThatHasAverageMealsPricesInteractor = GetCityThatHasAverageMealsPricesInteractor(dataSource)
    println(getCityThatHasAverageMealsPricesInteractor.execute())
    printSeparationLine()

    //5
    val getSalariesOfCountryCitiesInteractor = GetSalariesOfCountryCitiesInteractor(dataSource)
    println(getSalariesOfCountryCitiesInteractor.execute("Iraq"))
    printSeparationLine()

    //6
    val getTop10CountriesEnforceHighTaxesOnCarbonatedDrinks=GetTop10CountriesEnforceHighTaxesOnCarbonatedDrinks(dataSource)
    println(getTop10CountriesEnforceHighTaxesOnCarbonatedDrinks.execute())
    printSeparationLine()
}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


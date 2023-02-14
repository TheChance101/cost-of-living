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


    // bareq
    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()


    //1
    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())
    printSeparationLine()

    //2
    val GetAvgFruitNVeggieInteractor = GetAvgFruitNVeggieInteractor(dataSource)
    println(GetAvgFruitNVeggieInteractor.execute())
    printSeparationLine()

    //3
    val getSalariesOfCountryCitiesInteractor = GetSalariesOfCountryCitiesInteractor(dataSource)
    println(getSalariesOfCountryCitiesInteractor.execute("Iraq"))
    printSeparationLine()

    // 4
    val getHighestDifferanceBetweenCityCenterAndOutside=GetHighestDifferanceBetweenCityCenterAndOutside(dataSource)
    println(getHighestDifferanceBetweenCityCenterAndOutside.execute())
    printSeparationLine()

    //5



    //6
    val getCheapestTenCitiesApartments = FindTheCheapestTenCitiesApartments(dataSource)
    println(getCheapestTenCitiesApartments.execute())
    printSeparationLine()

    //7


    //8
    val getCityThatHasAverageMealsPricesInteractor = GetCityThatHasAverageMealsPricesInteractor(dataSource)
    println(getCityThatHasAverageMealsPricesInteractor.execute())
    printSeparationLine()


    //9
    val getTop10CountriesEnforceHighTaxesOnCarbonatedDrinks = GetTop10CountriesEnforceHighTaxesOnCarbonatedDrinks(dataSource)
    println(getTop10CountriesEnforceHighTaxesOnCarbonatedDrinks.execute())
    printSeparationLine()

    //10
    val getCityHasMoreSavingsPerMonthInteractor = GetCityHasMoreSavingsPerMonthInteractor(dataSource)
    println(getCityHasMoreSavingsPerMonthInteractor.execute())
    printSeparationLine()
}

private fun printSeparationLine() {
    print("\n_______________________________\n")
}


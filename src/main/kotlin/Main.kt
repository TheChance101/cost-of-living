import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import dataSource.utils.GetCityNamesClothesPrices
import enums.TheTypeOfApartments
import interactor.*
import interactor.CostOfLivingDataSource
import interactor.GetCityHasLowestYearsToBuyApartmentInteractor
import interactor.GetCityHasCheapestMealPricesInteractor
import interactor.GetSalaryAverageForCitiesInCountryInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    // region HighestSalaryAverageCities
    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()
    //endregion
    //region 1-CityHasCheapestInternetConnection
    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())
    printSeparationLine()
    //endregion
    //region 2-TopCitiesFruitsAndVegetablesLowestCost
    val getTopCitiesFruitsAndVegetablesLowestCost = GetTopCitiesFruitsAndVegetablesLowestCostInteractor(dataSource)
    println(getTopCitiesFruitsAndVegetablesLowestCost.execute(10))
    printSeparationLine()
    //endregion
    //region 3-SalaryAverageForCitiesInCountry
    val getSalaryAverageForCitiesInCountry = GetSalaryAverageForCitiesInCountryInteractor(dataSource)
    println(getSalaryAverageForCitiesInCountry.execute("Egypt"))
    println(getSalaryAverageForCitiesInCountry.execute("Turkey"))
    println(getSalaryAverageForCitiesInCountry.execute("syria"))
    printSeparationLine()
    //endregion
    //region 4-CityHasHighestDifferentRentBetweenCityCenterAndOutside
    val getCityHasHighestDifferentRentBetweenCityCenterAndOutside =
        GetCityHasHighestDifferentRentBetweenCityCenterAndOutsideInteractor(dataSource)
    println(getCityHasHighestDifferentRentBetweenCityCenterAndOutside.execute(TheTypeOfApartments.ONE_BED_ROOM))
    printSeparationLine()
    //endregion
    //region 5-Top5CitiesNameHasSuitableClothesPrices
    val gitCityNamesClothesPrices = GetCityNamesClothesPrices(dataSource.getAllCitiesData())
    val getTop5NamesCitiesHasClothesFamousBrandsWithSuitablePricesInteractor =
        GetTop5CitiesNameHasSuitableClothesPricesInteractor(gitCityNamesClothesPrices.execute())
    println(getTop5NamesCitiesHasClothesFamousBrandsWithSuitablePricesInteractor.execute())
    printSeparationLine()
    //endregion
    // region 6-CityHasLowestYearsToBuyApartment
    val getCityHasLowestYearsToBuyApartment = GetCityHasLowestYearsToBuyApartmentInteractor(dataSource)
    println(getCityHasLowestYearsToBuyApartment.execute(10, 55))
    println(getCityHasLowestYearsToBuyApartment.execute(7, 100))
    println(getCityHasLowestYearsToBuyApartment.execute(0, 55))
    printSeparationLine()
    //endregion
    //region 7-CheapestBananaCitiesNames
    val getCheapestBananaCitiesNames = GetCheapestBananaCitiesNamesInteractor(dataSource)
    println(getCheapestBananaCitiesNames.execute(dataSource.getAllCitiesData()[0].cityName))
    printSeparationLine()
    //endregion
    //region 8-CityHasCheapestMealPrices
    val getCityHasCheapestMealPrices = GetCityHasCheapestMealPricesInteractor(dataSource)
    println(getCityHasCheapestMealPrices.execute())
    printSeparationLine()
    //endregion
    //region 9-TopTenCountryEnforceHighTaxesOnCarbonatedDrinks
    val getTopTenCountryEnforceHighTaxesOnCarbonatedDrinks =
        GetTopTenCountryEnforceHighTaxesOnCarbonatedDrinksInteractor(dataSource)
    println(getTopTenCountryEnforceHighTaxesOnCarbonatedDrinks.execute(10))
    printSeparationLine()
    //endregion
    //region 10-SuitableCityMoreSavingPerMonth
    val getSuitableCityMoreSavingPerMonth = GetSuitableCityMoreSavingPerMonthInteractor(dataSource)
    println(getSuitableCityMoreSavingPerMonth.execute())
    printSeparationLine()
    //endregion

}

private fun printSeparationLine() {
    print("\n_______________________________\n")
}


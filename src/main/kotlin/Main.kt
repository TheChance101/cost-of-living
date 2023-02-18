import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import enums.TheTypeOfApartments
import interactor.*
import interactor.CostOfLivingDataSource
import interactor.GetCityHasLowestYearsToBuyApartmentInteractor
import interactor.GetCityHasAverageMealPricesInteractor
import interactor.GetSalaryAverageForCitiesInCountryInteractor
import model.CityEntity

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)


    // region HighestSalaryAverageCities
    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 5))
    printSeparationLine()
    //endregion
    //region 1-CityHasCheapestInternetConnection
    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute(100))
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
    val  numberOfCityShouldReturn = 5
    val getTop5NamesCitiesHasClothesFamousBrandsWithSuitablePricesInteractor =
        GetTop5CitiesNameHasSuitableClothesPricesInteractor(dataSource)
    println(getTop5NamesCitiesHasClothesFamousBrandsWithSuitablePricesInteractor.execute(numberOfCityShouldReturn))
    printSeparationLine()
    //endregion
    // region 6-CityHasLowestYearsToBuyApartment
    val getCityHasLowestYearsToBuyApartment = GetCityHasLowestYearsToBuyApartmentInteractor(dataSource)
    println(getCityHasLowestYearsToBuyApartment.execute(10))
    println(getCityHasLowestYearsToBuyApartment.execute(7))
    println(getCityHasLowestYearsToBuyApartment.execute(0))
    printSeparationLine()
    //endregion
    //region 7-CheapestBananaCitiesNames
    val getCheapestBananaCitiesNames = GetCheapestBananaCitiesNamesInteractor(dataSource)
    println(getCheapestBananaCitiesNames.execute(dataSource.getAllCitiesData()[0]))
    printSeparationLine()
    //endregion
    //region 8-CityHasCheapestMealPrices
    val getCityHasCheapestMealPrices = GetCityHasAverageMealPricesInteractor(dataSource)
    println(getCityHasCheapestMealPrices.execute())
    printSeparationLine()
    //endregion
    //region 9-TopTenCountryEnforceHighTaxesOnCarbonatedDrinks
    val getTopTenCountryEnforceHighTaxesOnCarbonatedDrinks =
        GetTopCountryEnforceHighTaxesOnCarbonatedDrinksInteractor(dataSource)
    println(getTopTenCountryEnforceHighTaxesOnCarbonatedDrinks.execute(10))
    printSeparationLine()
    //endregion
    //region 10-SuitableCityMoreSavingPerMonth
    val getSuitableCityMoreSavingPerMonth = GetSuitableCityMoreSavingPerMonthInteractor(dataSource)
    println(getSuitableCityMoreSavingPerMonth.execute())
    printSeparationLine()
    //endregion
    //region 11-SearchCheapestCarInCountryInteractor
    val searchCheapestCarInCountryInteractor = SearchCheapestCarInCountryInteractor(dataSource)
    println(searchCheapestCarInCountryInteractor.execute("Egypt",3))
    printSeparationLine()
    //endregion
}

private fun printSeparationLine() {
    print("\n_______________________________\n")
}


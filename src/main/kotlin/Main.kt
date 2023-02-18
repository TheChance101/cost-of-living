import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.*
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor
import interactor.GetTopCountriesHaveHighCarbonatedDrinksPricesInterctor
import interactor.GetCitiesAndYearsToBuyApartmentInteractor
import interactor.GetTopFashionCitiesInteractor
import interactor.GetCitiesNamesSortedByCheapestBananaPricesInteractor
import interactor.util.Constants.GET_CITIES_AND_YEARS_TO_BUY_APARTMENT

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getTopCountriesWithHighTaxOnCarbonatedDrinks= GetTopCountriesHaveHighCarbonatedDrinksPricesInterctor(dataSource)
    println(getTopCountriesWithHighTaxOnCarbonatedDrinks.execute(limit = 10))
    printSeparationLine()

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

    val getCityHasHighestApartmentRent= GetHighestApartmentPriceDifferenceCityInteractor(dataSource)
    println( getCityHasHighestApartmentRent.execute())
    printSeparationLine()

    val getTopFashionCities = GetTopFashionCitiesInteractor(dataSource)
    println(getTopFashionCities.execute(limit = 5))
    printSeparationLine()

    val getCitiesNamesSortedByCheapestBananaPrices = GetCitiesNamesSortedByCheapestBananaPricesInteractor(dataSource)
    println(getCitiesNamesSortedByCheapestBananaPrices.execute("Caracas","Accra","Giza"))
    printSeparationLine()

    printSeparationLine(message = GET_CITIES_AND_YEARS_TO_BUY_APARTMENT)
    val getCitiesAndYearsToBuyApartment = GetCitiesAndYearsToBuyApartmentInteractor(dataSource)
    println(getCitiesAndYearsToBuyApartment.execute(limit = 10))
    printSeparationLine()

    val getCountryCitiesAverageSalary = GetCountryCitiesAverageSalaryInteractor(dataSource)
    println(getCountryCitiesAverageSalary.execute("Syria"))
    printSeparationLine()

    val getLowCostFruitVegetableCitiesWithHighSalaries = GetLowCostFruitVegetableCitiesWithHighSalariesInteractor(dataSource)
    println(getLowCostFruitVegetableCitiesWithHighSalaries.execute())
    printSeparationLine()

    val getTheCityThatMatchManagerExpectations = GetTheCityThatMatchManagerExpectationsInteractor(dataSource)
    println(getTheCityThatMatchManagerExpectations.execute())
    printSeparationLine()

    val getCityHasCheapestInternetConnection = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnection.execute())
    printSeparationLine()


}

private fun printSeparationLine(message : String = "_") {
    print("\n_____________${message}_________________\n")
}


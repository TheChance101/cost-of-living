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
import interactor.*
import interactor.util.TypeOfApartments

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getTopCountriesWithHighTaxOnCarbonatedDrinks= GetTopCountriesHaveHighCarbonatedDrinksPricesInterctor(dataSource)
    println(getTopCountriesWithHighTaxOnCarbonatedDrinks.execute(limit = 10))
    printSeparationLine()

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

    val getHighestApartmentPriceDifferenceCity = GetHighestApartmentPriceDifferenceCityInteractor(dataSource)
    println(getHighestApartmentPriceDifferenceCity.execute(TypeOfApartments.ONE_BEDROOM))
    printSeparationLine()

    val getTopFashionCities = GetTopFashionCitiesInteractor(dataSource)
    println(getTopFashionCities.execute(limit = 5))
    printSeparationLine()

    val getCitiesNamesSortedByCheapestBananaPricesInteractor = GetCitiesNamesSortedByCheapestBananaPricesInteractor(dataSource)
    println(getCitiesNamesSortedByCheapestBananaPricesInteractor.execute("Caracas","Accra","Giza"))
    printSeparationLine()

    val getCitiesAndYearsToBuyApartment = GetCitiesAndYearsToBuyApartmentInteractor(dataSource)
    println(getCitiesAndYearsToBuyApartment.execute(limit = 10))
    printSeparationLine()

    val getCountryCitiesAverageSalary = GetCountryCitiesAverageSalaryInteractor(dataSource)
    println(getCountryCitiesAverageSalary.execute("Syria"))
    printSeparationLine()

    val getLowCostFruitVegetableCitiesWithHighSalaries = GetLowCostFruitVegetableCitiesWithHighSalariesInteractor(dataSource)
    println(getLowCostFruitVegetableCitiesWithHighSalaries.execute(10))
    printSeparationLine()

    val getTheCityThatMatchManagerExpectations = GetTheCityThatMatchManagerExpectationsInteractor(dataSource)
    println(getTheCityThatMatchManagerExpectations.execute())
    printSeparationLine()

    val getCityHasCheapestInternetConnection = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnection.execute())
    printSeparationLine()


}

private fun printSeparationLine() {
    print("\n_______________________________\n")
}


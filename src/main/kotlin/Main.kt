import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.*

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val limit = 10

    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())
    printSeparationLine()

    val getCitiesWithLowestFruitAndVegetablesAverageComparedToSalariesInteractor =
        GetCitiesWithLowestFruitAndVegetablesAverageComparedToSalariesInteractor(dataSource)
    println(getCitiesWithLowestFruitAndVegetablesAverageComparedToSalariesInteractor.execute(limit))
    printSeparationLine()

    val getHighestSalaryAverageCities = GetAverageSalariesInCountryInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute("Egypt"))
    printSeparationLine()

    val getCityWithHighestRentalPriceDifferenceInteractor =
        GetCityWithHighestRentalPriceDifferenceInteractor(dataSource)
    println(getCityWithHighestRentalPriceDifferenceInteractor.execute(dataSource.getAllCitiesData()))
    printSeparationLine()

    val getTopCitesNameInFashionTaskInteractor =
        GetTopCitesNameInFashionTaskInteractor(dataSource)
    println(getTopCitesNameInFashionTaskInteractor.execute())
    printSeparationLine()

    val getFastest10CitiesToBuyAPTInteractor = GetFastestCitiesToBuyApartmentInteractor(dataSource)
    println(getFastest10CitiesToBuyAPTInteractor.execute(limit))
    printSeparationLine()

    val  getCheapestCitiesSalesBananas = GetCheapestCitiesSalesBananas()
    println(getCheapestCitiesSalesBananas.execute(*dataSource.getAllCitiesData().toTypedArray()))
    printSeparationLine()

    val getDinnerLocationInteractor = GetDinnerLocationInteractor(dataSource)
    println(getDinnerLocationInteractor.execute())
    printSeparationLine()

    val getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor =
        GetTopCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor(dataSource)
    println(getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor.execute(limit))
    printSeparationLine()

    val getCityMakesFamilySaveMoreInteractor= GetCityMakesFamilySaveMoreInteractor(dataSource)
    println(getCityMakesFamilySaveMoreInteractor.execute())
    printSeparationLine()

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


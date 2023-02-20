import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.*
import interactor.addons.GetCheapestCityForCrookPersonInteractor
import interactor.addons.GetCheapestCityForRaisingOneChildYearlyInteractor
import interactor.addons.GetCityHasLowestCarsPriceInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val limit = 10

    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())
    printSeparationLine()

    val getCitiesWithLowestFruitAndVegetablesAverageComparedToSalariesInteractor =
        GetCitiesWithLowestFruitAndVegetablesAverageComparedToSalariesInteractor(dataSource)
        println(getCitiesWithLowestFruitAndVegetablesAverageComparedToSalariesInteractor.execute(10))
    println(getCitiesWithLowestFruitAndVegetablesAverageComparedToSalariesInteractor.execute(limit))
    printSeparationLine()

    val searchForAverageSalariesInCountryInteractor = SearchForAverageSalariesInCountryInteractor(dataSource)
    println(searchForAverageSalariesInCountryInteractor.execute("Egypt"))
    printSeparationLine()

    val getCityWithHighestRentalPriceDifferenceInteractor =
        GetCityWithHighestRentalPriceDifferenceInteractor(dataSource)
    println(getCityWithHighestRentalPriceDifferenceInteractor.execute())
    printSeparationLine()

    val getTopCitesNameInFashionTaskInteractor =
        GetTopCitesNameInFashionTaskInteractor(dataSource)
    println(getTopCitesNameInFashionTaskInteractor.execute(limit))
    printSeparationLine()


    val getFastestCitiesToBuyApartmentInteractor = GetFastestCitiesToBuyApartmentInteractor(dataSource)
    println(getFastestCitiesToBuyApartmentInteractor.execute(limit))
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


    printSeparationLine()
    printSeparationLine()
    printSeparationLine()

    val getCheapestCityForCrookPersonInteractor = GetCheapestCityForCrookPersonInteractor(dataSource)
    println(getCheapestCityForCrookPersonInteractor.execute())
    printSeparationLine()

    val getCheapestCityForRaisingOneChildYearlyInteractor = GetCheapestCityForRaisingOneChildYearlyInteractor(dataSource)
    println(getCheapestCityForRaisingOneChildYearlyInteractor.execute())
    printSeparationLine()

    val getCityHasLowestCarsPriceInteractor = GetCityHasLowestCarsPriceInteractor(dataSource)
    println(getCityHasLowestCarsPriceInteractor.execute())
    printSeparationLine()


}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


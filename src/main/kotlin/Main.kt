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
    println(getCitiesWithLowestFruitAndVegetablesAverageComparedToSalariesInteractor.execute(1))
    printSeparationLine()

    val getHighestSalaryAverageCities = GetAverageSalariesInCountryInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute("Egypt"))
    printSeparationLine()

    val getCityWithHighestRentalPriceDifferenceInteractor =
        GetCityWithHighestRentalPriceDifferenceInteractor(dataSource)
    println(getCityWithHighestRentalPriceDifferenceInteractor.execute(dataSource.getAllCitiesData()))
    printSeparationLine()

    val getTopFiveCitesNameInClothesFromFamousBrandsInteractor =
        GetTopFiveCitesNameInClothesFromFamousBrandsInteractor(dataSource)
    println(getTopFiveCitesNameInClothesFromFamousBrandsInteractor.execute())
    printSeparationLine()

    val getFastest10CitiesToBuyAPTInteractor = GetFastest10CitiesToBuyAPTInteractor(dataSource)
    println(getFastest10CitiesToBuyAPTInteractor.execute(1))
    printSeparationLine()

    val  getCheapestCitiesSalesBananas = GetCheapestCitiesSalesBananas()
    println(getCheapestCitiesSalesBananas.execute(*dataSource.getAllCitiesData().toTypedArray()))
    printSeparationLine()

    val getDinnerLocationInteractor = GetDinnerLocationInteractor(dataSource)
    println(getDinnerLocationInteractor.execute())
    printSeparationLine()

    val getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor =
        GetTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor(dataSource)
    println(getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor.execute(limit))
    printSeparationLine()

    val getCityMakesFamilySaveMoreInteractor= GetCityMakesFamilySaveMoreInteractor(dataSource)
    println(getCityMakesFamilySaveMoreInteractor.execute())
    printSeparationLine()

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


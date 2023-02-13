import dataSource.CsvDataSource
import dataSource.utils.CsvParser

import interactor.*

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
    val data = dataSource.getAllCitiesData()
    val getTop10CountriesWithHighTaxOnCarbonatedDrinks= GetTop10CountriesWithHighTaxOnCarbonatedDrinks(dataSource)
    println(getTop10CountriesWithHighTaxOnCarbonatedDrinks.execute(10,data))

    val inputCitiesEntity= arrayOf(
        dataSource.getAllCitiesData()[11],
        dataSource.getAllCitiesData()[4],
        dataSource.getAllCitiesData()[10],
        dataSource.getAllCitiesData()[12],
        dataSource.getAllCitiesData()[13])

    val lowestAveragePricesForFruitsAndVegetables = GetLowestAveragePricesForFruitsAndVegetablesInteractor(dataSource)
    println(lowestAveragePricesForFruitsAndVegetables.execute(limit = 10))
    printSeparationLine()
    
    val getCitiesNamesSortedCheapestBananPrices = GetCitiesNamesSortedCheapestBananPrices()
    println(getCitiesNamesSortedCheapestBananPrices.excute(*inputCitiesEntity))
    
    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor()
    println(getCityHasCheapestInternetConnectionInteractor.execute(data))



    val getMostSuitableCity = GetMostSuitableCityInteractor()
    val list = getMostSuitableCity.getAllCities(dataSource)
    val cityNameResult = getMostSuitableCity.execute(list)

    println(cityNameResult)

    val getCitiesNameToBuyApartmentFasterInteractor =
        GetCitiesNameToBuyApartmentFasterInteractor(dataSource)
    println(getCitiesNameToBuyApartmentFasterInteractor.execute(1000, 10, 100))
    printSeparationLine()
}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


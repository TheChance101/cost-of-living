import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCitiesNamesSortedCheapestBananPrices
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor
import interactor.GetTop10CountriesWithHighTaxOnCarbonatedDrinks
import interactor.GetMostSuitableCityInteractor

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
    val data = dataSource.getAllCitiesData()
    val getTop10CountriesWithHighTaxOnCarbonatedDrinks=GetTop10CountriesWithHighTaxOnCarbonatedDrinks(dataSource)
    println(getTop10CountriesWithHighTaxOnCarbonatedDrinks.execute(data))

    val inputCitiesEntity= arrayOf(
        dataSource.getAllCitiesData()[11],
        dataSource.getAllCitiesData()[4],
        dataSource.getAllCitiesData()[10],
        dataSource.getAllCitiesData()[12],
        dataSource.getAllCitiesData()[13])

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

    val getCitiesNamesSortedCheapestBananPrices = GetCitiesNamesSortedCheapestBananPrices()
    println(getCitiesNamesSortedCheapestBananPrices.excute(*inputCitiesEntity))


   val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor()
    println(getCityHasCheapestInternetConnectionInteractor.execute(data))



    val getMostSuitableCity = GetMostSuitableCityInteractor()
    val list = getMostSuitableCity.getAllCities(dataSource)
    val cityNameResult = getMostSuitableCity.findTheMostSuitableCity(list)

    println(cityNameResult)
}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.*

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getTheTopCitiesWhereYouCanGetAnApartmentFaster = GetTheTopCitiesWhereYouCanGetAnApartmentFaster(dataSource)
    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    val getHighestSalaryAverageCititesNamesInteractor = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    val getCItyWithMealPriceBetweenTwo = GetCItyWithMealPriceBetweenTwo(dataSource)
    val getMostSuitableSavingCityInteractor = GetMostSuitableSavingCityInteractor(dataSource)
    val getTheAverageSalaryForEachCityInTheCountryInteractor =
        GetTheAverageSalaryForEachCityInTheCountryInteractor(dataSource)
    val getTopFiveCitiesForFashionInteractor = GetTopFiveCitiesForFashionInteractor(dataSource)
    val reorderCitiesByCheapestBananaPrices = ReorderCitiesByCheapestBananaPrices(dataSource)

    println(getCItyWithMealPriceBetweenTwo.execute())
    println(getCityHasCheapestInternetConnectionInteractor.execute())
    println(getMostSuitableSavingCityInteractor.execute())
    println(getHighestSalaryAverageCititesNamesInteractor.execute(10))
    println(getTheTopCitiesWhereYouCanGetAnApartmentFaster.getListOfTopCitiesNamesAndNumberOfYearsToGetApartmentFaster(10))
    println(getTheAverageSalaryForEachCityInTheCountryInteractor.execute("Egypt"))
    println(getTopFiveCitiesForFashionInteractor.execute(5))
    println(reorderCitiesByCheapestBananaPrices.reorderTheGivenList())

}


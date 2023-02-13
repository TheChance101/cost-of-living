import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor

import interactor.GetMostSuitableSavingCityInteractor
import interactor.getTheAverageSalaryForEachCityInTheCountryInteractor


fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)


    val getMostSuitableSavingCityInteractor = GetMostSuitableSavingCityInteractor(dataSource)
    println(getMostSuitableSavingCityInteractor.execute(limit = 1))
    printSeparationLine()
    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)

    val getTheAverageSalaryForEachCityInTheCountry =getTheAverageSalaryForEachCityInTheCountryInteractor(dataSource)

    val getTheRightApartment = GetTheRightApartment(dataSource)
    println(getTheRightApartment.getListOfDetailsOfApartment(1000))


println(getTheAverageSalaryForEachCityInTheCountry.execute("Cuba"))
}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}




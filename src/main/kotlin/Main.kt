import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor
import interactor.getTheAverageSalaryForEachCityInTheCountryInteractor
import interactor.GetTheRightApartment


fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)


    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)


    val getTheAverageSalaryForEachCityInTheCountry =getTheAverageSalaryForEachCityInTheCountryInteractor(dataSource)

    val getTheRightApartment = GetTheRightApartment(dataSource)
    println(getTheRightApartment.getListOfDetailsOfApartment(1000))


println(getTheAverageSalaryForEachCityInTheCountry.execute("Cuba"))
}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}




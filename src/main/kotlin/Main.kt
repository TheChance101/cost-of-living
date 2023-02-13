import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.*

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

    val getHighestApartmentPriceDifferenceCity = GetCityHasHighestDifferenceRentBetweenCityCenterAndOutside(dataSource)
    println(getHighestApartmentPriceDifferenceCity.execute(typeOfApartments.ONE_BEDROOM))
    printSeparationLine()

    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


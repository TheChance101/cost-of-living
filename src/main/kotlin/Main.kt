import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.CostOfLivingDataSource
import interactor.GetCityHasCheapestInternetConnectionInteractor
import interactor.GetHighestSalaryAverageCititesNamesInteractor
import model.CityEntity
import model.RealEstatesPrices

fun big (datame : RealEstatesPrices):List<Float>{
    val temp = listOf(datame.apartmentOneBedroomInCityCentre,datame.apartmentOneBedroomOutsideOfCentre,datame.apartment3BedroomsInCityCentre,datame.apartment3BedroomsOutsideOfCentre)
    var big : Float  = 0f
    var s : Float =0f
    for (i in 0..4 )
    {
        if (temp[i]!! > big ){

                big = temp[i]!!
            s= i.toFloat()

        }

    }
    val end = listOf(big , s)
    return end


}

import interactor.GetMostSuitableSavingCityInteractor
import interactor.getTheAverageSalaryForEachCityInTheCountryInteractor


fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)


    val getMostSuitableSavingCityInteractor = GetMostSuitableSavingCityInteractor(dataSource)
    println(getMostSuitableSavingCityInteractor.execute(limit = 1))
    printSeparationLine()
    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)

    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())
val dataany : List<CityEntity>  = dataSource.getAllCitiesData()
    val x : Float = 0f
    var x2:CityEntity
    for (i in dataany){
        if (big(i.realEstatesPrices)[0] > x){
            print(big(i.realEstatesPrices)[0])



        }

    }
    val getTheAverageSalaryForEachCityInTheCountry =getTheAverageSalaryForEachCityInTheCountryInteractor(dataSource)

    val getTheRightApartment = GetTheRightApartment(dataSource)
    println(getTheRightApartment.getListOfDetailsOfApartment(1000))


println(getTheAverageSalaryForEachCityInTheCountry.execute("Cuba"))

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}




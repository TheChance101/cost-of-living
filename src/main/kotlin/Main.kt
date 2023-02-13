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

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

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
}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}


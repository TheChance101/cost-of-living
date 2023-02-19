import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import interactor.*
import model.CityEntity

fun main() {
    val csvParser = CsvParser()
    val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    val getHighestSalaryAverageCities = GetHighestSalaryAverageCititesNamesInteractor(dataSource)
    println(getHighestSalaryAverageCities.execute(limit = 10))
    printSeparationLine()

    val getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    println(getCityHasCheapestInternetConnectionInteractor.execute())
    printSeparationLine()


    val getTheMostExpensiveCitiesNamesIntTermOfCinemaTickets = GetTheMostExpensiveCitiesNamesIntTermOfCinemaTickets(dataSource)
    println( getTheMostExpensiveCitiesNamesIntTermOfCinemaTickets.execute(10))
    printSeparationLine()

}
private fun printSeparationLine(){
    print("\n_______________________________\n")
}
private fun excludeNullSalariesAndApartmentAndFoodThings(cityEntity: CityEntity):Boolean{
    return cityEntity.averageMonthlyNetSalaryAfterTax!=null
           && cityEntity.realEstatesPrices.apartment3BedroomsOutsideOfCentre!=null
           && cityEntity.foodPrices.loafOfFreshWhiteBread500g!=null
            && cityEntity.foodPrices.localCheese1kg!=null
            && cityEntity.foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!=null
           && cityEntity.foodPrices.chickenFillets1kg!=null
            && cityEntity.foodPrices.riceWhite1kg!=null
}
private fun savesAfterPayAllThings(cityEntity: CityEntity):Float{
    val foodPrices = cityEntity.foodPrices
    return (cityEntity.averageMonthlyNetSalaryAfterTax!!*2)-
            (foodPrices.loafOfFreshWhiteBread500g!!*30)-
            (foodPrices.localCheese1kg!!)-
            (foodPrices.beefRound1kgOrEquivalentBackLegRedMeat!!*4)-
            (foodPrices.chickenFillets1kg!!*10)-
          (foodPrices.riceWhite1kg!!*2)-
            250
}


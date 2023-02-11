package interactor
import model.DrinksPrices
import model.CityEntity

class GetTop10CountriesWithHighTaxOnCarbonatedDrinks ( private val dataSource: CostOfLivingDataSource){
    fun execute(cities:List<CityEntity>): List<Pair<String, Double>> {
        throw Throwable("Not Implemented yet")
    }
}
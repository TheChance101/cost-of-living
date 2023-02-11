package interactor

import model.CityEntity





class GetHighestCarbonatedDrinksPricesInteractor(private val dataSource: CostOfLivingDataSource)
{
    fun execute () : List<Pair<String,Double>> {

      var city : Pair<String,Double> = Pair(dataSource.getAllCitiesData().get(0).toString(),dataSource.getAllCitiesData().get(2).drinksPrices.toString().toDouble())
        val listofcities : MutableList<Pair<String,Double>> = mutableListOf(city)
        return listofcities
    }
}
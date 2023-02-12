package interactor

import model.CityEntity
import model.DrinksPrices


class GetHighestCarbonatedDrinksPricesInteractor(private val dataSource: CostOfLivingDataSource)
{
    fun execute () : List<Pair<String,Float>> {

      val city : List<CityEntity> = dataSource.getAllCitiesData().filter { nullDrinks(it) }
          val listOfCities  = sortingDescending(city)
        return pricesAvg(listOfCities)
    }

private fun nullDrinks (cityEntity: CityEntity):Boolean =
            cityEntity.drinksPrices.cappuccinoRegularInRestaurants != null &&
            cityEntity.drinksPrices.milkRegularOneLiter !=null &&
            cityEntity.drinksPrices.waterAThirdOfLiterBottleInRestaurants !=null &&
            cityEntity.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants !=null &&
            cityEntity.drinksPrices.waterOneAndHalfLiterBottleAtTheMarket !=null


private fun sortingDescending(list: List<CityEntity>) =
    list.sortedBy { avgPriceForASingleCity(it) }.take(10)



private fun pricesAvg (list: List<CityEntity>) : List<Pair<String,Float>>{
    val finalList = mutableListOf<Pair<String,Float>>()
    var avgPrice : Float
    list.forEach {
        avgPrice = avgPriceForASingleCity(it)
        finalList.add(Pair(it.country,avgPrice))
    }
    return finalList
}

private fun avgPriceForASingleCity(cityEntity: CityEntity) = cityEntity.drinksPrices.milkRegularOneLiter!! + cityEntity.drinksPrices.cappuccinoRegularInRestaurants!! +
        cityEntity.drinksPrices.waterOneAndHalfLiterBottleAtTheMarket!! + cityEntity.drinksPrices.waterAThirdOfLiterBottleInRestaurants!!+ cityEntity.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants!!
}
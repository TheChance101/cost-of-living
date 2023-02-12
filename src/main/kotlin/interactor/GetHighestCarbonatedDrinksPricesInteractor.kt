package interactor
import model.CityEntity
import model.DrinksPrices


class GetHighestCarbonatedDrinksPricesInteractor(private val dataSource: CostOfLivingDataSource)
{
    fun execute () : List<Pair<String,Float>> {

        val city : List<CityEntity> = dataSource.getAllCitiesData()
            .filter { nullAndLowQualityDrinks(it) }
            .sortedByDescending { avgPriceForASingleCity(it) }
            .take(10)


        return if
                       (city.isEmpty())
        { emptyList()
        }// listOf(Pair("no countries Found",0.0f))
        else {pricesAvg(city)}
    }

    private fun nullAndLowQualityDrinks (cityEntity: CityEntity):Boolean =

        cityEntity.drinksPrices.cappuccinoRegularInRestaurants != null &&
                cityEntity.drinksPrices.milkRegularOneLiter !=null &&
                cityEntity.drinksPrices.waterAThirdOfLiterBottleInRestaurants !=null &&
                cityEntity.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants !=null &&
                cityEntity.drinksPrices.waterOneAndHalfLiterBottleAtTheMarket !=null &&
                cityEntity.dataQuality


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
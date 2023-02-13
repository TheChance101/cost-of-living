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


        return if (city.isEmpty())
        { emptyList()
        }
        else {pricesAvg(city)}
    }

    private fun nullAndLowQualityDrinks(cityEntity: CityEntity): Boolean =

        cityEntity.drinksPrices.cappuccinoRegularInRestaurants != null &&
                cityEntity.drinksPrices.milkRegularOneLiter != null &&
                cityEntity.drinksPrices.waterAThirdOfLiterBottleInRestaurants != null &&
                cityEntity.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants != null &&
                cityEntity.drinksPrices.waterOneAndHalfLiterBottleAtTheMarket != null &&
                cityEntity.dataQuality


    private fun pricesAvg(list: List<CityEntity>): List<Pair<String, Float>> {
        val finalList = mutableListOf<Pair<String, Float>>()
        val setofcountries = mutableSetOf<Pair<String, Float>>()
        var avgPrice: Float
        list.forEach {
            avgPrice = avgPriceForASingleCity(it)
            setofcountries.add(Pair(it.country, avgPrice))
        }
        return setofcountries.toList()
    }

    // function to return the average prices for only one city
    private fun avgPriceForASingleCity(cityEntity: CityEntity) = (cityEntity.drinksPrices.milkRegularOneLiter!! +
            cityEntity.drinksPrices.cappuccinoRegularInRestaurants!! +
            cityEntity.drinksPrices.waterOneAndHalfLiterBottleAtTheMarket!! +
            cityEntity.drinksPrices.waterAThirdOfLiterBottleInRestaurants!! +
            cityEntity.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants!!) / 5

    //a function to return the average prices for a whole country
    private fun avgpriceforacountry(list: List<CityEntity>): Float {
        var listofprices = mutableListOf<Float>()
        var finalvalue : Float = 0f
        list.forEach {
            listofprices.add(avgPriceForASingleCity(it))
        }
        listofprices.forEach{
            finalvalue += it
        }
    return finalvalue/listofprices.size
    }

    //
    private fun pricesforacoutry
}
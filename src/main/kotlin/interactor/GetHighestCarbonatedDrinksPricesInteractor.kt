package interactor

import model.CityEntity
import model.DrinksPrices


class GetHighestCarbonatedDrinksPricesInteractor(private val dataSource: CostOfLivingDataSource) {
    fun execute(): Set<Pair<String, Float>> {

        val city: List<CityEntity> = dataSource.getAllCitiesData()
            .filter { nullAndLowQualityDrinks(it) }
            .sortedByDescending { avgPriceForASingleCity(it) }

        return if (city.isEmpty()) {
            emptySet()
        } else {
            finalList(city)
        }
    }

    private fun nullAndLowQualityDrinks(cityEntity: CityEntity): Boolean =

        cityEntity.drinksPrices.cappuccinoRegularInRestaurants != null &&
                cityEntity.drinksPrices.milkRegularOneLiter != null &&
                cityEntity.drinksPrices.waterAThirdOfLiterBottleInRestaurants != null &&
                cityEntity.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants != null &&
                cityEntity.drinksPrices.waterOneAndHalfLiterBottleAtTheMarket != null &&
                cityEntity.dataQuality


    // function to return the average prices for only one city
    private fun avgPriceForASingleCity(cityEntity: CityEntity) = (cityEntity.drinksPrices.milkRegularOneLiter!! +
            cityEntity.drinksPrices.cappuccinoRegularInRestaurants!! +
            cityEntity.drinksPrices.waterOneAndHalfLiterBottleAtTheMarket!! +
            cityEntity.drinksPrices.waterAThirdOfLiterBottleInRestaurants!! +
            cityEntity.drinksPrices.cokePepsiAThirdOfLiterBottleInRestaurants!!) / 5

    //a function to return the average prices for a whole country
    private fun avgpriceforacountry(list: List<CityEntity>): Float {
        val listofprices = mutableListOf<Float>()
        var finalvalue = 0f
        list.forEach {
            listofprices.add(avgPriceForASingleCity(it))
        }
        listofprices.forEach {
            finalvalue += it
        }
        return  finalvalue / listofprices.size
    }

    // function to sort the list into a sorted set and return a list of 10 countries
    fun finalList(list: List<CityEntity>) :Set<Pair<String,Float>> {
        val finallist = mutableListOf<Pair<String, Float>>()
        list.forEach { cityEntity ->
            finallist .add(Pair(cityEntity.country,avgpriceforacountry(list.filter{cityEntity.country ==it.country })))

        }
        return finallist.toSet().take(10).toSet()
    }
}

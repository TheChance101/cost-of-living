package interactor

import model.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class GetCitiesHasLowestFruitVegPricesComparingSalariesPaidTest {

    val list:List<CityEntity> = listOf(
        CityEntity("Baghdad","Iraq", MealsPrices(null,null,null)
        , DrinksPrices(null,null,null,null,null)
        , FruitAndVegetablesPrices(1F,1.5F,1F,0.4F,0.5F,0.6F,2.7F)
        , FoodPrices(null,null,null,null,null,null)
        , ServicesPrices(null,null,null,null,null,null,null,null,)
        , ClothesPrices(null,null,null,null)
        , TransportationsPrices(null,null,null,null,null,null)
        , CarsPrices(null,null)
        , RealEstatesPrices(null,null,null,null,null,null)
        ,800F
        ,true
        )
        ,CityEntity("Doha","Qatar", MealsPrices(null,null,null)
            , DrinksPrices(null,null,null,null,null)
            , FruitAndVegetablesPrices(2F,2.5F,1.5F,1.4F,1.5F,3.6F,3.7F)
            , FoodPrices(null,null,null,null,null,null)
            , ServicesPrices(null,null,null,null,null,null,null,null,)
            ,ClothesPrices(null,null,null,null)
            ,TransportationsPrices(null,null,null,null,null,null)
            ,CarsPrices(null,null)
            ,RealEstatesPrices(null,null,null,null,null,null)
            ,3600F
            ,true
        )
        ,CityEntity("Ciro","Egypt", MealsPrices(null,null,null)
            , DrinksPrices(null,null,null,null,null)
            , FruitAndVegetablesPrices(1F,1.5F,1F,0.4F,0.5F,0.6F,2.7F)
            , FoodPrices(null,null,null,null,null,null)
            , ServicesPrices(null,null,null,null,null,null,null,null,)
            ,ClothesPrices(null,null,null,null)
            ,TransportationsPrices(null,null,null,null,null,null)
            ,CarsPrices(null,null)
            ,RealEstatesPrices(null,null,null,null,null,null)
            ,500F
            ,true
        )
        ,CityEntity("Reyad","Saudi", MealsPrices(null,null,null)
            , DrinksPrices(null,null,null,null,null)
            , FruitAndVegetablesPrices(1F,1.5F,1F,0.4F,0.5F,0.6F,2.7F)
            , FoodPrices(null,null,null,null,null,null)
            , ServicesPrices(null,null,null,null,null,null,null,null,)
            ,ClothesPrices(null,null,null,null)
            ,TransportationsPrices(null,null,null,null,null,null)
            ,CarsPrices(null,null)
            ,RealEstatesPrices(null,null,null,null,null,null)
            ,1700F
            ,true
        )
        ,CityEntity("Dubai","UAE", MealsPrices(null,null,null)
            , DrinksPrices(null,null,null,null,null)
            , FruitAndVegetablesPrices(1F,1.5F,1F,0.4F,0.5F,0.6F,2.7F)
            , FoodPrices(null,null,null,null,null,null)
            , ServicesPrices(null,null,null,null,null,null,null,null,)
            , ClothesPrices(null,null,null,null)
            , TransportationsPrices(null,null,null,null,null,null)
            , CarsPrices(null,null)
            , RealEstatesPrices(null,null,null,null,null,null)
            ,3400F
            ,true
        )
        ,CityEntity("Kuwit","Kuwit", MealsPrices(null,null,null)
            , DrinksPrices(null,null,null,null,null)
            , FruitAndVegetablesPrices(2F,2.5F,1.5F,1.4F,1.5F,3.6F,3.7F)
            , FoodPrices(null,null,null,null,null,null)
            , ServicesPrices(null,null,null,null,null,null,null,null,)
            ,ClothesPrices(null,null,null,null)
            ,TransportationsPrices(null,null,null,null,null,null)
            ,CarsPrices(null,null)
            ,RealEstatesPrices(null,null,null,null,null,null)
            ,4600F
            ,true
        )
        ,CityEntity("Qudis","Palistine", MealsPrices(null,null,null)
            , DrinksPrices(null,null,null,null,null)
            , FruitAndVegetablesPrices(1F,1.5F,1F,0.4F,0.5F,0.6F,2.7F)
            , FoodPrices(null,null,null,null,null,null)
            , ServicesPrices(null,null,null,null,null,null,null,null,)
            ,ClothesPrices(null,null,null,null)
            ,TransportationsPrices(null,null,null,null,null,null)
            ,CarsPrices(null,null)
            ,RealEstatesPrices(null,null,null,null,null,null)
            ,600F
            ,true
        )
        ,CityEntity("Paris","France", MealsPrices(null,null,null)
            , DrinksPrices(null,null,null,null,null)
            , FruitAndVegetablesPrices(1F,1.5F,1F,0.4F,0.5F,0.6F,2.7F)
            , FoodPrices(null,null,null,null,null,null)
            , ServicesPrices(null,null,null,null,null,null,null,null,)
            ,ClothesPrices(null,null,null,null)
            ,TransportationsPrices(null,null,null,null,null,null)
            ,CarsPrices(null,null)
            ,RealEstatesPrices(null,null,null,null,null,null)
            ,2700F
            ,true
        )
        ,CityEntity("London","England", MealsPrices(null,null,null)
            , DrinksPrices(null,null,null,null,null)
            , FruitAndVegetablesPrices(1F,1.5F,1F,0.4F,0.5F,0.6F,2.7F)
            , FoodPrices(null,null,null,null,null,null)
            , ServicesPrices(null,null,null,null,null,null,null,null,)
            , ClothesPrices(null,null,null,null)
            , TransportationsPrices(null,null,null,null,null,null)
            , CarsPrices(null,null)
            , RealEstatesPrices(null,null,null,null,null,null)
            ,2700F
            ,true
        )
        ,CityEntity("Tahran","Iran", MealsPrices(null,null,null)
            , DrinksPrices(null,null,null,null,null)
            , FruitAndVegetablesPrices(2F,2.5F,1.5F,1.4F,1.5F,3.6F,3.7F)
            , FoodPrices(null,null,null,null,null,null)
            , ServicesPrices(null,null,null,null,null,null,null,null,)
            ,ClothesPrices(null,null,null,null)
            ,TransportationsPrices(null,null,null,null,null,null)
            ,CarsPrices(null,null)
            ,RealEstatesPrices(null,null,null,null,null,null)
            ,400F
            ,true
        )
        ,CityEntity("Mexico","Mexico", MealsPrices(null,null,null)
            , DrinksPrices(null,null,null,null,null)
            , FruitAndVegetablesPrices(1F,1.5F,1F,0.4F,0.5F,0.6F,2.7F)
            , FoodPrices(null,null,null,null,null,null)
            , ServicesPrices(null,null,null,null,null,null,null,null,)
            ,ClothesPrices(null,null,null,null)
            ,TransportationsPrices(null,null,null,null,null,null)
            ,CarsPrices(null,null)
            ,RealEstatesPrices(null,null,null,null,null,null)
            ,1600F
            ,true
        )
        ,CityEntity("Madrid","Spain", MealsPrices(null,null,null)
            , DrinksPrices(null,null,null,null,null)
            , FruitAndVegetablesPrices(1F,1.5F,1F,0.4F,0.5F,0.6F,2.7F)
            , FoodPrices(null,null,null,null,null,null)
            , ServicesPrices(null,null,null,null,null,null,null,null,)
            ,ClothesPrices(null,null,null,null)
            ,TransportationsPrices(null,null,null,null,null,null)
            ,CarsPrices(null,null)
            ,RealEstatesPrices(null,null,null,null,null,null)
            ,2500F
            ,true
        )
    )
// Iran and Egypt should not be in the list
    @Test
    fun shouldReturnCorrectResultWhenCorrectListIsGiven() {
    //given
    val innerList = list
    // when

    //then

    }
}
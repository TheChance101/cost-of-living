package interactor

import model.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCitiesHasLowestFruitVegPricesComparingSalariesPaidTest {
    lateinit var getCities: GetCitiesHasLowestFruitVegPricesComparingSalariesPaid

    val list:List<CityEntity> = listOf(
        CityEntity("Baghdad","Iraq", MealsPrices(null,null,null)
        , DrinksPrices(null,null,null,null,null)
            , FruitAndVegetablesPrices(2F,2.5F,1.5F,1.4F,1.5F,3.6F,3.7F)
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
            , FruitAndVegetablesPrices(2F,2.5F,1.5F,1.4F,1.5F,3.6F,3.7F)
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
            , FruitAndVegetablesPrices(2F,2.5F,1.5F,1.4F,1.5F,3.6F,3.7F)
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
            , FruitAndVegetablesPrices(2F,2.5F,1.5F,1.4F,1.5F,3.6F,3.7F)
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
            , FruitAndVegetablesPrices(2F,2.5F,1.5F,1.4F,1.5F,3.6F,3.7F)
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
            , FruitAndVegetablesPrices(2F,2.5F,1.5F,1.4F,1.5F,3.6F,3.7F)
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
            , FruitAndVegetablesPrices(2F,2.5F,1.5F,1.4F,1.5F,3.6F,3.7F)
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
            , FruitAndVegetablesPrices(2F,2.5F,1.5F,1.4F,1.5F,3.6F,3.7F)
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
            , FruitAndVegetablesPrices(2F,2.5F,1.5F,1.4F,1.5F,3.6F,3.7F)
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
// all cities have same fruit-veg prices but different salaries
// Iran and Egypt should not be in the new list after the test

    val correctTestedList = list.filter { it.cityName != "Ciro" && it.cityName != "Tahran" }
    @BeforeAll
    fun setup(){
        getCities = GetCitiesHasLowestFruitVegPricesComparingSalariesPaid(list)
    }

    @Test
    fun shouldReturnCorrectResultWhenCorrectListIsGiven() {
    //given correct list that has more than 10 objects of CityEntity
    val innerList = list
    // when find 10 cities that has lowest fruitVeg prices comparing to salaries paid there
        val listToTest = getCities.execute()
    //then
        assertEquals(correctTestedList,listToTest)
    }
}
package interactor

import model.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class GetCheapestCitiesSalesBananasTest {
    @Test
    fun should_ReturnCorrectCities_When_PassingCorrectData() {
        //given
        val args = arrayOf(
            CityEntity(
                "City1",
                "Country1",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, 50f, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                5000f,
                false
            ),
            CityEntity(
                "City2",
                "Country1",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, 80f, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                5000f,
                false
            ),
            CityEntity(
                "City4",
                "Country1",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, 300f, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                5000f,
                false
            ),
            CityEntity(
                "City6",
                "Country4",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, 10f, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                5000f,
                false
            ),
        )
        val expected = listOf("City6", "City1", "City2", "City4")
        //when
        val getCheapestCitiesSalesBananas = GetCheapestCitiesSalesBananas()
        val result = getCheapestCitiesSalesBananas.execute(*args)
        val citiesNameOfTheResult = result.map { it.cityName }
        //then
        assertEquals(expected, citiesNameOfTheResult)
    }
    @Test
    fun should_ReturnFalse_When_PassingNullBananas(){
        //given
        val fruitAndVegetablesPrice= FruitAndVegetablesPrices(null, null, null, null, null, null, null)
        //when
        val result = excludeNullBananas(fruitAndVegetablesPrice)
        //then
        assertFalse(result)
    }
    @Test
    fun should_ReturnCitiesWithoutCitiesThatHaveNullBanana_When_PassingCitiesWithNullAndWithout(){
        val args = arrayOf(
            CityEntity(
                "City1",
                "Country1",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, 50f, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                5000f,
                false
            ),
            CityEntity(
                "City2",
                "Country1",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, 80f, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                5000f,
                false
            ),
            CityEntity(
                "City4",
                "Country1",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, 300f, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                5000f,
                false
            ),
            CityEntity(
                "City6",
                "Country4",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, 10f, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                5000f,
                false
            ),
            CityEntity(
                "City20",
                "Country4",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                5000f,
                false
            ),
            CityEntity(
                "City64",
                "Country4",
                MealsPrices(null, null, null),
                DrinksPrices(null, null, null, null, null),
                FruitAndVegetablesPrices(null, null, null, null, null, null, null),
                FoodPrices(null, null, null, null, null, null),
                ServicesPrices(null, null, null, null, null, null, null, null),
                ClothesPrices(null, null, null, null),
                TransportationsPrices(null, null, null, null, null, null),
                CarsPrices(null, null),
                RealEstatesPrices(null, null, null, null, null, null),
                5000f,
                false
            ),
        )
        val expected = listOf("City6", "City1", "City2", "City4")
        //when
        val getCheapestCitiesSalesBananas = GetCheapestCitiesSalesBananas()
        val result = getCheapestCitiesSalesBananas.execute(*args)
        val citiesNameOfTheResult = result.map { it.cityName }
        //then
        assertEquals(expected, citiesNameOfTheResult)
    }

}
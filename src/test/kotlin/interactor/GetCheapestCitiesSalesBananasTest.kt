package interactor

import fakeDataSource.GetCheapestCitiesSalesBananasFakeData
import model.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class GetCheapestCitiesSalesBananasTest {

    private val cheapestCitiesSalesBananas = GetCheapestCitiesSalesBananasFakeData()

    @Test
    fun should_ReturnCorrectCities_When_PassingCorrectData() {
        //given
        val args = cheapestCitiesSalesBananas.getCorrectValidData()
        val expected = cheapestCitiesSalesBananas.getResultForValidData()
        //when
        val getCheapestCitiesSalesBananas = GetCheapestCitiesSalesBananas()
        val result = getCheapestCitiesSalesBananas.execute(*args)
        //then
        assertEquals(expected, result)
    }

    @Test
    fun should_ReturnFalse_When_PassingNullBananas() {
        //given
        val fruitAndVegetablesPrice = FruitAndVegetablesPrices(null, null, null, null, null, null, null)
        //when
        val result = excludeNullBananas(fruitAndVegetablesPrice)
        //then
        assertFalse(result)
    }

    @Test
    fun should_ReturnCitiesWithoutCitiesThatHaveNullBanana_When_PassingCitiesWithNullAndWithoutNullBananaPrice() {
        val args = cheapestCitiesSalesBananas.getVariousCitiesData()
        val expected = cheapestCitiesSalesBananas.getResultForVariousCitiesData()
        //when
        val getCheapestCitiesSalesBananas = GetCheapestCitiesSalesBananas()
        val result = getCheapestCitiesSalesBananas.execute(*args)
        //then
        assertEquals(expected, result)
    }

}
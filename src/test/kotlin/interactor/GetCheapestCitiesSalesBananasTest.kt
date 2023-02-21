package interactor

import data.FakeDataSourceForTestCase
import fakeDataSource.FakeDataSourceForGetCheapestCitiesSalesBananas

import model.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class GetCheapestCitiesSalesBananasTest {

    private val cheapestCitiesSalesBananas = FakeDataSourceForGetCheapestCitiesSalesBananas()

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

    @Test
    fun should_ReturnSortedList_WhenTheInputIsMultiCityAllIncludedInDifferentCases() {
        // given multi city all of this is included
        val cities = FakeDataSourceForTestCase.filterCity("Santiago de Cuba", "Sancti Spiritus")

        // when the output is list of sorted cities by Banana Price
        val getCheapestCitiesSalesBananas = GetCheapestCitiesSalesBananas()
        val result = getCheapestCitiesSalesBananas.execute(*cities)

        // then check
        assertEquals(listOf("Santiago de Cuba", "Sancti Spiritus"), result)
    }

}
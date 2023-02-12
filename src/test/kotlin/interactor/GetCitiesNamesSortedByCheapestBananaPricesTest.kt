package interactor

import FakeData
import model.CityEntity
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.function.Executable
import kotlin.test.assertEquals

class GetCitiesNamesSortedByCheapestBananaPricesTest {

    private lateinit var fakeData: FakeData
    private lateinit var getCitiesNamesSortedByCheapestBananaPrices: GetCitiesNamesSortedByCheapestBananaPrices

    @BeforeEach
    fun setUp() {
        fakeData = FakeData()
        getCitiesNamesSortedByCheapestBananaPrices = GetCitiesNamesSortedByCheapestBananaPrices(fakeData)
    }

    @Test
    fun should_ReturnListOfCorrectCitiesName_When_HaveCorrectListWithUpperCase() {
        //given list of cities with upper case
        val cities = listOf("Caracas","Accra","Giza")
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute(*cities.toTypedArray())
        val expectedResult = listOf("Giza", "Accra", "Caracas")
        //Then
        assertEquals(expectedResult,result)
    }
    @Test
    fun should_ReturnCorrectCitiesName_When_HaveCorrectListWithLowerCase() {
        //given list of cities with lower case
        val cities = listOf("caracas","accra","giza")
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute(*cities.toTypedArray())
        val expectedResult = listOf("Giza", "Accra", "Caracas")
        //Then
        assertEquals(expectedResult,result)
    }
    @Test
    fun should_ReturnListOfCorrectCitiesName_When_HaveSpaceAtTheEndAndTheStartOfCityName() {
        //given a list of cities name with space at the end or the start or both
        val cities = listOf(" caracas ","accra "," giza")
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute(*cities.toTypedArray())
        val expectedResult = listOf("Giza", "Accra", "Caracas")
        //Then
        assertEquals(expectedResult,result)
    }
    @Test
    fun should_ReturnCorrectListOfCitiesName_When_CitiesNameHaveLowerAndUpperCase() {
        //given list of cities with lower and upper case
        val cities = listOf("CarAcas","ACCRA","giZA")
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute(*cities.toTypedArray())
        val expectedResult = listOf("Giza", "Accra", "Caracas")
        //Then
        assertEquals(expectedResult,result)
    }
    @Test
    fun should_ReturnEmptyList_When_HaveEmptyList() {
        //given empty list
        val cities = listOf<String>()
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute(*cities.toTypedArray())
        val expectedResult: List<String> = emptyList()
        //Then
        assertEquals(expectedResult,result)
    }
    @Test
    fun should_ReturnCorrectSortedByTheCheapestBananaList_When_HaveCorrectCitiesName() {
        //given list of correct cities name
        val cities = listOf("Caracas","Accra","Giza")
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute(*cities.toTypedArray())
        val expectedResult = listOf("Giza", "Accra", "Caracas")
        //Then
        assertEquals(expectedResult,result)
    }

}

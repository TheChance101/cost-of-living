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
    fun should_returnListOfCorrectCitiesName_when_haveCorrectListWithUpperCase() {
        //given list of cities with upper case
        val cities = listOf("Caracas","Accra","Giza")
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute(*cities.toTypedArray())
        val expectedResult = listOf("Giza", "Accra", "Caracas")
        //Then
        assertEquals(expectedResult,result)
    }
    @Test
    fun should_returnCorrectCitiesName_when_haveCorrectListWithLowerCase() {
        //given list of cities with lower case
        val cities = listOf("caracas","accra","giza")
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute(*cities.toTypedArray())
        val expectedResult = listOf("Giza", "Accra", "Caracas")
        //Then
        assertEquals(expectedResult,result)
    }
    @Test
    fun should_returnListOfCorrectCitiesName_when_haveSpaceAtTheEndAndTheStartOfCityName() {
        //given a list of cities name with space at the end or the start or both
        val cities = listOf(" caracas ","accra "," giza")
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute(*cities.toTypedArray())
        val expectedResult = listOf("Giza", "Accra", "Caracas")
        //Then
        assertEquals(expectedResult,result)
    }
    @Test
    fun should_returnCorrectListOfCitiesName_when_citiesNameHaveLowerAndUpperCase() {
        //given list of cities with lower and upper case
        val cities = listOf("CarAcas","ACCRA","giZA")
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute(*cities.toTypedArray())
        val expectedResult = listOf("Giza", "Accra", "Caracas")
        //Then
        assertEquals(expectedResult,result)
    }
    @Test
    fun should_returnEmptyList_when_haveEmptyList() {
        //given empty list
        val cities = listOf<String>()
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute(*cities.toTypedArray())
        val expectedResult: List<String> = emptyList()
        //Then
        assertEquals(expectedResult,result)
    }
    @Test
    fun should_returnCorrectSortedByTheCheapestBananaList_when_haveCorrectCitiesName() {
        //given list of correct cities name
        val cities = listOf("Caracas","Accra","Giza")
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute(*cities.toTypedArray())
        val expectedResult = listOf("Giza", "Accra", "Caracas")
        //Then
        assertEquals(expectedResult,result)
    }

}

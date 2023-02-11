package interactor

import FakeData
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
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
    fun should_return_citesName_when_enter_correct_list() {
        //give list of cites with upper case
        val cites = listOf("Caracas","Accra","Giza")
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute(*cites.toTypedArray())
        //Then
        assertEquals(listOf("Giza", "Accra", "Caracas"),result)
    }
    @Test
    fun should_return_citesName_when_enter_lowerCaseOrUpperCaseValue() {
        //give list of cites with lower case
        val cites = listOf("caracas","accra","giza")
        //when
        val result = getCitiesNamesSortedByCheapestBananaPrices.execute(*cites.toTypedArray())
        //Then
        assertEquals(listOf("Giza", "Accra", "Caracas"),result)
    }


}
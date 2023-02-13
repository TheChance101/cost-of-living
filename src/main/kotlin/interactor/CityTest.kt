package interactor

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CityTest {

    lateinit var city : City
    @BeforeAll
    fun setup(){
        city = City("",0)
    }
    @Test
    fun should_ReturnTheCitiesOrderDescendingByBananasPrice_When_EnteringCities() {
        //given
        val newYork = City("New York", 7)
        val cairo = City("Cairo", 5)
        val madrid = City("Madrid", 6)
        val manchester = City("Manchester", 10)
        //when
        val expectedResult = listOf("Cairo", "Madrid", "New York", "Manchester")
        val actualResult = city.lowestPrice(newYork, cairo, madrid, manchester)
        //then
        assertEquals(expectedResult, actualResult)
    }
}
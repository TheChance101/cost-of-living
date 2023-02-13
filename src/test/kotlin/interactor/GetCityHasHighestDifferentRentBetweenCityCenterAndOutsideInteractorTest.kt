package interactor

import fakeData.FakeData
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNull
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasHighestDifferentRentBetweenCityCenterAndOutsideInteractorTest {


    lateinit var converter: GetCityHasHighestDifferentRentBetweenCityCenterAndOutsideInteractor
    lateinit var fakedata: FakeData

    @BeforeAll
    fun setUp() {
        fakedata = FakeData()
        converter = GetCityHasHighestDifferentRentBetweenCityCenterAndOutsideInteractor(fakedata)

    }

    @Test
    fun should_ReturnCorrectCity_When_TypeOne() {
        //given
        val type = 1

        //when find the city with the Highest different rent
        val city = converter.execute(type)
        //then
        assertEquals("Sancti Spiritus", city)
    }

    @Test
    fun should_ReturnCorrectCity_When_TypeTwo() {
        //given
        val type = 2

        //when find the city with the Highest different rent
        val city = converter.execute(type)
        //then
        assertEquals("Solue", city)
    }

    @Test
    fun should_ReturnNull_When_TypeNotCorrect() {
        //given
        val type = 3

        //when find the city with the Highest different rent
        val city = converter.execute(type)
        //then
        assertNull(city)
    }

}
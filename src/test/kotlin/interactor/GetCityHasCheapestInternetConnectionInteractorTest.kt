package interactor

import fakeData.FakeData
import io.mockk.every
import org.junit.jupiter.api.Test
import io.mockk.mockk
import model.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityHasCheapestInternetConnectionInteractorTest {

    lateinit var fakedata: FakeData
    lateinit var converter : GetCityHasCheapestInternetConnectionInteractor


    @BeforeAll
    fun setUp(){
        fakedata= FakeData()
        converter=GetCityHasCheapestInternetConnectionInteractor(fakedata)

    }


    @Test
    fun `should return cheapest city When  enter list of cities`() {
        // given
     val cities=fakedata.getAllCitiesData()
        // when
        val city = converter.execute(cities)

        // then
        assertEquals(cities[4], city)
    }


    @Test
    fun `should return the same city When enter one city`() {
        // given
        val cities=fakedata.getAllCitiesData()[2]
        // when
        val city = converter.execute(listOf(cities))

        // then
        assertEquals(cities, city)
    }
    @Test
    fun `should return throw exception When list is empty`() {
        // given
        val cities= emptyList<CityEntity>()
        // when
        val city = Executable {converter.execute(cities)}

        // then
        assertThrows(IllegalArgumentException::class.java,city)
    }



}
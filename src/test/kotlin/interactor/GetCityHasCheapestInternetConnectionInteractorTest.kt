package interactor

import fakeData.FakeData

import org.junit.jupiter.api.Test

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
        // when
        val city = converter.execute()

        // then
        assertEquals(fakedata.getAllCitiesData()[4], city)
    }






}
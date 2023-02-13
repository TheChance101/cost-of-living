package interactor

import fakedata.FakeFullData
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance


@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class GetSuitableClothesPriceCitiesNameInteractorTest {
    private lateinit var fakeFullData : FakeFullData

    @BeforeAll
    fun setup()
    {
        fakeFullData= FakeFullData()

    }
    @Test
    fun should_ReturnTop5CitiesName_When_EnterListOfCitiesWithFullData() {
        //given list of five city
        val listOfCities =GetSuitableClothesPriceCitiesNameInteractor(fakeFullData)
        //when find top 5cities for suitable price
        val topFiveCities =listOfCities.execute(5)
        //then check the result
        assertEquals(listOf("aswan","Giza","tanta","alexandria","cairo"),topFiveCities)
    }
}
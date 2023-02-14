package interactor

import enums.TheTypeOfApartments
import fakeData.FakeData
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasHighestDifferentRentBetweenCityCenterAndOutsideInteractorTest {


    lateinit var highestDifferentRent: GetCityHasHighestDifferentRentBetweenCityCenterAndOutsideInteractor
    lateinit var fakedata: FakeData

    @BeforeAll
    fun setUp() {
        fakedata = FakeData()
        highestDifferentRent = GetCityHasHighestDifferentRentBetweenCityCenterAndOutsideInteractor(fakedata)

    }

    @Test
    fun should_ReturnCorrectCity_When_TypeOne() {
        //given the type of the apartment
        val type = TheTypeOfApartments.ONE_BED_ROOM

        //when find the city with the Highest different rent
        val city = highestDifferentRent.execute(type)
        //then
        assertEquals(fakedata.getAllCitiesData()[1], city)
    }

    @Test
    fun should_ReturnCorrectCity_When_TypeTwo() {
        //given the type of the apartment
        val type = TheTypeOfApartments.THREE_BED_ROOMS

        //when find the city with the Highest different rent
        val city = highestDifferentRent.execute(type)
        //then
        assertEquals(fakedata.getAllCitiesData()[4], city)
    }


}
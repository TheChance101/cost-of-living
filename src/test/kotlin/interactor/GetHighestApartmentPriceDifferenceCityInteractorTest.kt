package interactor
import FakeData
import interactor.util.TypeOfApartments
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetHighestApartmentPriceDifferenceCityInteractorTest {

    // create an object from FakeData class
    private lateinit var fakeData: FakeData
    private lateinit var getHighestApartmentPrice: GetHighestApartmentPriceDifferenceCityInteractor

    @BeforeEach
    fun setUp() {
        fakeData = FakeData()
        getHighestApartmentPrice = GetHighestApartmentPriceDifferenceCityInteractor(fakeData)
    }

    @Test
    fun should_ReturnHighestRentDifference_When_OneBedRoomSelect() {
        //given the type of the apartment
        val type = TypeOfApartments.ONE_BEDROOM

        //when find the city with the Highest different rent
        val city = getHighestApartmentPrice.execute(type)
        //then
        assertEquals(fakeData.getAllCitiesData()[1], city)
    }

    @Test
    fun should_ReturnHighestRentDifference_When_ThreeBedRoomSelect() {
        //given the type of the apartment
        val type = TypeOfApartments.THREE_BEDROOMS

        //when find the city with the Highest different rent
        val result = getHighestApartmentPrice.execute(type)
        //then
        assertEquals(fakeData.getAllCitiesData()[1], result)
    }

    @Test
    fun should_ReturnNull_When_theTypeIsMissing() {
        // given an invalid type
        val type = null
        // when check if the type is missing
        val result = type?.let { getHighestApartmentPrice.execute(it) }
        // then check the result
        assertNull(result)
    }

    @Test
    fun should_ReturnDefaultCity_When_TheCitiesMissing() {
        // given a missing cities
        val type = null
        val defaultCity = "default"
        // when check if the highest city with invalid type
        val result = type?.let { getHighestApartmentPrice.execute(it) } ?: defaultCity
        // then check if the result is the default city
        assertEquals(defaultCity, result)
    }



}
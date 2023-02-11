package interactor

import FakeData
import model.CityEntity
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetHighestApartmentPriceDifferenceCityInteractorTest {

// create an object from FakeData class
    private lateinit var fakeData: FakeData
    private lateinit var GetHighestApartmentPrice: GetHighestApartmentPriceDifferenceCityInteractor

    @BeforeEach
    fun setUp() {
        fakeData = FakeData()
        GetHighestApartmentPrice = GetHighestApartmentPriceDifferenceCityInteractor(fakeData)
    }

//to test execute function we need to list of city , We take it from FakeData class

    @Test
    fun isEmpty_theListIsEmpty_returnNull(){
        // given an empty list
        val cityNames = emptyList<CityEntity>()
        // when check if the highst city is an empty list
        val highestCity = GetHighestApartmentPrice.execute(cityNames)
        // then check the result
        assertEquals(null,highestCity)
    }
}
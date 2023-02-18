package interactor
import FakeDataRentApartmentPrice
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance



@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetHighestApartmentPriceDifferenceCityInteractorTest {

    private lateinit var getCitiesHighestApartmentRent: GetHighestApartmentPriceDifferenceCityInteractor
    private lateinit var fakeData: FakeDataRentApartmentPrice

    @BeforeAll
    fun setUp() {
        fakeData = FakeDataRentApartmentPrice()
        getCitiesHighestApartmentRent = GetHighestApartmentPriceDifferenceCityInteractor(fakeData)
    }

    @Test
    fun should_ReturnCityWithHighestDifference_When_InputIsCorrect(){

        //when check which city has the highest difference rent between city center and outside
        val result = getCitiesHighestApartmentRent.execute()
        //then return the correct city
        assertEquals("Lannull",result)

    }

    @Test
    fun should_ReturnFalse_When_DataIsNotEmpty() {

        //when check which city has the highest difference rent between city center and outside
        val result = getCitiesHighestApartmentRent.execute()

        //Then return false if data is not empty
        assertFalse(result.isEmpty() )
    }

    @Test
    fun should_ReturnFalse_When_DataIsNotBlank(){
        //when check which city has the highest difference rent between city center and outside
        val result = getCitiesHighestApartmentRent.execute()

        //Then return false if data is not empty
        assertTrue(result.isNotBlank() )
    }

}







package interactor

import fakeDataSource.FakeDataSourceForDinnerLocation
import model.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.assertDoesNotThrow


class GetDinnerLocationInteractorTest {

    private lateinit var fakeDataSourceForDinnerLocation: FakeDataSourceForDinnerLocation
    private lateinit var interactor: GetDinnerLocationInteractor

    @BeforeEach
    fun setUp() {
        fakeDataSourceForDinnerLocation = FakeDataSourceForDinnerLocation()
    }


    @Test
    fun should_ReturnNull_When_ThereAreNoCities() {
        // given
        interactor = GetDinnerLocationInteractor(
            fakeDataSourceForDinnerLocation.getEmptyFakeDataSource())
        // when
        val result = interactor.execute()
        //then
        assertDoesNotThrow("This block should not throw an exception") {
            result
        }
    }

    @Test
    fun should_ReturnNull_When_CitiesHaveMissingMealPrices() {
        // Given
        interactor = GetDinnerLocationInteractor(fakeDataSourceForDinnerLocation.
            getDataWithNullInMealPrice())

        //when
        val result = interactor.execute()
        //then
        assertNull(result)
    }

    @Test
    fun should_ReturnsNull_When_CitiesAreNotFromUSAOrCanadaOrMexico()
    {
        // Given
        val interactor = GetDinnerLocationInteractor(fakeDataSourceForDinnerLocation.getMeOtherThanSelected())
        //when
        val result = interactor.execute()
        //then
        assertNull(result)
    }

    @Test
    fun should_ReturnsClosestCityName() {
        // Given
        val interactor = GetDinnerLocationInteractor(
            fakeDataSourceForDinnerLocation.getMeCustomDataSource())
        val expected = "Chicago"
        // When
        val result = interactor.execute()
        // Then
        assertEquals(expected, result)
    }

    @Test
    fun should_Get_Average_Returns_TheCorrect_Average() {
        // Given
        val mealsPrices1 = fakeDataSourceForDinnerLocation.mealOne()
        val mealsPrices2 = fakeDataSourceForDinnerLocation.mealTwo()
        //when
        val avg = getAverageBetweenTwoCities(mealsPrices1.mealsPrices, mealsPrices2.mealsPrices)
        //then
        assertEquals(145f, avg)
    }

    @Test
    fun should_ReturnsClosestCity_And_Avg(){
        //Given
        val cityList = fakeDataSourceForDinnerLocation.getMeClosestCity()
        val avg = 310f
        //when
        val closestCity = getClosestCity(cityList).cityName
        val expected = "Ecatepec"
        //then
        assertEquals(expected, closestCity)
    }
}
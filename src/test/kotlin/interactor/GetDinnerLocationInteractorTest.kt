package interactor

import fakeDataSource.FakeDataSourceForDinnerLocation
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.function.Executable
import kotlin.math.ceil


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
            fakeDataSourceForDinnerLocation.getEmptyFakeDataSource()
        )
        // when
        val executable = Executable { interactor.execute() }
        //then
        assertDoesNotThrow("This block should not throw an exception") {
            executable
        }
    }

    @Test
    fun should_ThrowsException_When_CitiesHaveMissingMealPrices() {
        // Given
        interactor = GetDinnerLocationInteractor(
            fakeDataSourceForDinnerLocation.getDataWithNullInMealPrice()
        )
        //when
        val executable = Executable { interactor.execute() }
        //then
        assertThrows(Exception::class.java, executable)
    }

    @Test
    fun should_ThrowsException_When_CitiesAreNotFromUSAOrCanadaOrMexico() {
        // Given
        val interactor = GetDinnerLocationInteractor(fakeDataSourceForDinnerLocation.getMeOtherThanSelected())
        //when
        val executable = Executable { interactor.execute() }
        //then
        assertThrows(Exception::class.java, executable)
    }

    @Test
    fun should_ReturnsClosestCityName() {
        // Given
        val interactor = GetDinnerLocationInteractor(
            fakeDataSourceForDinnerLocation.getMeCustomDataSource()
        )
        val expected = "Montreal"
        // When
        val result = interactor.execute().cityName
        // Then
        assertEquals(expected, result)
    }

    @Test
    fun should_Get_Average_Returns_TheCorrect_Average() {
        // Given
        val mealsPrices1 = fakeDataSourceForDinnerLocation.mealOne()
        val mealsPrices2 = fakeDataSourceForDinnerLocation.mealTwo()
        //when
        val average = ceil(getAverageBetweenTwoCities(mealsPrices1.mealsPrices, mealsPrices2.mealsPrices))
        val exepected = 131.0f

        //then
        assertEquals(exepected, average)
    }

    @Test
    fun should_ReturnsClosestCity_And_Average() {
        //Given
        val cityList = fakeDataSourceForDinnerLocation.getMeClosestCity()
        //when
        val closestCity = getClosestCity(cityList,getAverageBetweenTwoCities(
                cityList.first().mealsPrices,
                cityList.last().mealsPrices
            )
        ).cityName
        val expected = "Montreal"
        //then
        assertEquals(expected, closestCity)
    }
}
package interactor.plus

import data.BananaCheapestFakeData
import data.EmptyFakeData
import data.InvalidFakeData
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCitiesNameWithCheapestTennisPriceOnWeekendInteractorTest {
    private lateinit var getCitiesNameWithCheapestTennisPrice: GetCitiesNameWithCheapestTennisPriceOnWeekendInteractor

    @BeforeEach
    fun setup() {
        getCitiesNameWithCheapestTennisPrice =
            GetCitiesNameWithCheapestTennisPriceOnWeekendInteractor(BananaCheapestFakeData)
    }

    @Test
    fun `should return correct 2 cities when the data is valid`() {
        // given limit the return by 2
        val limit = 2
        val expectedCitiesNames = listOf("Santiago de Cuba", "Sancti Spiritus")
        // when the actual result is 2 cities names
        val result = getCitiesNameWithCheapestTennisPrice(limit)
        // then check of the result
        assertEquals(expectedCitiesNames, result)
    }

    @Test
    fun `should return correct list of 1 city name when the data is valid`() {
        // given limit the return by 1
        val limit = 1
        val expectedCityName = listOf("Santiago de Cuba")
        // when the actual result is list of 1 city name
        val result = getCitiesNameWithCheapestTennisPrice(limit)
        // then check of the result
        assertEquals(expectedCityName, result)
    }

    @Test
    fun `should throw exception when the data is invalid`() {
        // change data to be invalid
        getCitiesNameWithCheapestTennisPrice = GetCitiesNameWithCheapestTennisPriceOnWeekendInteractor(InvalidFakeData)
        // given limit the return by 1
        val limit = 1
        // when the actual result is exception
        val result = Executable { getCitiesNameWithCheapestTennisPrice(limit) }
        // then check of the result
        assertThrows(IllegalStateException::class.java, result)
    }

    @Test
    fun `should throw exception when the data is empty`() {
        // change data to be empty
        getCitiesNameWithCheapestTennisPrice = GetCitiesNameWithCheapestTennisPriceOnWeekendInteractor(EmptyFakeData)
        // given limit the return by 1
        val limit = 1
        // when the actual result is exception
        val result = Executable { getCitiesNameWithCheapestTennisPrice(limit) }
        // then check of the result
        assertThrows(IllegalStateException::class.java, result)
    }
}
package interactor

import mockdata.MockCityEntity.createMockCity
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.unmockkAll
import model.CityEntity
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable
import kotlin.test.assertEquals
import kotlin.test.assertNull

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityHasCheapestInternetConnectionInteractorTest {

    private lateinit var interactor: GetCityHasCheapestInternetConnectionInteractor
    private val mockData = mockk<CostOfLivingDataSource>()

    @BeforeAll
    fun setup() {
        unmockkAll()
        clearAllMocks()
        interactor = GetCityHasCheapestInternetConnectionInteractor(mockData)
    }

    @Test
    fun `should return city with cheapest internet connection when given a limit with three correct cites`() {
        // given
        val limit = 3
        val mockCities = listOf(
            createMockCity("City 1", 50f, 10f),
            createMockCity("City 2", 2000f, 40f),
            createMockCity("City 3", 5000f, 200f)
        )
        every { mockData.getAllCitiesData() } returns (mockCities)
        // when
        val result = interactor.execute(limit)
        // then
        assertEquals(mockCities[1], result)
    }

    @Test
    fun `should return null when given a list with all has null internet price`() {
        // given
        val limit = 3
        val mockCities = listOf(
            createMockCity("City 1", 50f, null),
            createMockCity("City 2", 2000f, null),
            createMockCity("City 3", 5000f, null)
        )
        every { mockData.getAllCitiesData() } returns (mockCities)
        // when
        val result = interactor.execute(limit)
        // then
        assertNull(result)
    }

    @Test
    fun `should return null when given a list with all has null salary`() {
        // given
        val limit = 3
        val mockCities = listOf(
            createMockCity("City 1", null, 10f),
            createMockCity("City 2", null, 40f),
            createMockCity("City 3", null, 200f)
        )
        every { mockData.getAllCitiesData() } returns (mockCities)
        // when
        val result = interactor.execute(limit)
        // then
        assertNull(result)
    }

    @Test
    fun `should return correct city entity when given a list has some incorrect cities`() {
        // given
        val limit = 4
        val mockCities = listOf(
            createMockCity("City 1", 50f, 10f),
            createMockCity("City 2", null, 40f),
            createMockCity("City 3", 5000f, 200f),
            createMockCity("City 4", 5000f, null)
        )
        every { mockData.getAllCitiesData() } returns (mockCities)
        // when
        val result = interactor.execute(limit)
        // then
        assertEquals(mockCities[2], result)
    }
    @Test
    fun `should return correct city entity when given a list has a city repeated one more time`() {
        // given
        val limit = 3
        val mockCities = listOf(
            createMockCity("City 1", 50f, 10f),
            createMockCity("City 1", 50f, 10f),
            createMockCity("City 1", 50f, 10f),
        )
        every { mockData.getAllCitiesData() } returns (mockCities)
        // when
        val result = interactor.execute(limit)
        // then
        assertEquals(mockCities[0], result)
    }
    @Test
    fun `should return null when given a limit by zero`() {
        // given
        val limit = 0
        val mockCities = emptyList<CityEntity>()
        every { mockData.getAllCitiesData() } returns (mockCities)
        // when
        val result = interactor.execute(limit)
        // then
        assertNull(result)
    }

    @Test
    fun `should throws exception when limit is negative`() {
        // given a limit that is less than zero
        val limit = -1
        // when getting result
        val result = Executable { interactor.execute(limit) }
        // then check if it throws exception or not
        Assertions.assertThrows(Exception::class.java, result)
    }

}
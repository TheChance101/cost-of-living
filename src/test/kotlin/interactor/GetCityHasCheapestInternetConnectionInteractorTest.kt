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
    // Create an instance of the interactor to test and a mock of the data source.
    private lateinit var interactor: GetCityHasCheapestInternetConnectionInteractor
    private val mockData = mockk<CostOfLivingDataSource>()

    @BeforeAll
    fun setup() {
        // Reset all mocks and create a new interactor for each test.
        unmockkAll()
        clearAllMocks()
        interactor = GetCityHasCheapestInternetConnectionInteractor(mockData)
    }
    @Test
    fun `should return city with cheapest internet connection when given a limit with three correct cites`() {
        // given A list of cities with different average monthly net salaries and internet prices
        val limit = 3
        val mockCities = listOf(
            createMockCity("City 1", 50f, 10f),
            createMockCity("City 2", 2000f, 40f),
            createMockCity("City 3", 5000f, 200f)
        )
        every { mockData.getAllCitiesData() } returns (mockCities)

        // when executing the interactor with the given limit
        val result = interactor.execute(limit)

        // then The city with the cheapest internet connection relative to salary is returned
        assertEquals(mockCities[1], result)
    }

    @Test
    fun `should return null when given all cities have null internet prices`() {
        // given A list of cities where all internet prices are null
        val limit = 3
        val mockCities = listOf(
            createMockCity("City 1", 50f, null),
            createMockCity("City 2", 2000f, null),
            createMockCity("City 3", 5000f, null)
        )
        every { mockData.getAllCitiesData() } returns (mockCities)

        // when executing the interactor with the given limit
        val result = interactor.execute(limit)

        // then Null is returned since there are no cities with internet prices
        assertNull(result)
    }

    @Test
    fun `should return null when given a list with all has null salary`() {
        // given A list of cities where all average net salary after tax are null
        val limit = 3
        val mockCities = listOf(
            createMockCity("City 1", null, 10f),
            createMockCity("City 2", null, 40f),
            createMockCity("City 3", null, 200f)
        )
        every { mockData.getAllCitiesData() } returns (mockCities)

        // when
        val result = interactor.execute(limit)

        // then assert that null is returned since there are no cities with average net salary after tax
        assertNull(result)
    }

    @Test
    fun `should return correct city entity when given a list has some incorrect cities`() {
        // given a list of cities with some incorrect data
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

        // then the correct city entity is returned
        assertEquals(mockCities[2], result)
    }

    @Test
    fun `should return city with cheapest internet connection when there are multiple cities with the same cheapest price`() {
        // given: A list of cities with the same internet price
        val limit = 3
        val mockCities = listOf(
            createMockCity("City 1", 50f, 10f),
            createMockCity("City 1", 50f, 10f),
            createMockCity("City 1", 50f, 10f),
        )
        every { mockData.getAllCitiesData() } returns (mockCities)

        // when
        val result = interactor.execute(limit)

        // then: The city with the cheapest internet connection is returned
        assertEquals(mockCities[0], result)
    }

    @Test
    fun `should return null when given a limit by zero`() {
        // given: An empty list of cities
        val limit = 0
        val mockCities = emptyList<CityEntity>()
        every { mockData.getAllCitiesData() } returns (mockCities)

        // when
        val result = interactor.execute(limit)

        // then: Null is returned since
        assertNull(result)
    }
    @Test
    fun `should throws exception when limit is negative`() {
        // given a limit that is less than zero
        val limit = -1

        // when executing the interactor with the negative limit
        val result = Executable { interactor.execute(limit) }

        // then check if it throws exception or not
        Assertions.assertThrows(Exception::class.java, result)
    }

}
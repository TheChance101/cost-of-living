package interactor

import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.unmockkAll
import mockData.MockCityEntity
import model.CarsPrices
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

/**
 * Created by Mohamed Elgohary on 2/17/2023.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SearchCheapestCarInCountryInteractorTest {

    private lateinit var searchInteractor: SearchCheapestCarInCountryInteractor
    private val mockData = mockk<CostOfLivingDataSource>()

    @BeforeAll
    fun setup() {
        unmockkAll()
        clearAllMocks()
        searchInteractor = SearchCheapestCarInCountryInteractor(mockData)
    }

    @Test
    fun `should return a list with one Pair containing the cheapest car price for the given country`() {
        // Given country name Uppercase
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                "UNITED STATES",
                "New York",
                CarsPrices(
                    18000.0f,
                    15000.0f
                ),
            )
        )
        // When averageSalary not null and high dataQuality
        every { mockData.getAllCitiesData() } returns (mockCity)
        // Then return a list of pair of city name and average salary
        val actualResult = searchInteractor.execute(mockCity[0].country, 1)
        assertEquals(listOf(Pair("New York", 15000.0f)), actualResult)
    }

    @Test
    fun `should return the minimum car price when both prices are valid`() {
        // Given country name Uppercase
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                "Egypt",
                "Cairo",
                CarsPrices(
                    10000.0f,
                    11000.0f
                ),
            )
        )
        // When averageSalary not null and high dataQuality
        every { mockData.getAllCitiesData() } returns (mockCity)
        // Then return a list of pair of city name and average salary
        val actualResult = searchInteractor.searchCheapestCar(mockCity[0])
        assertEquals(10000.0f, actualResult)
    }

    @Test
    fun `should return true when both car prices are not null`() {
        // Given country name Uppercase
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                "Saudi Arabia",
                "Riyadh",
                CarsPrices(
                    12000.0f,
                    13000.0f
                ),
            )
        )
        // When averageSalary not null and high dataQuality
        every { mockData.getAllCitiesData() } returns (mockCity)
        // Then return a list of pair of city name and average salary
        val actualResult = searchInteractor.excludeNullCarsPrices(mockCity[0])
        assertTrue(actualResult)
    }

    @Test
    fun `should return false when the price of a Volkswagen Golf is null`() {
        // Given country name Uppercase
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                "Egypt",
                "Damanhour",
                CarsPrices(
                    null,
                    13000.0f
                ),
            )
        )
        // When averageSalary not null and high dataQuality
        every { mockData.getAllCitiesData() } returns (mockCity)
        // Then return a list of pair of city name and average salary
        val actualResult = searchInteractor.excludeNullCarsPrices(mockCity[0])
        assertFalse(actualResult)
    }

    @Test
    fun `should return false when the price of a Toyota Corolla is null`() {
        // Given country name Uppercase
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                "Egypt",
                "Fayoum",
                CarsPrices(
                    15000.0f,
                    null
                ),
            )
        )
        // When averageSalary not null and high dataQuality
        every { mockData.getAllCitiesData() } returns (mockCity)
        // Then return a list of pair of city name and average salary
        val actualResult = searchInteractor.excludeNullCarsPrices(mockCity[0])
        assertFalse(actualResult)
    }

    @Test
    fun `should return false when both car prices are null`() {
        // Given country name Uppercase
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                "Netherlands",
                //This city does not have any cars
                "Giethoorn",
                CarsPrices(
                    null,
                    null
                ),
            )
        )
        // When averageSalary not null and high dataQuality
        every { mockData.getAllCitiesData() } returns (mockCity)
        // Then return a list of pair of city name and average salary
        val actualResult = searchInteractor.excludeNullCarsPrices(mockCity[0])
        assertFalse(actualResult)
    }

}


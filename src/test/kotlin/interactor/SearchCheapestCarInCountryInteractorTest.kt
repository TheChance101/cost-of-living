package interactor

import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.unmockkAll
import mockdata.MockCityEntity
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
        // Given correct country name
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                "UNITED STATES", "New York",
                CarsPrices(18000.0f,
                    15000.0f
                ), 1300.0f
            ),
            MockCityEntity.createMockCity("UNITED STATES", "Los Angeles",
                CarsPrices(
                    17000.0f,
                    14000.0f
                ), 1500.0f
            )
        )
        // When averageSalary and cars prices not null
        every { mockData.getAllCitiesData() } returns (mockCity)
        // Then return a list of pair of city name and car price
        val actualResult = searchInteractor.execute(mockCity[0].country, 1)
        assertEquals(listOf(Pair("You can buy the car after working 9.333333 months in Los Angeles", 14000.0f)
        ), actualResult
        )
    }

    @Test
    fun `should return the minimum car price when both prices are valid`() {
        // Given correct country name
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                "Egypt",
                "Cairo",
                CarsPrices(
                    10000.0f,
                    11000.0f
                ), 500.0f
            )
        )
        // When averageSalary and cars prices not null
        every { mockData.getAllCitiesData() } returns (mockCity)
        // Then return a list of pair of city name and car price
        val actualResult = searchInteractor.searchCheapestCar(mockCity[0])
        assertEquals(10000.0f, actualResult)
    }

    @Test
    fun `should return true when both car prices are not null`() {
        // Given correct country name
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                "Saudi Arabia",
                "Riyadh",
                CarsPrices(
                    12000.0f,
                    13000.0f
                ), 2000.0f
            )
        )
        // When both car prices are not null
        every { mockData.getAllCitiesData() } returns (mockCity)
        // Then return true
        val actualResult = searchInteractor.excludeNullCarsPricesAndSalaries(mockCity[0])
        assertTrue(actualResult)
    }

    @Test
    fun `should return false when the price of a Volkswagen Golf is null`() {
        // Given correct country name
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                "Egypt",
                "Damanhour",
                CarsPrices(
                    null,
                    13000.0f
                ),400.0f
            )
        )
        // When the price of a Volkswagen Golf is null
        every { mockData.getAllCitiesData() } returns (mockCity)
        // Then return false
        val actualResult = searchInteractor.excludeNullCarsPricesAndSalaries(mockCity[0])
        assertFalse(actualResult)
    }

    @Test
    fun `should return false when the price of a Toyota Corolla is null`() {
        // Given correct country name
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                "Egypt",
                "Fayoum",
                CarsPrices(
                    15000.0f,
                    null
                ),350.0f
            )
        )
        // When the price of a Toyota Corolla is null
        every { mockData.getAllCitiesData() } returns (mockCity)
        // Then return false
        val actualResult = searchInteractor.excludeNullCarsPricesAndSalaries(mockCity[0])
        assertFalse(actualResult)
    }

    @Test
    fun `should return false when both car prices are null`() {
        // Given correct country name
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                "Netherlands",
                //This city does not have any cars
                "Giethoorn",
                CarsPrices(
                    null,
                    null
                ),1100.0f
            )
        )
        // When both car prices are null
        every { mockData.getAllCitiesData() } returns (mockCity)
        // Then return false
        val actualResult = searchInteractor.excludeNullCarsPricesAndSalaries(mockCity[0])
        assertFalse(actualResult)
    }
}



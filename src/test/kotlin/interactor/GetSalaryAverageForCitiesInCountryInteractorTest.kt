package interactor

import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.unmockkAll
import mockData.MockCityEntity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

/**
 * Created by Mohamed Elgohary on 2/9/2023.
 */

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetSalaryAverageForCitiesInCountryInteractorTest {

    private lateinit var interactor: GetSalaryAverageForCitiesInCountryInteractor
    private val mockData = mockk<CostOfLivingDataSource>()


    @BeforeAll
    fun setup() {
        unmockkAll()
        clearAllMocks()
        interactor = GetSalaryAverageForCitiesInCountryInteractor(mockData)
    }


    @Test
    fun `should return cities name and salaries average when country name is uppercase`() {
        // Given country name Uppercase
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                "UNITED STATES",
                "New York",
                1500.0f,
                true
            )
        )
        // When averageSalary not null and high dataQuality
        every { mockData.getAllCitiesData() } returns (mockCity)
        // Then return a list of pair of city name and average salary
        val actualResult = interactor.execute(mockCity[0].country)
        assertEquals(listOf(Pair("New York", 1500.0f)), actualResult)
    }

    @Test
    fun `should return cities name and salaries average when country name is lowercase`() {
        // Given country name Lowercase
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                "egypt",
                "Tanta",
                101.74f,
                true
            )
        )

        every { mockData.getAllCitiesData() } returns (mockCity)
        // When averageSalary not null and high dataQuality
        val actualPairList = interactor.execute(mockCity[0].country)

        // Then return a list of pair of city name and average salary
        assertEquals(listOf(Pair("Tanta", 101.74f)), actualPairList)
    }


    @Test
    fun `should return cities name and salaries average when country name is mixed`() {
        // Given country name Mix of Uppercase and Lowercase
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                "SyRiA",
                "Damascus",
                50.24f,
                true
            )
        )
        every { mockData.getAllCitiesData() } returns (mockCity)

        // When averageSalary not null and high dataQuality
        val actualPairList = interactor.execute(mockCity[0].country)

        // Then return a list of pair of city name and average salary
        assertEquals(listOf(Pair("Damascus", 50.24f)), actualPairList)
    }


    @Test
    fun `should return exception when country name is empty or wrong`() {
        // Given empty country name
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                "",
                "",
                0.0f,
                true
            )
        )

        val exception = IllegalStateException(" Country name is empty or wrong :( Try again! ")
        every { mockData.getAllCitiesData() } throws (exception)

        // When country name is empty
        val result = Executable { interactor.execute(mockCity[0].country) }

        // Then return Throw Exception
        assertThrows(Exception::class.java, result)
    }

    @Test
    fun `should return false when salaries equal null or not avoid low quality data`() {
        // Given cityEntity
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                "Country",
                "City",
                null,
                true
            )
        )
        every { mockData.getAllCitiesData() } returns (mockCity)

        // When averageSalary not null and high dataQuality
        val actualResult = interactor.excludeNullSalariesAndLowQualityData(mockCity[0])

        // Then return false
        assertFalse(actualResult)
    }

    @Test
    fun `should return true when salaries not equal null and avoid low quality data`() {

        val mockCity = listOf(
            MockCityEntity.createMockCity(
                "Country",
                "City",
                50.0f,
                true
            )
        )
        every { mockData.getAllCitiesData() } returns (mockCity)

        // When averageSalary not null and high dataQuality
        val actualResult = interactor.excludeNullSalariesAndLowQualityData(mockCity[0])

        // Then return false
        assertTrue(actualResult)

    }
}

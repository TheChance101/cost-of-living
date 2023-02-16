package interactor

import fakeData.FakeData
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

    private lateinit var fakeData: CostOfLivingDataSource
    private lateinit var interactor: GetSalaryAverageForCitiesInCountryInteractor

    @BeforeAll
    fun setup() {
        fakeData = FakeData()
        interactor = GetSalaryAverageForCitiesInCountryInteractor(fakeData)

    }

    @Test
    fun `should return cities name and salaries average when country name is uppercase`() {
        // Given country name Uppercase
        val countryName = "CUBA"

        // When averageSalary not null and high dataQuality
        val actualPairList = interactor.execute(countryName)
        // Then return a list of pair of city name and average salary
        val expected =
            listOf(
                Pair("Santiago de Cuba", 1580.0f),
                Pair("Sancti Spiritus", 20.0f),
                Pair("Santa Clara", 25.0f)
            )
        assertEquals(expected, actualPairList)
    }

    @Test
    fun `should return cities name and salaries average when country name is lowercase`() {
        // Given country name Lowercase
        val countryName = "egypt"

        // When averageSalary not null and high dataQuality
        val actualPairList = interactor.execute(countryName)

        // Then return a list of pair of city name and average salary
        assertEquals(listOf(Pair("Tanta", 101.74f)), actualPairList)
    }

    @Test
    fun `should return cities name and salaries average when country name is mixed`() {
        // Given country name Mix of Uppercase and Lowercase
        val countryName = "SyRia"

        // When averageSalary not null and high dataQuality
        val actualPairList = interactor.execute(countryName)

        // Then return a list of pair of city name and average salary
        assertEquals(listOf(Pair("Damascus", 50.24f)), actualPairList)
    }

    @Test
    fun `should return exception when country name is empty or wrong`() {
        // Given empty country name
        val countryName = ""

        // When country name is empty
        val result = Executable { interactor.execute(countryName) }

        // Then return Throw Exception
        assertThrows(Exception::class.java, result)
    }

    @Test
    fun `should return false when salaries equal null or not avoid low quality data`() {
        // Given cityEntity
        val fakeCity = fakeData.getAllCitiesData()[1]

        // When averageSalary not null and low dataQuality
        val result = interactor.excludeNullSalariesAndLowQualityData(fakeCity)

        // Then return false
        assertFalse(result)
    }

    @Test
    fun `should return true when salaries not equal null and avoid low quality data`() {
        // Given cityEntity
        val fakeCity = fakeData.getAllCitiesData()[2]

        // When averageSalary not null and high dataQuality
        val result = interactor.excludeNullSalariesAndLowQualityData(fakeCity)

        // Then return true
        assertTrue(result)
    }


}
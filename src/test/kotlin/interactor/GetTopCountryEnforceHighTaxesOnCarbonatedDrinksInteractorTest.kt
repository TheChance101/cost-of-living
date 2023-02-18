package interactor

import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.unmockkAll
import mockData.MockCityEntity.createMockCity
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable
import kotlin.test.assertEquals


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopCountryEnforceHighTaxesOnCarbonatedDrinksInteractorTest {

    private lateinit var testingData: GetTopCountryEnforceHighTaxesOnCarbonatedDrinksInteractor
    private val dataSource = mockk<CostOfLivingDataSource>()

    @BeforeAll
    fun setUpData() {
        // clear and cancel all objects mock
        unmockkAll()
        clearAllMocks()

        //set testing data from HighTaxesOnCarbonatedDrinks class
        testingData = GetTopCountryEnforceHighTaxesOnCarbonatedDrinksInteractor(dataSource)
    }

    @Test
    fun `should return correct data when has a limit with correct data`() {
        //Given eight countries as a limit and set mockk data
        val limit = 8
        val mockCountry = listOf(
            createMockCity("Cuba", 2.0f, true),
            createMockCity("Egypt", 2.0f, true),
            createMockCity("Koura", 2.0f, true),
            createMockCity("Lebanon", 2.0f, true),
            createMockCity("Argentina", 2.0f, true),
            createMockCity("Loliput", 2.0f, true),
            createMockCity("Albania", 2.0f, true),
            createMockCity("Syria", 0.82f, true)
        )

        every { dataSource.getAllCitiesData() } returns mockCountry
        // When getting result
        val actualList = testingData.execute(limit)
        // Then return listOf Pair(country name and the average prices for those drinks for this country)
        val expectedList = listOf(
            Pair("Cuba", 2.0f),
            Pair("Egypt", 2.0f),
            Pair("Koura", 2.0f),
            Pair("Lebanon", 2.0f),
            Pair("Argentina", 2.0f),
            Pair("Loliput", 2.0f),
            Pair("Albania", 2.0f),
            Pair("Syria", 0.82f)
        )
        assertEquals(expectedList, actualList)
    }

    @Test
    fun ` should throws exception when has a limit less than zero `() {
        // Given limit less than zero
        val limit = -1
        // When no data
        val noData = Executable { testingData.execute(limit) }
        // Then should Throw Exception
        assertThrows(Exception::class.java, noData)
    }
    @Test
    fun `should return correct data list when has limit with correct data and null data`() {
        //Given four countries as a limit and set mockk data
        val limit = 4
        val mockCountry = listOf(
            createMockCity("Cuba", 0f, true),
            createMockCity("Egypt", 2.0f, true),
            createMockCity("Koura", 3.0f, true),
            createMockCity("Lebanon", 1.0f, true),
            createMockCity("Argentina", 0f, true),
            createMockCity("Loliput", 0.5f, true),
            createMockCity("Albania", 0f, true),
            createMockCity("Syria", 4.4f, true)
        )

        every { dataSource.getAllCitiesData() } returns mockCountry
        // When getting result
        val actualList = testingData.execute(limit)
        // Then return listOf Pair(country name and the average prices for those drinks for this country)
        val expectedList = listOf(
            Pair("Syria", 4.4f),
            Pair("Koura", 3.0f),
            Pair("Egypt", 2.0f),
            Pair("Lebanon", 1.0f)
        )
        assertEquals(expectedList, actualList)
    }


}
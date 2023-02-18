package interactor

import fakeData.FakeData
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable
import kotlin.test.assertEquals


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopTenCountryEnforceHighTaxesOnCarbonatedDrinksInteractorTest {

    private lateinit var testingData: GetTopCountryEnforceHighTaxesOnCarbonatedDrinksInteractor
    private val fakeData = FakeData()

    @BeforeAll
    fun setUpData() {
        testingData = GetTopCountryEnforceHighTaxesOnCarbonatedDrinksInteractor(fakeData)
    }

    @Test
    fun `should return correct data when has a limit with correct data`() {
        //Given eight countries as a limit
        val limit = 8
        // When getting result
        val result = testingData.execute(limit)
        // Then return listOf Pair(country name and the average prices for those drinks for this country)
        val listOfPair = listOf(
            Pair("Cuba", 2.0f),
            Pair("Egypt", 2.0f),
            Pair("Koura", 2.0f),
            Pair("Lebanon", 2.0f),
            Pair("Argentina", 2.0f),
            Pair("Loliput", 2.0f),
            Pair("Albania", 2.0f),
            Pair("Syria", 0.82f)
        )
        assertEquals(listOfPair, result)
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
}
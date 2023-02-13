package interactor

import fakeData.FakeData
import model.CityEntity
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopTenCountryEnforceHighTaxesOnCarbonatedDrinksInteractorTest {

    private lateinit var testingData: GetTopTenCountryEnforceHighTaxesOnCarbonatedDrinksInteractor
    private val fakeData = FakeData()

    @BeforeAll
    fun setUpData() {
        testingData = GetTopTenCountryEnforceHighTaxesOnCarbonatedDrinksInteractor(fakeData)
    }

    @Test
    fun returnSizeOfList() {
        val limit = 10
        val cities = fakeData.getAllCitiesData()
        val result = testingData.execute(limit, cities)
        assertEquals(8, result.size)
    }

    @Test
    fun throwNullException() {
        var list: List<CityEntity> = listOf()
        val noData = org.junit.jupiter.api.function.Executable { testingData.execute(-1, list) }
        assertThrows(Exception::class.java, noData)
    }


}
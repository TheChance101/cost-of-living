package interactor

import fakeData.FakeData
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTopCitiesFruitsAndVegetablesLowestCostInteractorTest {

    private lateinit var interactor: GetTopCitiesFruitsAndVegetablesLowestCostInteractor
    private val fakeData = FakeData()

    @BeforeAll
    fun setup() {
        interactor = GetTopCitiesFruitsAndVegetablesLowestCostInteractor(fakeData)
    }

    // Start testing for getAverageFruitAndVegetablePricesForCity
    @Test
    fun `should return null when sum of all fruit and vegetables prices less than and not equal zero`() {
        // given
        val entity = fakeData.getAllCitiesData()[7]
        // when
        val result = interactor.getAverageFruitAndVegetablePricesForCity(entity)
        // then
        assertNull(result)
    }

    @Test
    fun `should return correct value when all fruit and vegetable is not null`() {
        // given
        val entity = fakeData.getAllCitiesData()[0]
        // when
        val result = interactor.getAverageFruitAndVegetablePricesForCity(entity)
        // then
        assertEquals(1.106f, result)
    }

    @Test
    fun `should return correct value when there is at least one value is null`() {
        // given
        val entity = fakeData.getAllCitiesData()[0]
        // when
        val result = interactor.getAverageFruitAndVegetablePricesForCity(entity)
        // then
        assertEquals(1.106f, result)
    }
    // End testing for getAverageFruitAndVegetablePricesForCity

    // Start testing for excludeNullFruitAndVegetablePricesOrNullSalaries
    @Test
    fun `should return true when cities fruits and vegetables and average salaries is not null`() {
        // given
        val fakeCity = fakeData.getAllCitiesData()[0]
        // when
        val result = interactor.excludeNullFruitAndVegetablePricesOrNullSalaries(fakeCity)
        // then
        assertTrue(result)
    }

    @Test
    fun `should return false when all cities fruits and vegetables and average salaries is null`() {
        // given
        val fakeCity = fakeData.getAllCitiesData()[7]
        // when
        val result = interactor.excludeNullFruitAndVegetablePricesOrNullSalaries(fakeCity)
        // then
        assertFalse(result)
    }

    @Test
    fun `should return false when cities fruits and vegetables is not null but average salary is null`() {
        // given
        val fakeCity = fakeData.getAllCitiesData()[8]
        // when
        val result = interactor.excludeNullFruitAndVegetablePricesOrNullSalaries(fakeCity)
        // then
        assertFalse(result)
    }

    @Test
    fun `should return false when cities fruits and vegetables is null but average salary is not null`() {
        // given
        val fakeCity = fakeData.getAllCitiesData()[9]
        // when
        val result = interactor.excludeNullFruitAndVegetablePricesOrNullSalaries(fakeCity)
        // then
        assertFalse(result)
    }
    // End testing for excludeNullFruitAndVegetablePricesOrNullSalaries

    // Start testing for execute function
    @Test
    fun `should throws exception when limit is negative`() {
        // given
        val limit = -1
        // when
        val result = Executable { interactor.execute(limit) }
        // then
        assertThrows(Exception::class.java, result)
    }

    @Test
    fun `should return correct cities names sorted by lowest cost of fruit and vegetables compared to average salary`() {
        // given
        val limit = 10
        // when
        val result = interactor.execute(limit)
        // then
        assertEquals(
            listOf(
                "Santiago de Cuba",
                "Sancti Spiritus",
                "Santa Clara",
                "Masin",
                "Solue",
                "Fayrouz"
            ), result
        )
    }

    @Test
    fun `should return empty list when given a limit by zero `() {
        // given
        val limit = 0
        // when
        val result = interactor.execute(limit)
        // then
        assertEquals(listOf(), result)
    }
    // End testing for execute function

}
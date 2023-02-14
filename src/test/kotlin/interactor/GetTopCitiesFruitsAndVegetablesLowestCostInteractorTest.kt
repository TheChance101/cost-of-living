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

    @Test
    fun `should return null when sum of all fruit and vegetables prices less than and not equal zero`() {
        // given an entity that has sum of all fruits and vegetables < 0
        val entity = fakeData.getAllCitiesData()[7]
        // when make calculations
        val result = interactor.getAverageFruitAndVegetablePricesForCity(entity)
        // then check if getting result is null
        assertNull(result)
    }

    @Test
    fun `should return correct value when all fruit and vegetable is not null`() {
        // given an entity all it's fruit and vegetables has a value
        val entity = fakeData.getAllCitiesData()[0]
        // when make calculations
        val result = interactor.getAverageFruitAndVegetablePricesForCity(entity)
        // then check if getting correct value
        assertEquals(1.106f, result)
    }

    @Test
    fun `should return correct value when there is at least one value is null`() {
        // given an entity that has at least a null value in fruit and vegetables
        val entity = fakeData.getAllCitiesData()[0]
        // when getting result
        val result = interactor.getAverageFruitAndVegetablePricesForCity(entity)
        // then check if getting correct value
        assertEquals(1.106f, result)
    }

    @Test
    fun `should return true when cities fruits and vegetables and average salaries is not null`() {
        // given an entity it's average salary has a value and also average fruits and vegetables is not null
        val fakeCity = fakeData.getAllCitiesData()[0]
        // when getting result
        val result = interactor.excludeNullFruitAndVegetablePricesOrNullSalaries(fakeCity)
        // then check if the result is true
        assertTrue(result)
    }

    @Test
    fun `should return false when all cities fruits and vegetables and average salaries is null`() {
        // given an entity it's average fruit and vegetables and average salary is null
        val fakeCity = fakeData.getAllCitiesData()[7]
        // when getting result
        val result = interactor.excludeNullFruitAndVegetablePricesOrNullSalaries(fakeCity)
        // then check if the result is false
        assertFalse(result)
    }

    @Test
    fun `should return false when cities fruits and vegetables is not null but average salary is null`() {
        // given an entity that it's average fruit and vegetables is not null , but , it's average salary is null
        val fakeCity = fakeData.getAllCitiesData()[8]
        // when getting result
        val result = interactor.excludeNullFruitAndVegetablePricesOrNullSalaries(fakeCity)
        // then check if the result is false
        assertFalse(result)
    }

    @Test
    fun `should return false when cities fruits and vegetables is null but average salary is not null`() {
        // given an entity that it's average fruit and vegetables null , but , it's average salary null
        val fakeCity = fakeData.getAllCitiesData()[9]
        // when getting result
        val result = interactor.excludeNullFruitAndVegetablePricesOrNullSalaries(fakeCity)
        // then check if the result is false
        assertFalse(result)
    }

    @Test
    fun `should throws exception when limit is negative`() {
        // given a limit that is less than zero
        val limit = -1
        // when getting result
        val result = Executable { interactor.execute(limit) }
        // then check if it throws exception or not
        assertThrows(Exception::class.java, result)
    }

    @Test
    fun `should return correct cities names sorted by lowest cost of fruit and vegetables compared to average salary`() {
        // given a limit of city that has correct value of average salary and average fruits and vegetables
        val limit = 10
        // when getting result
        val result = interactor.execute(limit)
        // then check if getting correct list of cities
        assertEquals(
            listOf(
                "Santiago de Cuba",
                "Tanta",
                "Damascus",
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
        // given a limit is equal zero which is has nothing to show
        val limit = 0
        // when getting result
        val result = interactor.execute(limit)
        // then check if getting an empty list
        assertEquals(listOf(), result)
    }
}
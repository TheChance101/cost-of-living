package interactor

import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.unmockkAll
import mockdata.MockCityEntity.createMockCity
import model.CityEntity
import model.FruitAndVegetablesPrices
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTopCitiesFruitsAndVegetablesLowestCostInteractorTest {

    private lateinit var interactor: GetTopCitiesFruitsAndVegetablesLowestCostInteractor
    private val mockData = mockk<CostOfLivingDataSource>()

    @BeforeAll
    fun setup() {
        unmockkAll()
        clearAllMocks()
        interactor = GetTopCitiesFruitsAndVegetablesLowestCostInteractor(mockData)
    }

    @Test
    fun `should return null when sum of all fruit and vegetables prices less than and not equal zero`() {
        // given an entity that has sum of all fruits and vegetables < 0
        val limit = 1
        val mockCity = listOf(
            createMockCity(
                "City 1",
                FruitAndVegetablesPrices(
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                ),
                null
            )
        )
        every { mockData.getAllCitiesData() } returns mockCity
        // when make calculations
        val result = interactor.execute(limit)
        // then check if getting result is null
        assertEquals(emptyList(), result)
    }

    @Test
    fun `should return correct value when all fruit and vegetable is not null`() {
        // given an entity all it's fruit and vegetables has a value
        val limit = 1
        val mockCity = listOf(
            createMockCity(
                "City 1",
                FruitAndVegetablesPrices(
                    3.5f,
                    2.4f,
                    2.14f,
                    8.1f,
                    4.12f,
                    5.5f,
                    1.2f,
                ),
                800f
            )
        )
        every { mockData.getAllCitiesData() } returns mockCity
        // when make calculations
        val result = interactor.execute(limit)
        // then check if getting correct value
        assertEquals(listOf("City 1"), result)
    }

    @Test
    fun `should return correct value when there is at least one value is null`() {
        // given an entity that has at least a null value in fruit and vegetables
        val limit = 1
        val mockCity = listOf(
            createMockCity(
                "City 1",
                FruitAndVegetablesPrices(
                    3.5f,
                    2.4f,
                    2.14f,
                    null,
                    4.12f,
                    5.5f,
                    1.2f,
                ),
                800f
            )
        )
        every { mockData.getAllCitiesData() } returns mockCity
        // when make calculations
        val result = interactor.execute(limit)
        // then check if getting correct value
        assertEquals(listOf("City 1"), result)
    }

    @Test
    fun `should return true when cities fruits and vegetables and average salaries is not null`() {
        // given an entity it's average salary has a value and also average fruits and vegetables is not null
        val mockCity = listOf(
            createMockCity(
                "City 1",
                FruitAndVegetablesPrices(
                    3.5f,
                    2.4f,
                    2.14f,
                    8.1f,
                    4.12f,
                    5.5f,
                    1.2f,
                ),
                800f
            )
        )
        every { mockData.getAllCitiesData() } returns mockCity
        // when getting result
        val result = interactor.excludeNullFruitAndVegetablePricesOrNullSalaries(mockCity[0])
        // then check if the result is true
        assertTrue(result)
    }

    @Test
    fun `should return false when all cities fruits and vegetables and average salaries is null`() {
        // given an entity it's average fruit and vegetables and average salary is null
        val mockCity = listOf(
            createMockCity(
                "City 1",
                FruitAndVegetablesPrices(
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                ),
                null
            )
        )
        every { mockData.getAllCitiesData() } returns mockCity
        // when getting result
        val result = interactor.excludeNullFruitAndVegetablePricesOrNullSalaries(mockCity[0])
        // then check if the result is false
        assertFalse(result)
    }

    @Test
    fun `should return false when cities fruits and vegetables is not null but average salary is null`() {
        // given an entity that it's average fruit and vegetables is not null , but , it's average salary is null
        val mockCity = listOf(
            createMockCity(
                "City 1",
                FruitAndVegetablesPrices(
                    3.5f,
                    2.4f,
                    2.14f,
                    8.1f,
                    4.12f,
                    5.5f,
                    1.2f,
                ),
                null
            )
        )
        every { mockData.getAllCitiesData() } returns mockCity
        // when getting result
        val result = interactor.excludeNullFruitAndVegetablePricesOrNullSalaries(mockCity[0])
        // then check if the result is false
        assertFalse(result)
    }

    @Test
    fun `should return false when cities fruits and vegetables is null but average salary is not null`() {
        // given an entity that it's average fruit and vegetables null , but , it's average salary null
        val mockCity = listOf(
            createMockCity(
                "City 1",
                FruitAndVegetablesPrices(
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                ),
                800f
            )
        )
        every { mockData.getAllCitiesData() } returns mockCity
        // when getting result
        val result = interactor.excludeNullFruitAndVegetablePricesOrNullSalaries(mockCity[0])
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
        val limit = 3
        val mockCity = listOf(
            createMockCity(
                "City 1",
                FruitAndVegetablesPrices(
                    3.5f,
                    2.4f,
                    2.14f,
                    8.1f,
                    4.12f,
                    5.5f,
                    1.2f,
                ),
                800f
            ),
            createMockCity(
                "City 2",
                FruitAndVegetablesPrices(
                    8.6f,
                    7.2f,
                    5.14f,
                    8.1f,
                    10.12f,
                    15.5f,
                    12.2f,
                ),
                3000f
            ),
            createMockCity(
                "City 3",
                FruitAndVegetablesPrices(
                    18.5f,
                    21.4f,
                    22.14f,
                    18.1f,
                    14.12f,
                    15.5f,
                    11.2f,
                ),
                5000f
            )
        )
        every { mockData.getAllCitiesData() } returns mockCity
        // when getting result
        val result = interactor.execute(limit)
        // then check if getting correct list of cities
        assertEquals(listOf("City 2", "City 3", "City 1"), result)
    }

    @Test
    fun `should return empty list when given a limit by zero `() {
        // given a limit is equal zero which is has nothing to show
        val limit = 0
        val mockCity = emptyList<CityEntity>()
        every { mockData.getAllCitiesData() } returns mockCity
        // when getting result
        val result = interactor.execute(limit)
        // then check if getting an empty list
        assertEquals(emptyList(), result)
    }
}
package interactor

import fakedata.FakeDataSource
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetLowestFruitAndVegetablesPricesCitiesNamesInteractorTest {
    private lateinit var fakedata: FakeDataSource
    private lateinit var getFruitAndVegetables: GetTopCitiesFruitsAndVegetablesLowestCostInteractor

    @BeforeEach
    fun setUp() {
        fakedata = FakeDataSource()
        getFruitAndVegetables = GetTopCitiesFruitsAndVegetablesLowestCostInteractor(fakedata)
    }

    @Test
    fun `should Returen Names Of Cities When Input Integer Number`() {
        // given a limit is Integer number and returen correct expected value
        val limit = 2
        val expected: List<String> = listOf("Lyon", "Alex")
        // when getting result
        val result = getFruitAndVegetables.execute(limit)
        // then check if getting an empty list
        assertEquals(expected, result)
    }

    @Test
    fun `should Returen Names Of Cities When Incorrect Input `() {
        // given a limit is Integer number and returen correct expected value
        val limit = 2
        val expected: List<String> = listOf("Lyon", "Alex", "Ali", "Mojtaba")
        // when getting result
        val result = getFruitAndVegetables.execute(limit)
        // then check if getting an empty list
        assertNotEquals(expected, result)
    }

    @Test
    fun `should Returen True When Input avarag month salary `() {
        //given
        val city = fakedata.alexHighQuality
        //when
        val result = getFruitAndVegetables.excludeNullSalaries(city)
        //then
        assertTrue(result)
    }

    @Test
    fun `should Returen False When Input avarag month salary null `() {
        //given
        val city = fakedata.berlinHighQualityNull
        //when
        val result = getFruitAndVegetables.excludeNullSalaries(city)
        //then
        assertFalse(result)

    }

    @Test
    fun `should return empty list when given a limit by zero `() {
        // given a limit is equal zero which is has nothing to show
        val limit = 0
        val expected: List<String> = emptyList()
        // when getting result
        val result = getFruitAndVegetables.execute(limit)
        // then check if getting an empty list
        assertEquals(expected, result)
    }


}
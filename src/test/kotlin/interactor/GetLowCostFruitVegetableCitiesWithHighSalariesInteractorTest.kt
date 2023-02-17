package interactor

import FakeData
import model.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetLowCostFruitVegetableCitiesWithHighSalariesInteractorTest {
    private lateinit var getLowCostFruitVegetableCitiesWithHighSalaries: GetLowCostFruitVegetableCitiesWithHighSalariesInteractor

    @BeforeAll
    fun setup() {
        getLowCostFruitVegetableCitiesWithHighSalaries =
            GetLowCostFruitVegetableCitiesWithHighSalariesInteractor(FakeData())
    }

    @Test
    fun should_returnCorrectResult_when_correctListIsGiven() {
        //given the limit of cities is 10
        val expectedResult = listOf("Giza","Rawalpindi","Alexandria","Hyderabad City","Karachi","Lahore","Multan","Tanta","Accra","Dushanbe")
        val limit = 10
        // when find 10 cities that has lowest fruitVeg prices comparing to salaries paid there
        val result = getLowCostFruitVegetableCitiesWithHighSalaries.execute(limit)

        //then
        assertEquals(expectedResult, result)
    }

    @Test
    fun should_returnTen_when_theSizeOfTheListIsTen() {
        //given the limit of cities is 10
        val limit = 10
        // when
        val result = getLowCostFruitVegetableCitiesWithHighSalaries.execute(limit)

        //then
        assertEquals(10, result.size)
    }

    @Test
    fun should_return_emptyList_when_inputLimitIsMoreThanListSize() {
        //given the limit of cities is 20
        val limit = 20
        // when
        val result = getLowCostFruitVegetableCitiesWithHighSalaries.execute(limit)
        //then
        assertTrue(result.isEmpty())
    }

    @Test
    fun should_return_emptyList_when_inputIsZero() {
        //given the limit of cities is 0
        val limit = 0
        // when
        val result = getLowCostFruitVegetableCitiesWithHighSalaries.execute(limit)
        //then
        assertTrue(result.isEmpty())
    }

    @Test
    fun should_return_emptyList_when_inputIsNegative() {
        //given the limit of cities is -1
        val limit = -1
        // when
        val result = getLowCostFruitVegetableCitiesWithHighSalaries.execute(limit)
        //then
        assertTrue(result.isEmpty())
    }






}
package interactor

import FakeData
import model.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetLowCostFruitVegetableCitiesWithHighSalariesInteractorTest {
    private lateinit var getLowCostFruitVegetableCitiesWithHighSalaries: GetLowCostFruitVegetableCitiesWithHighSalariesInteractor
    private lateinit var expectedResult: List<String>

    @BeforeAll
    fun setup() {
        getLowCostFruitVegetableCitiesWithHighSalaries =
            GetLowCostFruitVegetableCitiesWithHighSalariesInteractor(FakeData())
        expectedResult = listOf("Giza","Rawalpindi","Alexandria","Hyderabad City","Karachi","Lahore","Multan","Tanta","Accra","Dushanbe")
    }


    @Test
    fun should_returnCorrectResult_when_correctListIsGiven() {
        //given the limit of cities is 10
        val limit = 10
        // when find 10 cities that has lowest fruitVeg prices comparing to salaries paid there
        val result = getLowCostFruitVegetableCitiesWithHighSalaries.execute(limit)

        //then
        assertEquals(expectedResult, result)
    }

//    @Test
//    fun should_returnFalse_when_theNameOfCityIsNull() {
//        // when
//        val result = getLowCostFruitVegetableCitiesWithHighSalaries.execute()
//
//        //then
//        assertFalse(result.any { it.cityName == "" })
//    }
//
//    @Test
//    fun should_returnTen_when_theSizeOfTheListIsTen() {
//        // when
//        val result = getLowCostFruitVegetableCitiesWithHighSalaries.execute()
//
//        //then
//        assertEquals(10, result.size)
//    }
//
//    @Test
//    fun should_returnFalse_when_salaryIsNull() {
//        // when
//        val result = getLowCostFruitVegetableCitiesWithHighSalaries.execute()
//
//        //then
//        assertFalse(result.any { it.averageMonthlyNetSalaryAfterTax == null })
//    }
//
//    @Test
//    fun should_returnFalse_when_salaryIsZero() {
//        // when
//        val result = getLowCostFruitVegetableCitiesWithHighSalaries.execute()
//
//        //then
//        assertFalse(result.any { it.averageMonthlyNetSalaryAfterTax == 0f })
//    }
//
//    @Test
//    fun should_returnFalse_when_salaryIsNegative() {
//        // when
//        val result = getLowCostFruitVegetableCitiesWithHighSalaries.execute()
//
//        //then
//        assertFalse(result.any { it.averageMonthlyNetSalaryAfterTax!! < 0f })
//    }




}
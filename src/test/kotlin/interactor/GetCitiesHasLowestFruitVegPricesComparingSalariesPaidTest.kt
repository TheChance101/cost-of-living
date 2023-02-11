package interactor

import FakeDataGetCitiesHasLowestFruitVegPricesComparingSalariesPaid
import model.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCitiesHasLowestFruitVegPricesComparingSalariesPaidTest {
    lateinit var getCities: GetCitiesHasLowestFruitVegPricesComparingSalariesPaid

    val list:List<CityEntity> = FakeDataGetCitiesHasLowestFruitVegPricesComparingSalariesPaid().list
// all cities have same fruit-veg prices but different salaries
// Iran and Egypt should not be in the new list after the test

    val correctTestedList = list.filter { it.cityName != "Ciro" && it.cityName != "Tahran" }.sortedByDescending { it.averageMonthlyNetSalaryAfterTax }
    @BeforeAll
    fun setup(){
        getCities = GetCitiesHasLowestFruitVegPricesComparingSalariesPaid(list)
    }

    @Test
    fun shouldReturnCorrectResultWhenCorrectListIsGiven() {
    //given correct list that has more than 10 objects of CityEntity
    val innerList = list
    // when find 10 cities that has lowest fruitVeg prices comparing to salaries paid there
        val listToTest = getCities.execute()
    //then
        assertEquals(correctTestedList,listToTest)
    }
//    @Test
//    fun shouldReturnFalseResultWhenLowNumberOfListIsGiven() {
//        //given a list that has less than 10 objects of CityEntity
//        val innerList = list
//        // when find 10 cities that has lowest fruitVeg prices comparing to salaries paid there
//        val listToTest = getCities.execute()
//        //then
//        assertEquals(correctTestedList,listToTest)
//    }
}
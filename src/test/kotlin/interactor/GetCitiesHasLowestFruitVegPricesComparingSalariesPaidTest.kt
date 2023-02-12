package interactor

import FakeData
import model.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCitiesHasLowestFruitVegPricesComparingSalariesPaidTest {
    private lateinit var getCities: GetCitiesHasLowestFruitVegPricesComparingSalariesPaid
    private lateinit var fakeData:  FakeData
    private lateinit var correctTestedList: List<CityEntity>

    @BeforeAll
    fun setup(){
        fakeData = FakeData()
        getCities = GetCitiesHasLowestFruitVegPricesComparingSalariesPaid(fakeData)
        correctTestedList = fakeData.getAllCitiesData().filter {
            it.cityName == "Giza" || it.cityName == "Rawalpindi" || it.cityName == "Alexandria"
            || it.cityName =="Hyderabad City" || it.cityName == "Karachi" || it.cityName == "Lahore"
            || it.cityName =="Multan" || it.cityName == "Tanta" || it.cityName == "Accra" || it.cityName == "Dushanbe"
        }.sortedBy { it.cityName }
    }

    @Test
    fun shouldReturnCorrectResultWhenCorrectListIsGiven() {
    //given correct list that has more than 10 objects of CityEntity in the constructor

    // when find 10 cities that has lowest fruitVeg prices comparing to salaries paid there
        val listToTest = getCities.execute().sortedBy { it.cityName }
    //then
        assertEquals(correctTestedList,listToTest)
    }

    // test all the cities name are not null
    @Test
    fun shouldExcludeNoNameCity() {
        //given correct list that has more than 10 objects of CityEntity in the constructor
        // when
        val listToTest = getCities.execute()
        //then
       assertFalse(listToTest.any { it.cityName.equals("") })
    }


    // test we have just 10 cities
    @Test
    fun shouldInclude10Cities() {
        //given correct list that has more than 10 objects of CityEntity in the constructor
        // when
        val listToTest = getCities.execute()
        //then

        assertEquals(10,listToTest.size)
    }

    // test the salary is not null
    @Test
    fun shouldExcludeNullSalary() {
        //given correct list that has more than 10 objects of CityEntity in the constructor
        // when
        val listToTest = getCities.execute()
        //then
        assertFalse(listToTest.any { it.averageMonthlyNetSalaryAfterTax==null})
    }

  // test the salary is not 0
    @Test
    fun shouldExcludeZeroSalary() {
    //given correct list that has more than 10 objects of CityEntity in the constructor
    // when
    val listToTest = getCities.execute()
    //then
    assertFalse(listToTest.any { it.averageMonthlyNetSalaryAfterTax==0f})
    }
    // test all the Salaries are not negative
    @Test
    fun shouldExcludeNegativeSalary() {
        //given correct list that has more than 10 objects of CityEntity in the constructor
        // when
        val listToTest = getCities.execute()
        //then
        assertFalse(listToTest.any { it.averageMonthlyNetSalaryAfterTax!! < 0f})
    }
    // test if it was the same output data type
    @Test
    fun shouldReturnTheSameOutputType() {
        //given correct list that has more than 10 objects of CityEntity in the constructor
        // when
        val listToTest = getCities.execute()
        //then
        assertTrue(listToTest is List<CityEntity>)
       // assertTrue(true)

    }

}
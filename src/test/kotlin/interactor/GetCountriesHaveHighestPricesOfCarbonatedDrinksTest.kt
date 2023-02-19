package interactor

import fakedata.FakeDataSource
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCountriesHaveHighestPricesOfCarbonatedDrinksTest {


    private lateinit var dataSource: CostOfLivingDataSource

    private lateinit var fakeData: FakeDataSource

    private lateinit var getTopTenCountriesHaveHighestPricesOfCoke: GetCountriesHaveHighestPricesOfCarbonatedDrinks


    @BeforeEach
    fun setUp() {
        fakeData = FakeDataSource()
        dataSource = fakeData
        getTopTenCountriesHaveHighestPricesOfCoke = GetCountriesHaveHighestPricesOfCarbonatedDrinks(dataSource)
    }

    @Test

    fun should_ReturnListOfCountriesAndAveragePrice_when_inputIsCorrect() {
        //given the correct input
        val limit = 2
        val expectedResult = listOf(Pair("France", 6.0), Pair("Italy", 5.0))
        //when check the input limit value
        val actualResult =
            getTopTenCountriesHaveHighestPricesOfCoke.getCountriesHaveHighestPricesOfCarbonatedDrinks(limit)
        //then the result will be correct
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun should_ReturnEmptyList_when_theInputIsNegativeValue() {
        //given negative value of limit
        val limit = -1
        //when the limit is negative value
        val actualResult = Executable {
            getTopTenCountriesHaveHighestPricesOfCoke.getCountriesHaveHighestPricesOfCarbonatedDrinks(limit)
        }
        //then throw exception
        assertThrows(Throwable::class.java, actualResult)
    }

    @Test
    fun should_ReturnEmptyList_when_theInputIsZero() {
        //given zero value of limit
        val limit = 0
        val expectedResult = emptyList<Pair<String, Double>>()
        //when value  limit is zero
        val actualResult =
            getTopTenCountriesHaveHighestPricesOfCoke.getCountriesHaveHighestPricesOfCarbonatedDrinks(limit)

        //then the result will be empty list
        assertEquals(expectedResult, actualResult)
    }

}

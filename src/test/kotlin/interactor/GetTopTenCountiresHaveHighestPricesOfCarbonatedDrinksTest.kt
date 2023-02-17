package interactor

import fakedata.FakeDataSource
import model.CityEntity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopTenCountriesHaveHighestPricesOfCarbonatedDrinksTest {
    private lateinit var dataSource: CostOfLivingDataSource
    private lateinit var fakeData: FakeDataSource
    private lateinit var getTopTenCountriesHaveHighestPricesOfCoke:
            GetTopTenCountriesHaveHighestPricesOfCarbonatedDrinks


    @BeforeEach
    fun setUp() {
        fakeData = FakeDataSource()
        dataSource=fakeData
        getTopTenCountriesHaveHighestPricesOfCoke =
            GetTopTenCountriesHaveHighestPricesOfCarbonatedDrinks(dataSource)
    }

    @Test

    fun should_ReturnListOfCountriesAndPrice_when_OutPutIsCorrect() {
        //given the correct input
        val input = listOf("Cuba2.28","Syria0.82")

        //when check the input data
        val actualResult = getTopTenCountriesHaveHighestPricesOfCoke
            .getCountriesOfHighestCarbonatedDrinksPrices(10)

        //then the result will be correct
        assertEquals(listOf(Pair("Cuba",2.28F),Pair("Syria",0.82F)), actualResult)
    }
    @Test
    fun should_ReturnCorrectListOfCountries_when_countryNameIsRepeated() {
        //given the country name is repeated
        val input = listOf(Pair("Cuba",2.28),Pair("Cuba",2.0),Pair("Syria",0.82))

        //when filter frequent names
        val actualResult = getTopTenCountriesHaveHighestPricesOfCoke
             .getCountriesOfHighestCarbonatedDrinksPrices(3)

        //then the result without frequent names
        assertEquals(listOf(Pair("Cuba",2.28F),Pair("Syria",0.82F)), actualResult)
    }
    @Test
    fun should_ReturnFalse_When_theInputOfListIsEmpty() {
        //given the input is empty
        val input = listOf("")

        //when filter the empty data
        val actualResult = getTopTenCountriesHaveHighestPricesOfCoke.
        filterTheListOfCountriesOfHighestCarbonatedDrinksPrices(input)

        //then the result is false
        assertEquals(false, actualResult)
    }

    @Test
    fun should_ReturnTure_When_InputOfLimitIsPositiveValue(){
        //given limit true value
        val limit = 10

        //when check the value of limit
        val result = getTopTenCountriesHaveHighestPricesOfCoke.checkTheInputOfLimit(10)

        //then the result is true
        assertEquals(true,result)

    }
    @Test
    fun should_ReturnFalse_When_InputOfLimitIsZero(){
        //given limit zero
        val limit = 0

        //when check the value of limit
        val result = getTopTenCountriesHaveHighestPricesOfCoke.checkTheInputOfLimit(0)

        //then the result is false
        assertEquals(false,result)

    }
    @Test
    fun should_ReturnFalse_When_InputOfLimitIsMinusValue(){
        //given limit minus value
        val limit = -1

        //when check the limit value
        val result = getTopTenCountriesHaveHighestPricesOfCoke.checkTheInputOfLimit(-1)

        //then return false
        assertEquals(false,result)

    }
    @Test
    fun should_ReturnFalse_When_InputIncorrect () {
        //given the in correct data
        val input = fakeData.getAllCitiesData().first()

        //when filter the low quality data
        val actualResult = getTopTenCountriesHaveHighestPricesOfCoke
            .excludeCarbonateDrinksPriceAndLowQualityData(input)

        //then the result is false
        assertEquals(false,actualResult)
    }

 }






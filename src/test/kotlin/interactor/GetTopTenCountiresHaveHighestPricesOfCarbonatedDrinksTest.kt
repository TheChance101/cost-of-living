package interactor

import fakedata.FakeData
import model.CityEntity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopTenCountriesHaveHighestPricesOfCarbonatedDrinksTest {
    private lateinit var dataSource: CostOfLivingDataSource
    private lateinit var fakeData: FakeData
    private lateinit var getTopTenCountriesHaveHighestPricesOfCoke:
            GetTopTenCountiresHaveHighestPricesOfCarbonatedDrinks


    @BeforeEach
    fun setUp() {
        fakeData = FakeData()
        dataSource=fakeData
        getTopTenCountriesHaveHighestPricesOfCoke = GetTopTenCountiresHaveHighestPricesOfCarbonatedDrinks(dataSource)
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

        //when filter frequent nouns
        val actualResult = getTopTenCountriesHaveHighestPricesOfCoke
             .getCountriesOfHighestCarbonatedDrinksPrices(3)

        //then the result
        assertEquals(listOf(Pair("Cuba",2.28F),Pair("Syria",0.82F)), actualResult)
    }
    @Test
    fun should_ReturnFalse_When_theInputOfListIsEmpty() {
        //given the country name is repeated
        val input = listOf("")

        //when filter frequent nouns
        val actualResult = getTopTenCountriesHaveHighestPricesOfCoke.
        filterTheListOfCountriesOfHighestCarbonatedDrinksPrices(input)

        //then the result
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
    fun should_ReturnFlase_When_InputOfLimitIsZero(){
        //given limit zero
        val limit = 0

        //when check the value of limit
        val result = getTopTenCountriesHaveHighestPricesOfCoke.checkTheInputOfLimit(0)

        //then the result is false
        assertEquals(false,result)

    }
    @Test
    fun should_ReturnFlase_When_InputOfLimitIsMinusValue(){
        //given limit minus value
        val limit = -1

        //when check the limit value
        val result = getTopTenCountriesHaveHighestPricesOfCoke.checkTheInputOfLimit(-1)

        //then return false
        assertEquals(false,result)

    }
    @Test
    fun bbb (){
    val input =fakeData.getAllCitiesData()
    val actualResult=getTopTenCountriesHaveHighestPricesOfCoke.excludeCarbonateDrinksPriceAndLowQualityData()
}






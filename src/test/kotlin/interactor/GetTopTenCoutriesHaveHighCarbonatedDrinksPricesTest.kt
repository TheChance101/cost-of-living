package interactor
import FakeData
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class GetTopTenCoutriesHaveHighCarbonatedDrinksPricesTest {
    private lateinit var interactor: GetTopTenCoutriesHaveHighCarbonatedDrinksPrices
    private lateinit var fakeData:FakeData

    @BeforeEach
    fun setUp() {
        fakeData=FakeData()
        interactor = GetTopTenCoutriesHaveHighCarbonatedDrinksPrices(fakeData)
    }
    @Test
    fun should_ReturnListTopTenCountriesHaveHighDrinkPrice_When_DrinkPriceHigh() {
        //given Country with drink price and limit
        val cities = fakeData.getAllCitiesData()
        val limit: Int = 10;
        //when getting a list of pair  contains the country name and drink price
        val getTop10CountriesWithHighTaxOnCarbonatedDrinks = interactor.execute(limit, cities)
        // then
        assertArrayEquals(
            listOf(
                Pair("Cuba", 2.28f),
                Pair("Syria", 0.82f),
                Pair("Gambia", 0.73f),
                Pair("Nigeria", 0.55f),
                Pair("Nepal", 0.38f),
                Pair("Uganda", 0.27f),
                Pair("Sri Lanka", 0.27f),
                Pair("Bangladesh", 0.25f)
            ).toTypedArray(),
            getTop10CountriesWithHighTaxOnCarbonatedDrinks.toTypedArray()
        )
    }
    @Test
    fun should_ReturnEmptyList_When_listOfCityIsEmpty() {
        //given
        val limit:Int=10
        val getTopTenCountriesWithHighTaxOnCarbonatedDrinks = interactor.execute(limit,listOf())
        // Then
        assertTrue(getTopTenCountriesWithHighTaxOnCarbonatedDrinks.isEmpty())
    }
    @Test
    fun should_ReturnNotEquals_When_TheListLessThanTen() {
        //given Country with drink price and limit
        val cities = fakeData.getAllCitiesData()
        val limit:Int=10
        //when getting a Data contains null price value
        val getTop10CountriesWithHighTaxOnCarbonatedDrinks= interactor.execute(limit,cities)
        //then
        kotlin.test.assertNotEquals(10 , getTop10CountriesWithHighTaxOnCarbonatedDrinks.size)
    }
    @Test
    fun should_ThrowErrorMessage_When_ThePriceIsNull() {
        //given Country with drink price and limit
        val cities = fakeData.getAllCitiesData()
        val limit:Int=10
        //when getting a Data contains null price value
        val getTop10CountriesWithHighTaxOnCarbonatedDrinks= interactor.execute(limit,cities)
        //then
        if(getTop10CountriesWithHighTaxOnCarbonatedDrinks.any { it.second == null })
            AssertionError("Drink Price can't be Null")
    }
    @Test
    fun should_ThrowErrorMessage_When_PriceIsUnderZero() {
        //given Country with drink price and limit
        val cities = fakeData.getAllCitiesData()
        val limit:Int=10;

        //when getting a price in negative
        val getTop10CountriesWithHighTaxOnCarbonatedDrinks= interactor.execute(limit,cities)
        //then
        val executable = Executable {
            if(getTop10CountriesWithHighTaxOnCarbonatedDrinks.any { it.second!! < 0  })
                throw IllegalArgumentException("Drink Price can't be Negative Value")
        }
        assertThrows(IllegalArgumentException::class.java, executable)
    }
}
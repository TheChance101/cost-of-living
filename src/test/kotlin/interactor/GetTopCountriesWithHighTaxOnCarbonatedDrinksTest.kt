package interactor
import dataSource.FakeDataSource
import org.junit.jupiter.api.function.Executable
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class GetTopCountriesWithHighTaxOnCarbonatedDrinksTest {

    private lateinit var interactor: GetTopCountriesWithHighTaxOnCarbonatedDrinks
    private lateinit var fakeDataSource: FakeDataSource

    @BeforeEach
    fun setUp() {
        fakeDataSource = FakeDataSource()
        interactor = GetTopCountriesWithHighTaxOnCarbonatedDrinks(fakeDataSource)
    }

    @Test
    fun should_ReturnListTopTenCountryWithHighDrinkPrice_When_DrinkPriceHigh() {
        //given
        val cities = fakeDataSource.getAllCitiesData()
        val limit:Int=10;
        //when
        val getTopCountriesWithHighTaxOnCarbonatedDrinks = interactor.execute(limit,cities)
       // then
        assertArrayEquals(listOf(Pair("Cuba", 2.28f), Pair("Syria", 0.82f),
            Pair("Gambia", 0.73f),Pair ("Nigeria", 0.55f), Pair("Nepal", 0.38f),
            Pair ("Uganda", 0.27f), Pair("Sri Lanka", 0.27f),
            Pair("Bangladesh", 0.25f)).toTypedArray(),
            getTopCountriesWithHighTaxOnCarbonatedDrinks.toTypedArray())

    }
    @Test
    fun should_ReturnEmptyList_When_listOfCityIsEmpty() {
        //given
        val limit:Int=10
        // when
        val getTopCountriesWithHighTaxOnCarbonatedDrinks = interactor.execute(limit,listOf())
        // Then
        assertTrue(getTopCountriesWithHighTaxOnCarbonatedDrinks.isEmpty())
    }
    @Test
    fun should_ReturnNotEquals_When_TheListLessThanLimit() {
        //given
        val cities = fakeDataSource.getAllCitiesData()
        val limit:Int=10
        //when
        val getTopCountriesWithHighTaxOnCarbonatedDrinks= interactor.execute(limit,cities)
        //then
        kotlin.test.assertNotEquals(limit , getTopCountriesWithHighTaxOnCarbonatedDrinks.size)
    }
    @Test
    fun should_ThrowErrorMessage_When_ThePriceIsNull() {
        //given
        val cities = fakeDataSource.getAllCitiesData()
        val limit:Int=10
        //when
        val getTopCountriesWithHighTaxOnCarbonatedDrinks= interactor.execute(limit,cities)
        //then
        getTopCountriesWithHighTaxOnCarbonatedDrinks.forEach { (_, price) ->
            assertNotNull(price, "Drink Price can't be Null")
        }
    }
    @Test
    @Disabled
    fun should_ThrowErrorMessage_When_PriceIsNegative() {
        //given Country with drink price and limit
        val cities = fakeDataSource.getAllCitiesData()
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




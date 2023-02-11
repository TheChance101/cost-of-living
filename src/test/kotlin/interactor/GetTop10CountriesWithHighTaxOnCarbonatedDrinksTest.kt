package interactor
import org.junit.jupiter.api.Assertions.*
import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
import org.junit.jupiter.api.Assertions.*
import dataSource.FakeDataSource
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class GetTop10CountriesWithHighTaxOnCarbonatedDrinksTest {

    private lateinit var interactor: GetTop10CountriesWithHighTaxOnCarbonatedDrinks
    private lateinit var fakeDataSource: FakeDataSource

    @BeforeEach
    fun setUp() {
        fakeDataSource = FakeDataSource()
        interactor = GetTop10CountriesWithHighTaxOnCarbonatedDrinks(fakeDataSource)
    }

    @Test
    fun should_ReturnListTopTenCountryWithHighDrinkPrice_When_DrinkPriceHigh() {
        //given Country with drink price
        val cities = fakeDataSource.getAllCitiesData()
        //when getting a list of pair  contains the country name and drink price
        val getTop10CountriesWithHighTaxOnCarbonatedDrinks = interactor.execute(cities)
        //then
        assertEquals(listOf(Pair("Cuba",2.28f),Pair("Uganda", 2.27f),Pair()),getTop10CountriesWithHighTaxOnCarbonatedDrinks)
    }
    @Test
    fun should_ReturnEmptyList_When_listOfCityIsEmpty() {
        //given
        // When limit is zero
        val getTop10CountriesWithHighTaxOnCarbonatedDrinks = interactor.execute(listOf())
        // Then
        assertTrue(getTop10CountriesWithHighTaxOnCarbonatedDrinks.isEmpty())
    }
    @Test
    fun should_ThrowException_When_ThePriceIsNull() {
        //given Country with drink price
        val cities = fakeDataSource.getAllCitiesData()
        //when getting a Data contains null price value
        val getTop10CountriesWithHighTaxOnCarbonatedDrinks= Executable{interactor.execute(cities)}
        //then
        assertThrows(Exception::class.java,getTop10CountriesWithHighTaxOnCarbonatedDrinks)
    }
    @Test
    fun should_ThrowException_When_PriceIsNegative() {
        //given Country with drink price
        val cities = fakeDataSource.getAllCitiesData()
        //when getting a price in negative
        val getTop10CountriesWithHighTaxOnCarbonatedDrinks= Executable{interactor.execute(cities)}
        //then
        assertThrows(Exception::class.java,getTop10CountriesWithHighTaxOnCarbonatedDrinks)
    }
}
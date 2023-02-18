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
    fun `should return list top countries with high drink prices when high taxes on carbonated drinks`() {
        //given limit
        val limit:Int=8;
        //when getting a list of pair  contains the countries name and drink price
        val actual = interactor.execute(limit).toTypedArray()
        val expected=listOf(
            Pair("Cuba", 2.2799999713897705),
            Pair("Syria", 0.8100000023841858),
            Pair("Gambia", 0.7300000190734863),
            Pair ("Nigeria", 0.550000011920929),
            Pair("Nepal", 0.3799999952316284),
            Pair ("Uganda", 0.27000001072883606),
            Pair("Sri Lanka", 0.27000001072883606),
            Pair("Bangladesh", 0.25)
        ).toTypedArray()
       // then
        assertArrayEquals(expected, actual)

    }
    @Test
    fun `should return empty list When list of city is empty`() {
        //given limit
        val limit:Int=10
        //when getting data source empty
        val actual = interactor.execute(limit).isEmpty()
        // Then
        assertTrue(actual)
    }
    @Test
    fun `should not return list when he actual list size less than limit`() {
        //given limit
        val limit:Int=10
        //when result less than limit
        val actual= interactor.execute(limit).size
        //then
         assertNotEquals(limit , actual)
    }
}




package interactor
import dataSource.FakeDataSource
import dataSource.FakeNullDataSource
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class GetTopCountriesWithHighTaxOnCarbonatedDrinksTest {

    private lateinit var interactor: GetTopCountriesWithHighTaxOnCarbonatedDrinks
    private lateinit var fakeDataSource: FakeDataSource
    private lateinit var emptyDataInteractor: GetTopCountriesWithHighTaxOnCarbonatedDrinks

    @BeforeEach
    fun setUp() {
        fakeDataSource = FakeDataSource()
        interactor = GetTopCountriesWithHighTaxOnCarbonatedDrinks(fakeDataSource)
        emptyDataInteractor = GetTopCountriesWithHighTaxOnCarbonatedDrinks(FakeNullDataSource())
    }

    @Test
    fun `should return list top countries with high drink prices when high taxes on carbonated drinks`() {
        //given limit
        val limit =8
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
    fun `should return empty list When filtered list of cities is empty`() {
        //given limit
        val limit =10
        //when getting data source empty
        val actual = emptyDataInteractor.execute(limit).isEmpty()
        // Then
        assertTrue(actual)
    }
    @Test
    fun `should not return list when he actual list size less than limit`() {
        //given limit
        val limit =10
        //when result less than limit
        val actual= interactor.execute(limit).size
        //then
         assertNotEquals(limit , actual)
    }
}




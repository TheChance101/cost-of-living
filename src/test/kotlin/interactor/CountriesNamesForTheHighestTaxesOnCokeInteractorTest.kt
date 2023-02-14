package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import fakedata.*
import org.hamcrest.CoreMatchers
import org.hamcrest.MatcherAssert
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class CountriesNamesForTheHighestTaxesOnCokeInteractorTest {
    private lateinit var getTheHighestTaxesOnCokeCountriesNames: CountriesNamesForTheHighestTaxesOnCokeInteractor
    private lateinit var fakeCarbonatedTaxesOnCokeCountriesData: FakeCarbonatedTaxesOnCokeCountriesData
    private lateinit var fakeDuplicatedList: FakeDuplicatedList
    private lateinit var fakeShortCarbonatedList: FakeShortCarbonatedList
    private var csvParser = CsvParser()
    private var dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    @BeforeAll
    fun setup() {
        fakeCarbonatedTaxesOnCokeCountriesData = FakeCarbonatedTaxesOnCokeCountriesData()
        fakeDuplicatedList = FakeDuplicatedList()
        fakeShortCarbonatedList = FakeShortCarbonatedList()
        getTheHighestTaxesOnCokeCountriesNames = CountriesNamesForTheHighestTaxesOnCokeInteractor(dataSource)
    }

    @Test
    fun `should return False When The List of Pairs Size Is more than 10 `() {
        //given Country limit and Data

        val countriesNamesForTheHighestTaxesOnCoke = CountriesNamesForTheHighestTaxesOnCokeInteractor(dataSource)

        val limit = 10

        //when pairOfCountryAndPrices is  less than 10 countries

        val pairOfCountryAndPrices =
            countriesNamesForTheHighestTaxesOnCoke.execute(limitOfDesiredCountries = limit)

        //then

        assertTrue(pairOfCountryAndPrices.size <= 10)
    }

    @Test
    fun `should Return False if list not equal to the top 10 countries Data `() {
        //given country limit and Data

        val countriesNamesForTheHighestTaxesOnCoke =
            CountriesNamesForTheHighestTaxesOnCokeInteractor(dataSource)

        val countriesLimit = 10

        val expected: List<Pair<String, Float>> = countriesNamesForTheHighestTaxesOnCoke.execute(countriesLimit)

        //when pairOfCountryAndPrices is not Equal to top 10 countries data

        val pairOfCountryAndPrices =
            countriesNamesForTheHighestTaxesOnCoke.execute(limitOfDesiredCountries = countriesLimit)

        val actual: List<Pair<String, Float>> = pairOfCountryAndPrices
        //then

        MatcherAssert.assertThat(actual, CoreMatchers.`is`(expected))
    }

    @Test
    fun `should return false when Two countries Have The Same Name`() {

        //given country limit and Data

        val countriesNamesForTheHighestTaxesOnCoke =
            CountriesNamesForTheHighestTaxesOnCokeInteractor(dataSource)

        //when pairOfCountryAndPrices have duplicates

        val pairOfCountryAndPrices = countriesNamesForTheHighestTaxesOnCoke.execute(10)

        //then

        assertEquals(pairOfCountryAndPrices.distinctBy { it.first }, pairOfCountryAndPrices)
    }

    @Test
    fun `should fail test if  there is negative in the Prices`() {
        //given country limit and Data

        val countriesNamesForTheHighestTaxesOnCoke =
            CountriesNamesForTheHighestTaxesOnCokeInteractor(fakeCarbonatedTaxesOnCokeCountriesData)
        val limit = 10

        //when pairOfCountryAndPrices null prices

        val pairOfCountryAndPrices =
            countriesNamesForTheHighestTaxesOnCoke.execute(limitOfDesiredCountries = limit)

        //then

        assertEquals(pairOfCountryAndPrices, pairOfCountryAndPrices.filter { it.second >= 0 })
    }


}
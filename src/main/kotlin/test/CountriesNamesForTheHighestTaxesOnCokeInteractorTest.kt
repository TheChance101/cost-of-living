package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import fakeData.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class CountriesNamesForTheHighestTaxesOnCokeInteractorTest {
    private lateinit var getTheHighestTaxesOnCokeCountriesNames: CountriesNamesForTheHighestTaxesOnCokeInteractor
    private lateinit var fakeCarbonatedTaxesOnCokeCountriesData: fakeCarbonatedTaxesOnCokeCountriesData
    private lateinit var fakeDublicatedlist: fakeDublicatedlist
    private lateinit var fakeShortCarbonatedList: fakeShortCarbonatedList
    private var csvParser = CsvParser()
    private var dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    @BeforeAll
    fun setup() {
        fakeCarbonatedTaxesOnCokeCountriesData = fakeCarbonatedTaxesOnCokeCountriesData()
        fakeDublicatedlist = fakeDublicatedlist()
        fakeShortCarbonatedList = fakeShortCarbonatedList()
        getTheHighestTaxesOnCokeCountriesNames = CountriesNamesForTheHighestTaxesOnCokeInteractor(dataSource)
    }

    @Test
    fun `should return False When The List of Pairs Size Is Not 10`() {
        //given Country limit and Data

        val countriesNamesForTheHighestTaxesOnCoke = CountriesNamesForTheHighestTaxesOnCokeInteractor(dataSource)

        val limit = 10

        //when pairOfCountryAndPrices is  less than 10 countries

        val pairOfCountryAndPrices =
            countriesNamesForTheHighestTaxesOnCoke.execute(limitOfDesiredCountries = limit)

        //then

        assertEquals(10, pairOfCountryAndPrices)
    }
}
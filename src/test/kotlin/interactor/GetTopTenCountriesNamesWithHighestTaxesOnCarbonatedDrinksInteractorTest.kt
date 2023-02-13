package interactor

import fakeDataSource.FakeDataSource
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.TestInstance
import java.lang.IllegalArgumentException

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractorTest {

    private lateinit var getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor: GetTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor
    private lateinit var fakeDataSource: FakeDataSource

    @BeforeEach
    fun setUp() {
        fakeDataSource = FakeDataSource()
        getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor = GetTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor(dataSource)
    }

    @Test
    fun testUserInput_PositiveInput() {
        // Given
        val limit = -5
        // When
        val expected = IllegalArgumentException("Please Enter Positive Limit!")
        // Then
        assertEquals(expected,getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor.execute(limit))
    }


    @Test
    fun testResultSizeLessThanGivenLimit(){
        // Given
        val limit = 25
        val data = getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor.execute(limit)
        // When
        val expectedSize = 15
        // Then
        assertEquals(expectedSize,data.size)
    }

    @Test
    fun testFilterHighDataQuality(){
        //given
        val given = listOf(FakeDataSource().getAllCitiesData()[0]
            ,FakeDataSource().getAllCitiesData()[1]
            ,FakeDataSource().getAllCitiesData()[2])
        //when
        val expected = 3
        // Then
        assertEquals(expected,getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor.filterHighQualityData(given).size)
    }

    @Test
    fun testSorting(){
        //given
        val limit = 4
        val given = listOf(fakeDataSource.getAllCitiesData()[0]
            ,fakeDataSource.getAllCitiesData()[1]
            ,fakeDataSource.getAllCitiesData()[2]
            ,fakeDataSource.getAllCitiesData()[3])

        //when
        val expected = listOf(fakeDataSource.getAllCitiesData()[2]
            ,fakeDataSource.getAllCitiesData()[0]
            ,fakeDataSource.getAllCitiesData()[3]
            ,fakeDataSource.getAllCitiesData()[1])

        // then
        assertEquals(expected,getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor.execute(limit))
    }


}
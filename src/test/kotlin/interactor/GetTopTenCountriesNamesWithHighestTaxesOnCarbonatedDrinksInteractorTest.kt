package interactor

import fakeDataSource.FakeDataSource
import fakeDataSource.TaxesFakeDataSource
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable
import kotlin.IllegalArgumentException

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractorTest {

    private lateinit var getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor: GetTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor
    private lateinit var fakeDataSource: FakeDataSource
    private lateinit var taxesFakeDataSource: TaxesFakeDataSource

    @BeforeEach
    fun setUp() {
        fakeDataSource = FakeDataSource()
        taxesFakeDataSource = TaxesFakeDataSource()
        getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor =
            GetTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor(fakeDataSource)

    }

    @Test
    fun testUserInput_PositiveInput() {
        // Given
        val limit = -5
        // When
        //throws exception
        // Then
        val executable = Executable {getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor.execute(limit)}
        assertThrows(IllegalArgumentException::class.java,executable)
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
        assertEquals(expected,getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor.ex(given).size)
    }

    @Test
    fun testSorting(){
        //given
        val limit = 4

        //when
        val expected = listOf(fakeDataSource.getAllCitiesData()[2]
            ,fakeDataSource.getAllCitiesData()[0]
            ,fakeDataSource.getAllCitiesData()[3]
            ,fakeDataSource.getAllCitiesData()[1])

        // then
        assertEquals(expected,getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor.execute(limit))
    }

    //region data quality test
    @Test
    fun should_returnTrue_when_theDataQualityIsHigh() {
        // given
        val testCity = taxesFakeDataSource.createFakeCity(
            "Egypt",
            12f,
            true
        )
        // When
        val result = getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor
            .excludeLowQualityData(testCity)
        // then
        assertTrue(result)
    }

    @Test
    fun should_returnFalse_when_theDataQualityIsLow() {
        // given
        val testCity = taxesFakeDataSource.createFakeCity(
            "Egypt",
            12f,
            false
        )
        // when
        val result = getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor
            .excludeLowQualityData(testCity)
        // then
        assertFalse(result)
    }
    //endregion

    //region country test
    @Test
    fun should_returnTrue_when_countryIsValid() {
        // given
        val testCity = taxesFakeDataSource.createFakeCity(
            "Egypt",
            13f,
            true
        )
        // when
        val result = getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor
            .excludeInvalidCountries(testCity)
        // then
        assertTrue(result)
    }

    @Test
    fun should_returnFalse_when_countryIsEmpty() {
        // given
        val testCity = taxesFakeDataSource.createFakeCity(
            "      ",
            13f,
            true
        )
        // when
        val result = getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor
            .excludeInvalidCountries(testCity)
        // then
        assertFalse(result)
    }

    @Test
    fun should_returnFalse_when_countryLengthIsInvalid() {
        // given
        val testCity = taxesFakeDataSource.createFakeCity(
            "asd",
            13f,
            true
        )
        // when
        val result = getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor
            .excludeInvalidCountries(testCity)
        // then
        assertFalse(result)
    }

    @Test
    fun should_returnFalse_when_countryNameIsInvalidWithFirstCharacter() {
        // given
        val testCity = taxesFakeDataSource.createFakeCity(
            "egypt",
            13f,
            true
        )
        // when
        val result = getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor
            .excludeInvalidCountries(testCity)
        // then
        assertFalse(result)
    }

    //endregion

    //region drink price test
    @Test
    fun should_returnTrue_when_drinkPriceIsNotNull() {
        // given
        val testCity = taxesFakeDataSource.createFakeCity(
            "Egypt",
            13f,
            true
        )
        // when
        val result = getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor
            .excludeInvalidDrinksPrice(testCity)
        // then
        assertTrue(result)
    }

    @Test
    fun should_returnFalse_when_drinkPriceIsNull() {
        // given
        val testCity = taxesFakeDataSource.createFakeCity(
            "Iraq", null,
            true
        )
        // when
        val result = getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor
            .excludeInvalidDrinksPrice(testCity)
        // then
        assertFalse(result)
    }

    @Test
    fun should_returnTrue_when_drinkPriceIsValid() {
        // given
        val city = taxesFakeDataSource.createFakeCity(
            "Iraq",
            14f,
            true
        )
        // when
        val result = getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor
            .excludeInvalidDrinksPrice(city)
        // then
        assertTrue(result)
    }

    @Test
    fun should_return_when_drinkPriceIsInvalid() {
        // given
        val city = taxesFakeDataSource.createFakeCity(
            "Qatar",
            -5.15f,
            true
        )
        // when
        val result = getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor
            .excludeInvalidDrinksPrice(city)
        // then
        assertFalse(result)
    }
    //endregion


}
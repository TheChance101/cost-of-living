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
        val executable =
            Executable { getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor.execute(limit) }
        assertThrows(IllegalArgumentException::class.java, executable)
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

    @Test
    fun should_returnFalse_when_countryNameContainDigit() {
        // given
        val city = taxesFakeDataSource.createFakeCity(
            "a123456",
            17.5f,
            true
        )
        // when
        val result = getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor
            .excludeInvalidCountries(city)
        // then
        assertFalse(result)
    }

    @Test
    fun should_returnFalse_when_countryNameContainSymbols() {
        // given
        val city = taxesFakeDataSource.createFakeCity(
            "Symbols!@#",
            17.5f,
            true
        )
        // when
        val result = getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor
            .excludeInvalidCountries(city)
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

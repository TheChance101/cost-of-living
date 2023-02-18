package interactor

import fakeDataSource.TaxesFakeDataSource
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable
import kotlin.IllegalArgumentException

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractorTest {

    private lateinit var getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor:
            GetTopCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor

    private lateinit var taxesFakeDataSource: TaxesFakeDataSource

    @BeforeEach
    fun setUp() {
        taxesFakeDataSource = TaxesFakeDataSource()
        getTopTenCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor =
            GetTopCountriesNamesWithHighestTaxesOnCarbonatedDrinksInteractor(
                taxesFakeDataSource.getTwentyFakeCityData())
    }

    @Test
    fun should_Throw_Exception_When_Input_ZeroOrLess() {
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
    fun should_Return_True_When_theDataQualityIsHigh() {
        // given
        val testCity = taxesFakeDataSource.checkDataQuality()
        // When
        val result = excludeLowQualityData(testCity)
        // then
        assertTrue(result)
    }

    @Test
    fun should_ReturnFalse_When_theDataQualityIsLow() {
        // given
        val testCity = taxesFakeDataSource.getLowQualityAssertion()
        // when
        val result = excludeLowQualityData(testCity)
        // then
        assertFalse(result)
    }
    //endregion

    //region country test
    @Test
    fun should_Return_True_When_countryIsValid() {
        // given
        val testCity = taxesFakeDataSource.getValidCountry()
        // when
        val result = excludeInvalidCountries(testCity)
        // then
        assertTrue(result)
    }

    @Test
    fun should_Return_False_When_countryIsEmpty() {
        // given
        val testCity = taxesFakeDataSource.getEmptyCountry()
        // when
        val result = excludeInvalidCountries(testCity)
        // then
        assertFalse(result)
    }

    @Test
    fun should_Return_False_When_countryLengthIsInvalid() {
        // given
        val testCity = taxesFakeDataSource.getInvalidLengthCity()
        // when
        val result = excludeInvalidCountries(testCity)
        // then
        assertFalse(result)
    }

    @Test
    fun should_Return_False_When_countryNameIsInvalidWithFirstCharacter() {
        // given
        val testCity = taxesFakeDataSource.getInvalidLengthCity()
        // when
        val result = excludeInvalidCountries(testCity)
        // then
        assertFalse(result)
    }

    @Test
    fun should_Return_False_When_CountryNameContainDigit() {
        // given
        val city = taxesFakeDataSource.getCountryNameContainsDigits()
        // when
        val result = excludeInvalidCountries(city)
        // then
        assertFalse(result)
    }

    @Test
    fun should_Return_False_When_countryNameContainSymbols() {
        // given
        val city = taxesFakeDataSource.getCountryNameContainsSymbols()
        // when
        val result = excludeInvalidCountries(city)
        // then
        assertFalse(result)
    }
    //endregion

    //region drink price test
    @Test
    fun should_Return_True_When_drinkPriceIsNotNull() {
        // given
        val testCity = taxesFakeDataSource.getDataHasDrinkPriceIsNotNull()

        // when
        val result = excludeInvalidDrinksPrice(testCity)
        // then
        assertTrue(result)
    }

    @Test
    fun should_Return_False_When_drinkPriceIsNull() {
        // given
        val testCity = taxesFakeDataSource.getNullDrinkPrice()
        // when
        val result = excludeInvalidDrinksPrice(testCity)
        // then
        assertFalse(result)
    }

    @Test
    fun should_Return_True_When_drinkPriceIsValid() {
        // given
        val city = taxesFakeDataSource.getValidPrice()
        // when
        val result = excludeInvalidDrinksPrice(city)
        // then
        assertTrue(result)
    }

    @Test
    fun should_Return_When_drinkPriceIsInvalid() {
        // given
        val city = taxesFakeDataSource.getInvalidDrinkPrices()
        // when
        val result = excludeInvalidDrinksPrice(city)
        // then
        assertFalse(result)
    }
    //endregion

}

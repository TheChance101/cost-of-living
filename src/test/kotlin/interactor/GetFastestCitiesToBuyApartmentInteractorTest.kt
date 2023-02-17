package interactor

import fakeDataSource.*
import model.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.function.Executable
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetFastestCitiesToBuyApartmentInteractorTest {

    private val fastestCitiesToBuyApartmentFakeData = FastestCitiesToBuyApartmentFakeData()

    @Test
    fun should_ReturnTrue_When_DataQualityIsLow() {
        //given
        val lowQualityData = fastestCitiesToBuyApartmentFakeData.getLowQualityCities()
        //when
        val fastestCitiesToBuyAPT = GetFastestCitiesToBuyApartmentInteractor(lowQualityData)
        val result = fastestCitiesToBuyAPT.execute(10).isEmpty()
        //then
        assertTrue(result)
    }

    @Test
    fun should_ReturnTrue_When_PricePerSquareMeterOutsideCentreISNull() {
        //given
        val missingPricePerSquareMeterOutsideCentre =
            fastestCitiesToBuyApartmentFakeData.getMissingPricePerSquareMeterOutsideCentre()
        //when
        val fastestCitiesToBuyAPT = GetFastestCitiesToBuyApartmentInteractor(missingPricePerSquareMeterOutsideCentre)
        val result = fastestCitiesToBuyAPT.execute(10).isEmpty()
        //then
        assertTrue(result)
    }

    @Test
    fun should_ReturnTrue_When_SalaryIsNull() {
        //given
        val nullsSalary = fastestCitiesToBuyApartmentFakeData.getMissingSalary()
        //when
        val fastestCitiesToBuyAPT = GetFastestCitiesToBuyApartmentInteractor(nullsSalary)
        val result = fastestCitiesToBuyAPT.execute(10).isEmpty()
        //then
        assertTrue(result)
    }

    @Test
    fun should_ReturnTrue_When_TheLengthIs10() {

        //given
        val variousData = fastestCitiesToBuyApartmentFakeData.getVariousData()
        //when
        val fastest10CitiesToBuyAPT = GetFastestCitiesToBuyApartmentInteractor(variousData)
        val result = fastest10CitiesToBuyAPT.execute(10)
        //then
        assertEquals(10, result.size)
    }

    @Test
    fun should_ReturnCorrectNumberOfYears_WhenEnterAValidCityData() {
        //given
        val cityEntity = fastestCitiesToBuyApartmentFakeData.getSingleCityEntity()
        val expected = fastestCitiesToBuyApartmentFakeData.getExpectedResultOfNumberOfYearsForSingleCityEntity()

        //when
        val numberOfYears = calculateNumberOfYearsToBuyAPT(cityEntity)

        //then
        assertEquals(expected, numberOfYears)

    }

    @Test
    fun should_ReturnCorrectListOfPairs_When_InputIsCorrect() {
        //given
        val fastestCitiesToBuyAPT =
            GetFastestCitiesToBuyApartmentInteractor(fastestCitiesToBuyApartmentFakeData.getVariousData())
        val expectedList = fastestCitiesToBuyApartmentFakeData.getExpectedResultForVariousData()
        //when
        val result = fastestCitiesToBuyAPT.execute(10)
        //then
        assertEquals(expectedList, result)
    }

    @Test
    fun should_throwException_when_theLimitIsZeroOrNegativeValue() {
        // given
        val given = IllegalArgumentException::class.java
        val fastestCitiesToBuyAPT =
            GetFastestCitiesToBuyApartmentInteractor(fastestCitiesToBuyApartmentFakeData.getVariousData())
        // when
        val result = Executable { fastestCitiesToBuyAPT.execute(0) }

        // then
        assertThrows(given, result)
    }

    //region data quality test
    @Test
    fun should_returnTrue_when_theDataQualityIsHigh() {
        // Given a high quality data
        val city = fastestCitiesToBuyApartmentFakeData.createCustomCity(12.5f, 15.4f, true)
        // When checking a high quality data
        val result = excludeLowQualityData(city)
        // Then the result should be true
        assertTrue(result)
    }

    @Test
    fun should_returnFalse_when_theDataQualityIsLow() {
        // Given a low quality data
        val city = fastestCitiesToBuyApartmentFakeData.createCustomCity(12.5f, 15.4f, false)
        // When checking low quality data
        val result = excludeLowQualityData(city)
        // Then the result should be false
        assertFalse(result)
    }
    //endregion

    //region salary testing
    @Test
    fun should_returnTrue_when_salaryIsNotNull() {
        // Given a not null salary
        val city = fastestCitiesToBuyApartmentFakeData.createCustomCity(12f, 13f, true)
        // When checking for the not null salary
        val result = excludeInvalidSalaries(city)
        // Then the result should be true
        assertTrue(result)
    }

    @Test
    fun should_returnFalse_when_salaryIsNull() {
        // Given a null salary
        val city = fastestCitiesToBuyApartmentFakeData.createCustomCity(12f, null, true)
        // When checking for the null salary
        val result = excludeInvalidSalaries(city)
        // Then the result should be false
        assertFalse(result)
    }

    @Test
    fun should_returnTrue_when_salaryValueIsValid() {
        // Given a valid salary
        val city = fastestCitiesToBuyApartmentFakeData.createCustomCity(12f, 14f, true)
        // when checking for a valid salary
        val result = excludeInvalidSalaries(city)
        // then the result should be true
        assertTrue(result)
    }

    @Test
    fun should_return_when_salaryValueIsInvalid() {
        // Given an Invalid salary
        val city = fastestCitiesToBuyApartmentFakeData.createCustomCity(12f, -5f, true)
        // when checking for an Invalid salary
        val result = excludeInvalidSalaries(city)
        // then the result should be false
        assertFalse(result)
    }

    //endregion

    //region apartment Price test
    @Test
    fun should_returnTrue_when_apartmentPriceIsNotNull() {
        // Given a not null pricePerSquareMeter
        val city = fastestCitiesToBuyApartmentFakeData.createCustomCity(12f, 873.35f, true)
        // When checking for a not null apartment price
        val result = excludeInvalidApartmentPrice(city)
        // Then the result should be true
        assertTrue(result)
    }

    @Test
    fun should_returnFalse_when_apartmentPriceIsNull() {
        // Given a null pricePerSquareMeter
        val city = fastestCitiesToBuyApartmentFakeData.createCustomCity(null, 45.4f, true)
        // When checking a null salary, null apartment price and low quality data
        val result = excludeInvalidApartmentPrice(city)
        // Then the result should be false
        assertFalse(result)
    }

    @Test
    fun should_returnTrue_when_apartmentPriceIsValid() {
        // Given a valid pricePerSquareMeter
        val city = fastestCitiesToBuyApartmentFakeData.createCustomCity(26f, 4569.4f, false)
        // When checking a valid apartment price
        val result = excludeInvalidApartmentPrice(city)
        // Then the result should be true
        assertTrue(result)
    }

    @Test
    fun should_returnFalse_when_apartmentPriceIsInvalid() {
        // Given an Invalid pricePerSquareMeter
        val city = fastestCitiesToBuyApartmentFakeData.createCustomCity(0f, 56f, true)
        // When checking an Invalid apartment price
        val result = excludeInvalidApartmentPrice(city)
        // Then the result should be false
        assertFalse(result)
    }
    //endregion


}
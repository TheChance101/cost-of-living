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

    private val fakeDataSourceForFastestCitiesToBuyApartment = FakeDataSourceForFastestCitiesToBuyApartment()

    @Test
    fun should_ReturnTrue_When_DataQualityIsLow() {
        //given
        val lowQualityData = fakeDataSourceForFastestCitiesToBuyApartment.getLowQualityCities()
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
            fakeDataSourceForFastestCitiesToBuyApartment.getMissingPricePerSquareMeterOutsideCentre()
        //when
        val fastestCitiesToBuyAPT = GetFastestCitiesToBuyApartmentInteractor(missingPricePerSquareMeterOutsideCentre)
        val result = fastestCitiesToBuyAPT.execute(10).isEmpty()
        //then
        assertTrue(result)
    }

    @Test
    fun should_ReturnTrue_When_SalaryIsNull() {
        //given
        val nullsSalary = fakeDataSourceForFastestCitiesToBuyApartment.getMissingSalary()
        //when
        val fastestCitiesToBuyAPT = GetFastestCitiesToBuyApartmentInteractor(nullsSalary)
        val result = fastestCitiesToBuyAPT.execute(10).isEmpty()
        //then
        assertTrue(result)
    }

    @Test
    fun should_ReturnTrue_When_TheLengthIs10() {

        //given
        val variousData = fakeDataSourceForFastestCitiesToBuyApartment.getVariousData()
        //when
        val fastest10CitiesToBuyAPT = GetFastestCitiesToBuyApartmentInteractor(variousData)
        val result = fastest10CitiesToBuyAPT.execute(10)
        //then
        assertEquals(10, result.size)
    }

    @Test
    fun should_ReturnCorrectNumberOfYears_WhenEnterAValidCityData() {
        //given
        val cityEntity = fakeDataSourceForFastestCitiesToBuyApartment.getSingleCityEntity()
        val expected = fakeDataSourceForFastestCitiesToBuyApartment.getExpectedResultOfNumberOfYearsForSingleCityEntity()

        //when
        val numberOfYears = calculateNumberOfYearsToBuyAPT(cityEntity)

        //then
        assertEquals(expected, numberOfYears)

    }

    @Test
    fun should_ReturnCorrectListOfPairs_When_InputIsCorrect() {
        //given
        val fastestCitiesToBuyAPT =
            GetFastestCitiesToBuyApartmentInteractor(fakeDataSourceForFastestCitiesToBuyApartment.getVariousData())
        val expectedList = fakeDataSourceForFastestCitiesToBuyApartment.getExpectedResultForVariousData()
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
            GetFastestCitiesToBuyApartmentInteractor(fakeDataSourceForFastestCitiesToBuyApartment.getVariousData())
        // when
        val result = Executable { fastestCitiesToBuyAPT.execute(0) }

        // then
        assertThrows(given, result)
    }

    //region data quality test
    @Test
    fun should_returnTrue_when_theDataQualityIsHigh() {
        // Given a high quality data
        val city = fakeDataSourceForFastestCitiesToBuyApartment.createFakeCity(
            apartmentPrice = 12.5f,
            salary = 15.4f,
            dataQuality = true
        )
        // When checking a high quality data
        val result = excludeLowQualityCityData(city)
        // Then the result should be true
        assertTrue(result)
    }

    @Test
    fun should_returnFalse_when_theDataQualityIsLow() {
        // Given a low quality data
        val city = fakeDataSourceForFastestCitiesToBuyApartment.createFakeCity(
            apartmentPrice = 12.5f,
            salary = 15.4f,
            dataQuality = false
        )
        // When checking low quality data
        val result = excludeLowQualityCityData(city)
        // Then the result should be false
        assertFalse(result)
    }
    //endregion

    //region salary testing
    @Test
    fun should_returnTrue_when_salaryIsNotNull() {
        // Given a not null salary
        val city =
            fakeDataSourceForFastestCitiesToBuyApartment.createFakeCity(apartmentPrice = 12f, salary = 13f, dataQuality = true)
        // When checking for the not null salary
        val result = excludeInvalidSalaries(city)
        // Then the result should be true
        assertTrue(result)
    }

    @Test
    fun should_returnFalse_when_salaryIsNull() {
        // Given a null salary
        val city =
            fakeDataSourceForFastestCitiesToBuyApartment.createFakeCity(apartmentPrice = 12f, salary = null, dataQuality = true)
        // When checking for the null salary
        val result = excludeInvalidSalaries(city)
        // Then the result should be false
        assertFalse(result)
    }

    @Test
    fun should_returnTrue_when_salaryValueIsValid() {
        // Given a valid salary
        val city =
            fakeDataSourceForFastestCitiesToBuyApartment.createFakeCity(apartmentPrice = 12f, salary = 14f, dataQuality = true)
        // when checking for a valid salary
        val result = excludeInvalidSalaries(city)
        // then the result should be true
        assertTrue(result)
    }

    @Test
    fun should_return_when_salaryValueIsInvalid() {
        // Given an Invalid salary
        val city =
            fakeDataSourceForFastestCitiesToBuyApartment.createFakeCity(apartmentPrice = 12f, salary = -5f, dataQuality = true)
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
        val city = fakeDataSourceForFastestCitiesToBuyApartment.createFakeCity(
            apartmentPrice = 12f,
            salary = 873.35f,
            dataQuality = true
        )
        // When checking for a not null apartment price
        val result = excludeInvalidApartmentPrice(city)
        // Then the result should be true
        assertTrue(result)
    }

    @Test
    fun should_returnFalse_when_apartmentPriceIsNull() {
        // Given a null pricePerSquareMeter
        val city = fakeDataSourceForFastestCitiesToBuyApartment.createFakeCity(
            apartmentPrice = null,
            salary = 45.4f,
            dataQuality = true
        )
        // When checking a null salary, null apartment price and low quality data
        val result = excludeInvalidApartmentPrice(city)
        // Then the result should be false
        assertFalse(result)
    }

    @Test
    fun should_returnTrue_when_apartmentPriceIsValid() {
        // Given a valid pricePerSquareMeter
        val city = fakeDataSourceForFastestCitiesToBuyApartment.createFakeCity(
            apartmentPrice = 26f,
            salary = 4569.4f,
            dataQuality = false
        )
        // When checking a valid apartment price
        val result = excludeInvalidApartmentPrice(city)
        // Then the result should be true
        assertTrue(result)
    }

    @Test
    fun should_returnFalse_when_apartmentPriceIsInvalid() {
        // Given an Invalid pricePerSquareMeter
        val city =
            fakeDataSourceForFastestCitiesToBuyApartment.createFakeCity(apartmentPrice = 0f, salary = 56f, dataQuality = true)
        // When checking an Invalid apartment price
        val result = excludeInvalidApartmentPrice(city)
        // Then the result should be false
        assertFalse(result)
    }
    //endregion


}
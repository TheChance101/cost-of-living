package interactor

import model.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetFastest10CitiesToBuyAPTInteractorTest {

    private val getFastest10CitiesToBuyAPT = GetFastest10CitiesToBuyAPTInteractor(getVariousData())
    @Test
    fun `should avoid low quality`() {
        //given
        val fastestCitiesToBuyAPT = GetFastest10CitiesToBuyAPTInteractor(getLowQualityCities())

        //when
        val result = fastestCitiesToBuyAPT.execute()

        //then
        assertTrue(result.isEmpty())

    }

    @Test
    fun `should avoid missing price per square meter outside centre`() {
        //given
        val fastestCitiesToBuyAPT = GetFastest10CitiesToBuyAPTInteractor(getMissingPricePerSquareMeterOutsideCentre())
        //when
        val result = fastestCitiesToBuyAPT.execute()
        //then
        assertTrue(result.isEmpty())

    }

    // should skip
    @Test
    fun `should avoid missing salary`() {
        //given
        val fastestCitiesToBuyAPT = GetFastest10CitiesToBuyAPTInteractor(getMissingSalary())
        //when
        val result = fastestCitiesToBuyAPT.execute()
        //then
        assertTrue(result.isEmpty())

    }

    @Test
    fun `list size should be 10`() {

        val fastest10CitiesToBuyAPT = GetFastest10CitiesToBuyAPTInteractor(getAcceptable11Element())
        //when
        val result = fastest10CitiesToBuyAPT.execute()
        //then
        assertEquals(10, result.size)

    }

    @Test
    fun `should return correct data`() {
        //given
        val fastest10CitiesToBuyAPT = GetFastest10CitiesToBuyAPTInteractor(getVariousData())
        val expectedList = listOf(
            Pair("City11", 43.47826086956522),
            Pair("City12", 44.87179487179487),
            Pair("City13", 46.51162790697674),
            Pair("City14", 47.36842105263158),
            Pair("City15", 100.0),
            Pair("City16", 100.0),
            Pair("City17", 120.0),
            Pair("City18", 225.0),
            Pair("City19", 250.0),
            Pair("City20", 300.0)
        )
        //when
        val result = fastest10CitiesToBuyAPT.execute()

        //then
        assertEquals(expectedList, result)
    }

    //region data quality test
    @Test
    fun should_returnTrue_when_theDataQualityIsHigh() {
        // Given a high quality data
        val city = getCityWithCustomNeeds(12.5f, 15.4f, true)
        // When checking a high quality data
        val result = getFastest10CitiesToBuyAPT.excludeLowQualityData(city)
        // Then the result should be true
        assertTrue(result)
    }

    @Test
    fun should_returnFalse_when_theDataQualityIsLow() {
        // Given a low quality data
        val city = getCityWithCustomNeeds(12.5f, 15.4f, false)
        // When checking low quality data
        val result = getFastest10CitiesToBuyAPT.excludeLowQualityData(city)
        // Then the result should be false
        assertFalse(result)
    }
    //endregion

    //region salary testing
    @Test
    fun should_returnTrue_when_salaryIsNotNull() {
        // Given a not null salary
        val city = getCityWithCustomNeeds(12f,13f, true)
        // When checking for the not null salary
        val result = getFastest10CitiesToBuyAPT.excludeInvalidSalaries(city)
        // Then the result should be true
        assertTrue(result)
    }

    @Test
    fun should_returnFalse_when_salaryIsNull() {
        // Given a null salary
        val city = getCityWithCustomNeeds(12f, null, true)
        // When checking for the null salary
        val result = getFastest10CitiesToBuyAPT.excludeInvalidSalaries(city)
        // Then the result should be false
        assertFalse(result)
    }

    @Test
    fun should_returnTrue_when_salaryValueIsValid() {
        // Given a valid salary
        val city = getCityWithCustomNeeds(12f, 14f, true)
        // when checking for a valid salary
        val result = getFastest10CitiesToBuyAPT.excludeInvalidSalaries(city)
        // then the result should be true
        assertTrue(result)
    }
    @Test
    fun should_return_when_salaryValueIsInvalid() {
        // Given an Invalid salary
        val city = getCityWithCustomNeeds(12f, -5f, true)
        // when checking for an Invalid salary
        val result = getFastest10CitiesToBuyAPT.excludeInvalidSalaries(city)
        // then the result should be false
        assertFalse(result)
    }

    //endregion

    //region apartment Price test
    @Test
    fun should_returnTrue_when_apartmentPriceIsNotNull() {
        // Given a not null pricePerSquareMeter
        val city = getCityWithCustomNeeds(12f, 873.35f, true)
        // When checking for a not null apartment price
        val result = getFastest10CitiesToBuyAPT.excludeInvalidApartmentPrice(city)
        // Then the result should be true
        assertTrue(result)
    }

    @Test
    fun should_returnFalse_when_apartmentPriceIsNull() {
        // Given a null pricePerSquareMeter
        val city = getCityWithCustomNeeds(null, 45.4f, true)
        // When checking a null salary, null apartment price and low quality data
        val result = getFastest10CitiesToBuyAPT.excludeInvalidApartmentPrice(city)
        // Then the result should be false
        assertFalse(result)
    }

    @Test
    fun should_returnTrue_when_apartmentPriceIsValid() {
        // Given a valid pricePerSquareMeter
        val city = getCityWithCustomNeeds(26f, 4569.4f, false)
        // When checking a valid apartment price
        val result = getFastest10CitiesToBuyAPT.excludeInvalidApartmentPrice(city)
        // Then the result should be true
        assertTrue(result)
    }

    @Test
    fun should_returnFalse_when_apartmentPriceIsInvalid() {
        // Given an Invalid pricePerSquareMeter
        val city = getCityWithCustomNeeds(0f, 56f, true)
        // When checking an Invalid apartment price
        val result = getFastest10CitiesToBuyAPT.excludeInvalidApartmentPrice(city)
        // Then the result should be false
        assertFalse(result)
    }
    //endregion

}
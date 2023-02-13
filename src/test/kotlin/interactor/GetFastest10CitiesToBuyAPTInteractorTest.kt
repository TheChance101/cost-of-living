package interactor

import fakeDataSource.*
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
    fun should_ReturnTrue_When_DataQualityIsLow() {
        //given
        val lowQualityData  = getLowQualityCities()
        //when
        val fastestCitiesToBuyAPT = GetFastest10CitiesToBuyAPTInteractor(lowQualityData)
        val result = fastestCitiesToBuyAPT.execute()
        //then
        assertTrue(result.isEmpty())
    }
    @Test
    fun should_ReturnTrue_When_PricePerSquareMeterOutsideCentreISNull() {
        //given
        val missingPPS = getMissingPricePerSquareMeterOutsideCentre()
        //when
        val fastestCitiesToBuyAPT = GetFastest10CitiesToBuyAPTInteractor(missingPPS)
        val result = fastestCitiesToBuyAPT.execute()
        //then
        assertTrue(result.isEmpty())
    }
    @Test
    fun should_ReturnTrue_When_SalaryIsNull() {
        //given
        val nullsSalary = getMissingSalary()
        //when
        val fastestCitiesToBuyAPT = GetFastest10CitiesToBuyAPTInteractor(nullsSalary)
        val result = fastestCitiesToBuyAPT.execute()
        //then
        assertTrue(result.isEmpty())
    }

    @Test
    fun should_ReturnTrue_When_TheLengthIs10() {

        //given
        val variousData = getVariousData()
        //when
        val fastest10CitiesToBuyAPT = GetFastest10CitiesToBuyAPTInteractor(variousData)
        val result = fastest10CitiesToBuyAPT.execute()
        //then
        assertEquals(10, result.size)
    }

    @Test
    fun should_ReturnCorrectNumberOfYears_When() {
        //given
        val cityEntity = CityEntity(
            "City11",
            "Country11",
            MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, null, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(
                apartmentOneBedroomInCityCentre = null,
                apartmentOneBedroomOutsideOfCentre = null,
                apartment3BedroomsInCityCentre = null,
                apartment3BedroomsOutsideOfCentre = null,
                pricePerSquareMeterToBuyApartmentInCityCentre = null,
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 3000f
            ),
            6900f,
            true
        )
        val expected = 43.47826f

        //when
        val numberOfYears = calculateNumberOfYearsToBuyAPT(cityEntity)

        //then
        assertEquals(expected,numberOfYears.toFloat())

    }

    @Test
    fun should_ReturnCorrectListOfPairs_When_InputIsCorrect() {
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
        val city = getCityWithCustomNeeds(12f, 13f, true)
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
package interactor

import fakedata.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCitiesLeastAvgCarPricesInteractorTest {
    private lateinit var interactor: GetCitiesLeastAvgCarPricesInteractor

    @Test
    fun should_ReturnTopCityNames_when_inputIsValid() {
        // Given
        interactor = GetCitiesLeastAvgCarPricesInteractor(QualityCities())
        val expected = top10CitiesSorted()
        // When
        val result = interactor.execute(10)
        // Then
        assertContentEquals(expected, result)
    }

    @Test
    fun should_ReturnEmptyList_when_allCarsAreNull() {
        // Given
        interactor = GetCitiesLeastAvgCarPricesInteractor(CitiesWithNullCarPrices())
        // When
        val result = interactor.execute(10)
        // Then
        assertContentEquals(emptyList(), result)
    }

    @Test
    fun should_ReturnMaxLimitSize_when_inputIsValid() {
        // Given
        interactor = GetCitiesLeastAvgCarPricesInteractor(QualityCities())
        // When
        val result = interactor.execute(10).size
        // Then
        assertEquals(10, result)
    }

    @Test
    fun should_ReturnEmptyList_when_salaryIsNull() {
        // Given
        interactor = GetCitiesLeastAvgCarPricesInteractor(CitiesWithNullSalary())
        // When
        val result = interactor.execute(10)
        // Then
        assertEquals(emptyList(), result)
    }

    @Test
    fun should_ReturnLessSize_when_inputHasDuplicates() {
        // Given
        val testCity = CitiesWithTwoDuplicates()
        interactor = GetCitiesLeastAvgCarPricesInteractor(testCity)
        // When
        val actual = testCity.getAllCitiesData().size
        val result = interactor.execute(10)
        // Then
        assertNotEquals(actual, result.size)
    }
    @Test
    fun should_ReturnEmptyList_when_inputIsLowQualityData() {
        // Given
        interactor = GetCitiesLeastAvgCarPricesInteractor(CitiesWithLowQualityData())
        // When
        val result = interactor.execute(10)
        // Then
        assertEquals(emptyList(), result)
    }
    @Test
    fun should_ReturnEmptyList_when_carPricesAreNegative() {
        // Given
        interactor = GetCitiesLeastAvgCarPricesInteractor(CitiesWithNegativeCarPrices())
        // When
        val result = interactor.execute(10)
        // Then
        assertEquals(emptyList(), result)
    }
}
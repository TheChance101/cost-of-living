package interactor

import fakedata.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityNamesWithLeastAvgCarPricesInteractorTest {
    private lateinit var interactor: GetCityNamesWithLeastAvgCarPricesInteractor
    private lateinit var expectedTop10Cities: List<Pair<String, Float>>

    @BeforeAll
    fun init() {
        expectedTop10Cities = top10CitiesSorted()
    }

    @Test
    fun should_ReturnTopCityNames_when_inputIsValid() {
        // Given
        interactor = GetCityNamesWithLeastAvgCarPricesInteractor(QualityCities())
        // When
        val result = interactor.execute(10)
        // Then
        assertContentEquals(expectedTop10Cities, result)
    }

    @Test
    fun should_ReturnEmptyList_when_allCarsAreNull() {
        // Given
        interactor = GetCityNamesWithLeastAvgCarPricesInteractor(CitiesWithNullCarPrices())
        // When
        val result = interactor.execute(10)
        // Then
        assertContentEquals(emptyList(), result)
    }

    @Test
    fun should_ReturnMaxLimitSize_when_inputIsValid() {
        // Given
        interactor = GetCityNamesWithLeastAvgCarPricesInteractor(QualityCities())
        // When
        val result = interactor.execute(10)
        // Then
        assertEquals(10, result.size)
    }


    @Test
    fun should_ReturnLessSize_when_inputHasDuplicates() {
        // Given
        val testCity = CitiesWithTwoDuplicates()
        interactor = GetCityNamesWithLeastAvgCarPricesInteractor(testCity)
        // When
        val actual = testCity.getAllCitiesData().size
        val result = interactor.execute(10)
        // Then
        assertNotEquals(actual, result.size)
    }

    @Test
    fun should_ReturnEmptyList_when_carPricesAreNegative() {
        // Given
        interactor = GetCityNamesWithLeastAvgCarPricesInteractor(CitiesWithNegativeCarPrices())
        // When
        val result = interactor.execute(10)
        // Then
        assertEquals(emptyList(), result)
    }

}
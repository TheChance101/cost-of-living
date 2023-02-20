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
    private lateinit var duplicateCities : CitiesWithTwoDuplicates

    @BeforeAll
    fun init() {
        expectedTop10Cities = top10CitiesSorted()
        duplicateCities = CitiesWithTwoDuplicates()
    }

    @Test
    fun should_ReturnTopCityNames_when_inputIsValid() {
        // Given list of valid cities
        interactor = GetCityNamesWithLeastAvgCarPricesInteractor(QualityCities())
        // When get top 10 cities
        val result = interactor.execute(10)
        // Then result must equal expected
        assertContentEquals(expectedTop10Cities, result)
    }

    @Test
    fun should_ReturnEmptyList_when_allCarsAreNull() {
        // Given list of cities with null car prices
        interactor = GetCityNamesWithLeastAvgCarPricesInteractor(CitiesWithNullCarPrices())
        // When get top 10 cities
        val result = interactor.execute(10)
        // Then result must equal an empty list
        assertContentEquals(emptyList(), result)
    }

    @Test
    fun should_ReturnMaxLimitSize_when_inputIsValid() {
        // Given list of cities with null car prices
        interactor = GetCityNamesWithLeastAvgCarPricesInteractor(QualityCities())
        // When get top 10 cities
        val result = interactor.execute(10)
        // Then size must equal 10
        assertEquals(10, result.size)
    }


    @Test
    fun should_ReturnLessSize_when_inputHasDuplicates() {
        // Given list of cities with duplicates
        interactor = GetCityNamesWithLeastAvgCarPricesInteractor(duplicateCities)
        // When get top 10 cities
        val result = interactor.execute(10)
        // Then result size must equal expected
        assertNotEquals(duplicateCities.getAllCitiesData().size, result.size)
    }

    @Test
    fun should_ReturnEmptyList_when_carPricesAreNegative() {
        // Given list of cities with negative car prices
        interactor = GetCityNamesWithLeastAvgCarPricesInteractor(CitiesWithNegativeCarPrices())
        // When get top 10 cities
        val result = interactor.execute(10)
        // Then result must be an empty list
        assertEquals(emptyList(), result)
    }

}
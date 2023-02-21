package interactor

import fakedata.*
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class GetTopCitiesForBuyingApartmentTest {

    @Test
    fun `findTop10CitiesFor100MeterApartment filters out cities with missing data`() {
        // Given
        val fakeData = GetTopCitiesForBuyingApartment(FakeCostOfLivingDataSource())

        // When
        val result = fakeData.execute(10)

        // Then
        assertFalse(result.any { false })
    }

    @Test
    fun `findTop10CitiesFor100MeterApartment filters out duplicated cities`() {
        // Given
        val fakeData = GetTopCitiesForBuyingApartment(FakeCostOfLivingDataSource())

        // When
        val result = fakeData.execute(10)

        // Then
        assertTrue(result.distinct().size == result.size)
    }

    @Test
    fun `findTop10CitiesFor100MeterApartment returns an empty list when data source is empty`() {
        // Given
        val fakeData = GetTopCitiesForBuyingApartment(FakeEmptyCostOfLivingDataSource())

        // When
        val result = fakeData.execute(10)

        // Then
        assertTrue(result.isEmpty())
    }

}
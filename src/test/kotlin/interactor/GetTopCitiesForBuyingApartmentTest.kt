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
        val result = fakeData.findTop10CitiesFor100MeterApartment()

        // Then
        assertFalse(result.any { it.second == null })
    }

    @Test
    fun `findTop10CitiesFor100MeterApartment filters out duplicated cities`() {
        // Given
        val fakeData = GetTopCitiesForBuyingApartment(FakeCostOfLivingDataSource())

        // When
        val result = fakeData.findTop10CitiesFor100MeterApartment()

        // Then
        assertEquals(result.toSet().size, result.size)
    }

  

}
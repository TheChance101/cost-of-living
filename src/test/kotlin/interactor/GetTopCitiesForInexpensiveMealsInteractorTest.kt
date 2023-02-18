package interactor

import fakedata.FakeDuplicatedData
import fakedata.FakeEmptyCostOfLivingDataSource
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class GetCitiesWithInexpensiveMealsTest {

    @Test
    fun `GetCitiesWithInexpensiveMeals filters out cities with missing data`() {
        // Given
        val fakeData = GetTopCitiesForInexpensiveMealsInteractor(FakeDuplicatedData())

        // When
        val result = fakeData.execute(10)

        // Then
        assertFalse(result.any { false })
    }

    @Test
    fun `GetCitiesWithInexpensiveMeals filters out duplicated cities`() {
        // Given
        val fakeData = GetTopCitiesForInexpensiveMealsInteractor(FakeDuplicatedData())

        // When
        val result = fakeData.execute(10)

        // Then
        assertTrue(result.distinct().size == result.size)
    }

    @Test
    fun `GetCitiesWithInexpensiveMeals returns an empty list when data source is empty`() {
        // Given
        val fakeData = GetTopCitiesForInexpensiveMealsInteractor(FakeEmptyCostOfLivingDataSource())

        // When
        val result = fakeData.execute(10)

        // Then
        assertTrue(result.isEmpty())
    }

}

package interactor

import fakeData.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetLowestAvgFruitAndVegsPricesToSalariesInteractorTest {
    private lateinit var interactor: GetLowestAvgFruitAndVegsPricesToSalariesInteractor

    @Test
    fun should_ReturnCitiesNameWithLowestAvgFruitAndVegsPricesToSalaries_WhenGivenNormalData() {
        val fakeNormalFruitsAndVegsData = FakeNormalFruitsAndVegsData()
        // Given
        interactor = GetLowestAvgFruitAndVegsPricesToSalariesInteractor(fakeNormalFruitsAndVegsData)
        // When
        val lowestAvgFruitAndVegsPricesToSalariesCities = interactor.execute(10)
        // Then
        assertContentEquals(
            listOf(
                "alexandria", "cairo", "city_name", "city_name2",
                "ohio", "london", "yorkshire", "new york"
            ), lowestAvgFruitAndVegsPricesToSalariesCities
        )

    }


    @Test
    fun should_ReturnEmptyList_WhenGivenNullData() {
        val fakeNullFruitsAndVegsData = FakeNullFruitsAndVegsData()
        // Given
        interactor = GetLowestAvgFruitAndVegsPricesToSalariesInteractor(fakeNullFruitsAndVegsData)
        // When
        val lowestAvgFruitAndVegsPricesToSalariesCities = interactor.execute(10)
        // Then
        assertContentEquals(emptyList(), lowestAvgFruitAndVegsPricesToSalariesCities)

    }

    @Test
    fun should_ReturnListOfUniqueElements_WhenGivenDuplicateData() {
        val fakeDuplicateFruitsAndVegsData = FakeDuplicateFruitsAndVegsData()
        // Given
        interactor = GetLowestAvgFruitAndVegsPricesToSalariesInteractor(fakeDuplicateFruitsAndVegsData)
        // When
        val lowestAvgFruitAndVegsPricesToSalariesCities = interactor.execute(10)
        // Then
        assertEquals(3, lowestAvgFruitAndVegsPricesToSalariesCities.size)

    }
}
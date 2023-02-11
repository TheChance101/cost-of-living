package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopFashionCitiesNamesInteractorTest {
    private lateinit var getTopFashionCitiesNamesInteractor: GetTopFashionCitiesNamesInteractor

    @BeforeAll
    fun setUp() {
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
        getTopFashionCitiesNamesInteractor = GetTopFashionCitiesNamesInteractor(dataSource)
    }

    @Test
    fun should_Return_Top_5_When_Limit_Is_Five() {
        // Given
        val limit = 5
        // When
        val result = getTopFashionCitiesNamesInteractor.execute(limit)
        // Then
        assertEquals(5, result.size)
    }

    @Test
    fun should_Return_Empty_List_When_Limit_Is_Zero() {
        // Given
        val limit = 0
        // When
        val result = getTopFashionCitiesNamesInteractor.execute(limit)
        // Then
        assertTrue(result.isEmpty())
    }

    @Test
    fun should_Throw_Exception_When_Limit_Is_Negative() {
        // Given
        val limit = -1
        // When
        val executable = Executable { getTopFashionCitiesNamesInteractor.execute(limit) }
        // Then
        assertThrows(IllegalArgumentException::class.java, executable)
    }


}
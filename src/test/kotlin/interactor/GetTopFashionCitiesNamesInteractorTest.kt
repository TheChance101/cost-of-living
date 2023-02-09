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
        // given limit as 5
        val limit = 5
        // when get top 5 cities names
        val result = getTopFashionCitiesNamesInteractor.execute(limit)
        // then result should be 5 cities names
        assertEquals(5, result.size)
    }

    @Test
    fun should_Return_Empty_List_When_Limit_Is_Zero() {
        // given limit as 0
        val limit = 0
        // when get top 5 cities names
        val result = getTopFashionCitiesNamesInteractor.execute(limit)
        // then result should be empty list
        assertTrue(result.isEmpty())
    }

    @Test
    fun should_Throw_Exception_When_Limit_Is_Negative() {
        // given limit as negative
        val limit = -1
        // when get top 5 cities names
        val executable = Executable { getTopFashionCitiesNamesInteractor.execute(limit) }
        // then exception should be thrown
        assertThrows(IllegalArgumentException::class.java, executable)
    }


}
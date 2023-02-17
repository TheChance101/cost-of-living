package interactor

import dataSource.FakeDataSource
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTopFashionCitiesNamesInteractorTest {
    private lateinit var getTopFashionCitiesNamesInteractor: GetTopFashionCitiesNamesInteractor
    private lateinit var fakeDataSource: FakeDataSource

    @BeforeAll
    fun setUp() {
        fakeDataSource = FakeDataSource()
        getTopFashionCitiesNamesInteractor = GetTopFashionCitiesNamesInteractor(fakeDataSource)
    }

    @Test
    fun `should return only the required number of results`() {
        // given limit
        val limit = 5
        // when get top 5 cities names
        val actual = getTopFashionCitiesNamesInteractor.execute(limit).size
        // then actual should only contain the required number of cities
        assertEquals(limit, actual)
    }

    @Test
    fun `should return ascending sorted list when limit is valid`() {
        // given limit
        val limit = 5
        // when get top fashion cities names
        val actual = getTopFashionCitiesNamesInteractor.execute(limit)
        val expected = listOf(
            "Dhangadhi",
            "Narayanganj",
            "Banjul",
            "Kasese",
            "Sri Jayewardenepura Kotte"
        )
        // then actual should be equal to expected list
        assertEquals(expected, actual)
    }

    @Test
    fun `should return empty list when limit is zero`() {
        // given limit
        val limit = 0
        // when get top fashion cities names
        val actual = getTopFashionCitiesNamesInteractor.execute(limit).isEmpty()
        // then actual should be empty list
        assertTrue(actual)
    }

    @Test
    fun `should throw exception when limit is negative`() {
        // given limit in negative
        val limit = -1
        // when get top fashion cities names
        val actual = Executable { getTopFashionCitiesNamesInteractor.execute(limit) }
        val expected = InvalidLimitException::class.java
        // then should throw exception
        assertThrows(expected, actual)
    }

    @Test
    fun `should return available list when limit is greater than available`() {
        // given limit
        val limit = 1000
        // when get top fashion cities names
        val actual = getTopFashionCitiesNamesInteractor.execute(limit).size
        val expected = 9
        // then actual should be equal to a valid available list
        assertEquals(expected, actual)
    }

    @Test
    fun `should return unique top fashion cities names when limit is valid`() {
        // given limit
        val limit = 9
        // when get top fashion cities names
        val actual = getTopFashionCitiesNamesInteractor.execute(limit).size
        val expected = getTopFashionCitiesNamesInteractor.execute(limit).toSet().size
        // then actual should not contain duplicates
        assertEquals(expected, actual)
    }

}
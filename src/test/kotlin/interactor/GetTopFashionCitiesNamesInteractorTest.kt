package interactor

import dataSource.FakeDataSource
import dataSource.FakeDataWithEmptyList
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTopFashionCitiesNamesInteractorTest {
    private lateinit var fakeDataSource: FakeDataSource
    private lateinit var emptyFakeDataSource: FakeDataWithEmptyList
    private lateinit var interactor: GetTopFashionCitiesNamesInteractor
    private lateinit var emptyInteractor: GetTopFashionCitiesNamesInteractor

    @BeforeAll
    fun setUp() {
        fakeDataSource = FakeDataSource()
        emptyFakeDataSource = FakeDataWithEmptyList()
        interactor = GetTopFashionCitiesNamesInteractor(fakeDataSource)
        emptyInteractor = GetTopFashionCitiesNamesInteractor(emptyFakeDataSource)
    }

    @Test
    fun `should return only the required number of results`() {
        // given limit
        val limit = 5
        // when get top 5 cities names
        val actual = interactor.execute(limit).size
        // then actual should only contain the required number of cities
        assertEquals(limit, actual)
    }

    @Test
    fun `should return ascending sorted list when limit is valid`() {
        // given limit
        val limit = 5
        // when get top fashion cities names
        val actual = interactor.execute(limit)
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
        val actual = interactor.execute(limit).isEmpty()
        // then actual should be empty list
        assertTrue(actual)
    }

    @Test
    fun `should throw exception when limit is negative`() {
        // given limit in negative
        val limit = -1
        // when get top fashion cities names
        val actual = Executable { interactor.execute(limit) }
        val expected = InvalidLimitException::class.java
        // then should throw exception
        assertThrows(expected, actual)
    }

    @Test
    fun `should return available list when limit is greater than available`() {
        // given limit
        val limit = 1000
        // when get top fashion cities names
        val actual = interactor.execute(limit).size
        val expected = 9
        // then actual should be equal to a valid available list
        assertEquals(expected, actual)
    }

    @Test
    fun `should return unique top fashion cities names when limit is valid`() {
        // given limit
        val limit = 9
        // when get top fashion cities names
        val actual = interactor.execute(limit).size
        val expected = interactor.execute(limit).toSet().size
        // then actual should not contain duplicates
        assertEquals(expected, actual)
    }

    @Test
    fun `should throw exception when data source returns empty list`() {
        // given limit
        val limit = 9
        // when get top fashion cities names
        val actual = Executable { emptyInteractor.execute(limit) }
        val expected = IllegalStateException::class.java
        // then should throw exception
        assertThrows(expected, actual)
    }

}
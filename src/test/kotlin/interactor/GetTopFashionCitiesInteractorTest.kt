package interactor

import fakeDataSource.FakeData
import junit.framework.TestCase.assertEquals
import org.junit.jupiter.api.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopFashionCitiesInteractorTest {
    private lateinit var getTopFashionCities: GetTopFashionCitiesInteractor
    private lateinit var fakeData: FakeData


    @BeforeAll
    fun setUp() {
        fakeData = FakeData()
        getTopFashionCities = GetTopFashionCitiesInteractor(fakeData)
    }

    @Test
    fun should_ReturnCorrectList_When_HaveAvailableLimitValue() {
        //given limit value > 0
        val limit = 5
        //when
        val result = getTopFashionCities.execute(limit)
        //Then
        assertEquals(listOf("Asheville", "Baltimore", "Syracuse", "El Paso", "Tulsa"), result)
    }
    @Test
    fun should_ReturnCorrectListSize_When_HaveAvailableLimitValue() {
        //given limit value > 0
        val limit = 5
        //when
        val result = getTopFashionCities.execute(limit)
        //Then
        assertEquals(limit, result.size)
    }

    @Test
    fun should_ReturnEmptyList_When_HaveLimitValueZero() {
        //given limit value = 0
        val limit = 0
        //when
        val result = getTopFashionCities.execute(limit)
        val expectedResult = emptyList<String>()
        //Then
        assertEquals(expectedResult, result)
    }

    @Test
    fun should_ThrowException_When_HaveNegativeLimitValue() {
        //given  limit value < 0
        val limit = -1
        //Then exception should be thrown
        assertThrows<IllegalArgumentException> { getTopFashionCities.execute(limit) }
    }
    @Test
    fun should_ReturnAvailableList_When_HaveLimitGreaterThanAvailableCities() {
        //given limit value greater than Available
        val limit = 30
        //when
        val result = getTopFashionCities.execute(limit)
        //then
        assertEquals(18, result.size)
    }
}

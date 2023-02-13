package interactor

import FakeData
import junit.framework.TestCase.assertEquals
import org.junit.jupiter.api.*
import org.junit.jupiter.api.function.Executable
import java.lang.Exception

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTopFashionCitiesInteractorTest {
    private lateinit var getTopFashionCitiesInteractor: GetTopFashionCitiesInteractor

    @BeforeAll
    fun setUp() {
       val fakeData = FakeData()
        getTopFashionCitiesInteractor = GetTopFashionCitiesInteractor(fakeData)
    }

    @Test
    fun should_ReturnCorrectList_When_HaveLimitValueMoreThanZero() {
        //given limit value > 0
        val limit = 5
        //when
        val result = getTopFashionCitiesInteractor.execute(limit)
        val expectedResult = listOf("Accra", "Multan", "Karachi", "Rawalpindi", "Hyderabad City")
        //Then
        assertEquals(expectedResult, result)
    }

    @Test
    fun should_ReturnEmptyList_When_HaveLimitValueZero() {
        //given limit value = 0
        val limit = 0
        //when
        val result = getTopFashionCitiesInteractor.execute(limit)
        val expectedResult = emptyList<String>()
        //Then
        assertEquals(expectedResult, result)
    }

    @Test
    fun should_ThrowException_When_HaveNegativeLimitValue() {
        //given  limit value < 0
        val limit = -1
        //Then exception should be thrown
        assertThrows<IllegalArgumentException> { getTopFashionCitiesInteractor.execute(limit) }
    }
}

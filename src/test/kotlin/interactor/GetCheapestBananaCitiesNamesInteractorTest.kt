package interactor

import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.unmockkAll
import mockdata.MockCityEntity.createMockCity
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCheapestBananaCitiesNamesInteractorTest {

    private lateinit var interactor: GetCheapestBananaCitiesNamesInteractor
    private val mockData = mockk<CostOfLivingDataSource>()

    @BeforeAll
    fun setup() {
        unmockkAll()
        clearAllMocks()
        interactor = GetCheapestBananaCitiesNamesInteractor(mockData)
    }

    @Test
    fun `should return entered single city when have a city with not null banana price`() {
        // given correct cityEntity with not null banana price
        val mockCity = listOf(createMockCity("City 1", 0.25f))
        every { mockData.getAllCitiesData() } returns mockCity
        // when get cities list
        val citiesResult = interactor.execute(*mockCity.toTypedArray())
        // then check if getting entered city in a list
        assertEquals(listOf("City 1"), citiesResult)
    }

    @Test
    fun `should return empty list when have only one city with null banana price`() {
        // given correct city with null banana price
        val mockCity = listOf(createMockCity("City 1", null))
        every { mockData.getAllCitiesData() } returns mockCity
        // when get cities list
        val citiesResult = interactor.execute(*mockCity.toTypedArray())
        // then check if getting empty list
        assertEquals(emptyList(), citiesResult)
    }

    @Test
    fun `should return sorted correct cities when have list of cities with not null banana price for all cities`() {
        // given varargs of correct cities with not null banana price
        val mockCity = listOf(
            createMockCity("City 1", 2.54f),
            createMockCity("City 2", 1.21f),
            createMockCity("City 3", 4.6f)
        )
        every { mockData.getAllCitiesData() } returns mockCity
        // when get sorted cities list by cheapest banana price
        val citiesResult = interactor.execute(*mockCity.toTypedArray())
        // then check if getting correct cities
        assertEquals(listOf("City 2", "City 1", "City 3"), citiesResult)
    }

    @Test
    fun `should return sorted correct cities when have list of cities with one or more city has a null banana price`() {
        // given varargs of correct cities with correct banana price but there is one or more city has a null banana price
        val mockCity = listOf(
            createMockCity("City 1", 2.54f),
            createMockCity("City 2", null),
            createMockCity("City 3", 4.6f),
            createMockCity("City 4", null),
            createMockCity("City 5", 1.25f),
        )
        every { mockData.getAllCitiesData() } returns mockCity
        // when get sorted cities list by cheapest price
        val cities = interactor.execute(*mockCity.toTypedArray())
        // then check if getting correct cities
        assertEquals(listOf("City 5", "City 1", "City 3"), cities)
    }

    @Test
    fun `should return only one of repeated city when given list of repeated city with not null banana price`() {
        // given varargs of correct city repeated more than one time
        val mockCity = listOf(
            createMockCity("City 1", 2.54f),
            createMockCity("City 1", 2.54f),
            createMockCity("City 1", 2.54f),
        )
        every { mockData.getAllCitiesData() } returns mockCity
        // when get sorted cities list by cheapest price
        val cities = interactor.execute(*mockCity.toTypedArray())
        // then check if getting the only correct cities
        assertEquals(listOf("City 1"), cities)
    }

    @Test
    fun `should return empty list of repeated city when given list of repeated city with null banana price`() {
        // given varargs of repeated cities with null banana price
        val mockCity = listOf(
            createMockCity("City 1", null),
            createMockCity("City 1", null),
            createMockCity("City 1", null),
        )
        every { mockData.getAllCitiesData() } returns mockCity
        // when get sorted cities list by cheapest price
        val cities = interactor.execute(*mockCity.toTypedArray())
        // then check if getting empty list
        assertEquals(emptyList(), cities)
    }

    @Test
    fun `should return sorted correct cities when have more than cities repeated and also another cities not repeated`() {
        // given varargs of repeated cities with null banana price
        val mockCity = listOf(
            createMockCity("City 1", null),
            createMockCity("City 1", null),
            createMockCity("City 1", null),
            createMockCity("City 2", 3.5f),
            createMockCity("City 3", 4.9f),
        )
        every { mockData.getAllCitiesData() } returns mockCity
        // when get sorted cities list by cheapest banana price
        val cities = interactor.execute(*mockCity.toTypedArray())
        // then check if getting empty list
        assertEquals(listOf("City 2", "City 3"), cities)
    }
}
package interactor

import data.CheapestInternetFakeData
import data.EmptyFakeData
import data.InvalidFakeData
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.function.Executable



@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasCheapestInternetConnectionInteractorTest {

    private lateinit var cityHasCheapestInternet: GetCityHasCheapestInternetConnectionInteractor

    private lateinit var fakeData: CheapestInternetFakeData
    private lateinit var emptyFakeData: EmptyFakeData
    private lateinit var invalidFakeData: InvalidFakeData


    @BeforeAll
    fun setup() {
        fakeData = CheapestInternetFakeData()
        emptyFakeData =EmptyFakeData()
        invalidFakeData = InvalidFakeData()
    }

    @Test
    fun `should return cheapest city when given list of cities`() {
        // given city entity
        cityHasCheapestInternet = GetCityHasCheapestInternetConnectionInteractor(fakeData)
        val expectedCity = fakeData.getAllCitiesData()[9]
        // when check for the cheapest city in the list
        val actual = cityHasCheapestInternet.execute()
        // then check the result
        assertEquals(expectedCity, actual)
    }

    @Test
    fun `should return exception when all city has null internet price`() {
        // given city entity with invalid data
        cityHasCheapestInternet = GetCityHasCheapestInternetConnectionInteractor(invalidFakeData)
        // when check for the cheapest city in the list
        val actual =  Executable { cityHasCheapestInternet.execute() }
        // then check the result
        assertThrows(IllegalStateException::class.java, actual)
    }

    @Test
    fun `should return exception when given is empty fake data`() {
        // given city entity with invalid data
        cityHasCheapestInternet = GetCityHasCheapestInternetConnectionInteractor(emptyFakeData)
        // when check for the cheapest city in the list
        val actual = Executable { cityHasCheapestInternet.execute() }
        // then check the result
        assertThrows(IllegalStateException::class.java, actual)
    }

}
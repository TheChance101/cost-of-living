package interactor

import data.CheapestInternetFakeData
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.function.Executable



@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasCheapestInternetConnectionInteractorTest {

    private lateinit var cityHasCheapestInternet: GetCityHasCheapestInternetConnectionInteractor

    @Test
    fun `should return cheapest city when given list of cities`() {
        // given list of city entity
        cityHasCheapestInternet = GetCityHasCheapestInternetConnectionInteractor(CheapestInternetFakeData
            .validSalaryAndInternetPrices)
        val expectedCity = CheapestInternetFakeData.validSalaryAndInternetPrices.getAllCitiesData()[9]
        // when check for the cheapest city in the list
        val actual = cityHasCheapestInternet.execute()
        // then check the result
        assertEquals(expectedCity, actual)
    }

    @Test
    fun `should return exception when all city has null internet price`() {
        // given city entity with invalid data
        cityHasCheapestInternet = GetCityHasCheapestInternetConnectionInteractor(CheapestInternetFakeData
            .invalidData)
        // when check for the cheapest city in the list
        val actual =  Executable { cityHasCheapestInternet.execute() }
        // then check the result
        assertThrows(IllegalStateException::class.java, actual)
    }

    @Test
    fun `should return exception when given is empty fake data`() {
        // given city entity with invalid data
        cityHasCheapestInternet = GetCityHasCheapestInternetConnectionInteractor(CheapestInternetFakeData
            .emptyData)
        // when check for the cheapest city in the list
        val actual = Executable { cityHasCheapestInternet.execute() }
        // then check the result
        assertThrows(IllegalStateException::class.java, actual)
    }

}
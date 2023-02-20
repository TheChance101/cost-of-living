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
        // change source of fake data to valid salary and internet prices
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
        // change source of fake data to invalid data
        cityHasCheapestInternet = GetCityHasCheapestInternetConnectionInteractor(CheapestInternetFakeData
            .invalidData)
        // when check for the cheapest city in the list
        val actual =  Executable { cityHasCheapestInternet.execute() }
        // then check the result
        assertThrows(IllegalStateException::class.java, actual)
    }

    @Test
    fun `should return exception when given is empty fake data`() {
        // change source of fake data to empty data
        cityHasCheapestInternet = GetCityHasCheapestInternetConnectionInteractor(CheapestInternetFakeData
            .emptyData)
        // when check for the cheapest city in the list
        val actual = Executable { cityHasCheapestInternet.execute() }
        // then check the result
        assertThrows(IllegalStateException::class.java, actual)
    }

}
package interactor

import data.ManagerExpectationsFakeData
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable
import java.util.NoSuchElementException
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityThatMatchTheManagerExpectationsInteractorTest {
    private lateinit var getCityThatMatchTheManagerExpectationsInteractor: GetCityThatMatchTheManagerExpectationsInteractor

    @BeforeAll
    fun setup() {
        getCityThatMatchTheManagerExpectationsInteractor = GetCityThatMatchTheManagerExpectationsInteractor(ManagerExpectationsFakeData.emptyData)
    }


    @Test
    fun `should return city when countries and prices of meals are valid`() {
        // change source of fake data to countries' names and prices of meals which are valid
        val interactor =
            GetCityThatMatchTheManagerExpectationsInteractor(
                ManagerExpectationsFakeData.validCountriesAndPricesOfMeals
            )
        // When return city that match manager expectations
        val actualData = interactor.execute(countries).cityName
        // Then check the result
        assertEquals("Great Falls", actualData)
    }

    @Test
    fun `should return city when countries and some prices of meals are valid`() {
        // Given that countries' names and some prices of meals are valid
        val interactor =
            GetCityThatMatchTheManagerExpectationsInteractor(
                ManagerExpectationsFakeData.validCountriesAndSomeInvalidPricesOfMeals
            )
        // When return the city that match manager expectations
        val actualData = interactor.execute(countries).cityName
        // Then check the final result
        assertEquals("Chetumal", actualData)
    }

    @Test
    fun `should return city when some countries and prices of meals are valid`() {
        // Given that some countries' names and prices of meals are valid
        val interactor =
            GetCityThatMatchTheManagerExpectationsInteractor(
                ManagerExpectationsFakeData.someInvalidCountriesAndValidPricesOfMeals
            )
        // When return the city that match manager expectations
        val actualData = interactor.execute(countries).cityName
        // Then check the final result
        assertEquals("Moose Jaw", actualData)
    }

    @Test
    fun `should return city when some countries and some prices of meals are valid`() {
        // Given that some countries' names and some prices of meals are valid
        val interactor =
            GetCityThatMatchTheManagerExpectationsInteractor(
                ManagerExpectationsFakeData.invalidSomeCountriesAndSomePricesOfMeals
            )
        // When return the city that match manager expectations
        val actualData = interactor.execute(countries).cityName
        // Then check the final result
        assertEquals("Chetumal", actualData)
    }

    @Test
    fun `should return exception when countries are valid and prices of meals are invalid`() {
        // Given that countries' names are valid and prices of meals are invalid
        val interactor =
            GetCityThatMatchTheManagerExpectationsInteractor(
                ManagerExpectationsFakeData.validCountriesAndInvalidPricesOfMeals
            )
        // When return the city that match manager expectations
        val actualData = Executable {
            interactor.execute(countries).cityName
        }
        // Then check the final result
        assertThrows(NoSuchElementException::class.java, actualData)
    }

    @Test
    fun `should return exception when countries and prices of meals are invalid`() {
        // Given that countries' names  and prices of meals are invalid
        val interactor =
            GetCityThatMatchTheManagerExpectationsInteractor(
                ManagerExpectationsFakeData.invalidData
            )
        // When return the city that match manager expectations
        val actualData = Executable {
            interactor.execute(countries).cityName
        }
        // Then check the final result
        assertThrows(IllegalStateException::class.java, actualData)
    }

    @Test
    fun `should return exception when empty countries`() {
        // Given that countries' names  and prices of meals are invalid
        val interactor =
            GetCityThatMatchTheManagerExpectationsInteractor(
                ManagerExpectationsFakeData.emptyData
            )
        // When return the city that match manager expectations
        val actualData = Executable {
            interactor.execute(countries).cityName
        }
        // Then check the final result
        assertThrows(IllegalStateException::class.java, actualData)
    }

    private companion object{
        // Given the countries which will search on it
        val countries = listOf("united states", "canada", "mexico")
    }
}
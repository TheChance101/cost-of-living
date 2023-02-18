package interactor

import data.ManagerExpectationsFakeData
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityThatMatchTheManagerExpectationsInteractorTest {

    private lateinit var managerExpectationsFakeData: ManagerExpectationsFakeData

    @BeforeAll
    fun setUp() {
        managerExpectationsFakeData = ManagerExpectationsFakeData
    }

    @Test
    fun `should return city when countries and prices of meals are valid`() {
        // Given that countries' names and prices of meals are valid
        val validData = GetCityThatMatchTheManagerExpectationsInteractor(managerExpectationsFakeData.getValidCountriesAndPricesOfMeals)
        // When return city that match manager expectations
        val actualData = validData.execute().cityName
        // Then check the result
        assertEquals("Chetumal", actualData)
    }

    @Test
    fun `should return city when countries and some prices of meals are valid`() {
        // Given that countries' names and some prices of meals are valid
        val mixedData = GetCityThatMatchTheManagerExpectationsInteractor(managerExpectationsFakeData.getValidCountriesAndSomeInvalidPricesOfMeals)
        // When return the city that match manager expectations
        val actualData = mixedData.execute().cityName
        // Then check the final result
        assertEquals("Chetumal", actualData)
    }

    @Test
    fun `should return city when some countries and prices of meals are valid`() {
        // Given that some countries' names and prices of meals are valid
        val mixedData = GetCityThatMatchTheManagerExpectationsInteractor(managerExpectationsFakeData.getSomeInvalidCountriesAndValidPricesOfMeals)
        // When return the city that match manager expectations
        val actualData = mixedData.execute().cityName
        // Then check the final result
        assertEquals("Chetumal", actualData)
    }

    @Test
    fun `should return city when some countries and some prices of meals are valid`() {
        // Given that some countries' names and some prices of meals are valid
        val validData = GetCityThatMatchTheManagerExpectationsInteractor(managerExpectationsFakeData.getSomeInvalidCountriesAndSomeInvalidPricesOfMeals)
        // When return the city that match manager expectations
        val actualData = validData.execute().cityName
        // Then check the final result
        assertEquals("Great Falls", actualData)
    }

    @Test
    fun `should return exception when countries are valid and prices of meals are invalid`() {
        // Given that countries' names are valid and prices of meals are invalid
        val invalidData = GetCityThatMatchTheManagerExpectationsInteractor(managerExpectationsFakeData.getValidCountriesAndInvalidPricesOfMeals)
        // When return the city that match manager expectations
        val actualData = Executable {
            invalidData.execute().cityName
        }
        // Then check the final result
        assertThrowsExactly(Exception::class.java, actualData)
    }

    @Test
    fun `should return exception when countries and prices of meals are invalid`() {
        // Given that countries' names  and prices of meals are invalid
        val invalidData = GetCityThatMatchTheManagerExpectationsInteractor(managerExpectationsFakeData.getAllInvalidData)
        // When return the city that match manager expectations
        val actualData = Executable {
            invalidData.execute().cityName
        }
        // Then check the final result
        assertThrowsExactly(Exception::class.java, actualData)
    }
}
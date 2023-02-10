package interactor

import dataSource.utils.FakeDataSource
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityThatMatchTheManagerExpectationsInteractorTest {

    lateinit var getCityThatMatchTheManagerExpectationsInteractor: GetCityThatMatchTheManagerExpectationsInteractor
    lateinit var fakeDataSource: FakeDataSource

    @BeforeAll
    fun setUp() {
        fakeDataSource = FakeDataSource()
        getCityThatMatchTheManagerExpectationsInteractor =
            GetCityThatMatchTheManagerExpectationsInteractor(fakeDataSource)
    }

    @Test
    fun should_returnCity_when_allCountriesIncluded() {
        // Given all countries included
        val countries = listOf("united states", "canada", "mexico")
        // When return the city that match manager expectations
        val result = getCityThatMatchTheManagerExpectationsInteractor.execute(countries)
        // Then check the final result
        assertEquals("Chetumal", result?.cityName)
    }

    @Test
    fun should_returnCity_when_namesOfCountriesIsUpperCase() {
        // Given all countries included and all names uppercase
        val countries = listOf("UNITED STATES", "CANADA", "MEXICO")
        // When return the city that match manager expectations
        val result = getCityThatMatchTheManagerExpectationsInteractor.execute(countries)
        // Then check the final result
        assertEquals("Chetumal", result?.cityName)
    }

    @Test
    fun should_returnCity_when_namesOfCountriesIsMixedUpperCaseAndLowCase() {
        // Given all countries included and all names mixed
        val countries = listOf("UnItEd STaTeS", "CaNAdA", "MeXiCo")
        // When return the city that match manager expectations
        val result = getCityThatMatchTheManagerExpectationsInteractor.execute(countries)
        // Then check the final result
        assertEquals("Chetumal", result?.cityName)
    }

    @Test
    fun should_returnCity_when_notAllCountriesIncluded() {
        // Given not all countries included
        val countries = listOf("united states", "canada", "iraq")
        // When return the city that match manager expectations
        val result = getCityThatMatchTheManagerExpectationsInteractor.execute(countries)
        // Then check the final result
        assertEquals("Great Falls", result?.cityName)
    }

    @Test
    fun should_returnCity_when_allCountriesNotIncluded() {
        // Given all countries not included
        val countries = listOf("egypt", "syria", "iraq")
        // When return empty result
        val result = getCityThatMatchTheManagerExpectationsInteractor.execute(countries)
        // Then check the final result
        assertNull(null, result?.cityName)
    }

    @Test
    fun should_returnCity_when_namesOfCountriesIsEmpty() {
        // Given all empty string instead of countries names
        val countries = listOf("", "", "")
        // When return  empty result
        val result = getCityThatMatchTheManagerExpectationsInteractor.execute(countries)
        // Then check the final result
        assertNull(null, result?.cityName)
    }

}
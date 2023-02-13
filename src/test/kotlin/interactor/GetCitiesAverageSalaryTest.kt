package interactor

import dataSource.FakeDataSource
import dataSource.TestCase
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCitiesAverageSalaryTest {

    private lateinit var getCitiesAverageSalary: GetCitiesAverageSalary
    private lateinit var fakeData: FakeDataSource

    @BeforeAll
    fun setUp() {
        fakeData = FakeDataSource()
        getCitiesAverageSalary = GetCitiesAverageSalary(fakeData)
        fakeData.changeDataSource(TestCase.CitiesAverageSalary)

    }

    @Test
    fun should_ReturnCitiesWithAverageSalary_When_InputLowerCaseCountry() {
        //given a lower case country
        val country = "cuba"

        //when calculate the average salary of city
        val result = getCitiesAverageSalary.execute(country)

        //then check the result
        val fakeList = listOf(Pair("Santa Clara", 25.0))
        assertEquals(fakeList, result)
    }

    @Test
    fun should_ReturnCitiesWithAverageSalary_When_InputUpperCaseCountry() {
        //given an upper case country
        val country = "CUBA"

        //when calculate the average salary of city
        val result = getCitiesAverageSalary.execute(country)

        //then check the result
        val fakeList = listOf(Pair("Santa Clara", 25.0))
        assertEquals(fakeList, result)
    }

    @Test
    fun should_ReturnCitiesWithAverageSalary_When_InputUpperCaseAndLowerCaseCountry() {
        //given an upperCase and lowercase country
        val country = "Cuba"

        //when calculate the average salary of city
        val result = getCitiesAverageSalary.execute(country)

        //then check the result
        val fakeList = listOf(Pair("Santa Clara", 25.0))
        assertEquals(fakeList, result)
    }

    @Test
    fun should_ReturnCorrectCities_when_TheDataQualityIsTrue() {
        //given a country with true data quality
        val country = "cuba"

        //when return the average cities salary
        val result = getCitiesAverageSalary.execute(country)

        //then check the result
        val fakeList = listOf(Pair("Santa Clara", 25.0))
        assertEquals(fakeList, result)

    }

    @Test
    fun should_ReturnThrowException_When_InputWrong() {
        //given a wrong name country
        val country = "&&7#"

        //when calculate the average salary of city
        val result = Executable { getCitiesAverageSalary.execute(country) }

        //then check the result
        assertThrows(IllegalArgumentException::class.java, result)
    }
}


package interactor

import datasource.FakeDataSource
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

internal class GetCitiesAverageSalaryTest {

    private lateinit var getCitiesAverageSalary:GetCitiesAverageSalary
    private lateinit var getFakeDataSource:FakeDataSource

    fun setUp()
    {
        getFakeDataSource=FakeDataSource()
        getCitiesAverageSalary=GetCitiesAverageSalary(getFakeDataSource)
    }
    @Test
    fun should_ReturnCitiesWithAverageSalary_When_InputLowerCaseCountry() {
        //given a lower case country
        val country="cuba"

        //when calculate the average salary of city
        val result=getCitiesAverageSalary.execute(country)

        //then check the result
        val fakeList= listOf(Pair("Sancti Spiritus",20.0),Pair("Santiago de Cuba",18.0),Pair("Santa Clara",25.0))
        assertEquals(fakeList,result)
    }

    @Test
    fun should_ReturnCitiesWithAverageSalary_When_InputUpperCaseCountry() {
        //given an upper case country
        val country="CUBA"

        //when calculate the average salary of city
        val result=getCitiesAverageSalary.execute(country)

        //then check the result
        val fakeList= listOf(Pair("Sancti Spiritus",20.0),Pair("Santiago de Cuba",18.0),Pair("Santa Clara",25.0))
        assertEquals(fakeList,result)
    }

    @Test
    fun should_ReturnCitiesWithAverageSalary_When_InputUpperCaseAndLowerCaseCountry() {
        //given an upperCase and lowercase country
        val country="Cuba"

        //when calculate the average salary of city
        val result=getCitiesAverageSalary.execute(country)

        //then check the result
        val fakeList= listOf(Pair("Sancti Spiritus",20.0),Pair("Santiago de Cuba",18.0),Pair("Santa Clara",25.0))
        assertEquals(fakeList,result)
    }

    @Test
    fun should_ReturnThrowException_When_InputWrong() {
        //given a wrong name country
        val country="&&7#"

        //when calculate the average salary of city
        val result:Executable=Executable {getCitiesAverageSalary.execute(country)}

        //then check the result
        assertThrows(Exception::class.java,result)
    }
}


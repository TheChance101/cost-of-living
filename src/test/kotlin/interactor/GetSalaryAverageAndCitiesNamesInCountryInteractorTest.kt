package interactor

import dataSource.FakeDataSource
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
internal class GetSalaryAverageAndCitiesNamesInCountryInteractorTest {

    private lateinit var fakeDataSource: FakeDataSource
    lateinit var interactor: GetSalaryAverageAndCitiesNamesInCountryInteractor

    @BeforeAll
    fun setup(){
        fakeDataSource = FakeDataSource()
        interactor = GetSalaryAverageAndCitiesNamesInCountryInteractor(fakeDataSource)
    }

    @Test
    fun `should return correct list when the country name is correct and lowercase`() {
        //given lowercase country name
        val country = fakeDataSource.getAllCitiesData()[6].country.lowercase()
        //when getting a list of pair contains the city name and average salary of country with lowercase name
        val getSalaryAverageAndCitiesNamesInCountry = interactor.execute(country)
        //then
        assertEquals(listOf(Pair("Damascus",50.24f),Pair("Aleppo", 72.8f)),getSalaryAverageAndCitiesNamesInCountry)
    }

    @Test
    fun `should return correct list when the country name is correct and uppercase`() {
        //given uppercase country name
        val country = fakeDataSource.getAllCitiesData()[6].country.uppercase()
        //when getting a list of pair contains the city name and average salary of country with uppercase name
        val getSalaryAverageAndCitiesNamesInCountry = interactor.execute(country)
        //then
        assertEquals(listOf(Pair("Damascus",50.24f),Pair("Aleppo", 72.8f)),getSalaryAverageAndCitiesNamesInCountry)
    }

    @Test
    fun `should return correct list when the country name is correct and has lowercase and uppercase characters`() {
        //given mixture of lowercase and uppercase country name
        val country = fakeDataSource.getAllCitiesData()[0].country.substring(0,2).uppercase() + fakeDataSource.getAllCitiesData()[0].country.substring(2).lowercase()
        //when getting a list of pair contains the city name and average salary of country with mixture of lowercase and uppercase country name
        val getSalaryAverageAndCitiesNamesInCountry = interactor.execute(country)
        //then
        assertEquals(listOf(Pair("Havana",35.75f)),getSalaryAverageAndCitiesNamesInCountry)
    }

    @Test
    fun `should throw exception when the country name is wrong`() {
        //given wrong country name
        val country = fakeDataSource.getAllCitiesData()[0].country.substring(0,2)
        //when getting a list of pair contains the city name and average salary of country with wrong name
        val getSalaryAverageAndCitiesNamesInCountry= Executable{interactor.execute(country)}
        //then
        assertThrows(Exception::class.java,getSalaryAverageAndCitiesNamesInCountry)
    }

    @Test
    fun `should throw exception when the country name is empty string`() {
        //given wrong country name
        val country = " "
        //when getting a list of pair contains the city name and average salary of country with wrong name
        val getSalaryAverageAndCitiesNamesInCountry= Executable{interactor.execute(country)}
        //then
        assertThrows(Exception::class.java,getSalaryAverageAndCitiesNamesInCountry)
    }

}
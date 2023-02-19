package interactor

import dataSource.FakeDataSource
import dataSource.FakeDataWithEmptyList
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetSalaryAverageAndCitiesNamesInCountryInteractorTest {

    private lateinit var fakeDataSource: CostOfLivingDataSource
    private lateinit var fakeDataWithEmptyList: CostOfLivingDataSource
    private lateinit var interactor: GetSalaryAverageAndCitiesNamesInCountryInteractor
    private lateinit var interactorForEmptyData: GetSalaryAverageAndCitiesNamesInCountryInteractor


    @BeforeAll
    fun setup(){
        fakeDataSource = FakeDataSource()
        fakeDataWithEmptyList = FakeDataWithEmptyList()
        interactor = GetSalaryAverageAndCitiesNamesInCountryInteractor(fakeDataSource)
        interactorForEmptyData = GetSalaryAverageAndCitiesNamesInCountryInteractor(fakeDataWithEmptyList)
    }

    @Test
    fun `should return correct list when the country name is correct and lowercase`() {
        //given lowercase country name
        val country = "syria"
        //when getting a list of pairs contain the city name and average salary of country
        val actual= interactor.execute(country)
        val expected = listOf(Pair("Damascus",50.24f),Pair("Aleppo", 72.8f))
        //then
        assertEquals(expected,actual)
    }

    @Test
    fun `should return correct list when the country name is correct and uppercase`() {
        //given uppercase country name
        val country = "SYRIA"
        //when getting a list of pairs contain the city name and average salary of country
        val actual = interactor.execute(country)
        val expected = listOf(Pair("Damascus", 50.24f), Pair("Aleppo", 72.8f))
        //then
        assertEquals(expected, actual)
    }

    @Test
    fun `should return correct list when the country name is correct and has lowercase and uppercase characters`() {
        //given mixture of lowercase and uppercase country name
        val country = "cUbA"
        //when getting a list of pairs contain the city name and average salary of country
        val actual = interactor.execute(country)
        val expected = listOf(Pair("Havana",35.75f))
        //then
        assertEquals(expected,actual)
    }

    @Test
    fun `should throw exception when the country name is wrong`() {
        //given wrong country name
        val country = "lol"
        //when getting a list of pair contains the city name and average salary of country
        val actual = Executable { interactor.execute(country) }
        val expected = NoSuchElementException::class.java
        //then
        assertThrows(expected, actual)
    }
    @Test
    fun `should throw exception when the country name is empty string`() {
        //given empty string
        val country = ""
        //when getting a list of pair contains the city name and average salary of country
        val actual = Executable { interactor.execute(country) }
        val expected = NoSuchElementException::class.java
        //then
        assertThrows(expected, actual)
    }

    @Test
    fun `should return empty list when the country name is correct but excluded`(){
        //given excluded country name
        val country = "Ghana"
        //when getting a list of pair contains the city name and average salary of country
        val actual = interactor.execute(country)
        val expected = emptyList<Pair<String,Float>>()
        //then
        assertEquals(expected, actual)

    }

    @Test
    fun `should throw exception when the country name is correct but not in the data`(){
        //given country name that is not in the data
        val country = "Egypt"
        //when getting a list of pair contains the city name and average salary of country
        val actual = Executable { interactor.execute(country) }
        val expected = NoSuchElementException::class.java
        //then
        assertThrows(expected, actual)
    }

    @Test
    fun `should throw exception when there is no data`(){
        //given correct or wrong country name
        val country = "Ay 7aga"
        //when getting a list of pair contains the city name and average salary of country
        val actual = Executable { interactorForEmptyData.execute(country) }
        val expected = IllegalStateException::class.java
        //then
        assertThrows(expected,actual)
    }
}
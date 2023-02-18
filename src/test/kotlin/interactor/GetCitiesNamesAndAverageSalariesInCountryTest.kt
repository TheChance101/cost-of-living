package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.function.Executable

val csvParser = CsvParser()
val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCitiesNamesAndAverageSalariesInCountryTest {

    lateinit var getResult: GetCitiesNamesAndAverageSalariesInCountry
    @BeforeAll
    fun setup(){
        getResult=GetCitiesNamesAndAverageSalariesInCountry(dataSource)
    }
    @Test
    fun `should Return Names Of Cities And Average Salary when Enter Country Name`() {
        //given name of the country
        val country="Egypt"
        //when get the cities name and average salary in country
        val listOfCitiesAndSalaries=getResult.execute(country)
        //then check the result
        assertEquals(listOf(Pair("Tanta",101.74f),Pair("Alexandria",163.76f), Pair("Giza", 171.51f),Pair("Cairo", 200.4f))
            ,listOfCitiesAndSalaries)
    }

    @Test
    fun `should Return Names Of Cities And Average Salary when Enter Country Name In The Upper Case`(){
        //given name of the country
        val country="EGYPT"
        //when get the cities name and average salary in country
        val listOfCitiesAndSalaries=getResult.execute(country)
        //then check the result
        assertEquals(listOf(Pair("Tanta",101.74f),Pair("Alexandria",163.76f), Pair("Giza", 171.51f),Pair("Cairo", 200.4f))
            ,listOfCitiesAndSalaries)
    }

    @Test
    fun `should Return Names Of Cities And Average Salary when Enter Country Name In The Lower Case`(){
        //given name of the country
        val country="egypt"
        //when get the cities name and average salary in country
        val listOfCitiesAndSalaries=getResult.execute(country)
        //then check the result
        assertEquals(listOf(Pair("Tanta",101.74f),Pair("Alexandria",163.76f), Pair("Giza", 171.51f),Pair("Cairo", 200.4f))
            ,listOfCitiesAndSalaries)
    }

    @Test
    fun `should Return Names Of Cities And Average Salary when Enter Country Name In Mixture Of Upper And Lower case`() {
        //given name of the country
        val country="eGyPt"
        //when get the cities name and average salary in country
        val listOfCitiesAndSalaries=getResult.execute(country)
        //then check the result
        assertEquals(listOf(Pair("Tanta",101.74f),Pair("Alexandria",163.76f), Pair("Giza", 171.51f),Pair("Cairo", 200.4f))
            ,listOfCitiesAndSalaries)
    }


    @Test
    fun `should Throw Exception when Enter Wrong Name`() {
        //given name of the country
        val country="sd"
        //when get the cities name and average salary in country
        val listOfCitiesAndSalaries = Executable { getResult.execute(country) }
        // then check the result
        assertThrows(Exception::class.java, listOfCitiesAndSalaries)
    }
    @Test
    fun `should Throw Exception when Enter Empty Name`() {
        //given name of the country
        val country=""
        //when get the cities name and average salary in country
        val listOfCitiesAndSalaries = Executable { getResult.execute(country) }
        // then check the result
        assertThrows(Exception::class.java, listOfCitiesAndSalaries)
    }

}
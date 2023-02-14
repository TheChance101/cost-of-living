package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.assertThrows

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
    fun should_ReturnNamesOfCitiesAndAverageSalary_when_EnterCountryName() {
        //given name of the country
        val country="Egypt"
        //when get the cities name and average salary in country
        val ListOfCitiesAndSalaries=getResult.execute(country)
        //then check the result
        assertEquals(listOf(Pair("Tanta",101.74.toFloat()),Pair("Alexandria",163.76.toFloat()), Pair("Giza", 171.51.toFloat()),Pair("Cairo", 200.4.toFloat())),ListOfCitiesAndSalaries)
    }

    @Test
    fun should_ReturnNamesOfCitiesAndAverageSalary_when_EnterCountryNameInTheUpperCase() {
        //given name of the country
        val country="EGYPT"
        //when get the cities name and average salary in country
        val ListOfCitiesAndSalaries=getResult.execute(country)
        //then check the result
        assertEquals(listOf(Pair("Tanta",101.74.toFloat()),Pair("Alexandria",163.76.toFloat()), Pair("Giza", 171.51.toFloat()),Pair("Cairo", 200.4.toFloat())),ListOfCitiesAndSalaries)
    }

    @Test
    fun should_ReturnNamesOfCitiesAndAverageSalary_when_EnterCountryNameInTheLowerCase() {
        //given name of the country
        val country="egypt"
        //when get the cities name and average salary in country
        val ListOfCitiesAndSalaries=getResult.execute(country)
        //then check the result
        assertEquals(listOf(Pair("Tanta",101.74.toFloat()),Pair("Alexandria",163.76.toFloat()), Pair("Giza", 171.51.toFloat()),Pair("Cairo", 200.4.toFloat())),ListOfCitiesAndSalaries)
    }

    @Test
    fun should_ReturnNamesOfCitiesAndAverageSalary_when_EnterCountryNameInMixtureOfUppercaseAndLowercase() {
        //given name of the country
        val country="eGyPt"
        //when get the cities name and average salary in country
        val ListOfCitiesAndSalaries=getResult.execute(country)
        //then check the result
        assertEquals(listOf(Pair("Tanta",101.74.toFloat()),Pair("Alexandria",163.76.toFloat()), Pair("Giza", 171.51.toFloat()),Pair("Cairo", 200.4.toFloat())),ListOfCitiesAndSalaries)
    }


    @Test
    fun should_ThrowException_when_EnterWrongName() {
        //given name of the country
        val country="sd"
        //when get the cities name and average salary in country
        // then check the result
        assertThrows<Exception> {getResult.execute(country)}

    }

}
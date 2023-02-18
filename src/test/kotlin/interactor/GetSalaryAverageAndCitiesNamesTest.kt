package interactor

import dataSource.FakeCsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Disabled

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import interactor.CostOfLivingDataSource
import model.CityEntity
import org.junit.jupiter.api.TestInstance
import java.io.File
import java.io.IOException
import java.lang.Exception
import java.lang.reflect.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

internal class GetSalaryAverageAndCitiesNamesTest {

    lateinit var csvParser: CsvParser
    lateinit var dataSource: CostOfLivingDataSource
    lateinit var getSalaryAverageAndCitiesNames: GetSalaryAverageAndCitiesNames

    @BeforeAll
    fun execute() {
        csvParser = CsvParser()
        dataSource = FakeCsvDataSource(csvParser)
        getSalaryAverageAndCitiesNames = GetSalaryAverageAndCitiesNames(dataSource)
    }
    @Test
    fun should_ReturnCities_When_EnterCountryNameFormally() {
        //given
        val country = "Sri Lanka"
        val result = listOf(Pair("Colombo", 156.15f), Pair("Colombo", 156.15f))
        //when
        val cityAverage = getSalaryAverageAndCitiesNames.execute(countryName = country)
        //then
        assertEquals(result, cityAverage)
    }

    @Test
    fun should_ReturnCities_When_EnterCountryNameWithSpace() {
        //given
        val country = "Sri   Lanka"
        //when
        val result = getSalaryAverageAndCitiesNames.execute(countryName = country)
        val expectedResult = listOf(Pair("Colombo", 156.15f), Pair("Colombo", 156.15f))
        //then
        assertEquals(expectedResult, result)
    }
    @Test
    fun should_ReturnCities_When_AddLeadAndTrialSpaces() {
        //given
        val country = "    Sri Lanka  "
        val result = listOf(Pair("Colombo", 156.15f), Pair("Colombo", 156.15f))
        //when
        val cityAverage = getSalaryAverageAndCitiesNames.execute(countryName = country)
        //then
        assertEquals( result,cityAverage)
    }
    @Test
    fun should_ReturnCountryCities_When_AddLeadAndTrailSpaces() {
        //given
        val country = "      Cuba   "
        val result = listOf(Pair("Havana", 35.75f))

        //when
        val cityAverage = getSalaryAverageAndCitiesNames.execute(countryName = country)

        //then
        assertEquals(result,cityAverage)
    }


}

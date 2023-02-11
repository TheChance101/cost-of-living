package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class getTheAverageSalaryForEachCityInTheCountryInteractorTest {
    lateinit var searchCities :getTheAverageSalaryForEachCityInTheCountryInteractor
    @BeforeAll
    fun setuo(){
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)
        searchCities= getTheAverageSalaryForEachCityInTheCountryInteractor(dataSource)
    }
    @Test
    fun should_ReturnListOfPairsEachPairContainCityNameAndSalrayAverage_whenCityNameIsLowerCase () {
        //given


        //when


        //then
    }
}
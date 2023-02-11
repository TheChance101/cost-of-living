package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class GetCityThatHasAverageMealsPricesIntractorTest{

    private lateinit var cheapestInternet: GetCityThatHasAverageMealsPricesIntractor

    lateinit var csvParser : CsvParser
    @BeforeEach
    fun setup(){
        val csvParser = CsvParser()
    }
    @Test
    fun should_ReturnNull_When_TheCityIsNotSalaries() {
        // given open file null salaries

        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser , NULL_SALARIES_FILE)
        cheapestInternet=GetCityThatHasAverageMealsPricesIntractor(dataSource)

        //when find the city as  average salaries
        val cheapestCityInInternet=cheapestInternet.execute()
        // then
        assertNull( cheapestCityInInternet)

    }

    @Test
    fun should_ReturnNull_When_TheCityNotUSAAndCandaAndMexcio() {
        // given  open file and check
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, OLL_FILE_DATA)
        cheapestInternet=GetCityThatHasAverageMealsPricesIntractor(dataSource)

        //when find the city as  average salaries
        val cheapestCityInInternet=cheapestInternet.execute()
        // then
        assertNull(cheapestCityInInternet)

    }
    @Test
    fun should_ReturnNull_When_TheFileIsEmpty() {
        // given  open file empty
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser,EMPTY_FILE)
        cheapestInternet=GetCityThatHasAverageMealsPricesIntractor(dataSource)

        //when find the city as  average salaries
        val cheapestCityInInternet=cheapestInternet.execute()
        // then
        assertNull(cheapestCityInInternet)

    }
    @Test
    fun should_ReturnCity_When_TheCityIsAverage() {
        // given  open file and check

        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, OLL_FILE_DATA)
        cheapestInternet=GetCityThatHasAverageMealsPricesIntractor(dataSource)

        //when find the city as  average salaries
        val cheapestCityInInternet=cheapestInternet.execute()
        // then
        assertEquals("",cheapestCityInInternet)

    }

    companion object{
        private const val OLL_FILE_DATA = "csvFiles/costOfLiving.csv"
        private const val EMPTY_FILE = "csvFiles/emptyFile.csv"
        private const val NULL_SALARIES_FILE = "csvFiles/nullSalaries.csv"
    }
}
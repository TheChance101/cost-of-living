package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class GetCityHasCheapestInternetConnectionInteractorTest {
    private lateinit var cheapestInternet:GetCityHasCheapestInternetConnectionInteractor

    @Test
    fun should_ReturnLeastInternetCost_When_TheListNotEmptyAndNotNullAndTheAttributesNotNull() {
        // given list of cities
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, SUB_FILE_NAME) // CSV : comma separated values
        cheapestInternet=GetCityHasCheapestInternetConnectionInteractor(dataSource)
        val list=dataSource.getAllCitiesData()
        // when find the minimum internet coast of this list
        val cheapestCityInInternet=cheapestInternet.execute()
        // then
        assertEquals(list[1],cheapestCityInInternet)

    }

    @Test
    fun should_ReturnFirstCity_When_JustOneCityProvided() {
        // given a list has one city
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, ONE_CITY_FILE ) // CSV : comma separated values
        cheapestInternet=GetCityHasCheapestInternetConnectionInteractor(dataSource)
        val item=dataSource.getAllCitiesData()[0]

        // when find the minimum internet coast of this list
        val cheapestCityInInternet=cheapestInternet.execute()
        // then
        assertEquals(item,cheapestCityInInternet)

    }
    @Test
    fun should_ReturnNull_When_TheFileIsEmpty() {
        // given empty csv file
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, EMPTY_FILE) // CSV : comma separated values
        cheapestInternet=GetCityHasCheapestInternetConnectionInteractor(dataSource)

        // when find the minimum internet coast of this list
        val cheapestCityInInternet=cheapestInternet.execute()
        // then
        assertNull(cheapestCityInInternet)

    }
    @Test
    fun should_ReturnNull_When_AllTheSalariesIsNull() {
        // given a null salary cities list
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, NULL_SALARIES_FILE) // CSV : comma separated values
        cheapestInternet=GetCityHasCheapestInternetConnectionInteractor(dataSource)


        // when find the minimum internet coast of this list
        val cheapestCityInInternet=cheapestInternet.execute()
        // then
        assertNull(cheapestCityInInternet)

    }

    @Test
    fun should_ReturnNull_When_AllTheInternetCostsIsNull() {
        // given a null Internet Costs list
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, NULL_INTERNET_COST_FILE) // CSV : comma separated values
        cheapestInternet=GetCityHasCheapestInternetConnectionInteractor(dataSource)


        // when find the minimum internet coast of this list
        val cheapestCityInInternet=cheapestInternet.execute()
        // then
        assertNull(cheapestCityInInternet)

    }

    @Test
    fun should_ReturnNull_When_AllTheSalaryIsNegative() {
        // given a negative salary cities list
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser, NEGATIVE_SALARIES_FILE) // CSV : comma separated values
        cheapestInternet=GetCityHasCheapestInternetConnectionInteractor(dataSource)


        // when find the minimum internet coast of this list
        val cheapestCityInInternet=cheapestInternet.execute()
        // then
        assertNull(cheapestCityInInternet)

    }
    @Test
    fun should_ReturnNull_When_AllTheInternetCostsIsNegative() {
        // given a negative internet costs list
        val csvParser = CsvParser()
        val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser,NEGATIVE_INTERNET_COST_FILE ) // CSV : comma separated values
        cheapestInternet=GetCityHasCheapestInternetConnectionInteractor(dataSource)


        // when find the minimum internet coast of this list
        val cheapestCityInInternet=cheapestInternet.execute()
        // then
        assertNull(cheapestCityInInternet)

    }



    companion object{
        private const val SUB_FILE_NAME = "csvFiles/subListOfCostOfLiving.csv"
        private const val EMPTY_FILE = "csvFiles/emptyFile.csv"
        private const val NULL_SALARIES_FILE = "csvFiles/nullSalaries.csv"
        private const val NULL_INTERNET_COST_FILE = "csvFiles/nullSalaries.csv"
        private const val NEGATIVE_SALARIES_FILE = "csvFiles/negativeSalaries.csv"
        private const val NEGATIVE_INTERNET_COST_FILE = "csvFiles/negativeInternetCosts.csv"
        private const val ONE_CITY_FILE = "csvFiles/oneCity.csv"
    }
}
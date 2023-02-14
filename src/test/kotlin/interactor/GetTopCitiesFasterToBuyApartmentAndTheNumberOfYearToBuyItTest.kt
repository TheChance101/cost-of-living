package interactor


import dataSource.CsvDataSource
import dataSource.FakeCsvDataSource
import dataSource.utils.CsvParser
import model.CityEntity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetTopCitiesFasterToBuyApartmentAndTheNumberOfYearToBuyItTest {

    lateinit var csvParser :CsvParser
    lateinit var dataSource:CostOfLivingDataSource
    lateinit var GetTopCitiesFasterAndTheNumberOfYear : GetTopCitiesFasterToBuyApartmentAndTheNumberOfYearToBuyIt

    @BeforeAll
    fun setup() {
        csvParser= CsvParser()
        dataSource = FakeCsvDataSource(csvParser)
        GetTopCitiesFasterAndTheNumberOfYear =  GetTopCitiesFasterToBuyApartmentAndTheNumberOfYearToBuyIt(dataSource)



        @Test
        fun should_return_correctListOfPairs_whenTheSalaryIsCorrect() {
            //given
            val salary=100
            //when
            val listOfPairforcities=GetTopCitiesFasterAndTheNumberOfYear.execute(salary)
            //then
            assertEquals(listOf(Pair("Santiago de Cuba",2)),listOfPairforcities)
        }
        @Test
        fun should_returnNull_correctListOfCities_whenTheSalaryIsNegative() {
            //given
            val salary=-1
            //when
            val listOfPairforcities=GetTopCitiesFasterAndTheNumberOfYear.execute(salary)
            //then
            assertNull(listOfPairforcities)
        }

        @Test
        fun should_returnNull_emptyListOfCities_whenTheSalaryIsPositive() {
            //given
            val salary=300
            //when
            val listOfPairforcities=GetTopCitiesFasterAndTheNumberOfYear.execute(salary)
            //then
            assertEquals(emptyList<CityEntity>(),listOfPairforcities)
        }

        @Test
        fun should_returnNull_correctListOfCities_whenTheSalaryIsZero() {
            //given
            val salary=0
            //when
            val listOfPairforcities=GetTopCitiesFasterAndTheNumberOfYear.execute(salary)
            //then
            assertNull(listOfPairforcities)
        }

    }
}

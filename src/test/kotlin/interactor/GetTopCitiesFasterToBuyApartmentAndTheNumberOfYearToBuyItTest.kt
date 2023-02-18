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

    lateinit var csvParser: CsvParser
    lateinit var dataSource: CostOfLivingDataSource
    lateinit var GetTopCitiesFasterAndTheNumberOfYear: GetTopCitiesFasterToBuyApartmentAndTheNumberOfYearToBuyIt

    @BeforeAll
    fun setup() {
        csvParser = CsvParser()
        dataSource = FakeCsvDataSource(csvParser)
        GetTopCitiesFasterAndTheNumberOfYear = GetTopCitiesFasterToBuyApartmentAndTheNumberOfYearToBuyIt(dataSource)
    }


    @Test
    fun should_return_correctListOfPairs_whenTheSalaryIsCorrect() {
        //given

        //when
        val listOfPairforcities = GetTopCitiesFasterAndTheNumberOfYear.execute()
        //then
        assertEquals(listOf(Pair("Havana", 62.52448f),Pair("Damascus", 311.40524f)), listOfPairforcities)
    }





}


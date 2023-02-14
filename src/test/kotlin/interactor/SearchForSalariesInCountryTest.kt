package interactor

import dataSource.CsvDataSource
import dataSource.FakeCsvDataSource
import dataSource.utils.CsvParser
import model.CityEntity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import java.lang.Exception


@TestInstance(TestInstance.Lifecycle.PER_CLASS)

internal class SearchForSalariesInCountryTest {
    lateinit var csvParser: CsvParser
    lateinit var dataSource: CostOfLivingDataSource
    lateinit var salariesInCountry: SearchForSalariesInCountry

    @BeforeAll
    fun setup() {
        csvParser = CsvParser()
        dataSource = FakeCsvDataSource(csvParser)
        salariesInCountry = SearchForSalariesInCountry(dataSource)
    }
    @Test
    fun should_ReturnException_When_EnterRongCountry(){
        //given
        val countryName = "Egyptt"
        //when
        val result = assertThrows(Exception::class.java){
            salariesInCountry.execute(countryName)
        }

        //then
        assertEquals("Enter correct country name",result.message)
    }
}


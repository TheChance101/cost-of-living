package interactor

import dataSource.FakeCsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.TestInstance
import kotlin.test.Ignore

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCitiesNameHasHighestClothesPriceInteractorTest {

    lateinit var csvParser : CsvParser
    lateinit var dataSource: CostOfLivingDataSource
    lateinit var citiesName: GetCitiesNameHasHighestClothesPriceInteractor

    @BeforeAll
    fun setup(){
        csvParser= CsvParser()
        dataSource  = FakeCsvDataSource(csvParser)
        citiesName = GetCitiesNameHasHighestClothesPriceInteractor(dataSource)
    }

    @Test
    fun should_ReturnListOfSizeTwo_when_execute(){
        // when
        val result = citiesName.execute()
        // then
        assertEquals(2, result.size)
    }

    @Test
    fun should_ReturnTrue_when_executeWithAcceptiableData(){
        // given
        val expected = listOf("Havana", "Damascus")
        // when
        val result = citiesName.execute()
        // then
        assertEquals(expected, result)
    }
}
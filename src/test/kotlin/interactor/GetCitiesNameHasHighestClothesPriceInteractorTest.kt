package interactor

import dataSource.FakeCsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

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

}
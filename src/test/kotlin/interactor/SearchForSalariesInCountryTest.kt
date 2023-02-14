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

internal class SearchForSalariesInCountryTest {
    lateinit var csvParser : CsvParser
    lateinit var dataSource: CostOfLivingDataSource
    lateinit var salariesInCountry: SearchForSalariesInCountry

    @BeforeAll
    fun setup() {
        csvParser= CsvParser()
        dataSource  = FakeCsvDataSource(csvParser)
        salariesInCountry = SearchForSalariesInCountry(dataSource)
    }



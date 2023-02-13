package interactor

import dataSource.FakeCsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCountriesEnforceHighTaxesOnDrinksTest {

    lateinit var csvParser : CsvParser
    lateinit var dataSource: CostOfLivingDataSource
    lateinit var getCountriesEnforceHighTaxesOnDrinks: GetCountriesEnforceHighTaxesOnDrinks

    @BeforeAll
    fun setup(){
        csvParser= CsvParser()
        dataSource  = FakeCsvDataSource(csvParser)
        getCountriesEnforceHighTaxesOnDrinks = GetCountriesEnforceHighTaxesOnDrinks(dataSource)
    }


}
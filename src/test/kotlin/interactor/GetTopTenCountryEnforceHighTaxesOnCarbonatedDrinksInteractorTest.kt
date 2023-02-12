package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopTenCountryEnforceHighTaxesOnCarbonatedDrinksInteractorTest{

    private lateinit var testingData: GetTopTenCountryEnforceHighTaxesOnCarbonatedDrinksInteractor
    private val csvParser = CsvParser()
    private val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)


    @BeforeAll
    fun setUpData(){
        testingData = GetTopTenCountryEnforceHighTaxesOnCarbonatedDrinksInteractor(dataSource)
    }

    @Test
    fun returnSizeOfList() {
        //given
        val inComeData = testingData
        val limit = 10
        val cities = dataSource.getAllCitiesData()
        //when
        val result =
            inComeData.execute( limit, cities)
        //then
        assertEquals(10, result.size)
    }



}
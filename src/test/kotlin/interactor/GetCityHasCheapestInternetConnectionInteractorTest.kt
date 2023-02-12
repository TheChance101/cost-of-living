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
internal class GetCityHasCheapestInternetConnectionInteractorTest {

    lateinit var csvParser :CsvParser
    lateinit var dataSource: CostOfLivingDataSource
    lateinit var getCityHasCheapestInternetConnectionInteractor: GetCityHasCheapestInternetConnectionInteractor

    @BeforeAll
    fun setup(){
        csvParser= CsvParser()
        dataSource  = FakeCsvDataSource(csvParser)
        getCityHasCheapestInternetConnectionInteractor = GetCityHasCheapestInternetConnectionInteractor(dataSource)
    }

    @Test
    fun should_ReternTrue_when_ExecuteCityEntityWithHighDataQuality() {
        // given

        // when
        val result = getCityHasCheapestInternetConnectionInteractor.execute()
        // then
        assertTrue(result.dataQuality)

    }

    @Test
    fun should_ReternCityEntityWithAverageMonthlySalaryNotEqualNull_when_Execute() {
        // given

        // when
        val result = getCityHasCheapestInternetConnectionInteractor.execute()
        // then
        assertNotEquals(null , result.averageMonthlyNetSalaryAfterTax)

    }
    @Test
    fun should_ReternCityEntity_when_Execute() {
        // given

        // when
        val result = getCityHasCheapestInternetConnectionInteractor.execute()
        // then
        assertNotEquals(null , result)

    }

}
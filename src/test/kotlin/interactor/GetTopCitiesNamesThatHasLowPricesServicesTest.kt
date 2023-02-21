package interactor

import fakeDataSource.FakeData
import fakeDataSource.FakeDataOfGetCountryCitiesAverageSalary
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopCitiesNamesThatHasLowPricesServicesTest {
    private lateinit var getTopCitiesNamesThatHasLowPricesServices: GetTopCitiesNamesThatHasLowPricesServices
    private lateinit var fakeData:FakeData


    @BeforeAll
    fun setUp() {
        fakeData = FakeData()
        getTopCitiesNamesThatHasLowPricesServices = GetTopCitiesNamesThatHasLowPricesServices(fakeData)
    }
    @Test
    fun should_ReturnEmptyList_When_EntringZero() {
        //given
        val value=0
        //when
        val result =getTopCitiesNamesThatHasLowPricesServices.execute(0)
        //then
        assertTrue(result.isEmpty())
    }

    @Test
    fun should_Return_Ture_when_excludeNullServicesPrices() {
        //given
        val value=fakeData.getAllCitiesData()[0]
        //when
        val result =getTopCitiesNamesThatHasLowPricesServices.excludeNullServicesPrices(value)
        //then
        assertTrue(result)

    }

}
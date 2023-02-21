package interactor

import fakeDataSource.FakeData
import model.CityEntity
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.*
@TestInstance(Lifecycle.PER_CLASS)

 class GetTopCitiesNamesThatHasLowPricesServicesTest {
    private lateinit var fakeData: FakeData
    private lateinit var getTopCitiesNamesThatHasLowPricesServices: GetTopCitiesNamesThatHasLowPricesServices

    @BeforeAll
    fun  setup() {
        fakeData = FakeData()
        getTopCitiesNamesThatHasLowPricesServices = GetTopCitiesNamesThatHasLowPricesServices(fakeData)
    }
    @Test
    fun should_ReturnEmptyList_when_EntringZero() {
        //given
        val givenValue = 0
        // when
        val actualResult = getTopCitiesNamesThatHasLowPricesServices.execute(givenValue)
        // then
        assertTrue(actualResult.isEmpty())
    }
    @Test
    fun should_Return_True_When_excludeNullServicesPrices(){
        //given
        val givenValue=fakeData.getAllCitiesData()[0]
        //when
        val actualResult = getTopCitiesNamesThatHasLowPricesServices.excludeNullServicesPrices(givenValue)
        //then
        assertTrue(actualResult)

    }

}
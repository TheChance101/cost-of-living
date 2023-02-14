package interactor

import fakedata.CheapInternetFakeData
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetCityHasCheapestInternetConnectionInteractorTest {
    private lateinit var fakeNormalData: CheapInternetFakeData
    @BeforeAll
    fun setUp() {
        fakeNormalData = CheapInternetFakeData()
    }
    @Test
    fun should_ReturnCityWithCheapestInternetConnection_When_GetNormalData() {
        //given normal correct Data
        val interactor=GetCityHasCheapestInternetConnectionInteractor(fakeNormalData)
        //when find the Cheapest Internet Connection
        val city = interactor.execute()
        //then check the result of this city
        assertEquals(fakeNormalData.getAllCitiesData()[2],city)
    }
}
package interactor

import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.unmockkAll
import mockdata.MockCityEntity.createMockCity
import model.CityEntity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

internal class GetCheapestBasicPricesInAllCitiesComparingToAverageSalariesInteractorTest{

    private lateinit var interactor: GetCheapestBasicPricesInAllCitiesComparingToAverageSalariesInteractor
    private var mockData = mockk<CostOfLivingDataSource>()


    @BeforeAll
    fun setUp() {
        clearAllMocks()
        unmockkAll()
        interactor = GetCheapestBasicPricesInAllCitiesComparingToAverageSalariesInteractor(mockData)
    }

    @Test
    fun `should return false when the city has one or more value is null`() {
        val expected = false
        val listOfCityEntity = listOf(
            createMockCity("us" , 6000.0F , null
                , null, 50.0F ))

        // when return the country of the city is Canada
        every { mockData.getAllCitiesData() } returns listOfCityEntity
        val result = interactor.execludeNullSalaryAndQualityDataAndOtherBaicPrices(listOfCityEntity[0])
        // then
        assertEquals(expected, result)

    }


    @Test
    fun `should return false when the city has null values`() {
        // given for all values is null
        val expected = false
        val listOfCityEntity = listOf(
            createMockCity("us" , null , null
                , null , null ))
        every { mockData.getAllCitiesData() } returns listOfCityEntity
        // when execlude null values
        val result = interactor.execludeNullSalaryAndQualityDataAndOtherBaicPrices(listOfCityEntity[0])
        // then
        assertEquals(expected, result)

    }


    @Test
    fun `should return true when the city has value for all data`() {
        // given values for all data
        val expected = true
        val listOfCityEntity = listOf(
            createMockCity("us" , 2000.0F , 300.0F ,
                200.0F, 100.0F ))
        every { mockData.getAllCitiesData() } returns listOfCityEntity
        // when execlude null values
        val result = interactor.execludeNullSalaryAndQualityDataAndOtherBaicPrices(listOfCityEntity[0])
        // then
        assertEquals(expected, result)

    }


}
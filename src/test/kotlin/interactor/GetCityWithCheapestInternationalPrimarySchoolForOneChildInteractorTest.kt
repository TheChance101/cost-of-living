package interactor

import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.unmockkAll
import mockData.MockCityEntity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityWithCheapestInternationalPrimarySchoolForOneChildInteractorTest{

    private val dataSource = mockk<CostOfLivingDataSource>()
    private lateinit var interactor: GetCityWithCheapestInternationalPrimarySchoolForOneChildInteractor
    @BeforeAll
    fun setUp () {
        unmockkAll()
        clearAllMocks()
        interactor = GetCityWithCheapestInternationalPrimarySchoolForOneChildInteractor(dataSource)
    }
    @Test
    fun `should return true when high data quality and cost of international primary school is not null` () {
        //given
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                internationalPrimarySchoolYearlyForOneChild =2676.54f,
                cityName = "Damascus",
                dataQuality = true
            )
        )
        every { dataSource.getAllCitiesData() } returns mockCity
        //when
        val result = interactor.excludeNullInterNationalPrimarySchoolYearlyForOneChildAndLowQualityData(mockCity[0])
        //then
        assertTrue(result)
    }
}
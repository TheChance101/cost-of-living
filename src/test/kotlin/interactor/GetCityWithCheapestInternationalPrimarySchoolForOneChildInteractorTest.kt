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
import org.junit.jupiter.api.function.Executable

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
    @Test
    fun `should return false when cost of international primary school is null`(){
        //given
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                internationalPrimarySchoolYearlyForOneChild = null ,
                cityName = "Damascus",
                dataQuality = true
            )
        )
        every { dataSource.getAllCitiesData() } returns mockCity
        //when
        val result = interactor.excludeNullInterNationalPrimarySchoolYearlyForOneChildAndLowQualityData(mockCity[0])
        //then
        assertFalse(result)
    }
    @Test
    fun `should return false when low data quality`(){
        //given
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                internationalPrimarySchoolYearlyForOneChild = 2676.54f ,
                cityName = "Damascus",
                dataQuality = false
            )
        )
        every { dataSource.getAllCitiesData() } returns mockCity
        //when
        val result = interactor
            .excludeNullInterNationalPrimarySchoolYearlyForOneChildAndLowQualityData(mockCity[0])
        //then
        assertFalse(result)
    }

    @Test
    fun `should return correct list when enter positive limit`(){
        //given
        val limit = 2
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                internationalPrimarySchoolYearlyForOneChild = 2676.54f ,
                cityName = "Damascus",
                dataQuality = true
            ),
            MockCityEntity.createMockCity(
                internationalPrimarySchoolYearlyForOneChild = 4500.9f ,
                cityName = "Cairo",
                dataQuality = true
            ))
        every { dataSource.getAllCitiesData() } returns mockCity
        //when
        val result = interactor.execute(limit)
        //then
        assertEquals(listOf(Pair("Damascus",2676.54f),Pair("Cairo",4500.9f)),result)
    }
    @Test
    fun `should throw exeption correct list when enter negative limit`(){
        //given
        val limit = -2
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                internationalPrimarySchoolYearlyForOneChild = 2676.54f ,
                cityName = "Damascus",
                dataQuality = true
            ),
            MockCityEntity.createMockCity(
                internationalPrimarySchoolYearlyForOneChild = 4500.9f ,
                cityName = "Cairo",
                dataQuality = true
            ))
        every { dataSource.getAllCitiesData() } returns mockCity
        //when
        val resultList: Executable = Executable { interactor.execute(limit) }
        // then exception should be thrown
        assertThrows(Exception::class.java , resultList)
    }
    @Test
    fun `should throw exeption correct list when enter limit equal zero`(){
        //given
        val limit = 0

        val mockCity = listOf(
            MockCityEntity.createMockCity(
                internationalPrimarySchoolYearlyForOneChild = 2676.54f ,
                cityName = "Damascus",
                dataQuality = true
            ),
            MockCityEntity.createMockCity(
                internationalPrimarySchoolYearlyForOneChild = 4500.9f ,
                cityName = "Cairo",
                dataQuality = true
            ))
        every { dataSource.getAllCitiesData() } returns mockCity
        //when
        val resultList: Executable = Executable { interactor.execute(limit) }
        // then exception should be thrown
        assertThrows(Exception::class.java , resultList)
    }


}
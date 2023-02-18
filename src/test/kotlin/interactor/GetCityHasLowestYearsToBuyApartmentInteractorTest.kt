package interactor

import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.unmockkAll
import mockdata.MockCityEntity
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityHasLowestYearsToBuyApartmentInteractorTest {

    private lateinit var interactor: GetCityHasLowestYearsToBuyApartmentInteractor
    private val mockData = mockk<CostOfLivingDataSource>()

    @BeforeAll
    fun setUp() {
        unmockkAll()
        clearAllMocks()
        interactor = GetCityHasLowestYearsToBuyApartmentInteractor(mockData)
    }

    @Test
    fun `should return true when high data quality and not null price of apartment and net salary`() {
        //given
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                cityName = "Santiago de Cuba",
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 6000f,
                dataQuality = true,
                averageMonthlyNetSalaryAfterTax = 1580f
            )
        )
        every { mockData.getAllCitiesData() } returns mockCity
        //when
        val result = interactor.excludeNullSalariesAndNullPricePerSquareApartmentAndLowQualityData(mockCity[0])
        //then
        assertTrue(result)
    }

    @Test
    fun `should return false when low data quality`() {
        //given
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                cityName = "Santiago de Cuba",
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 230f,
                dataQuality = false,
                averageMonthlyNetSalaryAfterTax = 1580f
            )
        )
        //when
        val result = interactor.excludeNullSalariesAndNullPricePerSquareApartmentAndLowQualityData(mockCity[0])
        //then
        assertFalse(result)
    }

    @Test
    fun `should return false when null price of apartment or null net salary`() {
        //given
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                cityName = "Santiago de Cuba",
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = null,
                dataQuality = true,
                averageMonthlyNetSalaryAfterTax = 200f
            )
        )
        //when
        val result = interactor.excludeNullSalariesAndNullPricePerSquareApartmentAndLowQualityData(mockCity[0])
        //then
        assertFalse(result)
    }

    @Test
    fun `should return Correct List when Enter Postive limit`() {
        //given
        val mockCity = listOf(
            MockCityEntity.createMockCity(
                cityName = "Santiago de Cuba",
                pricePerSquareMeterToBuyApartmentOutsideOfCentre = 100.0f,
                dataQuality = true,
                averageMonthlyNetSalaryAfterTax = 1580f
            )
        )
        every { mockData.getAllCitiesData() } returns mockCity
        val limit = 1
        //when
        val resultList = interactor.execute(limit)
        //then
        assertEquals(listOf(Pair("Santiago de Cuba", .5274262f)), resultList)
    }

    @Test
    fun `should throws exception when  enter negative limit `() {
        //given
        val limit = -1
        val resultList: Executable = Executable { interactor.execute(limit) }
        // then eception should be thrown
        assertThrows(Exception::class.java, resultList)
    }

    @Test
    fun `should throws exception when limit zero limit `() {
        //given
        val limit = 0
        //when
        val resultList: Executable = Executable { interactor.execute(limit) }
        // then eception should be thrown
        assertThrows(Exception::class.java, resultList)
    }


}
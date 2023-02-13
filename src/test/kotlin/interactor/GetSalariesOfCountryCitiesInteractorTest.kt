package interactor

import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import io.mockk.mockk
import model.CityEntity
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.function.Executable

class GetSalariesOfCountryCitiesInteractorTest {

    @MockK
    private lateinit var dataSource: CostOfLivingDataSource

    @MockK
    private lateinit var gaza: CityEntity
    @MockK
    private lateinit var jerusalem: CityEntity
    @MockK
    private lateinit var amman: CityEntity
    @MockK
    private lateinit var cairo: CityEntity

    @BeforeEach
    fun setUp() {
        MockKAnnotations.init(this)
        every { gaza.country } returns "Palestine"
        every { jerusalem.country } returns "Palestine"
        every { amman.country } returns "Jordan"
        every { cairo.country } returns "Egypt"

        every { gaza.cityName } returns "Gaza"
        every { jerusalem.cityName } returns "Jerusalem"
        every { amman.cityName } returns "Amman"
        every { cairo.cityName } returns "Cairo"
    }

    @Test
    fun should_ThrowException_When_CountryNameIsWrong() {
        //given wrong country name
        val countryName = "potato"
        every {
            dataSource.getAllCitiesData()
        } returns listOf(gaza, jerusalem, amman, cairo)

        //when checking country name
        val salariesOfCountryInteractor = GetSalariesOfCountryCitiesInteractor(dataSource)
        val result = Executable { salariesOfCountryInteractor.execute(countryName) }
        //then
        assertThrows(Exception::class.java, result)
    }

    @Test
    fun should_ReturnPairsOfCitiesAndAverageSalaries_When_TheCountryNameIsInLowercase() {
        //given a correct country name in lowercase
        val countryName = "egypt"
        every { cairo.dataQuality } returns true
        every { cairo.averageMonthlyNetSalaryAfterTax } returns 100f
        every { dataSource.getAllCitiesData() } returns listOf(cairo, gaza, jerusalem, amman)
        //when checking the country name
        val salariesOfCountryInteractor = GetSalariesOfCountryCitiesInteractor(dataSource)
        val actualResult = salariesOfCountryInteractor.execute(countryName)
        //then
        assertEquals(mapOf("Cairo" to 100f), actualResult)
    }

    @Test
    fun should_ReturnPairsOfCitiesAndAverageSalaries_When_TheCountryNameIsInUppercase() {
        //given a correct country name in lowercase
        val countryName = "EGYPT"
        every { cairo.dataQuality } returns true
        every { cairo.averageMonthlyNetSalaryAfterTax } returns 100f
        every { dataSource.getAllCitiesData() } returns listOf(cairo, gaza, jerusalem, amman)
        //when checking the country name
        val salariesOfCountryInteractor = GetSalariesOfCountryCitiesInteractor(dataSource)
        val actualResult = salariesOfCountryInteractor.execute(countryName)
        //then
        assertEquals(mapOf("Cairo" to 100f), actualResult)
    }

    @Test
    fun should_ReturnPairsOfCitiesAndAverageSalaries_When_TheCountryNameIsInMixedCase() {
        //given a correct country name in lowercase
        val countryName = "eGyPt"
        every { cairo.dataQuality } returns true
        every { cairo.averageMonthlyNetSalaryAfterTax } returns 100f
        every { dataSource.getAllCitiesData() } returns listOf(cairo, gaza, jerusalem, amman)
        //when checking the country name
        val salariesOfCountryInteractor = GetSalariesOfCountryCitiesInteractor(dataSource)
        val actualResult = salariesOfCountryInteractor.execute(countryName)
        //then
        assertEquals(mapOf("Cairo" to 100f), actualResult)
    }

    @Test
    fun should_ReturnNull_When_AllOfTheCountryDataIsLowQuality() {
        //given a correct country name and low quality data for all the cities
        val countryName = "Egypt"
        every { cairo.dataQuality } returns false
        every { cairo.averageMonthlyNetSalaryAfterTax } returns 100f
        every { dataSource.getAllCitiesData() } returns listOf(cairo, gaza, jerusalem, amman)
        //when all the country's data is low quality
        val salariesOfCountryInteractor = GetSalariesOfCountryCitiesInteractor(dataSource)
        val actualResult = salariesOfCountryInteractor.execute(countryName)
        //then
        assertNull(actualResult)
    }

    @Test
    fun should_ReturnNull_When_AllOfTheCountrySalariesAreNull() {
        //given a correct country name and null salaries for all the cities
        val countryName = "Egypt"
        every { cairo.dataQuality } returns true
        every { cairo.averageMonthlyNetSalaryAfterTax } returns null
        every { dataSource.getAllCitiesData() } returns listOf(cairo, gaza, jerusalem, amman)
        //when all the country's cities has null salaries
        val salariesOfCountryInteractor = GetSalariesOfCountryCitiesInteractor(dataSource)
        val actualResult = salariesOfCountryInteractor.execute(countryName)
        //then
        assertNull(actualResult)
    }


}
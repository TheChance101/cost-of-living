package interactor

import dataSource.CsvDataSource
import dataSource.utils.CsvParser
import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.unmockkAll
import model.CityEntity
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityHasCheapestMealPricesInteractorTest {

    private lateinit var sut: GetCityHasCheapestMealPricesInteractor
    private val csvParser = CsvParser()
    private val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    @BeforeAll
    fun setUp() {
        // clear and cancel all objects mock
        clearAllMocks()
        unmockkAll()
        // sut: system under test
        sut = GetCityHasCheapestMealPricesInteractor(dataSource)
    }

    @Test
    fun `should return true when the city is in USA`() {
        // given fake city entity data
        val city: CityEntity = mockk()
        // when return the country of the city is USA
        every { city.country } returns ThreeSpecificCountries.USA.nameOFCountry
        val result = sut.citiesInUSACanadaAndMexico(city)
        // then
        assertTrue(result)
    }

    @Test
    fun `should return true when the city is in Canada`() {
        // given fake city entity data
        val city: CityEntity = mockk()
        // when return the country of the city is Canada
        every { city.country } returns ThreeSpecificCountries.CANADA.nameOFCountry
        val result = sut.citiesInUSACanadaAndMexico(city)
        // then
        assertTrue(result)
    }

    @Test
    fun `should return true when the city is in Mexico`() {
        // given fake city entity data
        val city: CityEntity = mockk()
        // when return the country of the city is Mexico
        every { city.country } returns ThreeSpecificCountries.MEXICO.nameOFCountry
        val result = sut.citiesInUSACanadaAndMexico(city)
        // then
        assertTrue(result)
    }

    @Test
    fun `should return false when the city is in Egypt`() {
        // given fake city entity data
        val city: CityEntity = mockk()
        // when return the country of the city is Egypt
        every { city.country } returns ThreeSpecificCountries.EGYPT.nameOFCountry
        val result = sut.citiesInUSACanadaAndMexico(city)
        // then
        assertFalse(result)
    }
}
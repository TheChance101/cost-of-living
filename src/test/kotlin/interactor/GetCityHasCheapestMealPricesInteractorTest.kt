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

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCityHasCheapestMealPricesInteractorTest {

    private lateinit var sut: GetCityHasCheapestMealPricesInteractor
    private val csvParser = CsvParser()
    private val dataSource: CostOfLivingDataSource = CsvDataSource(csvParser)

    @BeforeAll
    fun setUp() {
        clearAllMocks()
        unmockkAll()
        sut = GetCityHasCheapestMealPricesInteractor(dataSource)
    }

    @Test
    fun `should return true when the city is in USA`() {
        val city: CityEntity = mockk()
        every { city.country } returns "United States"
        val result = sut.citiesInUSACanadaAndMexico(city)

        assertEquals(true, result)
    }
}
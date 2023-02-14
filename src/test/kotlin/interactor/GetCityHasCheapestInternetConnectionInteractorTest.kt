package interactor

import io.mockk.every
import org.junit.jupiter.api.Test
import io.mockk.mockk
import model.*
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals
import kotlin.test.assertNull

class GetCityHasCheapestInternetConnectionInteractorTest {

    private val dataSource = mockk<CostOfLivingDataSource>()
    private val interactor = GetCityHasCheapestInternetConnectionInteractor(dataSource)

    @Test
    fun `should return city with cheapest internet connection`() {
        // given
        val citiesData = listOf(
            createCity("City 1", 50f, 10f),
            createCity("City 2", 2000f, 40f),
            createCity("City 3", 5000f, 200f)
        )
        //when(dataSource.getAllCitiesData()).thenRetu(citiesData)
        every { dataSource.getAllCitiesData() } returns (citiesData)
        // when
        val result = interactor.execute()

        // then
        assertEquals("City 2", result?.cityName)
    }
    @Test
    fun `should return null if no cities have internet price`() {
        // given
        val citiesData = listOf(
            createCity("City 1", 1000f, null),
            createCity("City 2", 2000f, null),
            createCity("City 3", 5000f, null)
        )
        every { dataSource.getAllCitiesData() } returns (citiesData)

        // when
        val result = interactor.execute()

        // then
        assertNull(result)
    }

    @Test
    fun `should throw exception when data source throws exception`() {
        // given
        val exception = IllegalStateException("Error getting city data")
        every { dataSource.getAllCitiesData() } throws (exception)

        // then
        assertThrows<IllegalStateException> {
            interactor.execute()
        }
    }
    private fun createCity(cityName: String, averageMonthlyNetSalaryAfterTax: Float, internetPrice: Float?) =
        CityEntity(
            cityName, "Country", MealsPrices(null, null, null),
            DrinksPrices(null, null, null, null, null),
            FruitAndVegetablesPrices(null, null, null, null, null, null, null),
            FoodPrices(null, null, null, null, null, null),
            ServicesPrices(null, null, internetPrice, null, null, null, null, null),
            ClothesPrices(null, null, null, null),
            TransportationsPrices(null, null, null, null, null, null),
            CarsPrices(null, null),
            RealEstatesPrices(null, null, null, null, null, null),
            averageMonthlyNetSalaryAfterTax, true
        )

}
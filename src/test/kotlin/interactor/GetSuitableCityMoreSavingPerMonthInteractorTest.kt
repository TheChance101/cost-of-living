package interactor

import io.mockk.clearAllMocks
import io.mockk.every
import io.mockk.mockk
import io.mockk.unmockkAll
import mockdata.MockCityEntity.createMockCity
import model.FoodPrices
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue

/**
 * Created by Aziza Helmy on 2/12/2023.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetSuitableCityMoreSavingPerMonthInteractorTest {
    private lateinit var getSuitableCityMoreSavingPerMonth: GetSuitableCityMoreSavingPerMonthInteractor
    private val mockData = mockk<CostOfLivingDataSource>()

    @BeforeAll
    fun setUp() {
        unmockkAll()
        clearAllMocks()
        getSuitableCityMoreSavingPerMonth = GetSuitableCityMoreSavingPerMonthInteractor(mockData)
    }

    @Test
    fun `should return true when cities has an average monthly salary`() {
        //Given
        val fakeCity = listOf(
            createMockCity(
                FoodPrices(
                    loafOfFreshWhiteBread500g = 1.1f,
                    riceWhite1kg = 1.1f,
                    eggsRegular12 = 2.03f,
                    localCheese1kg = 9.0f,
                    chickenFillets1kg = 6.61f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 6.61f
                ),
                averageMonthlyNetSalaryAfterTax = 1580f,
                apartment3BedroomsInCityCentre = 60.0f
            )
        )
        every { mockData.getAllCitiesData() } returns (fakeCity)
        //When
        val actualResult =
            getSuitableCityMoreSavingPerMonth.excludeNullSalariesApartment3BedroomsAndFoodies(fakeCity[0])
        //Then
        assertTrue(actualResult)
    }

    @Test
    fun `should return false when cities has not an average monthly salary`() {
        //Given
        val fakeCity = listOf(
            createMockCity(
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = null,
                    riceWhite1kg = null,
                    eggsRegular12 = 2.03f,
                    localCheese1kg = null,
                    chickenFillets1kg = null,
                    beefRound1kgOrEquivalentBackLegRedMeat = null
                ),
                averageMonthlyNetSalaryAfterTax = null,
                apartment3BedroomsInCityCentre = null,
            )
        )
        every { mockData.getAllCitiesData() } returns (fakeCity)
        //When
        val actualResult =
            getSuitableCityMoreSavingPerMonth.excludeNullSalariesApartment3BedroomsAndFoodies(fakeCity[0])
        //Then
        assertFalse(actualResult)
    }

    @Test//TODO
    fun `should return true when cities has an apartment 3Bedrooms in cityCenter`() {
        //Given
        val fakeCity = listOf(
            createMockCity(
                FoodPrices(
                    loafOfFreshWhiteBread500g = 1.1f,
                    riceWhite1kg = 1.1f,
                    eggsRegular12 = 2.03f,
                    localCheese1kg = 9.0f,
                    chickenFillets1kg = 6.61f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 6.61f
                ),
                averageMonthlyNetSalaryAfterTax = 1580f,
                apartment3BedroomsInCityCentre = 60.0f
            )
        )
        every { mockData.getAllCitiesData() } returns (fakeCity)
        //When
        val actualResult =
            getSuitableCityMoreSavingPerMonth.excludeNullSalariesApartment3BedroomsAndFoodies(fakeCity[0])
        //Then
        assertTrue(actualResult)
    }

    @Test
    fun `should return false when cities has not an apartment 3Bedrooms in cityCenter`() {
        //Given
        val fakeCity = listOf(
            createMockCity(
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = null,
                    riceWhite1kg = null,
                    eggsRegular12 = 2.03f,
                    localCheese1kg = null,
                    chickenFillets1kg = null,
                    beefRound1kgOrEquivalentBackLegRedMeat = null
                ),
                averageMonthlyNetSalaryAfterTax = null,
                apartment3BedroomsInCityCentre = null,
            )
        )
        every { mockData.getAllCitiesData() } returns (fakeCity)
        //When
        val actualResult =
            getSuitableCityMoreSavingPerMonth.excludeNullSalariesApartment3BedroomsAndFoodies(fakeCity[0])
        //Then
        assertFalse(actualResult)
    }

    @Test
    fun `should return true when cities has the needed foodies`() {
        //Given
        val fakeCity = listOf(
            createMockCity(
                FoodPrices(
                    loafOfFreshWhiteBread500g = 1.1f,
                    riceWhite1kg = 1.1f,
                    eggsRegular12 = 2.03f,
                    localCheese1kg = 9.0f,
                    chickenFillets1kg = 6.61f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 6.61f
                ),
                averageMonthlyNetSalaryAfterTax = 1580f,
                apartment3BedroomsInCityCentre = 60.0f
            )
        )
        every { mockData.getAllCitiesData() } returns (fakeCity)
        //When
        val actualResult =
            getSuitableCityMoreSavingPerMonth.excludeNullSalariesApartment3BedroomsAndFoodies(fakeCity[0])
        //Then
        assertTrue(actualResult)
    }

    @Test
    fun `should return false when cities has not the needed foodies`() {
        //Given
        val fakeCity = listOf(
            createMockCity(
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = null,
                    riceWhite1kg = null,
                    eggsRegular12 = 2.03f,
                    localCheese1kg = null,
                    chickenFillets1kg = null,
                    beefRound1kgOrEquivalentBackLegRedMeat = null
                ),
                averageMonthlyNetSalaryAfterTax = null,
                apartment3BedroomsInCityCentre = null,
            )
        )
        every { mockData.getAllCitiesData() } returns (fakeCity)
        //When
        val actualResult =
            getSuitableCityMoreSavingPerMonth.excludeNullSalariesApartment3BedroomsAndFoodies(fakeCity[0])
        //Then
        assertFalse(actualResult)
    }

    @Test
    fun `should not return suitable city when no savings more per month`() {
        //Given
        val expectedResult = listOf(
            createMockCity(
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 1.1f,
                    riceWhite1kg = 1.1f,
                    eggsRegular12 = 2.03f,
                    localCheese1kg = 9.0f,
                    chickenFillets1kg = 6.61f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 6.61f
                ),
                averageMonthlyNetSalaryAfterTax = 18.0f,
                apartment3BedroomsInCityCentre = 7000.0f,
            ),
            createMockCity(
                foodPrices = FoodPrices(
                    loafOfFreshWhiteBread500g = 1.1f,
                    riceWhite1kg = 1.1f,
                    eggsRegular12 = 2.03f,
                    localCheese1kg = 9.0f,
                    chickenFillets1kg = 6.61f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 6.61f
                ),
                averageMonthlyNetSalaryAfterTax = 8718.0f,
                apartment3BedroomsInCityCentre = 70.0f,
            )
        )
        every { mockData.getAllCitiesData() } returns (expectedResult)
        //When
        val actualResult = getSuitableCityMoreSavingPerMonth.execute()
        //Then
        assertNotEquals(expectedResult[0], actualResult)
    }

    @Test
    fun `should return suitable city when savings more per month`() {
        //Given
        val expectedResult = listOf(
            createMockCity(
                FoodPrices(
                    loafOfFreshWhiteBread500g = 1.1f,
                    riceWhite1kg = 1.1f,
                    eggsRegular12 = 2.03f,
                    localCheese1kg = 9.0f,
                    chickenFillets1kg = 6.61f,
                    beefRound1kgOrEquivalentBackLegRedMeat = 6.61f
                ),
                averageMonthlyNetSalaryAfterTax = 1580f,
                apartment3BedroomsInCityCentre = 60.0f
            )
        )
        every { mockData.getAllCitiesData() } returns (expectedResult)
        //When
        val actualResult = getSuitableCityMoreSavingPerMonth.execute()
        //Then
        assertEquals(expectedResult[0], actualResult)
    }

}
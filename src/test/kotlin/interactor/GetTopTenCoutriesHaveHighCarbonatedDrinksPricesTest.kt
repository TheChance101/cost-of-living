package interactor

import FakeData
import model.CityEntity
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTopTenCoutriesHaveHighCarbonatedDrinksPricesTest {
    private lateinit var interactor: GetTopTenCoutriesHaveHighCarbonatedDrinksPrices
    private lateinit var fakeData: FakeData

    @BeforeEach
    fun setUp() {
        fakeData = FakeData()
        interactor = GetTopTenCoutriesHaveHighCarbonatedDrinksPrices(fakeData)
    }


    @Test
    fun should_ReturnCorrect_When_LimitIsMoreThanZero() {
        //given Country with drink price and limit
        val limit = 3
        //when getting a list of pair  contains the country name and drink price
        val result = interactor.execute(limit)
        // then
        assertEquals(3, result.size)
        assertEquals("Cuba", result[0].first)
        assertEquals(2.28f, result[0].second)
        assertEquals("Venezuela", result[1].first)
        assertEquals(1.12f, result[1].second)
        assertEquals("Syria", result[2].first)
        assertEquals(0.82f, result[2].second)
    }

    @Test
    fun should_ReturnEmptyList_When_LimitIsZero() {
        //given
        val limit = 0
        //when
        val result = interactor.execute(limit)
        // Then
        assertTrue(result.isEmpty())
    }

    @Test
    fun should_ReturnEmptyList_When_LimitIsNegative() {
        //given
        val limit = -6
        //when
        val result = interactor.execute(limit)
        // Then
        assertEquals(emptyList<CityEntity>(),result)
    }


    @Test
    fun should_ThrowErrorMessage_When_ThePriceIsNull() {
        //given Country with drink price and limit
        val limit = 10
        //when getting a Data contains null price value
        val getTop10CountriesWithHighTaxOnCarbonatedDrinks = interactor.execute(limit)
        //then
        if (getTop10CountriesWithHighTaxOnCarbonatedDrinks.any { it.second == null })
            AssertionError("Drink Price can't be Null")
    }

    }

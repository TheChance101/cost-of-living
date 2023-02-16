package interactor

import fakedata.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FindTheHighestDifferenceInRentalPricesInteractorTest {
    private lateinit var interactor: FindTheHighestDifferenceInRentalPricesInteractor

    @Test
    fun `should return city with highest difference price when given high quality data`() {
        // given high quality data
        interactor = FindTheHighestDifferenceInRentalPricesInteractor(FindHighestDifferenceInRentalPricesFakeData())
        val expectedCity = FindHighestDifferenceInRentalPricesFakeData().getAllCitiesData()[1]
        //when
        val actualCity = interactor.execute()
        //then
        assertEquals(expectedCity, actualCity)
    }

    @Test
    fun `should return city with highest difference price when given mixed data`() {
        //given mixed data
        interactor = FindTheHighestDifferenceInRentalPricesInteractor(MixedFakeData())
        val expectedCity = MixedFakeData().getAllCitiesData()[0]

        // When
        val actualCity = interactor.execute()

        // Then
        assertEquals(expectedCity, actualCity)
    }

    @Test
    fun `should return null when given empty list`() {
        // given empty list
        interactor = FindTheHighestDifferenceInRentalPricesInteractor(FakeEmptyList())

        // When
        val actualCity = interactor.execute()

        // Then
        assertNull(actualCity)
    }

    @Test
    fun `should return null when given invalid null data`() {
        //given invalid data
        interactor = FindTheHighestDifferenceInRentalPricesInteractor(NullData())

        // When
        val actualCity = interactor.execute()

        // Then
        assertNull(actualCity)
    }

    @Test
    fun `should return null when given low quality data`() {
        //given low quality data
        interactor = FindTheHighestDifferenceInRentalPricesInteractor(LowQualityData())

        // When
        val actualCity = interactor.execute()

        // Then
        assertNull(actualCity)
    }
}


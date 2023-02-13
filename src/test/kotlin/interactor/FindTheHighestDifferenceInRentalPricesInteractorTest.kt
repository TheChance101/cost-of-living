package interactor

import fakedata.FakeData
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FindTheHighestDifferenceInRentalPricesInteractorTest {
    private lateinit var interactor:
            FindTheHighestDifferenceInRentalPricesInteractor

    @BeforeAll
    fun setUp() {
        interactor = FindTheHighestDifferenceInRentalPricesInteractor(FakeData())
    }

    @Test
    fun ` should return city with highest difference price when high quality data `() {
        // given
        interactor = FindTheHighestDifferenceInRentalPricesInteractor(FakeData())
        val highestDifferenceCity = FakeData().getAllCitiesData()[1]
        //when
        val result = interactor.execute()
        //then
        assertEquals(highestDifferenceCity, result)
    }

    @Test
    fun ` should return city with highest difference price when given mixed data `() {
        //given
        val dataSource = FakeData().MixedData()
        interactor = FindTheHighestDifferenceInRentalPricesInteractor(dataSource)
        val highestDifferenceCity = FakeData().MixedData().getAllCitiesData()[0]

        // When
        val result = interactor.execute()

        // Then
        assertEquals(highestDifferenceCity, result)
    }
}

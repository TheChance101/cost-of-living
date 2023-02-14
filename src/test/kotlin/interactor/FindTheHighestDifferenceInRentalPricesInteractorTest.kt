package interactor

import fakedata.FindHighestDifferenceInRentalPricesFakeData
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FindTheHighestDifferenceInRentalPricesInteractorTest {
    private lateinit var interactor:
            FindTheHighestDifferenceInRentalPricesInteractor

    @BeforeAll
    fun setUp() {
        interactor = FindTheHighestDifferenceInRentalPricesInteractor(FindHighestDifferenceInRentalPricesFakeData())
    }

    @Test
    fun ` should return city with highest difference price when high quality data `() {
        // given
        interactor = FindTheHighestDifferenceInRentalPricesInteractor(FindHighestDifferenceInRentalPricesFakeData())
        val highestDifferenceCity = FindHighestDifferenceInRentalPricesFakeData().getAllCitiesData()[1]
        //when
        val result = interactor.execute()
        //then
        assertEquals(highestDifferenceCity, result)
    }

    @Test
    fun ` should return city with highest difference price when given mixed data `() {
        //given
        val dataSource = FindHighestDifferenceInRentalPricesFakeData().MixedData()
        interactor = FindTheHighestDifferenceInRentalPricesInteractor(dataSource)
        val highestDifferenceCity = FindHighestDifferenceInRentalPricesFakeData().MixedData().getAllCitiesData()[0]

        // When
        val result = interactor.execute()

        // Then
        assertEquals(highestDifferenceCity, result)
    }

    @Test
    fun ` should return null  when given empty data`() {
        // given
        val dataSource = FindHighestDifferenceInRentalPricesFakeData().EmptyDataSource()
        interactor = FindTheHighestDifferenceInRentalPricesInteractor(dataSource)

        // When
        val result = interactor.execute()

        // Then
        assertNull(result)
    }

    @Test
    fun ` should Throw Exception when given null data  `() {
        //given
        val dataSource = FindHighestDifferenceInRentalPricesFakeData().NullData()
        interactor = FindTheHighestDifferenceInRentalPricesInteractor(dataSource)

        // When
        val executableResult = Executable { interactor.execute() }

        // Then
        assertThrows(Exception::class.java, executableResult)
    }

    @Test
    fun ` should Throw Exception when low quality data`() {
        //given
        val dataSource = FindHighestDifferenceInRentalPricesFakeData().LowQualityData()
        interactor = FindTheHighestDifferenceInRentalPricesInteractor(dataSource)

        // When
        val executableResult = Executable { interactor.execute() }

        // Then
        assertThrows(Exception::class.java, executableResult)
    }
}


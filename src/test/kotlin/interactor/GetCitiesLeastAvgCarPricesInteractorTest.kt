package interactor

import fakedata.QualityCities
import fakedata.top10CitiesSorted
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertContentEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCitiesLeastAvgCarPricesInteractorTest {
    private lateinit var interactor: GetCitiesLeastAvgCarPricesInteractor

    @Test
    fun should_ReturnTopCityNames_when_inputIsValid() {
        // Given
        interactor = GetCitiesLeastAvgCarPricesInteractor(QualityCities())
        val expected = top10CitiesSorted()
        // When
        val result = interactor.execute(10)
        // Then
        assertContentEquals(expected, result)
    }

    @Test
    fun should_ReturnEmptyList_when_allCarsAreNull() {
    }

    @Test
    fun should_ReturnMaxLimitSize_when_inputIsValid() {
    }

    @Test
    fun should_ReturnThrowException_when_salaryIsNull() {
    }

    @Test
    fun should_ReturnLessSize_when_inputHasDuplicates() {
    }
}
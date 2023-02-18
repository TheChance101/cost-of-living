package interactor

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCitiesLeastAvgCarPricesInteractorTest {
    private lateinit var interactor: GetCitiesLeastAvgCarPricesInteractor

    @Test
    fun should_ReturnTopCityNames_when_inputIsValid() {

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
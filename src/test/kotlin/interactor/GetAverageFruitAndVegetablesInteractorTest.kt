package interactor

import data.FruitsAndVegetablesFakeData
import data.TestCase
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetAverageFruitAndVegetablesInteractorTest {

    private lateinit var getAverageFruitAndVegetablesInteractor: GetAverageFruitAndVegetablesInteractor
    private val fakeData = FruitsAndVegetablesFakeData()

    @BeforeAll
    fun setup() {
        getAverageFruitAndVegetablesInteractor = GetAverageFruitAndVegetablesInteractor(fakeData)
    }

    @Test
    fun `should return correct cities names when the data source is valid`() {
        // given a limit of cities
        val limit = 10

        // when check and return cities name
        val result = getAverageFruitAndVegetablesInteractor.execute(limit)

        // then asserted the return and the expected
        val expected = listOf(
            "Christiansburg",
            "Brookdale",
            "Woodlawn",
            "Vryheid",
            "Clayton",
            "Brevard",
            "Mortsel",
            "Kernersville",
            "Airway Heights",
            "Ridgecrest"
        )
        assertEquals(expected, result)
    }

    @Test
    fun should_ReturnEmptyList_When_TheFruitsAndVegetablesAreNull() {
        // given null data to fruits and vegetables
//        fakeData.changeDataSource(TestCase.InvalidData)

        // when check and return cities name
        val result = getAverageFruitAndVegetablesInteractor.execute(111)

        // then asserted the return and the expected
        val expected = emptyList<String>()

        assertEquals(expected, result)
    }

    @Test
    fun should_ReturnEmptyList_When_TheAverageMonthlyNetSalaryAfterTaxIsNullOrNaN() {
        // given null data to average monthly net salary after tax
//        fakeData.changeDataSource(TestCase.AverageMonthlyNetSalary)

        // when check and return cities name
        val result = getAverageFruitAndVegetablesInteractor.execute(11)

        // then asserted the return and the expected
        val expected = emptyList<String>()

        assertEquals(expected, result)
    }

    @Test
    fun should_ReturnEmptyList_When_DataSourceIsEmpty() {
        // given empty data source
//        fakeData.changeDataSource(TestCase.Empty)

        // when check and return cities name
        val result = getAverageFruitAndVegetablesInteractor.execute(11)

        // then asserted the return and the expected
        val expected = emptyList<String>()

        assertEquals(expected, result)
    }
}
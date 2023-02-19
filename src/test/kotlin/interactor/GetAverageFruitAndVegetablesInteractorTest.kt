package interactor

import data.FruitsAndVegetablesFakeData
import data.InvalidFakeData
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.function.Executable

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetAverageFruitAndVegetablesInteractorTest {

    private lateinit var getAverageFruitAndVegetablesInteractor: GetAverageFruitAndVegetablesInteractor
    private val fakeData = FruitsAndVegetablesFakeData()

    @BeforeEach
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
            "Brevard",
            "Clayton",
            "Kernersville",
            "Keller",
            "Malden",
            "Pearl",
            "Moncks Corner"
        )
        assertEquals(expected, result)
    }

    @Test
    fun `should return empty list when given the data source is Invalid`() {
        // given a limit of cities and invalid data source
        val limit = 10

        getAverageFruitAndVegetablesInteractor = GetAverageFruitAndVegetablesInteractor(InvalidFakeData())

        // when check and return empty list
        val result = getAverageFruitAndVegetablesInteractor.execute(limit)

        val expected = emptyList<String>()
        // then asserted the return and the expected
        assertEquals(expected, result)
    }

    @Test
    fun `should return an empty list when given a limit zero`() {
        // given a limit zero
        val limit = 0

        // when check and return empty list
        val result = getAverageFruitAndVegetablesInteractor.execute(limit)

        val expected = emptyList<String>()

        // then asserted the return and the expected
        assertEquals(expected, result)
    }

    @Test
    fun `should throw an exception when given a negative limit number`() {
        // given a limit negative number
        val limit = -1

        // when check and throw exception
        val result = Executable { getAverageFruitAndVegetablesInteractor.execute(limit) }

        // then asserted the return and the expected
        assertThrows(IllegalArgumentException::class.java, result)
    }

    @Test
    fun `should Return false when the fruits and vegetables is Null but salary is valid`() {
        // given a null for fruits and vegetables but valid for salaries
        val city = FruitsAndVegetablesFakeData().getAllCitiesData()[10]

        // when check
        val result = getAverageFruitAndVegetablesInteractor.excludeNullFruitVegPriceAndNullSalaries(city)

        // then asserted the return and the expected
        assertFalse(result)
    }

    @Test
    fun `should Return false when the fruits and vegetables is valid but salary is null`() {
        // given valid data for fruits and vegetables but null for salaries
        val city = FruitsAndVegetablesFakeData().getAllCitiesData()[11]

        // when check
        val result = getAverageFruitAndVegetablesInteractor.excludeNullFruitVegPriceAndNullSalaries(city)

        // then asserted the return and the expected
        assertFalse(result)
    }

}
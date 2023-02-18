package interactor

import fakeDataSource.FruitAndVegetablesFakeDataSource
import model.*
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetCitiesWithLowestFruitAndVegetablesAverageComparedToSalariesTestInteractorTest {
    private lateinit var data: GetCitiesWithLowestFruitAndVegetablesAverageComparedToSalariesInteractor
    private val dataSource = FruitAndVegetablesFakeDataSource()

    @BeforeAll
    fun setup() {
        data =
            GetCitiesWithLowestFruitAndVegetablesAverageComparedToSalariesInteractor(
                dataSource.getFruitAndVegitabelsCleanData()
            )
    }

    @Test
    fun should_Return10CitiesWithLowestFruitAndVegetablesAverageComparedToSalaries_When_execute() {
        //given clean data
        val cities = listOf("City10", "City2", "City9", "City8", "City7", "City11", "City6", "City5", "City1", "City4")
        //when executing
        val result = data.execute(10)
        //then
        assertEquals(cities, result)
    }

    @Test
    fun should_ReturnFalse_When_CityNameIsEmpty() {
        //given an empty city name should
        val emptyCityName = dataSource.createCustomCity(cityName = "", salary = 1000f, dataQuality = true)
        //when executing
        val result = data.excludeEmptyCityNameAndLowQualityDataAndNullSalaries(emptyCityName)
        //then
        assertFalse(result)

    }

    @Test
    fun should_ReturnTheAverageOfFruitsAndVegetables_When_CountingAverage() {
        //given clean data
        val fruitAndVegetables = FruitAndVegetablesPrices(1.0f, 2.0f, 3.0f,
            4.0f, 5.0f, 6.0f, 7.0f)
        //when counting the average
        val result = fruitAndVegetables.getAvreage()
        //then
        assertEquals(4.0f, result)
    }

    @Test
    fun should_ReturnTheResultOfComparingFruitAndVegetablesWithSalaries_When_ComparingFruitAndVegetablesWithSalaries() {
        //given the average and the salaries
        val average = 4.0f
        val salaries = 5000.0f
        //when comparing fruit and vegetables with salaries
        val result = data.comparingFruitAndVegetablesWithSalaries(average, salaries)
        //then
        assertEquals(0.0008f, result)
    }

    @Test
    fun should_ReturnFalse_When_FruitAndVegetablesISNull() {
        //given null fruit and vegetables
        val nullFruitAndVegetables = FruitAndVegetablesPrices(null, 1.0f, null,
            null, null, null, null)
        //when FruitAndVegetablesISNull
        val result = data.excludeNullFruitsAndVegetables(nullFruitAndVegetables)
        //then
        assertFalse(result)

    }

    @Test
    fun should_ReturnFalse_When_SalariesISNull() {
        //given null salaries
        val nullSalaries = dataSource.createCustomCity(cityName = "Baghdad", salary = null, dataQuality = true)

        //when SalariesISNull
        val result = data.excludeEmptyCityNameAndLowQualityDataAndNullSalaries(nullSalaries)
        //then
        assertFalse(result)
    }

    @Test
    fun should_ReturnFalse_When_LowQualityData() {
        //given low quality data
        val lowQualityData = dataSource.createCustomCity(cityName = "Baghdad", salary = 1000f, dataQuality = false)
        //when executing
        val result = data.excludeEmptyCityNameAndLowQualityDataAndNullSalaries(lowQualityData)
        //then
        assertFalse(result)
    }
}
package interactor

import dataSource.FakeDataSource
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class GetLowestAveragePricesForFruitsAndVegetablesInteractorTest {

    private lateinit var fakeDataSource: CostOfLivingDataSource
    lateinit var interactor: GetLowestAveragePricesForFruitsAndVegetablesInteractor

    @BeforeAll
    fun setup(){
        fakeDataSource = FakeDataSource()
        interactor = GetLowestAveragePricesForFruitsAndVegetablesInteractor(fakeDataSource)
    }
    @Test
    fun `should return empty list when the limit is equal to zero`() {
        //given limit equal to zero
        val limit = 0
        //when getting list of cities names with the lowest average prices for fruits and vegetables
        val actual = interactor.execute(limit)
        //then
        val expected = emptyList<String>()
        assertEquals(expected,actual)
    }

    @Test
    fun `should return list of cities names its size is equal to limit when correct cites is more than limit`() {
        //given limit less than number of correct cities
        val limit = 4
        //when getting list of cities names with the lowest average prices for fruits and vegetables
        val actual = interactor.execute(limit)
        //then
        val expected = listOf(
            fakeDataSource.getAllCitiesData()[18].cityName,
            fakeDataSource.getAllCitiesData()[14].cityName,
            fakeDataSource.getAllCitiesData()[19].cityName,
            fakeDataSource.getAllCitiesData()[15].cityName
        )
        assertEquals(expected, actual)
    }

    @Test
    fun `should return list of cities names its size is equal to limit when  correct cites is equal to limit`() {
        //given limit equal to number of correct cities
        val limit = 7
        //when getting list of cities names with the lowest average prices for fruits and vegetables
        val actual = interactor.execute(limit)
        //then
        val expected = listOf(
            fakeDataSource.getAllCitiesData()[18].cityName,
            fakeDataSource.getAllCitiesData()[14].cityName,
            fakeDataSource.getAllCitiesData()[19].cityName,
            fakeDataSource.getAllCitiesData()[15].cityName,
            fakeDataSource.getAllCitiesData()[10].cityName,
            fakeDataSource.getAllCitiesData()[13].cityName,
            fakeDataSource.getAllCitiesData()[4].cityName
        )
        assertEquals(expected,actual)
    }

    @Test
    fun `should return list of cities names its size equals correct cites when the limit is more than correct cites`(){
        //given limit more than number of correct cities
        val limit = 10
        //when getting list of cities names with the lowest average prices for fruits and vegetables
        val actual = interactor.execute(limit)
        //then
        val expected = listOf(
            fakeDataSource.getAllCitiesData()[18].cityName,
            fakeDataSource.getAllCitiesData()[14].cityName,
            fakeDataSource.getAllCitiesData()[19].cityName,
            fakeDataSource.getAllCitiesData()[15].cityName,
            fakeDataSource.getAllCitiesData()[10].cityName,
            fakeDataSource.getAllCitiesData()[13].cityName,
            fakeDataSource.getAllCitiesData()[4].cityName
        )
        assertEquals(expected,actual)
    }
}